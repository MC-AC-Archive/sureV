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

public class SPacketPlayOutEntityTeleport extends VPacketPlayOutEntityTeleport
{
    private static final Field y_field;
    private static final Field pitch_field;
    private static final Field x_field;
    private static final Field yaw_field;
    private static final Field id_field;
    private static final Field z_field;
    private static final Field ground_field;
    private static final String[] llIIIlllIlIll;
    private static final int[] llIIIllllIlII;
    
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
        llIIllIIIllIII();
        llIIlIllllIIlI();
        id_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.llIIIlllIlIll[SPacketPlayOutEntityTeleport.llIIIllllIlII[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.llIIIlllIlIll[SPacketPlayOutEntityTeleport.llIIIllllIlII[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.llIIIlllIlIll[SPacketPlayOutEntityTeleport.llIIIllllIlII[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.llIIIlllIlIll[SPacketPlayOutEntityTeleport.llIIIllllIlII[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.llIIIlllIlIll[SPacketPlayOutEntityTeleport.llIIIllllIlII[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.llIIIlllIlIll[SPacketPlayOutEntityTeleport.llIIIllllIlII[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, SPacketPlayOutEntityTeleport.llIIIlllIlIll[SPacketPlayOutEntityTeleport.llIIIllllIlII[6]]);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntityTeleport)o);
    }
    
    private static void llIIlIllllIIlI() {
        (llIIIlllIlIll = new String[SPacketPlayOutEntityTeleport.llIIIllllIlII[7]])[SPacketPlayOutEntityTeleport.llIIIllllIlII[0]] = llIIlIlllIllll("xlXTpa/BaD4=", "oVqsk");
        SPacketPlayOutEntityTeleport.llIIIlllIlIll[SPacketPlayOutEntityTeleport.llIIIllllIlII[1]] = llIIlIllllIIII("tJ59nafjTcc=", "XjzAh");
        SPacketPlayOutEntityTeleport.llIIIlllIlIll[SPacketPlayOutEntityTeleport.llIIIllllIlII[2]] = llIIlIllllIIII("D8MrX/Rh1QU=", "CiOBc");
        SPacketPlayOutEntityTeleport.llIIIlllIlIll[SPacketPlayOutEntityTeleport.llIIIllllIlII[3]] = llIIlIlllIllll("reNCx71uQ08=", "myFOR");
        SPacketPlayOutEntityTeleport.llIIIlllIlIll[SPacketPlayOutEntityTeleport.llIIIllllIlII[4]] = llIIlIlllIllll("DUTF2i5JfYg=", "dnvXV");
        SPacketPlayOutEntityTeleport.llIIIlllIlIll[SPacketPlayOutEntityTeleport.llIIIllllIlII[5]] = llIIlIllllIIIl("EQ==", "wpXcf");
        SPacketPlayOutEntityTeleport.llIIIlllIlIll[SPacketPlayOutEntityTeleport.llIIIllllIlII[6]] = llIIlIlllIllll("TrA5oD5cZWM=", "YTzNV");
    }
    
    private static String llIIlIllllIIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityTeleport.llIIIllllIlII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIIlIllllIIIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityTeleport.llIIIllllIlII[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityTeleport.llIIIllllIlII[0];
        while (llIIllIIIllIIl(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (3 == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String llIIlIlllIllll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityTeleport.llIIIllllIlII[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityTeleport.llIIIllllIlII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void llIIllIIIllIII() {
        (llIIIllllIlII = new int[9])[0] = 0;
        SPacketPlayOutEntityTeleport.llIIIllllIlII[1] = 1;
        SPacketPlayOutEntityTeleport.llIIIllllIlII[2] = 2;
        SPacketPlayOutEntityTeleport.llIIIllllIlII[3] = 3;
        SPacketPlayOutEntityTeleport.llIIIllllIlII[4] = 4;
        SPacketPlayOutEntityTeleport.llIIIllllIlII[5] = 5;
        SPacketPlayOutEntityTeleport.llIIIllllIlII[6] = 6;
        SPacketPlayOutEntityTeleport.llIIIllllIlII[7] = 7;
        SPacketPlayOutEntityTeleport.llIIIllllIlII[8] = 8;
    }
    
    private static boolean llIIllIIIllIIl(final int n, final int n2) {
        return n < n2;
    }
}
