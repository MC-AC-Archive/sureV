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

public class SPacketPlayOutRelEntityMoveLook extends VPacketPlayOutRelEntityMoveLook
{
    private static final Field x_field;
    private static final Field pitch_field;
    private static final Field yaw_field;
    private static final Field id_field;
    private static final Field z_field;
    private static final Field ground_field;
    private static final Field y_field;
    private static final Field look_field;
    private static final String[] llIIlllIIIlII;
    private static final int[] llIIlllIIIllI;
    
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
    
    static {
        llIlIIlIlllIIl();
        llIlIIlIllIlIl();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[7]]);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    private static void llIlIIlIllIlIl() {
        (llIIlllIIIlII = new String[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[8]])[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[0]] = llIlIIlIllIIlI("sHfsU5uTuPQ=", "HyoFl");
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[1]] = llIlIIlIllIIll("7RW4qVpSbmI=", "AUaEO");
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[2]] = llIlIIlIllIIlI("WRAr5nVmiy8=", "KotNe");
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[3]] = llIlIIlIllIlII("Dw==", "kiBYP");
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[4]] = llIlIIlIllIlII("IA==", "EqmyY");
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[5]] = llIlIIlIllIIlI("YXZnYyLL4lo=", "tdMST");
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[6]] = llIlIIlIllIIll("utm5qI5gw7s=", "fmOqt");
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIlII[SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[7]] = llIlIIlIllIlII("Ow==", "SFvTJ");
    }
    
    private static String llIlIIlIllIIlI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIlIIlIllIlII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[0];
        while (llIlIIlIlllIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (-2 > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String llIlIIlIllIIll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void llIlIIlIlllIIl() {
        (llIIlllIIIllI = new int[9])[0] = 0;
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[1] = 1;
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[2] = 2;
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[3] = 3;
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[4] = 4;
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[5] = 5;
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[6] = 6;
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[7] = 7;
        SPacketPlayOutRelEntityMoveLook.llIIlllIIIllI[8] = 8;
    }
    
    private static boolean llIlIIlIlllIll(final int n, final int n2) {
        return n < n2;
    }
}
