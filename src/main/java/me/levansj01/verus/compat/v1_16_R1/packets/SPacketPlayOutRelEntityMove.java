package me.levansj01.verus.compat.v1_16_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_16_R1.*;
import me.levansj01.verus.util.java.*;
import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class SPacketPlayOutRelEntityMove extends VPacketPlayOutRelEntityMove
{
    private static final Field look_field;
    private static final Field x_field;
    private static final Field id_field;
    private static final Field y_field;
    private static final Field yaw_field;
    private static final Field pitch_field;
    private static final Field ground_field;
    private static final Field z_field;
    private static final String[] lIIlllIlIlIlI;
    private static final int[] lIIlllIllIIIl;
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutRelEntityMove.id_field, packetPlayOutEntity);
        this.x = (short)SafeReflection.fetch(SPacketPlayOutRelEntityMove.x_field, packetPlayOutEntity, Short.TYPE);
        this.y = (short)SafeReflection.fetch(SPacketPlayOutRelEntityMove.y_field, packetPlayOutEntity, Short.TYPE);
        this.z = (short)SafeReflection.fetch(SPacketPlayOutRelEntityMove.z_field, packetPlayOutEntity, Short.TYPE);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMove.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMove.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutRelEntityMove.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutRelEntityMove.look_field, packetPlayOutEntity);
    }
    
    static {
        lIlIIIIIIllllI();
        lIlIIIIIIlIIll();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[7]]);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    private static void lIlIIIIIIlIIll() {
        (lIIlllIlIlIlI = new String[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[8]])[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[0]] = lIlIIIIIIIlIll("NA==", "Uokdb");
        SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[1]] = lIlIIIIIIIlIll("JQ==", "GGHeM");
        SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[2]] = lIlIIIIIIIllII("RRYEaS5xDAc=", "DguGo");
        SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[3]] = lIlIIIIIIIllIl("sIAbjG0PVUo=", "fthmM");
        SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[4]] = lIlIIIIIIIllII("qwiWhjsgBTY=", "NgECP");
        SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[5]] = lIlIIIIIIIllII("Pxr5KrURGRQ=", "tKmMb");
        SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[6]] = lIlIIIIIIIlIll("Iw==", "DMIbl");
        SPacketPlayOutRelEntityMove.lIIlllIlIlIlI[SPacketPlayOutRelEntityMove.lIIlllIllIIIl[7]] = lIlIIIIIIIllIl("KfBFsoz5Cw8=", "rnZWa");
    }
    
    private static String lIlIIIIIIIlIll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutRelEntityMove.lIIlllIllIIIl[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutRelEntityMove.lIIlllIllIIIl[0];
        while (lIlIIIIIIlllll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (2 == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIlIIIIIIIllII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutRelEntityMove.lIIlllIllIIIl[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutRelEntityMove.lIIlllIllIIIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIIIIIIllIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutRelEntityMove.lIIlllIllIIIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIIIIllllI() {
        (lIIlllIllIIIl = new int[9])[0] = 0;
        SPacketPlayOutRelEntityMove.lIIlllIllIIIl[1] = 1;
        SPacketPlayOutRelEntityMove.lIIlllIllIIIl[2] = 2;
        SPacketPlayOutRelEntityMove.lIIlllIllIIIl[3] = 3;
        SPacketPlayOutRelEntityMove.lIIlllIllIIIl[4] = 4;
        SPacketPlayOutRelEntityMove.lIIlllIllIIIl[5] = 5;
        SPacketPlayOutRelEntityMove.lIIlllIllIIIl[6] = 6;
        SPacketPlayOutRelEntityMove.lIIlllIllIIIl[7] = 7;
        SPacketPlayOutRelEntityMove.lIIlllIllIIIl[8] = 8;
    }
    
    private static boolean lIlIIIIIIlllll(final int n, final int n2) {
        return n < n2;
    }
}
