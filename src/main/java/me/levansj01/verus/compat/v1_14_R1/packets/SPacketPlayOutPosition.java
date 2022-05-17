package me.levansj01.verus.compat.v1_14_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_14_R1.*;
import me.levansj01.verus.util.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayOutPosition extends VPacketPlayOutPosition
{
    private static final Field pitch_field;
    private static final Field flags_field;
    private static final Field x_field;
    private static final Field yaw_field;
    private static final Field y_field;
    private static final Field z_field;
    private static final String[] lIlllIllIlIIl;
    private static final int[] lIlllllIIIIll;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutPosition)o);
    }
    
    static {
        llIIIIlIIIllIl();
        lIlllllllIlllI();
        final Class<PacketPlayOutPosition> clazz = PacketPlayOutPosition.class;
        final String[] array = new String[SPacketPlayOutPosition.lIlllllIIIIll[0]];
        array[SPacketPlayOutPosition.lIlllllIIIIll[1]] = SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[1]];
        array[SPacketPlayOutPosition.lIlllllIIIIll[2]] = SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[2]];
        x_field = SafeReflection.access(clazz, array);
        final Class<PacketPlayOutPosition> clazz2 = PacketPlayOutPosition.class;
        final String[] array2 = new String[SPacketPlayOutPosition.lIlllllIIIIll[0]];
        array2[SPacketPlayOutPosition.lIlllllIIIIll[1]] = SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[0]];
        array2[SPacketPlayOutPosition.lIlllllIIIIll[2]] = SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[3]];
        y_field = SafeReflection.access(clazz2, array2);
        final Class<PacketPlayOutPosition> clazz3 = PacketPlayOutPosition.class;
        final String[] array3 = new String[SPacketPlayOutPosition.lIlllllIIIIll[0]];
        array3[SPacketPlayOutPosition.lIlllllIIIIll[1]] = SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[4]];
        array3[SPacketPlayOutPosition.lIlllllIIIIll[2]] = SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[5]];
        z_field = SafeReflection.access(clazz3, array3);
        final Class<PacketPlayOutPosition> clazz4 = PacketPlayOutPosition.class;
        final String[] array4 = new String[SPacketPlayOutPosition.lIlllllIIIIll[0]];
        array4[SPacketPlayOutPosition.lIlllllIIIIll[1]] = SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[6]];
        array4[SPacketPlayOutPosition.lIlllllIIIIll[2]] = SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[7]];
        yaw_field = SafeReflection.access(clazz4, array4);
        final Class<PacketPlayOutPosition> clazz5 = PacketPlayOutPosition.class;
        final String[] array5 = new String[SPacketPlayOutPosition.lIlllllIIIIll[0]];
        array5[SPacketPlayOutPosition.lIlllllIIIIll[1]] = SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[8]];
        array5[SPacketPlayOutPosition.lIlllllIIIIll[2]] = SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[9]];
        pitch_field = SafeReflection.access(clazz5, array5);
        final Class<PacketPlayOutPosition> clazz6 = PacketPlayOutPosition.class;
        final String[] array6 = new String[SPacketPlayOutPosition.lIlllllIIIIll[0]];
        array6[SPacketPlayOutPosition.lIlllllIIIIll[1]] = SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[10]];
        array6[SPacketPlayOutPosition.lIlllllIIIIll[2]] = SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[11]];
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
    
    private static void lIlllllllIlllI() {
        (lIlllIllIlIIl = new String[SPacketPlayOutPosition.lIlllllIIIIll[12]])[SPacketPlayOutPosition.lIlllllIIIIll[1]] = lIlllllllIlIll("Aw==", "bvFvf");
        SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[2]] = lIlllllllIlIll("MQ==", "IdhdS");
        SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[0]] = lIlllllllIllII("1d57440wREc=", "GwlCR");
        SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[3]] = lIlllllllIllII("6DmO8Atccak=", "aiWek");
        SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[4]] = lIlllllllIllII("jXah2InzvTE=", "WqPuJ");
        SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[5]] = lIlllllllIllIl("V+Hgnp7IiUE=", "hnbKC");
        SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[6]] = lIlllllllIllII("MGYGjpP16L4=", "BsVro");
        SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[7]] = lIlllllllIlIll("EQIP", "hcxQG");
        SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[8]] = lIlllllllIllII("7uUOyhmxIvo=", "hOwRx");
        SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[9]] = lIlllllllIlIll("OgcBASU=", "JnubM");
        SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[10]] = lIlllllllIllII("U9zwENoLzWg=", "vXCDV");
        SPacketPlayOutPosition.lIlllIllIlIIl[SPacketPlayOutPosition.lIlllllIIIIll[11]] = lIlllllllIllII("baYz/8glfRo=", "qZUqw");
    }
    
    private static String lIlllllllIllII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutPosition.lIlllllIIIIll[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutPosition.lIlllllIIIIll[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIlllllllIllIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutPosition.lIlllllIIIIll[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIlllllllIlIll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutPosition.lIlllllIIIIll[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutPosition.lIlllllIIIIll[1];
        while (llIIIIlIIIllll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (-2 >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void llIIIIlIIIllIl() {
        (lIlllllIIIIll = new int[13])[0] = 2;
        SPacketPlayOutPosition.lIlllllIIIIll[1] = 0;
        SPacketPlayOutPosition.lIlllllIIIIll[2] = 1;
        SPacketPlayOutPosition.lIlllllIIIIll[3] = 3;
        SPacketPlayOutPosition.lIlllllIIIIll[4] = 4;
        SPacketPlayOutPosition.lIlllllIIIIll[5] = 5;
        SPacketPlayOutPosition.lIlllllIIIIll[6] = 6;
        SPacketPlayOutPosition.lIlllllIIIIll[7] = 7;
        SPacketPlayOutPosition.lIlllllIIIIll[8] = 8;
        SPacketPlayOutPosition.lIlllllIIIIll[9] = 9;
        SPacketPlayOutPosition.lIlllllIIIIll[10] = 10;
        SPacketPlayOutPosition.lIlllllIIIIll[11] = 11;
        SPacketPlayOutPosition.lIlllllIIIIll[12] = 12;
    }
    
    private static boolean llIIIIlIIIllll(final int n, final int n2) {
        return n < n2;
    }
}
