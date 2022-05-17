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

public class SPacketPlayOutRelEntityMoveLook extends VPacketPlayOutRelEntityMoveLook
{
    private static final Field yaw_field;
    private static final Field x_field;
    private static final Field ground_field;
    private static final Field y_field;
    private static final Field pitch_field;
    private static final Field look_field;
    private static final Field id_field;
    private static final Field z_field;
    private static final String[] lIlIlllIIIlll;
    private static final int[] lIlIlllIIlIII;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    static {
        lIllIIIllllIII();
        lIllIIIlllIlll();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[7]]);
    }
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.id_field, packetPlayOutEntity);
        this.x = (int)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.x_field, packetPlayOutEntity);
        this.y = (int)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.y_field, packetPlayOutEntity);
        this.z = (int)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.z_field, packetPlayOutEntity);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.look_field, packetPlayOutEntity);
    }
    
    private static void lIllIIIlllIlll() {
        (lIlIlllIIIlll = new String[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[8]])[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[0]] = lIllIIIlllIlII("EA==", "qaqoE");
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[1]] = lIllIIIlllIlIl("9KNGjqewDwc=", "KZkBR");
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[2]] = lIllIIIlllIlII("Fw==", "tAqdM");
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[3]] = lIllIIIlllIlII("FA==", "plutk");
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[4]] = lIllIIIlllIlII("DQ==", "hzNZW");
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[5]] = lIllIIIlllIlIl("fqxIx8dtMMA=", "AHFIV");
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[6]] = lIllIIIlllIlII("Bg==", "aRBTm");
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIIlll[SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[7]] = lIllIIIlllIllI("n45K/JFqrQc=", "sZdCv");
    }
    
    private static String lIllIIIlllIlIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIllIIIlllIlII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[0];
        while (lIllIIIllllIIl(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (3 != 3) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIllIIIlllIllI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIllIIIllllIII() {
        (lIlIlllIIlIII = new int[9])[0] = 0;
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[1] = 1;
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[2] = 2;
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[3] = 3;
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[4] = 4;
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[5] = 5;
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[6] = 6;
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[7] = 7;
        SPacketPlayOutRelEntityMoveLook.lIlIlllIIlIII[8] = 8;
    }
    
    private static boolean lIllIIIllllIIl(final int n, final int n2) {
        return n < n2;
    }
}
