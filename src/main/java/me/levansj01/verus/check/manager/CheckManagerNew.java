package me.levansj01.verus.check.manager;

import java.util.*;
import me.levansj01.verus.storage.database.*;
import me.levansj01.verus.*;
import java.util.function.*;
import java.io.*;
import com.google.gson.*;
import me.levansj01.verus.check.*;

public class CheckManagerNew
{
    private static final Gson gson;
    private Map<String, CheckValues> valuesMap;
    private static CheckManager instance;
    
    public void onDisable(final VerusPlugin verusPlugin) {
        final File file = new File(verusPlugin.getPlugin().getDataFolder(), "checks.json");
        try {
            final FileWriter fileWriter = new FileWriter(file);
            Throwable t = null;
            Label_0154: {
                try {
                    fileWriter.write(CheckManagerNew.gson.toJson((Object)this.valuesMap));
                    if (fileWriter != null) {
                        if (t != null) {
                            try {
                                fileWriter.close();
                                break Label_0154;
                            }
                            catch (Throwable t2) {
                                t.addSuppressed(t2);
                                break Label_0154;
                            }
                        }
                        fileWriter.close();
                    }
                }
                catch (Throwable t3) {
                    t = t3;
                    throw t3;
                }
                finally {
                    Label_0151: {
                        if (fileWriter != null) {
                            if (t != null) {
                                try {
                                    fileWriter.close();
                                    break Label_0151;
                                }
                                catch (Throwable t4) {
                                    t.addSuppressed(t4);
                                    break Label_0151;
                                }
                            }
                            fileWriter.close();
                        }
                    }
                }
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void onEnable(final VerusPlugin verusPlugin) {
        final File file = new File(verusPlugin.getPlugin().getDataFolder(), "checks.json");
        if (!file.exists()) {
            verusPlugin.getTypeLoader().loadChecks().forEach(this::lambda$onEnable$0);
            return;
        }
        try {
            final FileReader fileReader = new FileReader(file);
            Throwable t = null;
            Label_0184: {
                try {
                    this.valuesMap = (Map<String, CheckValues>)CheckManagerNew.gson.fromJson((Reader)fileReader, (Class)Map.class);
                    if (fileReader != null) {
                        if (t != null) {
                            try {
                                fileReader.close();
                                break Label_0184;
                            }
                            catch (Throwable t2) {
                                t.addSuppressed(t2);
                                break Label_0184;
                            }
                        }
                        fileReader.close();
                    }
                }
                catch (Throwable t3) {
                    t = t3;
                    throw t3;
                }
                finally {
                    Label_0181: {
                        if (fileReader != null) {
                            if (t != null) {
                                try {
                                    fileReader.close();
                                    break Label_0181;
                                }
                                catch (Throwable t4) {
                                    t.addSuppressed(t4);
                                    break Label_0181;
                                }
                            }
                            fileReader.close();
                        }
                    }
                }
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static CheckManager getInstance() {
        CheckManager instance;
        if (CheckManagerNew.instance == null) {
            instance = (CheckManagerNew.instance = new CheckManager());
        }
        else {
            instance = CheckManagerNew.instance;
        }
        return instance;
    }
    
    static {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }
    
    private void lambda$onEnable$0(final Check check) {
        final CheckValues checkValues = this.valuesMap.put(check.identifier(), new CheckValues(check));
    }
    
    public CheckValues getValues(final String s) {
        return this.valuesMap.get(s);
    }
}
