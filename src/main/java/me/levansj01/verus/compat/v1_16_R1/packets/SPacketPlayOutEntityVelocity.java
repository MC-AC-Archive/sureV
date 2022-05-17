package me.levansj01.verus.compat.v1_16_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_16_R1.*;
import me.levansj01.verus.util.java.*;
import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class SPacketPlayOutEntityVelocity extends VPacketPlayOutEntityVelocity
{
    private static final Field motZ_field;
    private static final Field id_field;
    private static final Field motX_field;
    private static final Field motY_field;
    private static final String[] llIllIlllIIlI;
    private static final int[] llIllIlllIIll;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntityVelocity)o);
    }
    
    static {
        llIllllllllIll();
        llIllllllllIlI();
        final Class<PacketPlayOutEntityVelocity> clazz = PacketPlayOutEntityVelocity.class;
        final String[] array = new String[SPacketPlayOutEntityVelocity.llIllIlllIIll[0]];
        array[SPacketPlayOutEntityVelocity.llIllIlllIIll[1]] = SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[1]];
        array[SPacketPlayOutEntityVelocity.llIllIlllIIll[2]] = SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[2]];
        id_field = SafeReflection.access(clazz, array);
        final Class<PacketPlayOutEntityVelocity> clazz2 = PacketPlayOutEntityVelocity.class;
        final String[] array2 = new String[SPacketPlayOutEntityVelocity.llIllIlllIIll[0]];
        array2[SPacketPlayOutEntityVelocity.llIllIlllIIll[1]] = SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[0]];
        array2[SPacketPlayOutEntityVelocity.llIllIlllIIll[2]] = SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[3]];
        motX_field = SafeReflection.access(clazz2, array2);
        final Class<PacketPlayOutEntityVelocity> clazz3 = PacketPlayOutEntityVelocity.class;
        final String[] array3 = new String[SPacketPlayOutEntityVelocity.llIllIlllIIll[0]];
        array3[SPacketPlayOutEntityVelocity.llIllIlllIIll[1]] = SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[4]];
        array3[SPacketPlayOutEntityVelocity.llIllIlllIIll[2]] = SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[5]];
        motY_field = SafeReflection.access(clazz3, array3);
        final Class<PacketPlayOutEntityVelocity> clazz4 = PacketPlayOutEntityVelocity.class;
        final String[] array4 = new String[SPacketPlayOutEntityVelocity.llIllIlllIIll[0]];
        array4[SPacketPlayOutEntityVelocity.llIllIlllIIll[1]] = SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[6]];
        array4[SPacketPlayOutEntityVelocity.llIllIlllIIll[2]] = SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[7]];
        motZ_field = SafeReflection.access(clazz4, array4);
    }
    
    public void accept(final PacketPlayOutEntityVelocity packetPlayOutEntityVelocity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.id_field, packetPlayOutEntityVelocity);
        this.motX = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.motX_field, packetPlayOutEntityVelocity);
        this.motY = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.motY_field, packetPlayOutEntityVelocity);
        this.motZ = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.motZ_field, packetPlayOutEntityVelocity);
    }
    
    private static void llIllllllllIlI() {
        (llIllIlllIIlI = new String[SPacketPlayOutEntityVelocity.llIllIlllIIll[8]])[SPacketPlayOutEntityVelocity.llIllIlllIIll[1]] = llIlllllllIlll("+9GsvwR2x7M=", "aYrCA");
        SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[2]] = llIllllllllIII("33P5G4adKHM=", "YRJFC");
        SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[0]] = llIllllllllIII("it3UTmJq8CU=", "Kmito");
        SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[3]] = llIllllllllIII("uQSth6/4J+A=", "JBXDW");
        SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[4]] = llIllllllllIIl("Cg==", "ibVPr");
        SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[5]] = llIllllllllIIl("AQ==", "xIdty");
        SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[6]] = llIlllllllIlll("MHVnBCLX/T8=", "lqdnr");
        SPacketPlayOutEntityVelocity.llIllIlllIIlI[SPacketPlayOutEntityVelocity.llIllIlllIIll[7]] = llIllllllllIIl("MA==", "JcmNp");
    }
    
    private static String llIllllllllIIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityVelocity.llIllIlllIIll[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityVelocity.llIllIlllIIll[1];
        while (llIlllllllllII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (1 <= -1) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String llIllllllllIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityVelocity.llIllIlllIIll[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityVelocity.llIllIlllIIll[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIlllllllIlll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityVelocity.llIllIlllIIll[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void llIllllllllIll() {
        (llIllIlllIIll = new int[9])[0] = 2;
        SPacketPlayOutEntityVelocity.llIllIlllIIll[1] = 0;
        SPacketPlayOutEntityVelocity.llIllIlllIIll[2] = 1;
        SPacketPlayOutEntityVelocity.llIllIlllIIll[3] = 3;
        SPacketPlayOutEntityVelocity.llIllIlllIIll[4] = 4;
        SPacketPlayOutEntityVelocity.llIllIlllIIll[5] = 5;
        SPacketPlayOutEntityVelocity.llIllIlllIIll[6] = 6;
        SPacketPlayOutEntityVelocity.llIllIlllIIll[7] = 7;
        SPacketPlayOutEntityVelocity.llIllIlllIIll[8] = 8;
    }
    
    private static boolean llIlllllllllII(final int n, final int n2) {
        return n < n2;
    }
}
