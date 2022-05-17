package me.levansj01.verus.compat.v1_16_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_16_R1.*;
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
    private static final String[] llIIlIIlIlIII;
    private static final int[] llIIlIIlIlIIl;
    
    static {
        llIIlllIIIIIIl();
        llIIlllIIIIIII();
        id_field = SafeReflection.access(PacketPlayOutKeepAlive.class, SPacketPlayOutKeepAlive.llIIlIIlIlIII[SPacketPlayOutKeepAlive.llIIlIIlIlIIl[0]]);
    }
    
    public void accept(final PacketPlayOutKeepAlive packetPlayOutKeepAlive) {
        this.id = BigInteger.valueOf((long)SafeReflection.fetch(SPacketPlayOutKeepAlive.id_field, packetPlayOutKeepAlive));
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutKeepAlive)o);
    }
    
    private static void llIIlllIIIIIII() {
        (llIIlIIlIlIII = new String[SPacketPlayOutKeepAlive.llIIlIIlIlIIl[1]])[SPacketPlayOutKeepAlive.llIIlIIlIlIIl[0]] = llIIllIlllllll("2b+bx3kLuRM=", "cWaEE");
    }
    
    private static String llIIllIlllllll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutKeepAlive.llIIlIIlIlIIl[2]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutKeepAlive.llIIlIIlIlIIl[3], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void llIIlllIIIIIIl() {
        (llIIlIIlIlIIl = new int[4])[0] = 0;
        SPacketPlayOutKeepAlive.llIIlIIlIlIIl[1] = 1;
        SPacketPlayOutKeepAlive.llIIlIIlIlIIl[2] = 8;
        SPacketPlayOutKeepAlive.llIIlIIlIlIIl[3] = 2;
    }
}
