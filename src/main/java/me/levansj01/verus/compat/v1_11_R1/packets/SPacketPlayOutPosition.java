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

public class SPacketPlayOutPosition extends VPacketPlayOutPosition
{
    private static final Field pitch_field;
    private static final Field y_field;
    private static final Field x_field;
    private static final Field flags_field;
    private static final Field z_field;
    private static final Field yaw_field;
    private static final String[] llIIIIlIIllII;
    private static final int[] llIIIIlIllIll;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutPosition)o);
    }
    
    public void accept(final PacketPlayOutPosition packetPlayOutPosition) {
        this.x = (double)SafeReflection.fetch(SPacketPlayOutPosition.x_field, packetPlayOutPosition);
        this.y = (double)SafeReflection.fetch(SPacketPlayOutPosition.y_field, packetPlayOutPosition);
        this.z = (double)SafeReflection.fetch(SPacketPlayOutPosition.z_field, packetPlayOutPosition);
        this.yaw = (float)SafeReflection.fetch(SPacketPlayOutPosition.yaw_field, packetPlayOutPosition);
        this.pitch = (float)SafeReflection.fetch(SPacketPlayOutPosition.pitch_field, packetPlayOutPosition);
        this.flags = (Set<TeleportFlag>)SafeReflection.fetch(SPacketPlayOutPosition.flags_field, packetPlayOutPosition);
    }
    
    static {
        llIIIllIlIlllI();
        llIIIllIIlIIll();
        final Class<PacketPlayOutPosition> clazz = PacketPlayOutPosition.class;
        final String[] array = new String[SPacketPlayOutPosition.llIIIIlIllIll[0]];
        array[SPacketPlayOutPosition.llIIIIlIllIll[1]] = SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[1]];
        array[SPacketPlayOutPosition.llIIIIlIllIll[2]] = SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[2]];
        x_field = SafeReflection.access(clazz, array);
        final Class<PacketPlayOutPosition> clazz2 = PacketPlayOutPosition.class;
        final String[] array2 = new String[SPacketPlayOutPosition.llIIIIlIllIll[0]];
        array2[SPacketPlayOutPosition.llIIIIlIllIll[1]] = SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[0]];
        array2[SPacketPlayOutPosition.llIIIIlIllIll[2]] = SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[3]];
        y_field = SafeReflection.access(clazz2, array2);
        final Class<PacketPlayOutPosition> clazz3 = PacketPlayOutPosition.class;
        final String[] array3 = new String[SPacketPlayOutPosition.llIIIIlIllIll[0]];
        array3[SPacketPlayOutPosition.llIIIIlIllIll[1]] = SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[4]];
        array3[SPacketPlayOutPosition.llIIIIlIllIll[2]] = SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[5]];
        z_field = SafeReflection.access(clazz3, array3);
        final Class<PacketPlayOutPosition> clazz4 = PacketPlayOutPosition.class;
        final String[] array4 = new String[SPacketPlayOutPosition.llIIIIlIllIll[0]];
        array4[SPacketPlayOutPosition.llIIIIlIllIll[1]] = SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[6]];
        array4[SPacketPlayOutPosition.llIIIIlIllIll[2]] = SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[7]];
        yaw_field = SafeReflection.access(clazz4, array4);
        final Class<PacketPlayOutPosition> clazz5 = PacketPlayOutPosition.class;
        final String[] array5 = new String[SPacketPlayOutPosition.llIIIIlIllIll[0]];
        array5[SPacketPlayOutPosition.llIIIIlIllIll[1]] = SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[8]];
        array5[SPacketPlayOutPosition.llIIIIlIllIll[2]] = SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[9]];
        pitch_field = SafeReflection.access(clazz5, array5);
        final Class<PacketPlayOutPosition> clazz6 = PacketPlayOutPosition.class;
        final String[] array6 = new String[SPacketPlayOutPosition.llIIIIlIllIll[0]];
        array6[SPacketPlayOutPosition.llIIIIlIllIll[1]] = SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[10]];
        array6[SPacketPlayOutPosition.llIIIIlIllIll[2]] = SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[11]];
        flags_field = SafeReflection.access(clazz6, array6);
    }
    
    private static void llIIIllIIlIIll() {
        (llIIIIlIIllII = new String[SPacketPlayOutPosition.llIIIIlIllIll[12]])[SPacketPlayOutPosition.llIIIIlIllIll[1]] = llIIIllIIIlllI("Fg==", "weodY");
        SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[2]] = llIIIllIIIlllI("Eg==", "jLGbI");
        SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[0]] = llIIIllIIIllll("1mMI85yLT6A=", "huRrm");
        SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[3]] = llIIIllIIIllll("MuK9dbBHjVs=", "IlCKe");
        SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[4]] = llIIIllIIIllll("yMWKBuS8jyc=", "yxNuq");
        SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[5]] = llIIIllIIIllll("gyybNl758fQ=", "YZsWf");
        SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[6]] = llIIIllIIIlllI("NA==", "PQgWs");
        SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[7]] = llIIIllIIIlllI("LwAa", "VamSw");
        SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[8]] = llIIIllIIIlllI("MA==", "UuEDC");
        SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[9]] = llIIIllIIIlllI("OAAiBB0=", "HiVgu");
        SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[10]] = llIIIllIIlIIlI("hJumPvnZpKU=", "rzHAJ");
        SPacketPlayOutPosition.llIIIIlIIllII[SPacketPlayOutPosition.llIIIIlIllIll[11]] = llIIIllIIIllll("hT3wM2EgPoY=", "JMgrK");
    }
    
    private static String llIIIllIIIlllI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutPosition.llIIIIlIllIll[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutPosition.llIIIIlIllIll[1];
        if (llIIIllIlIllll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            return null;
        }
        return String.valueOf(sb);
    }
    
    private static String llIIIllIIlIIlI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutPosition.llIIIIlIllIll[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIllIIIllll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutPosition.llIIIIlIllIll[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutPosition.llIIIIlIllIll[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void llIIIllIlIlllI() {
        (llIIIIlIllIll = new int[13])[0] = 2;
        SPacketPlayOutPosition.llIIIIlIllIll[1] = 0;
        SPacketPlayOutPosition.llIIIIlIllIll[2] = 1;
        SPacketPlayOutPosition.llIIIIlIllIll[3] = 3;
        SPacketPlayOutPosition.llIIIIlIllIll[4] = 4;
        SPacketPlayOutPosition.llIIIIlIllIll[5] = 5;
        SPacketPlayOutPosition.llIIIIlIllIll[6] = 6;
        SPacketPlayOutPosition.llIIIIlIllIll[7] = 7;
        SPacketPlayOutPosition.llIIIIlIllIll[8] = 8;
        SPacketPlayOutPosition.llIIIIlIllIll[9] = 9;
        SPacketPlayOutPosition.llIIIIlIllIll[10] = 10;
        SPacketPlayOutPosition.llIIIIlIllIll[11] = 11;
        SPacketPlayOutPosition.llIIIIlIllIll[12] = 12;
    }
    
    private static boolean llIIIllIlIllll(final int n, final int n2) {
        return n < n2;
    }
}
