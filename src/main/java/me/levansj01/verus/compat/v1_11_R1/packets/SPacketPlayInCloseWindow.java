package me.levansj01.verus.compat.v1_11_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_11_R1.*;
import me.levansj01.verus.util.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayInCloseWindow extends VPacketPlayInCloseWindow
{
    private static final Field window_field;
    private static final String[] llIlIlIIIllIl;
    private static final int[] llIlIlIIIllll;
    
    public void accept(final PacketPlayInCloseWindow packetPlayInCloseWindow) {
        this.window = (int)SafeReflection.fetch(SPacketPlayInCloseWindow.window_field, packetPlayInCloseWindow);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInCloseWindow)o);
    }
    
    static {
        llIllIIllIlIll();
        llIllIIllIlIII();
        window_field = SafeReflection.access(PacketPlayInCloseWindow.class, SPacketPlayInCloseWindow.llIlIlIIIllIl[SPacketPlayInCloseWindow.llIlIlIIIllll[0]]);
    }
    
    private static void llIllIIllIlIII() {
        (llIlIlIIIllIl = new String[SPacketPlayInCloseWindow.llIlIlIIIllll[1]])[SPacketPlayInCloseWindow.llIlIlIIIllll[0]] = llIllIIllIIlll("49sQpSFeXe4=", "ANOvB");
    }
    
    private static String llIllIIllIIlll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayInCloseWindow.llIlIlIIIllll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void llIllIIllIlIll() {
        (llIlIlIIIllll = new int[3])[0] = 0;
        SPacketPlayInCloseWindow.llIlIlIIIllll[1] = 1;
        SPacketPlayInCloseWindow.llIlIlIIIllll[2] = 2;
    }
}
