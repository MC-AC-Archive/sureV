package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_7_R4.*;
import me.levansj01.verus.util.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayOutNamedEntitySpawn extends VPacketPlayOutNamedEntitySpawn
{
    private static final Field y_field;
    private static final Field yaw_field;
    private static final Field pitch_field;
    private static final Field z_field;
    private static final Field id_field;
    private static final Field x_field;
    private static final String[] lIIllIIIIllIl;
    private static final int[] lIIllIIIllIIl;
    
    public void accept(final PacketPlayOutNamedEntitySpawn packetPlayOutNamedEntitySpawn) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.id_field, packetPlayOutNamedEntitySpawn);
        this.x = (int)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.x_field, packetPlayOutNamedEntitySpawn) / 32.0;
        this.y = (int)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.y_field, packetPlayOutNamedEntitySpawn) / 32.0;
        this.z = (int)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.z_field, packetPlayOutNamedEntitySpawn) / 32.0;
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.yaw_field, packetPlayOutNamedEntitySpawn);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.pitch_field, packetPlayOutNamedEntitySpawn);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutNamedEntitySpawn)o);
    }
    
    static {
        lIIllIllllIIlI();
        lIIllIllIllIII();
        id_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIllIIIIllIl[SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[0]]);
        x_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIllIIIIllIl[SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[1]]);
        y_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIllIIIIllIl[SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[2]]);
        z_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIllIIIIllIl[SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIllIIIIllIl[SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIllIIIIllIl[SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[5]]);
    }
    
    private static void lIIllIllIllIII() {
        (lIIllIIIIllIl = new String[SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[6]])[SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[0]] = lIIllIllIlIIll("BGs73OVFFlE=", "cdNDI");
        SPacketPlayOutNamedEntitySpawn.lIIllIIIIllIl[SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[1]] = lIIllIllIlIlIl("Jg==", "EnSCN");
        SPacketPlayOutNamedEntitySpawn.lIIllIIIIllIl[SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[2]] = lIIllIllIlIllI("wzmhsE5fHhg=", "nYfVL");
        SPacketPlayOutNamedEntitySpawn.lIIllIIIIllIl[SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[3]] = lIIllIllIlIllI("e/Rn4LlYotU=", "YeblL");
        SPacketPlayOutNamedEntitySpawn.lIIllIIIIllIl[SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[4]] = lIIllIllIlIIll("SMyM47xeCiY=", "dxxXL");
        SPacketPlayOutNamedEntitySpawn.lIIllIIIIllIl[SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[5]] = lIIllIllIlIlIl("NA==", "SRfVL");
    }
    
    private static String lIIllIllIlIllI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[7]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllIllIlIIll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllIllIlIlIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[0];
        while (lIIllIllllIIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (2 < -1) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIIllIllllIIlI() {
        (lIIllIIIllIIl = new int[8])[0] = 0;
        SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[1] = 1;
        SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[2] = 2;
        SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[3] = 3;
        SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[4] = 4;
        SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[5] = 5;
        SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[6] = 6;
        SPacketPlayOutNamedEntitySpawn.lIIllIIIllIIl[7] = 8;
    }
    
    private static boolean lIIllIllllIIll(final int n, final int n2) {
        return n < n2;
    }
}
