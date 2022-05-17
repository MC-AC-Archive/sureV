package me.levansj01.verus.compat.v1_14_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_14_R1.*;
import me.levansj01.verus.util.java.*;
import java.math.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayOutKeepAlive extends VPacketPlayOutKeepAlive
{
    private static final Field id_field;
    private static final String[] lIIllIIIIIlII;
    private static final int[] lIIllIIIIllII;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutKeepAlive)o);
    }
    
    public void accept(final PacketPlayOutKeepAlive packetPlayOutKeepAlive) {
        this.id = BigInteger.valueOf((long)SafeReflection.fetch(SPacketPlayOutKeepAlive.id_field, packetPlayOutKeepAlive));
    }
    
    static {
        lIIllIllIlIIII();
        lIIllIllIIllII();
        id_field = SafeReflection.access(PacketPlayOutKeepAlive.class, SPacketPlayOutKeepAlive.lIIllIIIIIlII[SPacketPlayOutKeepAlive.lIIllIIIIllII[0]]);
    }
    
    private static void lIIllIllIIllII() {
        (lIIllIIIIIlII = new String[SPacketPlayOutKeepAlive.lIIllIIIIllII[1]])[SPacketPlayOutKeepAlive.lIIllIIIIllII[0]] = lIIllIllIIIlIl("KfKRdVql25U=", "TvTWt");
    }
    
    private static String lIIllIllIIIlIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutKeepAlive.lIIllIIIIllII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIllIllIlIIII() {
        (lIIllIIIIllII = new int[3])[0] = 0;
        SPacketPlayOutKeepAlive.lIIllIIIIllII[1] = 1;
        SPacketPlayOutKeepAlive.lIIllIIIIllII[2] = 2;
    }
}
