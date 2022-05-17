package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_7_R4.*;
import me.levansj01.verus.util.java.*;
import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class SPacketPlayOutEntityTeleport extends VPacketPlayOutEntityTeleport
{
    private static final Field ground_field;
    private static final Field y_field;
    private static final Field pitch_field;
    private static final Field x_field;
    private static final Field id_field;
    private static final Field yaw_field;
    private static final Field z_field;
    private static final String[] lIIIIllIlllIl;
    private static final int[] lIIIIlllIlIIl;
    
    static {
        lIIIlIlIlIIIll();
        lIIIlIlIIllllI();
        id_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIIIllIlllIl[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIIIllIlllIl[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIIIllIlllIl[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIIIllIlllIl[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIIIllIlllIl[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIIIllIlllIl[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.lIIIIllIlllIl[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[6]]);
    }
    
    public void accept(final PacketPlayOutEntityTeleport packetPlayOutEntityTeleport) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntityTeleport.id_field, packetPlayOutEntityTeleport);
        this.x = (int)SafeReflection.fetch(SPacketPlayOutEntityTeleport.x_field, packetPlayOutEntityTeleport) / 32.0;
        this.y = (int)SafeReflection.fetch(SPacketPlayOutEntityTeleport.y_field, packetPlayOutEntityTeleport) / 32.0;
        this.z = (int)SafeReflection.fetch(SPacketPlayOutEntityTeleport.z_field, packetPlayOutEntityTeleport) / 32.0;
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutEntityTeleport.yaw_field, packetPlayOutEntityTeleport);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutEntityTeleport.pitch_field, packetPlayOutEntityTeleport);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutEntityTeleport.ground_field, packetPlayOutEntityTeleport);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntityTeleport)o);
    }
    
    private static void lIIIlIlIIllllI() {
        (lIIIIllIlllIl = new String[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[7]])[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[0]] = lIIIlIlIIllIIl("wdFbmiyOmQQ=", "rtAHs");
        SPacketPlayOutEntityTeleport.lIIIIllIlllIl[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[1]] = lIIIlIlIIllIIl("bL20GjgyMK0=", "cGClt");
        SPacketPlayOutEntityTeleport.lIIIIllIlllIl[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[2]] = lIIIlIlIIllIIl("Jnj61QFVcvg=", "aCqAc");
        SPacketPlayOutEntityTeleport.lIIIIllIlllIl[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[3]] = lIIIlIlIIlllII("FaOrcXtv/Ek=", "psqtD");
        SPacketPlayOutEntityTeleport.lIIIIllIlllIl[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[4]] = lIIIlIlIIllIIl("csZpsqxLjRA=", "JXdpb");
        SPacketPlayOutEntityTeleport.lIIIIllIlllIl[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[5]] = lIIIlIlIIlllIl("BA==", "bywSV");
        SPacketPlayOutEntityTeleport.lIIIIllIlllIl[SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[6]] = lIIIlIlIIllIIl("SnDW7dV32i9MWij3j1kmvA==", "jRPaL");
    }
    
    private static String lIIIlIlIIlllIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[0];
        while (lIIIlIlIlIIlII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (5 <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIIIlIlIIlllII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIlIlIIllIIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIlIlIIIll() {
        (lIIIIlllIlIIl = new int[9])[0] = 0;
        SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[1] = 1;
        SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[2] = 2;
        SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[3] = 3;
        SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[4] = 4;
        SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[5] = 5;
        SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[6] = 6;
        SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[7] = 7;
        SPacketPlayOutEntityTeleport.lIIIIlllIlIIl[8] = 8;
    }
    
    private static boolean lIIIlIlIlIIlII(final int n, final int n2) {
        return n < n2;
    }
}
