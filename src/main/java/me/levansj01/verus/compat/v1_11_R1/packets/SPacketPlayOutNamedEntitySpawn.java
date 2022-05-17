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

public class SPacketPlayOutNamedEntitySpawn extends VPacketPlayOutNamedEntitySpawn
{
    private static final Field z_field;
    private static final Field id_field;
    private static final Field pitch_field;
    private static final Field x_field;
    private static final Field yaw_field;
    private static final Field y_field;
    private static final String[] lIIIlIlIIllll;
    private static final int[] lIIIlIlIlIIII;
    
    static {
        lIIIllIllIIIll();
        lIIIllIllIIIlI();
        id_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIIlIlIIllll[SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[0]]);
        x_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIIlIlIIllll[SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[1]]);
        y_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIIlIlIIllll[SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[2]]);
        z_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIIlIlIIllll[SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIIlIlIIllll[SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIIlIlIIllll[SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[5]]);
    }
    
    public void accept(final PacketPlayOutNamedEntitySpawn packetPlayOutNamedEntitySpawn) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.id_field, packetPlayOutNamedEntitySpawn);
        this.x = (double)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.x_field, packetPlayOutNamedEntitySpawn);
        this.y = (double)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.y_field, packetPlayOutNamedEntitySpawn);
        this.z = (double)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.z_field, packetPlayOutNamedEntitySpawn);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.yaw_field, packetPlayOutNamedEntitySpawn);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.pitch_field, packetPlayOutNamedEntitySpawn);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutNamedEntitySpawn)o);
    }
    
    private static void lIIIllIllIIIlI() {
        (lIIIlIlIIllll = new String[SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[6]])[SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[0]] = lIIIllIlIlllll("Il6iFnMceMQ=", "omPdF");
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIIllll[SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[1]] = lIIIllIllIIIII("Fw==", "tGgBF");
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIIllll[SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[2]] = lIIIllIllIIIII("JQ==", "AHNtG");
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIIllll[SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[3]] = lIIIllIllIIIIl("zT21w1lfrcc=", "QxmsL");
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIIllll[SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[4]] = lIIIllIllIIIIl("D8TVxEa/Tl8=", "VQCSM");
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIIllll[SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[5]] = lIIIllIllIIIII("Nw==", "PJrSK");
    }
    
    private static String lIIIllIllIIIIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIllIllIIIII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[0];
        while (lIIIllIllIIlII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (0 >= 1) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIIIllIlIlllll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[7]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIllIllIIIll() {
        (lIIIlIlIlIIII = new int[8])[0] = 0;
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[1] = 1;
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[2] = 2;
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[3] = 3;
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[4] = 4;
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[5] = 5;
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[6] = 6;
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIlIIII[7] = 8;
    }
    
    private static boolean lIIIllIllIIlII(final int n, final int n2) {
        return n < n2;
    }
}
