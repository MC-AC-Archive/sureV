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

public class SPacketPlayOutRelEntityMove extends VPacketPlayOutRelEntityMove
{
    private static final Field y_field;
    private static final Field x_field;
    private static final Field yaw_field;
    private static final Field id_field;
    private static final Field z_field;
    private static final Field pitch_field;
    private static final Field ground_field;
    private static final String[] lIIIIlIIIIllI;
    private static final int[] lIIIIlIIlllIl;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutRelEntityMove.id_field, packetPlayOutEntity);
        this.x = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMove.x_field, packetPlayOutEntity);
        this.y = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMove.y_field, packetPlayOutEntity);
        this.z = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMove.z_field, packetPlayOutEntity);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMove.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMove.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutRelEntityMove.ground_field, packetPlayOutEntity);
        this.look = (SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[0] != 0);
    }
    
    static {
        lIIIIlllllllll();
        lIIIIlllIllIll();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIIlIIIIllI[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIIlIIIIllI[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIIlIIIIllI[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIIlIIIIllI[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIIlIIIIllI[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIIlIIIIllI[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIIlIIIIllI[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[6]]);
    }
    
    private static void lIIIIlllIllIll() {
        (lIIIIlIIIIllI = new String[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[7]])[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[0]] = lIIIIlllIlIlII("YyfE6AN2sUs=", "EIGNk");
        SPacketPlayOutRelEntityMove.lIIIIlIIIIllI[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[1]] = lIIIIlllIlIlll("Og==", "XjYYt");
        SPacketPlayOutRelEntityMove.lIIIIlIIIIllI[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[2]] = lIIIIlllIllIII("jL3zSbjYZaE=", "HkwAx");
        SPacketPlayOutRelEntityMove.lIIIIlIIIIllI[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[3]] = lIIIIlllIlIlll("Mg==", "VGsZy");
        SPacketPlayOutRelEntityMove.lIIIIlIIIIllI[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[4]] = lIIIIlllIlIlII("mvyE9fjFDJ4=", "RCBzB");
        SPacketPlayOutRelEntityMove.lIIIIlIIIIllI[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[5]] = lIIIIlllIlIlII("dQ6q7CURhYM=", "WbYEK");
        SPacketPlayOutRelEntityMove.lIIIIlIIIIllI[SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[6]] = lIIIIlllIlIlII("d5GdJUFtXSw=", "hnSVb");
    }
    
    private static String lIIIIlllIlIlll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[0];
        while (lIIIlIIIIIIIII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (false) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIIIIlllIllIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIlllIlIlII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIlllllllll() {
        (lIIIIlIIlllIl = new int[9])[0] = 0;
        SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[1] = 1;
        SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[2] = 2;
        SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[3] = 3;
        SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[4] = 4;
        SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[5] = 5;
        SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[6] = 6;
        SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[7] = 7;
        SPacketPlayOutRelEntityMove.lIIIIlIIlllIl[8] = 8;
    }
    
    private static boolean lIIIlIIIIIIIII(final int n, final int n2) {
        return n < n2;
    }
}
