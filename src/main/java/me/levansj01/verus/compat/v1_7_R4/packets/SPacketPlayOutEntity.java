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

public class SPacketPlayOutEntity extends VPacketPlayOutEntity
{
    private static final Field pitch_field;
    private static final Field yaw_field;
    private static final Field id_field;
    private static final Field ground_field;
    private static final Field z_field;
    private static final Field y_field;
    private static final Field x_field;
    private static final String[] lIIIllIlllIII;
    private static final int[] lIIIllIllllIl;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntity.id_field, packetPlayOutEntity);
        this.x = (byte)SafeReflection.fetch(SPacketPlayOutEntity.x_field, packetPlayOutEntity);
        this.y = (byte)SafeReflection.fetch(SPacketPlayOutEntity.y_field, packetPlayOutEntity);
        this.z = (byte)SafeReflection.fetch(SPacketPlayOutEntity.z_field, packetPlayOutEntity);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutEntity.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutEntity.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutEntity.ground_field, packetPlayOutEntity);
        this.look = (SPacketPlayOutEntity.lIIIllIllllIl[0] != 0);
    }
    
    static {
        lIIlIIIIllIllI();
        lIIlIIIIllIIIl();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIIIllIlllIII[SPacketPlayOutEntity.lIIIllIllllIl[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIIIllIlllIII[SPacketPlayOutEntity.lIIIllIllllIl[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIIIllIlllIII[SPacketPlayOutEntity.lIIIllIllllIl[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIIIllIlllIII[SPacketPlayOutEntity.lIIIllIllllIl[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIIIllIlllIII[SPacketPlayOutEntity.lIIIllIllllIl[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIIIllIlllIII[SPacketPlayOutEntity.lIIIllIllllIl[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.lIIIllIlllIII[SPacketPlayOutEntity.lIIIllIllllIl[6]]);
    }
    
    private static void lIIlIIIIllIIIl() {
        (lIIIllIlllIII = new String[SPacketPlayOutEntity.lIIIllIllllIl[7]])[SPacketPlayOutEntity.lIIIllIllllIl[0]] = lIIlIIIIlIlIII("V734Vz07+34=", "NRgTV");
        SPacketPlayOutEntity.lIIIllIlllIII[SPacketPlayOutEntity.lIIIllIllllIl[1]] = lIIlIIIIllIIII("OA==", "ZEoEe");
        SPacketPlayOutEntity.lIIIllIlllIII[SPacketPlayOutEntity.lIIIllIllllIl[2]] = lIIlIIIIlIlIII("92YBx4u/R04=", "upazW");
        SPacketPlayOutEntity.lIIIllIlllIII[SPacketPlayOutEntity.lIIIllIllllIl[3]] = lIIlIIIIllIIII("JQ==", "AALRT");
        SPacketPlayOutEntity.lIIIllIlllIII[SPacketPlayOutEntity.lIIIllIllllIl[4]] = lIIlIIIIllIIII("Mw==", "VwWNx");
        SPacketPlayOutEntity.lIIIllIlllIII[SPacketPlayOutEntity.lIIIllIllllIl[5]] = lIIlIIIIllIIII("PA==", "ZAoWH");
        SPacketPlayOutEntity.lIIIllIlllIII[SPacketPlayOutEntity.lIIIllIllllIl[6]] = lIIlIIIIllIIII("Kg==", "MKrot");
    }
    
    private static String lIIlIIIIlIlIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntity.lIIIllIllllIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIIIIllIIII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntity.lIIIllIllllIl[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntity.lIIIllIllllIl[0];
        while (lIIlIIIIllIlll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (3 <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIIlIIIIllIllI() {
        (lIIIllIllllIl = new int[8])[0] = 0;
        SPacketPlayOutEntity.lIIIllIllllIl[1] = 1;
        SPacketPlayOutEntity.lIIIllIllllIl[2] = 2;
        SPacketPlayOutEntity.lIIIllIllllIl[3] = 3;
        SPacketPlayOutEntity.lIIIllIllllIl[4] = 4;
        SPacketPlayOutEntity.lIIIllIllllIl[5] = 5;
        SPacketPlayOutEntity.lIIIllIllllIl[6] = 6;
        SPacketPlayOutEntity.lIIIllIllllIl[7] = 7;
    }
    
    private static boolean lIIlIIIIllIlll(final int n, final int n2) {
        return n < n2;
    }
}
