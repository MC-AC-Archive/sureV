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

public class SPacketPlayOutEntity extends VPacketPlayOutEntity
{
    private static final Field y_field;
    private static final Field x_field;
    private static final Field id_field;
    private static final Field z_field;
    private static final Field look_field;
    private static final Field pitch_field;
    private static final Field ground_field;
    private static final Field yaw_field;
    private static final String[] lllllIlIlllI;
    private static final int[] lllllIlllIlI;
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntity.id_field, packetPlayOutEntity);
        this.x = (short)SafeReflection.fetch(SPacketPlayOutEntity.x_field, packetPlayOutEntity, Short.TYPE);
        this.y = (short)SafeReflection.fetch(SPacketPlayOutEntity.y_field, packetPlayOutEntity, Short.TYPE);
        this.z = (short)SafeReflection.fetch(SPacketPlayOutEntity.z_field, packetPlayOutEntity, Short.TYPE);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutEntity.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutEntity.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutEntity.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutEntity.look_field, packetPlayOutEntity);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    static {
        lIIIIIIlIIIlll();
        lIIIIIIIlllIIl();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[7]]);
    }
    
    private static void lIIIIIIIlllIIl() {
        (lllllIlIlllI = new String[SPacketPlayOutEntity.lllllIlllIlI[8]])[SPacketPlayOutEntity.lllllIlllIlI[0]] = lIIIIIIIllIIll("cdiabsOplok=", "OxhWN");
        SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[1]] = lIIIIIIIllIlII("Lg==", "LxwZL");
        SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[2]] = lIIIIIIIllIIll("b2qiTXHm9g0=", "niPSj");
        SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[3]] = lIIIIIIIllIlII("Kg==", "NxQzz");
        SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[4]] = lIIIIIIIllIIll("tIaK8ozW+QI=", "wiMUG");
        SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[5]] = lIIIIIIIllIlII("Hg==", "xEliw");
        SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[6]] = lIIIIIIIllIllI("DxNSQuqDAeY=", "KFAuT");
        SPacketPlayOutEntity.lllllIlIlllI[SPacketPlayOutEntity.lllllIlllIlI[7]] = lIIIIIIIllIIll("lY1HBptLO8U=", "YOhCF");
    }
    
    private static String lIIIIIIIllIlII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntity.lllllIlllIlI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntity.lllllIlllIlI[0];
        while (lIIIIIIlIIlIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (false) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIIIIIIIllIllI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntity.lllllIlllIlI[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntity.lllllIlllIlI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIIIIllIIll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntity.lllllIlllIlI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIIlIIIlll() {
        (lllllIlllIlI = new int[9])[0] = 0;
        SPacketPlayOutEntity.lllllIlllIlI[1] = 1;
        SPacketPlayOutEntity.lllllIlllIlI[2] = 2;
        SPacketPlayOutEntity.lllllIlllIlI[3] = 3;
        SPacketPlayOutEntity.lllllIlllIlI[4] = 4;
        SPacketPlayOutEntity.lllllIlllIlI[5] = 5;
        SPacketPlayOutEntity.lllllIlllIlI[6] = 6;
        SPacketPlayOutEntity.lllllIlllIlI[7] = 7;
        SPacketPlayOutEntity.lllllIlllIlI[8] = 8;
    }
    
    private static boolean lIIIIIIlIIlIll(final int n, final int n2) {
        return n < n2;
    }
}
