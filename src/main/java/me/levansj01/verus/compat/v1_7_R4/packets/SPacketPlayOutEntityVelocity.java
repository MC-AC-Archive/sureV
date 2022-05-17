package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_7_R4.*;
import me.levansj01.verus.util.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayOutEntityVelocity extends VPacketPlayOutEntityVelocity
{
    private static final Field motX_field;
    private static final Field motY_field;
    private static final Field motZ_field;
    private static final Field id_field;
    private static final String[] lllIlllIIIIl;
    private static final int[] llllIIIIlIII;
    
    static {
        llllIllIIIIIl();
        llllIIlIIIIlI();
        id_field = SafeReflection.access(PacketPlayOutEntityVelocity.class, SPacketPlayOutEntityVelocity.lllIlllIIIIl[SPacketPlayOutEntityVelocity.llllIIIIlIII[0]]);
        motX_field = SafeReflection.access(PacketPlayOutEntityVelocity.class, SPacketPlayOutEntityVelocity.lllIlllIIIIl[SPacketPlayOutEntityVelocity.llllIIIIlIII[1]]);
        motY_field = SafeReflection.access(PacketPlayOutEntityVelocity.class, SPacketPlayOutEntityVelocity.lllIlllIIIIl[SPacketPlayOutEntityVelocity.llllIIIIlIII[2]]);
        motZ_field = SafeReflection.access(PacketPlayOutEntityVelocity.class, SPacketPlayOutEntityVelocity.lllIlllIIIIl[SPacketPlayOutEntityVelocity.llllIIIIlIII[3]]);
    }
    
    public void accept(final PacketPlayOutEntityVelocity packetPlayOutEntityVelocity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.id_field, packetPlayOutEntityVelocity);
        this.motX = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.motX_field, packetPlayOutEntityVelocity);
        this.motY = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.motY_field, packetPlayOutEntityVelocity);
        this.motZ = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.motZ_field, packetPlayOutEntityVelocity);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntityVelocity)o);
    }
    
    private static void llllIIlIIIIlI() {
        (lllIlllIIIIl = new String[SPacketPlayOutEntityVelocity.llllIIIIlIII[4]])[SPacketPlayOutEntityVelocity.llllIIIIlIII[0]] = llllIIIllllll("gz8gFpeDKiM=", "IzgpT");
        SPacketPlayOutEntityVelocity.lllIlllIIIIl[SPacketPlayOutEntityVelocity.llllIIIIlIII[1]] = llllIIlIIIIII("R91cnW+FaVY=", "aeNnb");
        SPacketPlayOutEntityVelocity.lllIlllIIIIl[SPacketPlayOutEntityVelocity.llllIIIIlIII[2]] = llllIIIllllll("zkRPEFoCr1c=", "mEIgM");
        SPacketPlayOutEntityVelocity.lllIlllIIIIl[SPacketPlayOutEntityVelocity.llllIIIIlIII[3]] = llllIIlIIIIIl("LA==", "HbtnI");
    }
    
    private static String llllIIIllllll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityVelocity.llllIIIIlIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llllIIlIIIIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityVelocity.llllIIIIlIII[5]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityVelocity.llllIIIIlIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llllIIlIIIIIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityVelocity.llllIIIIlIII[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityVelocity.llllIIIIlIII[0];
        while (llllIllIIIIlI(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void llllIllIIIIIl() {
        (llllIIIIlIII = new int[6])[0] = 0;
        SPacketPlayOutEntityVelocity.llllIIIIlIII[1] = 1;
        SPacketPlayOutEntityVelocity.llllIIIIlIII[2] = 2;
        SPacketPlayOutEntityVelocity.llllIIIIlIII[3] = 3;
        SPacketPlayOutEntityVelocity.llllIIIIlIII[4] = 4;
        SPacketPlayOutEntityVelocity.llllIIIIlIII[5] = 8;
    }
    
    private static boolean llllIllIIIIlI(final int n, final int n2) {
        return n < n2;
    }
}
