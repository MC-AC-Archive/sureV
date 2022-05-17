package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_12_R1.*;
import me.levansj01.verus.util.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayOutEntityVelocity extends VPacketPlayOutEntityVelocity
{
    private static final Field motY_field;
    private static final Field id_field;
    private static final Field motX_field;
    private static final Field motZ_field;
    private static final String[] lllIIIIIIlIIl;
    private static final int[] lllIIIIIIllll;
    
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
    
    static {
        lllIIlIIlIlIlI();
        lllIIlIIlIIIll();
        final Class<PacketPlayOutEntityVelocity> clazz = PacketPlayOutEntityVelocity.class;
        final String[] array = new String[SPacketPlayOutEntityVelocity.lllIIIIIIllll[0]];
        array[SPacketPlayOutEntityVelocity.lllIIIIIIllll[1]] = SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[1]];
        array[SPacketPlayOutEntityVelocity.lllIIIIIIllll[2]] = SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[2]];
        id_field = SafeReflection.access(clazz, array);
        final Class<PacketPlayOutEntityVelocity> clazz2 = PacketPlayOutEntityVelocity.class;
        final String[] array2 = new String[SPacketPlayOutEntityVelocity.lllIIIIIIllll[0]];
        array2[SPacketPlayOutEntityVelocity.lllIIIIIIllll[1]] = SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[0]];
        array2[SPacketPlayOutEntityVelocity.lllIIIIIIllll[2]] = SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[3]];
        motX_field = SafeReflection.access(clazz2, array2);
        final Class<PacketPlayOutEntityVelocity> clazz3 = PacketPlayOutEntityVelocity.class;
        final String[] array3 = new String[SPacketPlayOutEntityVelocity.lllIIIIIIllll[0]];
        array3[SPacketPlayOutEntityVelocity.lllIIIIIIllll[1]] = SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[4]];
        array3[SPacketPlayOutEntityVelocity.lllIIIIIIllll[2]] = SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[5]];
        motY_field = SafeReflection.access(clazz3, array3);
        final Class<PacketPlayOutEntityVelocity> clazz4 = PacketPlayOutEntityVelocity.class;
        final String[] array4 = new String[SPacketPlayOutEntityVelocity.lllIIIIIIllll[0]];
        array4[SPacketPlayOutEntityVelocity.lllIIIIIIllll[1]] = SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[6]];
        array4[SPacketPlayOutEntityVelocity.lllIIIIIIllll[2]] = SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[7]];
        motZ_field = SafeReflection.access(clazz4, array4);
    }
    
    private static void lllIIlIIlIIIll() {
        (lllIIIIIIlIIl = new String[SPacketPlayOutEntityVelocity.lllIIIIIIllll[8]])[SPacketPlayOutEntityVelocity.lllIIIIIIllll[1]] = lllIIlIIIlllIl("jsI1X9/qMTk=", "Ovzex");
        SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[2]] = lllIIlIIIlllll("Gm1rx9bRg/I=", "VChLr");
        SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[0]] = lllIIlIIIlllIl("n0DaZoALBbU=", "SZGAq");
        SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[3]] = lllIIlIIlIIIlI("PQ==", "EaJZJ");
        SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[4]] = lllIIlIIIlllIl("wmq6QY/JJdc=", "MdxUR");
        SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[5]] = lllIIlIIIlllIl("enVvhux5Zlg=", "NxMnY");
        SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[6]] = lllIIlIIlIIIlI("PA==", "XSlCB");
        SPacketPlayOutEntityVelocity.lllIIIIIIlIIl[SPacketPlayOutEntityVelocity.lllIIIIIIllll[7]] = lllIIlIIlIIIlI("AA==", "zfMbC");
    }
    
    private static String lllIIlIIlIIIlI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityVelocity.lllIIIIIIllll[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityVelocity.lllIIIIIIllll[1];
        while (lllIIlIIlIlIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (4 == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lllIIlIIIlllIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityVelocity.lllIIIIIIllll[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIlIIIlllll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityVelocity.lllIIIIIIllll[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityVelocity.lllIIIIIIllll[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIlIIlIlIlI() {
        (lllIIIIIIllll = new int[9])[0] = 2;
        SPacketPlayOutEntityVelocity.lllIIIIIIllll[1] = 0;
        SPacketPlayOutEntityVelocity.lllIIIIIIllll[2] = 1;
        SPacketPlayOutEntityVelocity.lllIIIIIIllll[3] = 3;
        SPacketPlayOutEntityVelocity.lllIIIIIIllll[4] = 4;
        SPacketPlayOutEntityVelocity.lllIIIIIIllll[5] = 5;
        SPacketPlayOutEntityVelocity.lllIIIIIIllll[6] = 6;
        SPacketPlayOutEntityVelocity.lllIIIIIIllll[7] = 7;
        SPacketPlayOutEntityVelocity.lllIIIIIIllll[8] = 8;
    }
    
    private static boolean lllIIlIIlIlIll(final int n, final int n2) {
        return n < n2;
    }
}
