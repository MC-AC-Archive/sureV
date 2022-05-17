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

public class SPacketPlayOutEntityVelocity extends VPacketPlayOutEntityVelocity
{
    private static final Field motZ_field;
    private static final Field motY_field;
    private static final Field motX_field;
    private static final Field id_field;
    private static final String[] lIIIIllllIIlI;
    private static final int[] lIIIIllllIllI;
    
    public void accept(final PacketPlayOutEntityVelocity packetPlayOutEntityVelocity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.id_field, packetPlayOutEntityVelocity);
        this.motX = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.motX_field, packetPlayOutEntityVelocity);
        this.motY = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.motY_field, packetPlayOutEntityVelocity);
        this.motZ = (int)SafeReflection.fetch(SPacketPlayOutEntityVelocity.motZ_field, packetPlayOutEntityVelocity);
    }
    
    static {
        lIIIlIlIllIlIl();
        lIIIlIlIllIIII();
        final Class<PacketPlayOutEntityVelocity> clazz = PacketPlayOutEntityVelocity.class;
        final String[] array = new String[SPacketPlayOutEntityVelocity.lIIIIllllIllI[0]];
        array[SPacketPlayOutEntityVelocity.lIIIIllllIllI[1]] = SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[1]];
        array[SPacketPlayOutEntityVelocity.lIIIIllllIllI[2]] = SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[2]];
        id_field = SafeReflection.access(clazz, array);
        final Class<PacketPlayOutEntityVelocity> clazz2 = PacketPlayOutEntityVelocity.class;
        final String[] array2 = new String[SPacketPlayOutEntityVelocity.lIIIIllllIllI[0]];
        array2[SPacketPlayOutEntityVelocity.lIIIIllllIllI[1]] = SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[0]];
        array2[SPacketPlayOutEntityVelocity.lIIIIllllIllI[2]] = SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[3]];
        motX_field = SafeReflection.access(clazz2, array2);
        final Class<PacketPlayOutEntityVelocity> clazz3 = PacketPlayOutEntityVelocity.class;
        final String[] array3 = new String[SPacketPlayOutEntityVelocity.lIIIIllllIllI[0]];
        array3[SPacketPlayOutEntityVelocity.lIIIIllllIllI[1]] = SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[4]];
        array3[SPacketPlayOutEntityVelocity.lIIIIllllIllI[2]] = SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[5]];
        motY_field = SafeReflection.access(clazz3, array3);
        final Class<PacketPlayOutEntityVelocity> clazz4 = PacketPlayOutEntityVelocity.class;
        final String[] array4 = new String[SPacketPlayOutEntityVelocity.lIIIIllllIllI[0]];
        array4[SPacketPlayOutEntityVelocity.lIIIIllllIllI[1]] = SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[6]];
        array4[SPacketPlayOutEntityVelocity.lIIIIllllIllI[2]] = SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[7]];
        motZ_field = SafeReflection.access(clazz4, array4);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntityVelocity)o);
    }
    
    private static void lIIIlIlIllIIII() {
        (lIIIIllllIIlI = new String[SPacketPlayOutEntityVelocity.lIIIIllllIllI[8]])[SPacketPlayOutEntityVelocity.lIIIIllllIllI[1]] = lIIIlIlIlIlIlI("p9fS9ag+xnQ=", "TOopP");
        SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[2]] = lIIIlIlIlIllII("GJ39v7NdVhk=", "hBfeA");
        SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[0]] = lIIIlIlIlIllII("cQv/USni4As=", "IAKdq");
        SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[3]] = lIIIlIlIlIlllI("KA==", "POBcX");
        SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[4]] = lIIIlIlIlIlllI("MQ==", "RhsRg");
        SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[5]] = lIIIlIlIlIllII("kf8bAxqZ14Y=", "XjKXX");
        SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[6]] = lIIIlIlIlIllII("TDnUxZFZMBc=", "hypWT");
        SPacketPlayOutEntityVelocity.lIIIIllllIIlI[SPacketPlayOutEntityVelocity.lIIIIllllIllI[7]] = lIIIlIlIlIlIlI("JWZcxkPWyPs=", "GGUrZ");
    }
    
    private static String lIIIlIlIlIllII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityVelocity.lIIIIllllIllI[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIlIlIlIlIlI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityVelocity.lIIIIllllIllI[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityVelocity.lIIIIllllIllI[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIlIlIlIlllI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityVelocity.lIIIIllllIllI[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityVelocity.lIIIIllllIllI[1];
        while (lIIIlIlIllIllI(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (-4 > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIIIlIlIllIlIl() {
        (lIIIIllllIllI = new int[9])[0] = 2;
        SPacketPlayOutEntityVelocity.lIIIIllllIllI[1] = 0;
        SPacketPlayOutEntityVelocity.lIIIIllllIllI[2] = 1;
        SPacketPlayOutEntityVelocity.lIIIIllllIllI[3] = 3;
        SPacketPlayOutEntityVelocity.lIIIIllllIllI[4] = 4;
        SPacketPlayOutEntityVelocity.lIIIIllllIllI[5] = 5;
        SPacketPlayOutEntityVelocity.lIIIIllllIllI[6] = 6;
        SPacketPlayOutEntityVelocity.lIIIIllllIllI[7] = 7;
        SPacketPlayOutEntityVelocity.lIIIIllllIllI[8] = 8;
    }
    
    private static boolean lIIIlIlIllIllI(final int n, final int n2) {
        return n < n2;
    }
}
