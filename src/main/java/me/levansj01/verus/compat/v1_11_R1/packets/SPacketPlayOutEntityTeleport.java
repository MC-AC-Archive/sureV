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

public class SPacketPlayOutEntityTeleport extends VPacketPlayOutEntityTeleport
{
    private static final Field z_field;
    private static final Field pitch_field;
    private static final Field ground_field;
    private static final Field x_field;
    private static final Field y_field;
    private static final Field yaw_field;
    private static final Field id_field;
    private static final String[] llIlllIlIllII;
    private static final int[] llIlllIlIllIl;
    
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
        lllIIIlIIIlIIl();
        lllIIIlIIIIlll();
        id_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.llIlllIlIllII[SPacketPlayOutEntityTeleport.llIlllIlIllIl[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.llIlllIlIllII[SPacketPlayOutEntityTeleport.llIlllIlIllIl[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.llIlllIlIllII[SPacketPlayOutEntityTeleport.llIlllIlIllIl[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.llIlllIlIllII[SPacketPlayOutEntityTeleport.llIlllIlIllIl[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.llIlllIlIllII[SPacketPlayOutEntityTeleport.llIlllIlIllIl[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.llIlllIlIllII[SPacketPlayOutEntityTeleport.llIlllIlIllIl[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.llIlllIlIllII[SPacketPlayOutEntityTeleport.llIlllIlIllIl[6]]);
    }
    
    private static void lllIIIlIIIIlll() {
        (llIlllIlIllII = new String[SPacketPlayOutEntityTeleport.llIlllIlIllIl[7]])[SPacketPlayOutEntityTeleport.llIlllIlIllIl[0]] = lllIIIlIIIIlII("DQ==", "lujVb");
        SPacketPlayOutEntityTeleport.llIlllIlIllII[SPacketPlayOutEntityTeleport.llIlllIlIllIl[1]] = lllIIIlIIIIlIl("RdzzsHx3dUQ=", "xslpv");
        SPacketPlayOutEntityTeleport.llIlllIlIllII[SPacketPlayOutEntityTeleport.llIlllIlIllIl[2]] = lllIIIlIIIIllI("GXlCxAk8s4M=", "ptnaG");
        SPacketPlayOutEntityTeleport.llIlllIlIllII[SPacketPlayOutEntityTeleport.llIlllIlIllIl[3]] = lllIIIlIIIIllI("0UvGqTnVw9Y=", "ZMJNg");
        SPacketPlayOutEntityTeleport.llIlllIlIllII[SPacketPlayOutEntityTeleport.llIlllIlIllIl[4]] = lllIIIlIIIIllI("diPM4wOJprE=", "JVtGJ");
        SPacketPlayOutEntityTeleport.llIlllIlIllII[SPacketPlayOutEntityTeleport.llIlllIlIllIl[5]] = lllIIIlIIIIllI("xpWjTjF92mA=", "qYPax");
        SPacketPlayOutEntityTeleport.llIlllIlIllII[SPacketPlayOutEntityTeleport.llIlllIlIllIl[6]] = lllIIIlIIIIllI("JT+ZifO35sg=", "weHcA");
    }
    
    private static String lllIIIlIIIIlIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityTeleport.llIlllIlIllIl[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityTeleport.llIlllIlIllIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIIlIIIIllI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityTeleport.llIlllIlIllIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIIlIIIIlII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityTeleport.llIlllIlIllIl[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityTeleport.llIlllIlIllIl[0];
        while (lllIIIlIIIlIlI(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (1 <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lllIIIlIIIlIIl() {
        (llIlllIlIllIl = new int[9])[0] = 0;
        SPacketPlayOutEntityTeleport.llIlllIlIllIl[1] = 1;
        SPacketPlayOutEntityTeleport.llIlllIlIllIl[2] = 2;
        SPacketPlayOutEntityTeleport.llIlllIlIllIl[3] = 3;
        SPacketPlayOutEntityTeleport.llIlllIlIllIl[4] = 4;
        SPacketPlayOutEntityTeleport.llIlllIlIllIl[5] = 5;
        SPacketPlayOutEntityTeleport.llIlllIlIllIl[6] = 6;
        SPacketPlayOutEntityTeleport.llIlllIlIllIl[7] = 7;
        SPacketPlayOutEntityTeleport.llIlllIlIllIl[8] = 8;
    }
    
    private static boolean lllIIIlIIIlIlI(final int n, final int n2) {
        return n < n2;
    }
}
