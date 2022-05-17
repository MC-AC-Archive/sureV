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

public class SPacketPlayOutEntityVelocity extends VPacketPlayOutEntityVelocity
{
    private static final Field motZ_field;
    private static final Field id_field;
    private static final Field motY_field;
    private static final Field motX_field;
    private static final String[] lIlIlIllIIIII;
    private static final int[] lIlIlIllIIIIl;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntityVelocity)o);
    }
    
    static {
        lIlIllllIIIIIl();
        lIlIllllIIIIII();
        final Class<PacketPlayOutEntityVelocity> clazz = PacketPlayOutEntityVelocity.class;
        final String[] array = new String[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[0]];
        array[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[1]] = SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[1]];
        array[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[2]] = SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[2]];
        id_field = SafeReflection.access(clazz, array);
        final Class<PacketPlayOutEntityVelocity> clazz2 = PacketPlayOutEntityVelocity.class;
        final String[] array2 = new String[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[0]];
        array2[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[1]] = SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[0]];
        array2[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[2]] = SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[3]];
        motX_field = SafeReflection.access(clazz2, array2);
        final Class<PacketPlayOutEntityVelocity> clazz3 = PacketPlayOutEntityVelocity.class;
        final String[] array3 = new String[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[0]];
        array3[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[1]] = SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[4]];
        array3[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[2]] = SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[5]];
        motY_field = SafeReflection.access(clazz3, array3);
        final Class<PacketPlayOutEntityVelocity> clazz4 = PacketPlayOutEntityVelocity.class;
        final String[] array4 = new String[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[0]];
        array4[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[1]] = SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[6]];
        array4[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[2]] = SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[7]];
        motZ_field = SafeReflection.access(clazz4, array4);
    }
    
    public void accept(final PacketPlayOutEntityVelocity packetPlayOutEntityVelocity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.id_field, packetPlayOutEntityVelocity);
        this.motX = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.motX_field, packetPlayOutEntityVelocity);
        this.motY = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.motY_field, packetPlayOutEntityVelocity);
        this.motZ = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.motZ_field, packetPlayOutEntityVelocity);
    }
    
    private static void lIlIllllIIIIII() {
        (lIlIlIllIIIII = new String[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[8]])[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[1]] = lIlIlllIllllIl("GJRhVGXt3bo=", "IoSlb");
        SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[2]] = lIlIlllIllllIl("YvyJKW89VlE=", "MGSfO");
        SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[0]] = lIlIlllIllllIl("jGuhOXTEMfA=", "sMMpt");
        SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[3]] = lIlIlllIlllllI("Mw==", "KHsyd");
        SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[4]] = lIlIlllIllllll("7OMquIzmJss=", "oaUiH");
        SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[5]] = lIlIlllIllllIl("oZ7ZXP7jm/M=", "jsMsg");
        SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[6]] = lIlIlllIllllll("/JY8e9c2O7w=", "Dqwaf");
        SPacketPlayOutEntityVelocity.lIlIlIllIIIII[SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[7]] = lIlIlllIllllll("Y3Mk0YSXFgI=", "Mfsdu");
    }
    
    private static String lIlIlllIllllIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIlllIlllllI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[1];
        while (lIlIllllIIIIlI(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (false == true) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIlIlllIllllll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIllllIIIIIl() {
        (lIlIlIllIIIIl = new int[9])[0] = 2;
        SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[1] = 0;
        SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[2] = 1;
        SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[3] = 3;
        SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[4] = 4;
        SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[5] = 5;
        SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[6] = 6;
        SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[7] = 7;
        SPacketPlayOutEntityVelocity.lIlIlIllIIIIl[8] = 8;
    }
    
    private static boolean lIlIllllIIIIlI(final int n, final int n2) {
        return n < n2;
    }
}
