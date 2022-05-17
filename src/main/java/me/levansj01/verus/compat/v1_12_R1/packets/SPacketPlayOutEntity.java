package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_12_R1.*;
import me.levansj01.verus.util.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayOutEntity extends VPacketPlayOutEntity
{
    private static final Field ground_field;
    private static final Field yaw_field;
    private static final Field y_field;
    private static final Field look_field;
    private static final Field pitch_field;
    private static final Field id_field;
    private static final Field z_field;
    private static final Field x_field;
    private static final String[] lIllllIlllIIl;
    private static final int[] lIllllIlllIll;
    
    static {
        llIIIIIlllIlIl();
        llIIIIIlllIIlI();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[7]]);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntity.id_field, packetPlayOutEntity);
        this.x = (int)SafeReflection.fetch(SPacketPlayOutEntity.x_field, packetPlayOutEntity);
        this.y = (int)SafeReflection.fetch(SPacketPlayOutEntity.y_field, packetPlayOutEntity);
        this.z = (int)SafeReflection.fetch(SPacketPlayOutEntity.z_field, packetPlayOutEntity);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutEntity.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutEntity.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutEntity.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutEntity.look_field, packetPlayOutEntity);
    }
    
    private static void llIIIIIlllIIlI() {
        (lIllllIlllIIl = new String[SPacketPlayOutEntity.lIllllIlllIll[8]])[SPacketPlayOutEntity.lIllllIlllIll[0]] = llIIIIIllIllll("Cw==", "jVYoO");
        SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[1]] = llIIIIIlllIIII("tDjOvO793Vk=", "xyUIy");
        SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[2]] = llIIIIIllIllll("GQ==", "zmzDx");
        SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[3]] = llIIIIIlllIIIl("4DfjUex333w=", "PuwmA");
        SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[4]] = llIIIIIllIllll("MA==", "UDaOO");
        SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[5]] = llIIIIIllIllll("Pg==", "XSJYC");
        SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[6]] = llIIIIIllIllll("Dw==", "hdaJU");
        SPacketPlayOutEntity.lIllllIlllIIl[SPacketPlayOutEntity.lIllllIlllIll[7]] = llIIIIIllIllll("HQ==", "uASLV");
    }
    
    private static String llIIIIIlllIIIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntity.lIllllIlllIll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIIIlllIIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntity.lIllllIlllIll[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntity.lIllllIlllIll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIIIllIllll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntity.lIllllIlllIll[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntity.lIllllIlllIll[0];
        while (llIIIIIlllIllI(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (-4 >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void llIIIIIlllIlIl() {
        (lIllllIlllIll = new int[9])[0] = 0;
        SPacketPlayOutEntity.lIllllIlllIll[1] = 1;
        SPacketPlayOutEntity.lIllllIlllIll[2] = 2;
        SPacketPlayOutEntity.lIllllIlllIll[3] = 3;
        SPacketPlayOutEntity.lIllllIlllIll[4] = 4;
        SPacketPlayOutEntity.lIllllIlllIll[5] = 5;
        SPacketPlayOutEntity.lIllllIlllIll[6] = 6;
        SPacketPlayOutEntity.lIllllIlllIll[7] = 7;
        SPacketPlayOutEntity.lIllllIlllIll[8] = 8;
    }
    
    private static boolean llIIIIIlllIllI(final int n, final int n2) {
        return n < n2;
    }
}
