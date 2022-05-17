package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_7_R4.*;
import me.levansj01.verus.util.java.*;
import com.google.common.collect.*;
import java.util.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class SPacketPlayOutPosition extends VPacketPlayOutPosition
{
    private static final Field flags_field;
    private static final Field z_field;
    private static final Field yaw_field;
    private static final Field x_field;
    private static final Field y_field;
    private static final Field pitch_field;
    private static final String[] llIllIlllllIl;
    private static final int[] llIllIllllllI;
    
    static {
        lllIIIIIlIIIII();
        lllIIIIIIlllll();
        final Class<PacketPlayOutPosition> clazz = PacketPlayOutPosition.class;
        final String[] array = new String[SPacketPlayOutPosition.llIllIllllllI[0]];
        array[SPacketPlayOutPosition.llIllIllllllI[1]] = SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[1]];
        array[SPacketPlayOutPosition.llIllIllllllI[2]] = SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[2]];
        x_field = SafeReflection.access(clazz, array);
        final Class<PacketPlayOutPosition> clazz2 = PacketPlayOutPosition.class;
        final String[] array2 = new String[SPacketPlayOutPosition.llIllIllllllI[0]];
        array2[SPacketPlayOutPosition.llIllIllllllI[1]] = SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[0]];
        array2[SPacketPlayOutPosition.llIllIllllllI[2]] = SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[3]];
        y_field = SafeReflection.access(clazz2, array2);
        final Class<PacketPlayOutPosition> clazz3 = PacketPlayOutPosition.class;
        final String[] array3 = new String[SPacketPlayOutPosition.llIllIllllllI[0]];
        array3[SPacketPlayOutPosition.llIllIllllllI[1]] = SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[4]];
        array3[SPacketPlayOutPosition.llIllIllllllI[2]] = SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[5]];
        z_field = SafeReflection.access(clazz3, array3);
        final Class<PacketPlayOutPosition> clazz4 = PacketPlayOutPosition.class;
        final String[] array4 = new String[SPacketPlayOutPosition.llIllIllllllI[0]];
        array4[SPacketPlayOutPosition.llIllIllllllI[1]] = SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[6]];
        array4[SPacketPlayOutPosition.llIllIllllllI[2]] = SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[7]];
        yaw_field = SafeReflection.access(clazz4, array4);
        final Class<PacketPlayOutPosition> clazz5 = PacketPlayOutPosition.class;
        final String[] array5 = new String[SPacketPlayOutPosition.llIllIllllllI[0]];
        array5[SPacketPlayOutPosition.llIllIllllllI[1]] = SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[8]];
        array5[SPacketPlayOutPosition.llIllIllllllI[2]] = SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[9]];
        pitch_field = SafeReflection.access(clazz5, array5);
        Field access = null;
        try {
            final Class<PacketPlayOutPosition> clazz6 = PacketPlayOutPosition.class;
            final String[] array6 = new String[SPacketPlayOutPosition.llIllIllllllI[0]];
            array6[SPacketPlayOutPosition.llIllIllllllI[1]] = SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[10]];
            array6[SPacketPlayOutPosition.llIllIllllllI[2]] = SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[11]];
            access = SafeReflection.access(clazz6, array6);
            if (1 <= 0) {
                return;
            }
        }
        catch (IllegalArgumentException ex) {}
        flags_field = access;
    }
    
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
        this.flags = (Set<TeleportFlag>)Sets.newHashSet();
        final Set<TeleportFlag> flags = this.flags;
        final TeleportFlag[] array = new TeleportFlag[SPacketPlayOutPosition.llIllIllllllI[3]];
        array[SPacketPlayOutPosition.llIllIllllllI[1]] = TeleportFlag.X;
        array[SPacketPlayOutPosition.llIllIllllllI[2]] = TeleportFlag.Y;
        array[SPacketPlayOutPosition.llIllIllllllI[0]] = TeleportFlag.Z;
        flags.addAll(Arrays.asList(array));
        if (lllIIIIIlIIIIl(SPacketPlayOutPosition.flags_field) && lllIIIIIlIIIlI(((boolean)SafeReflection.fetch(SPacketPlayOutPosition.flags_field, packetPlayOutPosition)) ? 1 : 0)) {
            final Set<TeleportFlag> flags2 = this.flags;
            final TeleportFlag[] array2 = new TeleportFlag[SPacketPlayOutPosition.llIllIllllllI[0]];
            array2[SPacketPlayOutPosition.llIllIllllllI[1]] = TeleportFlag.X_ROT;
            array2[SPacketPlayOutPosition.llIllIllllllI[2]] = TeleportFlag.Y_ROT;
            flags2.addAll(Arrays.asList(array2));
        }
    }
    
    private static void lllIIIIIIlllll() {
        (llIllIlllllIl = new String[SPacketPlayOutPosition.llIllIllllllI[12]])[SPacketPlayOutPosition.llIllIllllllI[1]] = lllIIIIIIlllII("4p+6tqon6ek=", "osEQe");
        SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[2]] = lllIIIIIIlllIl("R8MljGCrUH4=", "mKyqy");
        SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[0]] = lllIIIIIIlllII("RUWIHW8ISMg=", "ZCUmI");
        SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[3]] = lllIIIIIIlllII("EzK6LWqzuY8=", "LxkPj");
        SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[4]] = lllIIIIIIlllIl("x4uEkxYBR3k=", "swOIE");
        SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[5]] = lllIIIIIIllllI("EA==", "jKmXr");
        SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[6]] = lllIIIIIIlllII("3byRc8Zoht8=", "FqcCu");
        SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[7]] = lllIIIIIIllllI("EjE9", "kPJpM");
        SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[8]] = lllIIIIIIlllIl("A2unjsOSjeY=", "zuRQL");
        SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[9]] = lllIIIIIIlllIl("sgYQ7nljJ00=", "iLiWZ");
        SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[10]] = lllIIIIIIlllIl("IuW/TIE5D8M=", "NAcDp");
        SPacketPlayOutPosition.llIllIlllllIl[SPacketPlayOutPosition.llIllIllllllI[11]] = lllIIIIIIlllII("R1ujxWrDZy8=", "CxxOj");
    }
    
    private static String lllIIIIIIllllI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutPosition.llIllIllllllI[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutPosition.llIllIllllllI[1];
        while (lllIIIIIlIIIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lllIIIIIIlllII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutPosition.llIllIllllllI[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIIIIIlllIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutPosition.llIllIllllllI[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutPosition.llIllIllllllI[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIIIIlIIIII() {
        (llIllIllllllI = new int[13])[0] = 2;
        SPacketPlayOutPosition.llIllIllllllI[1] = 0;
        SPacketPlayOutPosition.llIllIllllllI[2] = 1;
        SPacketPlayOutPosition.llIllIllllllI[3] = 3;
        SPacketPlayOutPosition.llIllIllllllI[4] = 4;
        SPacketPlayOutPosition.llIllIllllllI[5] = 5;
        SPacketPlayOutPosition.llIllIllllllI[6] = 6;
        SPacketPlayOutPosition.llIllIllllllI[7] = 7;
        SPacketPlayOutPosition.llIllIllllllI[8] = 8;
        SPacketPlayOutPosition.llIllIllllllI[9] = 9;
        SPacketPlayOutPosition.llIllIllllllI[10] = 10;
        SPacketPlayOutPosition.llIllIllllllI[11] = 11;
        SPacketPlayOutPosition.llIllIllllllI[12] = 12;
    }
    
    private static boolean lllIIIIIlIIIll(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean lllIIIIIlIIIIl(final Object o) {
        return o != null;
    }
    
    private static boolean lllIIIIIlIIIlI(final int n) {
        return n != 0;
    }
}
