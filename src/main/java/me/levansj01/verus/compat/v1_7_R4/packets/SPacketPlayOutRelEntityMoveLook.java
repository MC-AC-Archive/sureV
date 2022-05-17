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

public class SPacketPlayOutRelEntityMoveLook extends VPacketPlayOutRelEntityMoveLook
{
    private static final Field id_field;
    private static final Field yaw_field;
    private static final Field z_field;
    private static final Field pitch_field;
    private static final Field ground_field;
    private static final Field y_field;
    private static final Field x_field;
    private static final String[] lIIlllllIllll;
    private static final int[] lIlIIIIIIIIlI;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.id_field, packetPlayOutEntity);
        this.x = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.x_field, packetPlayOutEntity);
        this.y = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.y_field, packetPlayOutEntity);
        this.z = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.z_field, packetPlayOutEntity);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.ground_field, packetPlayOutEntity);
        this.look = (SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[0] != 0);
    }
    
    static {
        lIlIIIllIIIllI();
        lIlIIIlIlIlIIl();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIlllllIllll[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIlllllIllll[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIlllllIllll[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIlllllIllll[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIlllllIllll[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIlllllIllll[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIlllllIllll[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[6]]);
    }
    
    private static void lIlIIIlIlIlIIl() {
        (lIIlllllIllll = new String[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[7]])[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[0]] = lIlIIIlIlIIlIl("MA==", "QazUq");
        SPacketPlayOutRelEntityMoveLook.lIIlllllIllll[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[1]] = lIlIIIlIlIIlIl("Iw==", "AOzmx");
        SPacketPlayOutRelEntityMoveLook.lIIlllllIllll[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[2]] = lIlIIIlIlIIllI("E23+sDq3cDo=", "EHADL");
        SPacketPlayOutRelEntityMoveLook.lIIlllllIllll[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[3]] = lIlIIIlIlIIlll("HJxaVWjS0iQ=", "ryFBd");
        SPacketPlayOutRelEntityMoveLook.lIIlllllIllll[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[4]] = lIlIIIlIlIIlll("T2d4BpVq2yk=", "gpWRv");
        SPacketPlayOutRelEntityMoveLook.lIIlllllIllll[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[5]] = lIlIIIlIlIIllI("teeT8t4arog=", "qrxAD");
        SPacketPlayOutRelEntityMoveLook.lIIlllllIllll[SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[6]] = lIlIIIlIlIIlll("u88r4DDzCg4=", "HAVvn");
    }
    
    private static String lIlIIIlIlIIllI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIIlIlIIlIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[0];
        while (lIlIIIllIIlIII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (-1 >= 4) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIlIIIlIlIIlll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIllIIIllI() {
        (lIlIIIIIIIIlI = new int[9])[0] = 0;
        SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[1] = 1;
        SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[2] = 2;
        SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[3] = 3;
        SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[4] = 4;
        SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[5] = 5;
        SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[6] = 6;
        SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[7] = 7;
        SPacketPlayOutRelEntityMoveLook.lIlIIIIIIIIlI[8] = 8;
    }
    
    private static boolean lIlIIIllIIlIII(final int n, final int n2) {
        return n < n2;
    }
}
