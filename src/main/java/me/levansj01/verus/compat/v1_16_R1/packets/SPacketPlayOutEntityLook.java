package me.levansj01.verus.compat.v1_16_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_16_R1.*;
import me.levansj01.verus.util.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayOutEntityLook extends VPacketPlayOutEntityLook
{
    private static final Field id_field;
    private static final Field x_field;
    private static final Field pitch_field;
    private static final Field yaw_field;
    private static final Field look_field;
    private static final Field ground_field;
    private static final Field y_field;
    private static final Field z_field;
    private static final String[] lllIIIIllllII;
    private static final int[] lllIIIlIIlIll;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    static {
        lllIIllIlIIIll();
        lllIIllIIIllll();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[7]]);
    }
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntityLook.id_field, packetPlayOutEntity);
        this.x = (short)SafeReflection.fetch(SPacketPlayOutEntityLook.x_field, packetPlayOutEntity, Short.TYPE);
        this.y = (short)SafeReflection.fetch(SPacketPlayOutEntityLook.y_field, packetPlayOutEntity, Short.TYPE);
        this.z = (short)SafeReflection.fetch(SPacketPlayOutEntityLook.z_field, packetPlayOutEntity, Short.TYPE);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutEntityLook.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutEntityLook.look_field, packetPlayOutEntity);
    }
    
    private static void lllIIllIIIllll() {
        (lllIIIIllllII = new String[SPacketPlayOutEntityLook.lllIIIlIIlIll[8]])[SPacketPlayOutEntityLook.lllIIIlIIlIll[0]] = lllIIllIIIlIll("3r/cCzuFLzs=", "ynxjq");
        SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[1]] = lllIIllIIIlIll("Eelr8YFDcsA=", "IqhNJ");
        SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[2]] = lllIIllIIIllIl("F74jeBhW3j8=", "vvcvA");
        SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[3]] = lllIIllIIIlllI("NA==", "PUQDa");
        SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[4]] = lllIIllIIIlIll("GZVUkIQRQ7Q=", "QwPnm");
        SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[5]] = lllIIllIIIlllI("NA==", "RkqoV");
        SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[6]] = lllIIllIIIlIll("+4JkIPXKBQ4=", "LTBWz");
        SPacketPlayOutEntityLook.lllIIIIllllII[SPacketPlayOutEntityLook.lllIIIlIIlIll[7]] = lllIIllIIIllIl("ycgIrS50AnE=", "yrodz");
    }
    
    private static String lllIIllIIIlIll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityLook.lllIIIlIIlIll[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityLook.lllIIIlIIlIll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIllIIIllIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityLook.lllIIIlIIlIll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIllIIIlllI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityLook.lllIIIlIIlIll[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityLook.lllIIIlIIlIll[0];
        while (lllIIllIlIIlII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (4 < 2) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lllIIllIlIIIll() {
        (lllIIIlIIlIll = new int[9])[0] = 0;
        SPacketPlayOutEntityLook.lllIIIlIIlIll[1] = 1;
        SPacketPlayOutEntityLook.lllIIIlIIlIll[2] = 2;
        SPacketPlayOutEntityLook.lllIIIlIIlIll[3] = 3;
        SPacketPlayOutEntityLook.lllIIIlIIlIll[4] = 4;
        SPacketPlayOutEntityLook.lllIIIlIIlIll[5] = 5;
        SPacketPlayOutEntityLook.lllIIIlIIlIll[6] = 6;
        SPacketPlayOutEntityLook.lllIIIlIIlIll[7] = 7;
        SPacketPlayOutEntityLook.lllIIIlIIlIll[8] = 8;
    }
    
    private static boolean lllIIllIlIIlII(final int n, final int n2) {
        return n < n2;
    }
}
