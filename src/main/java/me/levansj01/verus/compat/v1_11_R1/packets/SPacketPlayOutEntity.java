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

public class SPacketPlayOutEntity extends VPacketPlayOutEntity
{
    private static final Field yaw_field;
    private static final Field ground_field;
    private static final Field id_field;
    private static final Field look_field;
    private static final Field x_field;
    private static final Field z_field;
    private static final Field pitch_field;
    private static final Field y_field;
    private static final String[] lIllIIIIlIlll;
    private static final int[] lIllIIIlIIIll;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    static {
        lIllIlIIIlIllI();
        lIllIlIIIlIIlI();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[7]]);
    }
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntity.id_field, packetPlayOutEntity);
        this.x = (int)SafeReflection.fetch(SPacketPlayOutEntity.x_field, packetPlayOutEntity);
        this.y = (int)SafeReflection.fetch(SPacketPlayOutEntity.y_field, packetPlayOutEntity);
        this.z = (int)SafeReflection.fetch(SPacketPlayOutEntity.z_field, packetPlayOutEntity);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutEntity.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutEntity.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutEntity.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutEntity.look_field, packetPlayOutEntity);
    }
    
    private static void lIllIlIIIlIIlI() {
        (lIllIIIIlIlll = new String[SPacketPlayOutEntity.lIllIIIlIIIll[8]])[SPacketPlayOutEntity.lIllIIIlIIIll[0]] = lIllIlIIIIllII("IA==", "Akrei");
        SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[1]] = lIllIlIIIIllIl("MJ5OGr2/ozc=", "RGkij");
        SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[2]] = lIllIlIIIIllIl("XFRvThIySW4=", "wLtqO");
        SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[3]] = lIllIlIIIIlllI("kTMEVWpTDnY=", "NDPZY");
        SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[4]] = lIllIlIIIIllII("Bw==", "bGWvl");
        SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[5]] = lIllIlIIIIllIl("SbjVhl+nHhI=", "UqSOJ");
        SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[6]] = lIllIlIIIIlllI("Szb+iUDUtAM=", "BKxVb");
        SPacketPlayOutEntity.lIllIIIIlIlll[SPacketPlayOutEntity.lIllIIIlIIIll[7]] = lIllIlIIIIlllI("juFF1tQ3vnI=", "qACnq");
    }
    
    private static String lIllIlIIIIllII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntity.lIllIIIlIIIll[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntity.lIllIIIlIIIll[0];
        while (lIllIlIIIllIII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (4 == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIllIlIIIIllIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntity.lIllIIIlIIIll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIllIlIIIIlllI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntity.lIllIIIlIIIll[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntity.lIllIIIlIIIll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIllIlIIIlIllI() {
        (lIllIIIlIIIll = new int[9])[0] = 0;
        SPacketPlayOutEntity.lIllIIIlIIIll[1] = 1;
        SPacketPlayOutEntity.lIllIIIlIIIll[2] = 2;
        SPacketPlayOutEntity.lIllIIIlIIIll[3] = 3;
        SPacketPlayOutEntity.lIllIIIlIIIll[4] = 4;
        SPacketPlayOutEntity.lIllIIIlIIIll[5] = 5;
        SPacketPlayOutEntity.lIllIIIlIIIll[6] = 6;
        SPacketPlayOutEntity.lIllIIIlIIIll[7] = 7;
        SPacketPlayOutEntity.lIllIIIlIIIll[8] = 8;
    }
    
    private static boolean lIllIlIIIllIII(final int n, final int n2) {
        return n < n2;
    }
}
