package me.levansj01.verus.compat.v1_16_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_16_R1.*;
import me.levansj01.verus.util.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayInCloseWindow extends VPacketPlayInCloseWindow
{
    private static final Field window_field;
    private static final String[] lIIllIlllllll;
    private static final int[] lIIlllIIIIIII;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInCloseWindow)o);
    }
    
    static {
        lIIlllllIIllII();
        lIIlllllIIlIIl();
        window_field = SafeReflection.access(PacketPlayInCloseWindow.class, SPacketPlayInCloseWindow.lIIllIlllllll[SPacketPlayInCloseWindow.lIIlllIIIIIII[0]]);
    }
    
    public void accept(final PacketPlayInCloseWindow packetPlayInCloseWindow) {
        this.window = (int)SafeReflection.fetch(SPacketPlayInCloseWindow.window_field, packetPlayInCloseWindow);
    }
    
    private static void lIIlllllIIlIIl() {
        (lIIllIlllllll = new String[SPacketPlayInCloseWindow.lIIlllIIIIIII[1]])[SPacketPlayInCloseWindow.lIIlllIIIIIII[0]] = lIIlllllIIIlll("X/XOWThXUQQ=", "NbJDs");
    }
    
    private static String lIIlllllIIIlll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayInCloseWindow.lIIlllIIIIIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlllllIIllII() {
        (lIIlllIIIIIII = new int[3])[0] = 0;
        SPacketPlayInCloseWindow.lIIlllIIIIIII[1] = 1;
        SPacketPlayInCloseWindow.lIIlllIIIIIII[2] = 2;
    }
}
