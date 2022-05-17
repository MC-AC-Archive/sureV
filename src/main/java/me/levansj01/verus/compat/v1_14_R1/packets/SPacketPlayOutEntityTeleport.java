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

public class SPacketPlayOutEntityTeleport extends VPacketPlayOutEntityTeleport
{
    private static final Field yaw_field;
    private static final Field pitch_field;
    private static final Field id_field;
    private static final Field ground_field;
    private static final Field y_field;
    private static final Field x_field;
    private static final Field z_field;
    private static final String[] lIIlIIIlIIlIl;
    private static final int[] lIIlIIIlIIlll;
    
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
        lIIlIlIIIlIlIl();
        lIIlIlIIIlIIII();
        id_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIlIIIlIIlIl[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIlIIIlIIlIl[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIlIIIlIIlIl[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIlIIIlIIlIl[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIlIIIlIIlIl[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIlIIIlIIlIl[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIlIIIlIIlIl[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[6]]);
    }
    
    private static void lIIlIlIIIlIIII() {
        (lIIlIIIlIIlIl = new String[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[7]])[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[0]] = lIIlIlIIIIllII("FA==", "uoOGP");
        SPacketPlayOutEntityTeleport.lIIlIIIlIIlIl[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[1]] = lIIlIlIIIIllIl("u4UqQQ17hX0=", "GrNVN");
        SPacketPlayOutEntityTeleport.lIIlIIIlIIlIl[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[2]] = lIIlIlIIIIllIl("JcWnMNt/0BE=", "ZsiHw");
        SPacketPlayOutEntityTeleport.lIIlIIIlIIlIl[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[3]] = lIIlIlIIIIllll("kdV8QWbcut0=", "QDgwu");
        SPacketPlayOutEntityTeleport.lIIlIIIlIIlIl[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[4]] = lIIlIlIIIIllIl("Yj4vFpp8WOk=", "DTgnF");
        SPacketPlayOutEntityTeleport.lIIlIIIlIIlIl[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[5]] = lIIlIlIIIIllIl("QGvVTmYVn8Q=", "gHTSa");
        SPacketPlayOutEntityTeleport.lIIlIIIlIIlIl[SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[6]] = lIIlIlIIIIllIl("PUBzNvdep4k=", "tYmTv");
    }
    
    private static String lIIlIlIIIIllll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIlIIIIllII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[0];
        while (lIIlIlIIIlIllI(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (1 > 4) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIIlIlIIIIllIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIlIIIlIlIl() {
        (lIIlIIIlIIlll = new int[9])[0] = 0;
        SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[1] = 1;
        SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[2] = 2;
        SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[3] = 3;
        SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[4] = 4;
        SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[5] = 5;
        SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[6] = 6;
        SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[7] = 7;
        SPacketPlayOutEntityTeleport.lIIlIIIlIIlll[8] = 8;
    }
    
    private static boolean lIIlIlIIIlIllI(final int n, final int n2) {
        return n < n2;
    }
}
