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

public class SPacketPlayOutPosition extends VPacketPlayOutPosition
{
    private static final Field x_field;
    private static final Field flags_field;
    private static final Field pitch_field;
    private static final Field y_field;
    private static final Field yaw_field;
    private static final Field z_field;
    private static final String[] lIIIIllIllIII;
    private static final int[] lIIIIllIllIlI;
    
    static {
        lIIIlIlIIlIIlI();
        lIIIlIlIIIllll();
        final Class<PacketPlayOutPosition> clazz = PacketPlayOutPosition.class;
        final String[] array = new String[SPacketPlayOutPosition.lIIIIllIllIlI[0]];
        array[SPacketPlayOutPosition.lIIIIllIllIlI[1]] = SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[1]];
        array[SPacketPlayOutPosition.lIIIIllIllIlI[2]] = SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[2]];
        x_field = SafeReflection.access(clazz, array);
        final Class<PacketPlayOutPosition> clazz2 = PacketPlayOutPosition.class;
        final String[] array2 = new String[SPacketPlayOutPosition.lIIIIllIllIlI[0]];
        array2[SPacketPlayOutPosition.lIIIIllIllIlI[1]] = SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[0]];
        array2[SPacketPlayOutPosition.lIIIIllIllIlI[2]] = SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[3]];
        y_field = SafeReflection.access(clazz2, array2);
        final Class<PacketPlayOutPosition> clazz3 = PacketPlayOutPosition.class;
        final String[] array3 = new String[SPacketPlayOutPosition.lIIIIllIllIlI[0]];
        array3[SPacketPlayOutPosition.lIIIIllIllIlI[1]] = SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[4]];
        array3[SPacketPlayOutPosition.lIIIIllIllIlI[2]] = SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[5]];
        z_field = SafeReflection.access(clazz3, array3);
        final Class<PacketPlayOutPosition> clazz4 = PacketPlayOutPosition.class;
        final String[] array4 = new String[SPacketPlayOutPosition.lIIIIllIllIlI[0]];
        array4[SPacketPlayOutPosition.lIIIIllIllIlI[1]] = SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[6]];
        array4[SPacketPlayOutPosition.lIIIIllIllIlI[2]] = SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[7]];
        yaw_field = SafeReflection.access(clazz4, array4);
        final Class<PacketPlayOutPosition> clazz5 = PacketPlayOutPosition.class;
        final String[] array5 = new String[SPacketPlayOutPosition.lIIIIllIllIlI[0]];
        array5[SPacketPlayOutPosition.lIIIIllIllIlI[1]] = SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[8]];
        array5[SPacketPlayOutPosition.lIIIIllIllIlI[2]] = SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[9]];
        pitch_field = SafeReflection.access(clazz5, array5);
        final Class<PacketPlayOutPosition> clazz6 = PacketPlayOutPosition.class;
        final String[] array6 = new String[SPacketPlayOutPosition.lIIIIllIllIlI[0]];
        array6[SPacketPlayOutPosition.lIIIIllIllIlI[1]] = SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[10]];
        array6[SPacketPlayOutPosition.lIIIIllIllIlI[2]] = SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[11]];
        flags_field = SafeReflection.access(clazz6, array6);
    }
    
    public void accept(final PacketPlayOutPosition packetPlayOutPosition) {
        this.x = (double)SafeReflection.fetch(SPacketPlayOutPosition.x_field, packetPlayOutPosition);
        this.y = (double)SafeReflection.fetch(SPacketPlayOutPosition.y_field, packetPlayOutPosition);
        this.z = (double)SafeReflection.fetch(SPacketPlayOutPosition.z_field, packetPlayOutPosition);
        this.yaw = (float)SafeReflection.fetch(SPacketPlayOutPosition.yaw_field, packetPlayOutPosition);
        this.pitch = (float)SafeReflection.fetch(SPacketPlayOutPosition.pitch_field, packetPlayOutPosition);
        this.flags = (Set<TeleportFlag>)SafeReflection.fetch(SPacketPlayOutPosition.flags_field, packetPlayOutPosition);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutPosition)o);
    }
    
    private static void lIIIlIlIIIllll() {
        (lIIIIllIllIII = new String[SPacketPlayOutPosition.lIIIIllIllIlI[12]])[SPacketPlayOutPosition.lIIIIllIllIlI[1]] = lIIIlIlIIIlIlI("9koNUBmMYqI=", "SMpLx");
        SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[2]] = lIIIlIlIIIlIll("CQ==", "qbFMq");
        SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[0]] = lIIIlIlIIIllII("H0afkFiLXJI=", "GfocL");
        SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[3]] = lIIIlIlIIIlIll("DQ==", "tVPGy");
        SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[4]] = lIIIlIlIIIlIlI("d8Q+QK7HNlw=", "RKpCc");
        SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[5]] = lIIIlIlIIIllII("ypDB5BP3rik=", "bKqwO");
        SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[6]] = lIIIlIlIIIlIll("Eg==", "vlHnb");
        SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[7]] = lIIIlIlIIIlIll("PC0W", "ELaLa");
        SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[8]] = lIIIlIlIIIlIlI("OHQrAi1h+D4=", "uoyXs");
        SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[9]] = lIIIlIlIIIllII("5WMcwT9+sW8=", "Dmena");
        SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[10]] = lIIIlIlIIIllII("5/kpcLA5Um0=", "VoGai");
        SPacketPlayOutPosition.lIIIIllIllIII[SPacketPlayOutPosition.lIIIIllIllIlI[11]] = lIIIlIlIIIlIlI("AbQsLW22S1o=", "OOxek");
    }
    
    private static String lIIIlIlIIIlIll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutPosition.lIIIIllIllIlI[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutPosition.lIIIIllIllIlI[1];
        while (lIIIlIlIIlIIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIIIlIlIIIllII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutPosition.lIIIIllIllIlI[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutPosition.lIIIIllIllIlI[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIlIlIIIlIlI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutPosition.lIIIIllIllIlI[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIlIIlIIlI() {
        (lIIIIllIllIlI = new int[13])[0] = 2;
        SPacketPlayOutPosition.lIIIIllIllIlI[1] = 0;
        SPacketPlayOutPosition.lIIIIllIllIlI[2] = 1;
        SPacketPlayOutPosition.lIIIIllIllIlI[3] = 3;
        SPacketPlayOutPosition.lIIIIllIllIlI[4] = 4;
        SPacketPlayOutPosition.lIIIIllIllIlI[5] = 5;
        SPacketPlayOutPosition.lIIIIllIllIlI[6] = 6;
        SPacketPlayOutPosition.lIIIIllIllIlI[7] = 7;
        SPacketPlayOutPosition.lIIIIllIllIlI[8] = 8;
        SPacketPlayOutPosition.lIIIIllIllIlI[9] = 9;
        SPacketPlayOutPosition.lIIIIllIllIlI[10] = 10;
        SPacketPlayOutPosition.lIIIIllIllIlI[11] = 11;
        SPacketPlayOutPosition.lIIIIllIllIlI[12] = 12;
    }
    
    private static boolean lIIIlIlIIlIIll(final int n, final int n2) {
        return n < n2;
    }
}
