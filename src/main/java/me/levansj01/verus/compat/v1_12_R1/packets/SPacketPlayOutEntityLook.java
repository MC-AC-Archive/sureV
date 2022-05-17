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

public class SPacketPlayOutEntityLook extends VPacketPlayOutEntityLook
{
    private static final Field ground_field;
    private static final Field z_field;
    private static final Field yaw_field;
    private static final Field look_field;
    private static final Field pitch_field;
    private static final Field x_field;
    private static final Field y_field;
    private static final Field id_field;
    private static final String[] lllIIIlIIIIIl;
    private static final int[] lllIIIlIIlllI;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    static {
        lllIIllIlIlIIl();
        lllIIllIIlllII();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[7]]);
    }
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntityLook.id_field, packetPlayOutEntity);
        this.x = (int)SafeReflection.fetch(SPacketPlayOutEntityLook.x_field, packetPlayOutEntity);
        this.y = (int)SafeReflection.fetch(SPacketPlayOutEntityLook.y_field, packetPlayOutEntity);
        this.z = (int)SafeReflection.fetch(SPacketPlayOutEntityLook.z_field, packetPlayOutEntity);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutEntityLook.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutEntityLook.look_field, packetPlayOutEntity);
    }
    
    private static void lllIIllIIlllII() {
        (lllIIIlIIIIIl = new String[SPacketPlayOutEntityLook.lllIIIlIIlllI[8]])[SPacketPlayOutEntityLook.lllIIIlIIlllI[0]] = lllIIllIIlIIII("/iRnT1vmH9M=", "Wjocj");
        SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[1]] = lllIIllIIlIlIl("0zKYkWjIuD4=", "BKioY");
        SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[2]] = lllIIllIIlIllI("EA==", "sdxRh");
        SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[3]] = lllIIllIIlIllI("Ew==", "wfALs");
        SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[4]] = lllIIllIIlIIII("IIds7+0JWbE=", "EoSen");
        SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[5]] = lllIIllIIlIIII("0SW8kZFcHv8=", "rZXfX");
        SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[6]] = lllIIllIIlIllI("AQ==", "fZKPZ");
        SPacketPlayOutEntityLook.lllIIIlIIIIIl[SPacketPlayOutEntityLook.lllIIIlIIlllI[7]] = lllIIllIIlIlIl("nb1aLFwcXiw=", "RAwcJ");
    }
    
    private static String lllIIllIIlIlIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityLook.lllIIIlIIlllI[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityLook.lllIIIlIIlllI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIllIIlIIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityLook.lllIIIlIIlllI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIllIIlIllI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityLook.lllIIIlIIlllI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityLook.lllIIIlIIlllI[0];
        while (lllIIllIlIlIlI(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (0 < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lllIIllIlIlIIl() {
        (lllIIIlIIlllI = new int[9])[0] = 0;
        SPacketPlayOutEntityLook.lllIIIlIIlllI[1] = 1;
        SPacketPlayOutEntityLook.lllIIIlIIlllI[2] = 2;
        SPacketPlayOutEntityLook.lllIIIlIIlllI[3] = 3;
        SPacketPlayOutEntityLook.lllIIIlIIlllI[4] = 4;
        SPacketPlayOutEntityLook.lllIIIlIIlllI[5] = 5;
        SPacketPlayOutEntityLook.lllIIIlIIlllI[6] = 6;
        SPacketPlayOutEntityLook.lllIIIlIIlllI[7] = 7;
        SPacketPlayOutEntityLook.lllIIIlIIlllI[8] = 8;
    }
    
    private static boolean lllIIllIlIlIlI(final int n, final int n2) {
        return n < n2;
    }
}
