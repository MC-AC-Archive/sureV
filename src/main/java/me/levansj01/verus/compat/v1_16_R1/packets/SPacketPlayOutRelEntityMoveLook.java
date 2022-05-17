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

public class SPacketPlayOutRelEntityMoveLook extends VPacketPlayOutRelEntityMoveLook
{
    private static final Field look_field;
    private static final Field ground_field;
    private static final Field y_field;
    private static final Field pitch_field;
    private static final Field x_field;
    private static final Field z_field;
    private static final Field yaw_field;
    private static final Field id_field;
    private static final String[] lIIIIIlIIlIII;
    private static final int[] lIIIIIlIIlIll;
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.id_field, packetPlayOutEntity);
        this.x = (short)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.x_field, packetPlayOutEntity, Short.TYPE);
        this.y = (short)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.y_field, packetPlayOutEntity, Short.TYPE);
        this.z = (short)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.z_field, packetPlayOutEntity, Short.TYPE);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.look_field, packetPlayOutEntity);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    static {
        lIIIIlIlIllIlI();
        lIIIIlIlIlIllI();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[7]]);
    }
    
    private static void lIIIIlIlIlIllI() {
        (lIIIIIlIIlIII = new String[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[8]])[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[0]] = lIIIIlIlIlIIII("CQ==", "hhxqz");
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[1]] = lIIIIlIlIlIIIl("xz7kd6x4SuE=", "VleCR");
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[2]] = lIIIIlIlIlIIlI("pyrKjt70GVE=", "NshKq");
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[3]] = lIIIIlIlIlIIlI("pEkqFdg5ri0=", "wfVPg");
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[4]] = lIIIIlIlIlIIlI("msExQGDkxkI=", "DFfgp");
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[5]] = lIIIIlIlIlIIlI("97CM/cQsqV8=", "RwnUR");
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[6]] = lIIIIlIlIlIIlI("PHfn1SdZGfA=", "EYusN");
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIII[SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[7]] = lIIIIlIlIlIIIl("LcDBws27ugk=", "XpNLo");
    }
    
    private static String lIIIIlIlIlIIIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIlIlIlIIII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[0];
        while (lIIIIlIlIllIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (0 < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIIIIlIlIlIIlI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIlIlIllIlI() {
        (lIIIIIlIIlIll = new int[9])[0] = 0;
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[1] = 1;
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[2] = 2;
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[3] = 3;
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[4] = 4;
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[5] = 5;
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[6] = 6;
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[7] = 7;
        SPacketPlayOutRelEntityMoveLook.lIIIIIlIIlIll[8] = 8;
    }
    
    private static boolean lIIIIlIlIllIll(final int n, final int n2) {
        return n < n2;
    }
}
