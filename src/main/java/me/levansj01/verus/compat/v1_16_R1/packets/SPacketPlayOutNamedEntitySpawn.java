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

public class SPacketPlayOutNamedEntitySpawn extends VPacketPlayOutNamedEntitySpawn
{
    private static final Field y_field;
    private static final Field id_field;
    private static final Field x_field;
    private static final Field pitch_field;
    private static final Field z_field;
    private static final Field yaw_field;
    private static final String[] lIIIlIlIIIIll;
    private static final int[] lIIIlllIlllIl;
    
    static {
        lIIlIIIlllIIlI();
        lIIIllIlIIlIIl();
        id_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIIlIlIIIIll[SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[0]]);
        x_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIIlIlIIIIll[SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[1]]);
        y_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIIlIlIIIIll[SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[2]]);
        z_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIIlIlIIIIll[SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIIlIlIIIIll[SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.lIIIlIlIIIIll[SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[5]]);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutNamedEntitySpawn)o);
    }
    
    public void accept(final PacketPlayOutNamedEntitySpawn packetPlayOutNamedEntitySpawn) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.id_field, packetPlayOutNamedEntitySpawn);
        this.x = (double)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.x_field, packetPlayOutNamedEntitySpawn);
        this.y = (double)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.y_field, packetPlayOutNamedEntitySpawn);
        this.z = (double)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.z_field, packetPlayOutNamedEntitySpawn);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.yaw_field, packetPlayOutNamedEntitySpawn);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutNamedEntitySpawn.pitch_field, packetPlayOutNamedEntitySpawn);
    }
    
    private static void lIIIllIlIIlIIl() {
        (lIIIlIlIIIIll = new String[SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[6]])[SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[0]] = lIIIllIlIIIllI("EA==", "qKvoN");
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIIIIll[SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[1]] = lIIIllIlIIIlll("/gS27EhEI1Q=", "dArwy");
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIIIIll[SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[2]] = lIIIllIlIIlIII("20q/UsZi7J0=", "maZlL");
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIIIIll[SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[3]] = lIIIllIlIIIlll("eubTt8RWrx0=", "bMAfb");
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIIIIll[SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[4]] = lIIIllIlIIIlll("FkLGzzbCV6c=", "abCEA");
        SPacketPlayOutNamedEntitySpawn.lIIIlIlIIIIll[SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[5]] = lIIIllIlIIlIII("/FYzaFvt7nM=", "llPDX");
    }
    
    private static String lIIIllIlIIlIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[7]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIllIlIIIlll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIllIlIIIllI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[0];
        while (lIIlIIIlllIIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (true != true) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIIlIIIlllIIlI() {
        (lIIIlllIlllIl = new int[8])[0] = 0;
        SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[1] = 1;
        SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[2] = 2;
        SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[3] = 3;
        SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[4] = 4;
        SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[5] = 5;
        SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[6] = 6;
        SPacketPlayOutNamedEntitySpawn.lIIIlllIlllIl[7] = 8;
    }
    
    private static boolean lIIlIIIlllIIll(final int n, final int n2) {
        return n < n2;
    }
}
