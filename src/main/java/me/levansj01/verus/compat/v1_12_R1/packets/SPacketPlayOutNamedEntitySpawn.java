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

public class SPacketPlayOutNamedEntitySpawn extends VPacketPlayOutNamedEntitySpawn
{
    private static final Field x_field;
    private static final Field pitch_field;
    private static final Field y_field;
    private static final Field id_field;
    private static final Field yaw_field;
    private static final Field z_field;
    private static final String[] lIlllIIllIllI;
    private static final int[] lIlllIlIIIIll;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutNamedEntitySpawn)o);
    }
    
    static {
        lIlllllIllIlIl();
        lIlllllIlIlIIl();
        id_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIlllIIllIllI[SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[0]]);
        x_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIlllIIllIllI[SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[1]]);
        y_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIlllIIllIllI[SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[2]]);
        z_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIlllIIllIllI[SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIlllIIllIllI[SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIlllIIllIllI[SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[5]]);
    }
    
    public void accept(final PacketPlayOutNamedEntitySpawn packetPlayOutNamedEntitySpawn) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.id_field, packetPlayOutNamedEntitySpawn);
        this.x = (double)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.x_field, packetPlayOutNamedEntitySpawn);
        this.y = (double)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.y_field, packetPlayOutNamedEntitySpawn);
        this.z = (double)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.z_field, packetPlayOutNamedEntitySpawn);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.yaw_field, packetPlayOutNamedEntitySpawn);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.pitch_field, packetPlayOutNamedEntitySpawn);
    }
    
    private static void lIlllllIlIlIIl() {
        (lIlllIIllIllI = new String[SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[6]])[SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[0]] = lIlllllIIllllI("ajTX0+eklHo=", "yGAAY");
        SPacketPlayOutNamedEntitySpawn.lIlllIIllIllI[SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[1]] = lIlllllIlIIIll("Og==", "YDAkM");
        SPacketPlayOutNamedEntitySpawn.lIlllIIllIllI[SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[2]] = lIlllllIlIIIll("KQ==", "MOLvy");
        SPacketPlayOutNamedEntitySpawn.lIlllIIllIllI[SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[3]] = lIlllllIIllllI("qJ5ZMKynfcQ=", "qMbpC");
        SPacketPlayOutNamedEntitySpawn.lIlllIIllIllI[SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[4]] = lIlllllIlIIIll("CA==", "nXhzd");
        SPacketPlayOutNamedEntitySpawn.lIlllIIllIllI[SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[5]] = lIlllllIlIlIII("VXO231TYA3U=", "AHfBd");
    }
    
    private static String lIlllllIlIIIll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[0];
        while (lIlllllIllIlll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIlllllIIllllI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIlllllIlIlIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[7]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIlllllIllIlIl() {
        (lIlllIlIIIIll = new int[8])[0] = 0;
        SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[1] = 1;
        SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[2] = 2;
        SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[3] = 3;
        SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[4] = 4;
        SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[5] = 5;
        SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[6] = 6;
        SPacketPlayOutNamedEntitySpawn.lIlllIlIIIIll[7] = 8;
    }
    
    private static boolean lIlllllIllIlll(final int n, final int n2) {
        return n < n2;
    }
}
