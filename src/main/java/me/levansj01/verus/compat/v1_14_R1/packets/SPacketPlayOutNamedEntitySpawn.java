package me.levansj01.verus.compat.v1_14_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_14_R1.*;
import me.levansj01.verus.util.java.*;
import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class SPacketPlayOutNamedEntitySpawn extends VPacketPlayOutNamedEntitySpawn
{
    private static final Field x_field;
    private static final Field y_field;
    private static final Field z_field;
    private static final Field yaw_field;
    private static final Field id_field;
    private static final Field pitch_field;
    private static final String[] llIlllIlllIll;
    private static final int[] llIllllIIIllI;
    
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
    
    static {
        lllIIIlIlIllll();
        lllIIIlIlIlIll();
        id_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.llIlllIlllIll[SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[0]]);
        x_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.llIlllIlllIll[SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[1]]);
        y_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.llIlllIlllIll[SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[2]]);
        z_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.llIlllIlllIll[SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.llIlllIlllIll[SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutNamedEntitySpawn.class, SPacketPlayOutNamedEntitySpawn.llIlllIlllIll[SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[5]]);
    }
    
    private static void lllIIIlIlIlIll() {
        (llIlllIlllIll = new String[SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[6]])[SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[0]] = lllIIIlIlIIIlI("cKpV8NwntKo=", "WAAwr");
        SPacketPlayOutNamedEntitySpawn.llIlllIlllIll[SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[1]] = lllIIIlIlIIIll("1SDqDHtyD/E=", "wjngz");
        SPacketPlayOutNamedEntitySpawn.llIlllIlllIll[SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[2]] = lllIIIlIlIIIll("v5bno+4YMH4=", "ABeET");
        SPacketPlayOutNamedEntitySpawn.llIlllIlllIll[SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[3]] = lllIIIlIlIlIlI("AA==", "eWOLI");
        SPacketPlayOutNamedEntitySpawn.llIlllIlllIll[SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[4]] = lllIIIlIlIlIlI("Fg==", "puhFO");
        SPacketPlayOutNamedEntitySpawn.llIlllIlllIll[SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[5]] = lllIIIlIlIlIlI("AQ==", "flsPP");
    }
    
    private static String lllIIIlIlIlIlI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[0];
        while (lllIIIlIllIIII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (false) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lllIIIlIlIIIlI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[7]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIIlIlIIIll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIIlIlIllll() {
        (llIllllIIIllI = new int[8])[0] = 0;
        SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[1] = 1;
        SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[2] = 2;
        SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[3] = 3;
        SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[4] = 4;
        SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[5] = 5;
        SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[6] = 6;
        SPacketPlayOutNamedEntitySpawn.llIllllIIIllI[7] = 8;
    }
    
    private static boolean lllIIIlIllIIII(final int n, final int n2) {
        return n < n2;
    }
}
