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

public class SPacketPlayOutEntityTeleport extends VPacketPlayOutEntityTeleport
{
    private static final Field yaw_field;
    private static final Field ground_field;
    private static final Field y_field;
    private static final Field x_field;
    private static final Field id_field;
    private static final Field z_field;
    private static final Field pitch_field;
    private static final String[] lIIIIlIIllIll;
    private static final int[] lIIIlIlIIIlIl;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntityTeleport)o);
    }
    
    public void accept(final PacketPlayOutEntityTeleport packetPlayOutEntityTeleport) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntityTeleport.id_field, packetPlayOutEntityTeleport);
        this.x = (double)SafeReflection.fetch(SPacketPlayOutEntityTeleport.x_field, packetPlayOutEntityTeleport);
        this.y = (double)SafeReflection.fetch(SPacketPlayOutEntityTeleport.y_field, packetPlayOutEntityTeleport);
        this.z = (double)SafeReflection.fetch(SPacketPlayOutEntityTeleport.z_field, packetPlayOutEntityTeleport);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutEntityTeleport.yaw_field, packetPlayOutEntityTeleport);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutEntityTeleport.pitch_field, packetPlayOutEntityTeleport);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutEntityTeleport.ground_field, packetPlayOutEntityTeleport);
    }
    
    static {
        lIIIllIlIIllIl();
        lIIIIllllllllI();
        id_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIIIlIIllIll[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIIIlIIllIll[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIIIlIIllIll[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIIIlIIllIll[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIIIlIIllIll[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIIIlIIllIll[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIIIlIIllIll[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[6]]);
    }
    
    private static void lIIIIllllllllI() {
        (lIIIIlIIllIll = new String[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[7]])[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[0]] = lIIIIllllllIll("P8qsTQCHWEA=", "dJUwX");
        SPacketPlayOutEntityTeleport.lIIIIlIIllIll[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[1]] = lIIIIlllllllII("87r35yTUxZE=", "PSubA");
        SPacketPlayOutEntityTeleport.lIIIIlIIllIll[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[2]] = lIIIIlllllllII("ORh3Div0zJU=", "MQkIL");
        SPacketPlayOutEntityTeleport.lIIIIlIIllIll[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[3]] = lIIIIlllllllIl("Jg==", "BsCwm");
        SPacketPlayOutEntityTeleport.lIIIIlIIllIll[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[4]] = lIIIIlllllllII("dq8AjFAkbPE=", "NSYRG");
        SPacketPlayOutEntityTeleport.lIIIIlIIllIll[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[5]] = lIIIIlllllllIl("EA==", "vegeS");
        SPacketPlayOutEntityTeleport.lIIIIlIIllIll[SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[6]] = lIIIIlllllllIl("Pw==", "XAtQx");
    }
    
    private static String lIIIIllllllIll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIlllllllIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[0];
        while (lIIIllIlIIllll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (3 <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIIIIlllllllII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIllIlIIllIl() {
        (lIIIlIlIIIlIl = new int[9])[0] = 0;
        SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[1] = 1;
        SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[2] = 2;
        SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[3] = 3;
        SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[4] = 4;
        SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[5] = 5;
        SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[6] = 6;
        SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[7] = 7;
        SPacketPlayOutEntityTeleport.lIIIlIlIIIlIl[8] = 8;
    }
    
    private static boolean lIIIllIlIIllll(final int n, final int n2) {
        return n < n2;
    }
}
