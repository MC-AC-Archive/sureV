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

public class SPacketPlayOutEntityLook extends VPacketPlayOutEntityLook
{
    private static final Field y_field;
    private static final Field x_field;
    private static final Field id_field;
    private static final Field ground_field;
    private static final Field pitch_field;
    private static final Field z_field;
    private static final Field yaw_field;
    private static final String[] lIIllIllllllI;
    private static final int[] lIIlllIIIlIII;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    static {
        lIIlllllIlIllI();
        lIIlllllIIlIll();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIllIllllllI[SPacketPlayOutEntityLook.lIIlllIIIlIII[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIllIllllllI[SPacketPlayOutEntityLook.lIIlllIIIlIII[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIllIllllllI[SPacketPlayOutEntityLook.lIIlllIIIlIII[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIllIllllllI[SPacketPlayOutEntityLook.lIIlllIIIlIII[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIllIllllllI[SPacketPlayOutEntityLook.lIIlllIIIlIII[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIllIllllllI[SPacketPlayOutEntityLook.lIIlllIIIlIII[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIllIllllllI[SPacketPlayOutEntityLook.lIIlllIIIlIII[6]]);
    }
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntityLook.id_field, packetPlayOutEntity);
        this.x = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.x_field, packetPlayOutEntity);
        this.y = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.y_field, packetPlayOutEntity);
        this.z = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.z_field, packetPlayOutEntity);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutEntityLook.ground_field, packetPlayOutEntity);
        this.look = (SPacketPlayOutEntityLook.lIIlllIIIlIII[0] != 0);
    }
    
    private static void lIIlllllIIlIll() {
        (lIIllIllllllI = new String[SPacketPlayOutEntityLook.lIIlllIIIlIII[7]])[SPacketPlayOutEntityLook.lIIlllIIIlIII[0]] = lIIlllllIIIlIl("Fg==", "wpATA");
        SPacketPlayOutEntityLook.lIIllIllllllI[SPacketPlayOutEntityLook.lIIlllIIIlIII[1]] = lIIlllllIIIllI("yyvZwhMeWUo=", "HfbDi");
        SPacketPlayOutEntityLook.lIIllIllllllI[SPacketPlayOutEntityLook.lIIlllIIIlIII[2]] = lIIlllllIIlIII("l7BKx25BlEU=", "QTDkK");
        SPacketPlayOutEntityLook.lIIllIllllllI[SPacketPlayOutEntityLook.lIIlllIIIlIII[3]] = lIIlllllIIIllI("wHq7nesB4jA=", "YpVbJ");
        SPacketPlayOutEntityLook.lIIllIllllllI[SPacketPlayOutEntityLook.lIIlllIIIlIII[4]] = lIIlllllIIlIII("bTAD25Pewhg=", "anVBj");
        SPacketPlayOutEntityLook.lIIllIllllllI[SPacketPlayOutEntityLook.lIIlllIIIlIII[5]] = lIIlllllIIIllI("wSMrUa60R0U=", "gvdKD");
        SPacketPlayOutEntityLook.lIIllIllllllI[SPacketPlayOutEntityLook.lIIlllIIIlIII[6]] = lIIlllllIIIllI("UO4bAkjxP8o=", "rFpgi");
    }
    
    private static String lIIlllllIIIllI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityLook.lIIlllIIIlIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlllllIIIlIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityLook.lIIlllIIIlIII[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityLook.lIIlllIIIlIII[0];
        while (lIIlllllIllIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (2 < -1) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIIlllllIIlIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityLook.lIIlllIIIlIII[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityLook.lIIlllIIIlIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlllllIlIllI() {
        (lIIlllIIIlIII = new int[9])[0] = 0;
        SPacketPlayOutEntityLook.lIIlllIIIlIII[1] = 1;
        SPacketPlayOutEntityLook.lIIlllIIIlIII[2] = 2;
        SPacketPlayOutEntityLook.lIIlllIIIlIII[3] = 3;
        SPacketPlayOutEntityLook.lIIlllIIIlIII[4] = 4;
        SPacketPlayOutEntityLook.lIIlllIIIlIII[5] = 5;
        SPacketPlayOutEntityLook.lIIlllIIIlIII[6] = 6;
        SPacketPlayOutEntityLook.lIIlllIIIlIII[7] = 7;
        SPacketPlayOutEntityLook.lIIlllIIIlIII[8] = 8;
    }
    
    private static boolean lIIlllllIllIll(final int n, final int n2) {
        return n < n2;
    }
}
