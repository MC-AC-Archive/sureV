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

public class SPacketPlayOutRelEntityMoveLook extends VPacketPlayOutRelEntityMoveLook
{
    private static final Field look_field;
    private static final Field id_field;
    private static final Field yaw_field;
    private static final Field ground_field;
    private static final Field z_field;
    private static final Field x_field;
    private static final Field pitch_field;
    private static final Field y_field;
    private static final String[] llIIlIlIIIllI;
    private static final int[] llIIlIlIIlIlI;
    
    static {
        llIIllllIIlIll();
        llIIllllIIIlIl();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[7]]);
    }
    
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
    
    private static void llIIllllIIIlIl() {
        (llIIlIlIIIllI = new String[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[8]])[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[0]] = llIIllllIIIIII("QVtPeBAhV7A=", "zPwVP");
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[1]] = llIIllllIIIIlI("Jw==", "EunJE");
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[2]] = llIIllllIIIIII("s6FdPfPstx4=", "CjjWA");
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[3]] = llIIllllIIIIlI("IQ==", "ECqXR");
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[4]] = llIIllllIIIIII("kC7Br3wnr0M=", "zySUH");
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[5]] = llIIllllIIIIll("pZUOsaEWpX0=", "tpgiI");
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[6]] = llIIllllIIIIlI("KA==", "OYpks");
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIIllI[SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[7]] = llIIllllIIIIII("EcFfHwA9MLs=", "jjbsE");
    }
    
    private static String llIIllllIIIIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIIllllIIIIlI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[0];
        while (llIIllllIIllII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (4 < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String llIIllllIIIIll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void llIIllllIIlIll() {
        (llIIlIlIIlIlI = new int[9])[0] = 0;
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[1] = 1;
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[2] = 2;
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[3] = 3;
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[4] = 4;
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[5] = 5;
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[6] = 6;
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[7] = 7;
        SPacketPlayOutRelEntityMoveLook.llIIlIlIIlIlI[8] = 8;
    }
    
    private static boolean llIIllllIIllII(final int n, final int n2) {
        return n < n2;
    }
}
