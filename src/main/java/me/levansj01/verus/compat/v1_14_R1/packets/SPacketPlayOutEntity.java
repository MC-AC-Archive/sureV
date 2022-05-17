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

public class SPacketPlayOutEntity extends VPacketPlayOutEntity
{
    private static final Field z_field;
    private static final Field y_field;
    private static final Field yaw_field;
    private static final Field look_field;
    private static final Field ground_field;
    private static final Field id_field;
    private static final Field x_field;
    private static final Field pitch_field;
    private static final String[] llIllIIlIIlIl;
    private static final int[] llIllIIlIIllI;
    
    static {
        llIlllIlllIllI();
        llIlllIlllIlII();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[7]]);
    }
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntity.id_field, packetPlayOutEntity);
        this.x = (short)SafeReflection.fetch(SPacketPlayOutEntity.x_field, packetPlayOutEntity, Short.TYPE);
        this.y = (short)SafeReflection.fetch(SPacketPlayOutEntity.y_field, packetPlayOutEntity, Short.TYPE);
        this.z = (short)SafeReflection.fetch(SPacketPlayOutEntity.z_field, packetPlayOutEntity, Short.TYPE);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutEntity.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutEntity.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutEntity.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutEntity.look_field, packetPlayOutEntity);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    private static void llIlllIlllIlII() {
        (llIllIIlIIlIl = new String[SPacketPlayOutEntity.llIllIIlIIllI[8]])[SPacketPlayOutEntity.llIllIIlIIllI[0]] = llIlllIlllIIII("oynpW2UZWcc=", "LZLHC");
        SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[1]] = llIlllIlllIIIl("BA==", "fBrSv");
        SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[2]] = llIlllIlllIIIl("Lg==", "MKkSn");
        SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[3]] = llIlllIlllIIII("PjdkwWdrDuA=", "BzvEy");
        SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[4]] = llIlllIlllIIlI("jvFdL71a2Rg=", "dHPAg");
        SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[5]] = llIlllIlllIIlI("STEkxvDbu6E=", "cCVVg");
        SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[6]] = llIlllIlllIIIl("Bg==", "atRRH");
        SPacketPlayOutEntity.llIllIIlIIlIl[SPacketPlayOutEntity.llIllIIlIIllI[7]] = llIlllIlllIIIl("PA==", "TAvbb");
    }
    
    private static String llIlllIlllIIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntity.llIllIIlIIllI[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntity.llIllIIlIIllI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIlllIlllIIIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntity.llIllIIlIIllI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntity.llIllIIlIIllI[0];
        while (llIlllIlllIlll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (4 != 4) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String llIlllIlllIIlI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntity.llIllIIlIIllI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void llIlllIlllIllI() {
        (llIllIIlIIllI = new int[9])[0] = 0;
        SPacketPlayOutEntity.llIllIIlIIllI[1] = 1;
        SPacketPlayOutEntity.llIllIIlIIllI[2] = 2;
        SPacketPlayOutEntity.llIllIIlIIllI[3] = 3;
        SPacketPlayOutEntity.llIllIIlIIllI[4] = 4;
        SPacketPlayOutEntity.llIllIIlIIllI[5] = 5;
        SPacketPlayOutEntity.llIllIIlIIllI[6] = 6;
        SPacketPlayOutEntity.llIllIIlIIllI[7] = 7;
        SPacketPlayOutEntity.llIllIIlIIllI[8] = 8;
    }
    
    private static boolean llIlllIlllIlll(final int n, final int n2) {
        return n < n2;
    }
}
