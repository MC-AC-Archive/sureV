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

public class SPacketPlayOutRelEntityMove extends VPacketPlayOutRelEntityMove
{
    private static final Field ground_field;
    private static final Field z_field;
    private static final Field y_field;
    private static final Field id_field;
    private static final Field x_field;
    private static final Field pitch_field;
    private static final Field look_field;
    private static final Field yaw_field;
    private static final String[] llIlIlIIllIII;
    private static final int[] llIlIlIllIIlI;
    
    static {
        llIllIlIllIIII();
        llIllIIllllIII();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[7]]);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutRelEntityMove.id_field, packetPlayOutEntity);
        this.x = (int)SafeReflection.fetch(SPacketPlayOutRelEntityMove.x_field, packetPlayOutEntity);
        this.y = (int)SafeReflection.fetch(SPacketPlayOutRelEntityMove.y_field, packetPlayOutEntity);
        this.z = (int)SafeReflection.fetch(SPacketPlayOutRelEntityMove.z_field, packetPlayOutEntity);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMove.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMove.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutRelEntityMove.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutRelEntityMove.look_field, packetPlayOutEntity);
    }
    
    private static void llIllIIllllIII() {
        (llIlIlIIllIII = new String[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[8]])[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[0]] = llIllIIlllIlIl("NyAiVyZqSp4=", "czLbR");
        SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[1]] = llIllIIlllIllI("GA==", "zClte");
        SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[2]] = llIllIIlllIllI("Ig==", "AVeAC");
        SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[3]] = llIllIIlllIlll("/4O4zKGpFPo=", "gwFOJ");
        SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[4]] = llIllIIlllIlll("m9Opo3yjUz8=", "obuMJ");
        SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[5]] = llIllIIlllIlIl("ijvSvSgC5Bs=", "ZeSKt");
        SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[6]] = llIllIIlllIlIl("N8AcCjYh780=", "SJrMa");
        SPacketPlayOutRelEntityMove.llIlIlIIllIII[SPacketPlayOutRelEntityMove.llIlIlIllIIlI[7]] = llIllIIlllIllI("Gw==", "syqbN");
    }
    
    private static String llIllIIlllIlIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutRelEntityMove.llIlIlIllIIlI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIllIIlllIlll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutRelEntityMove.llIlIlIllIIlI[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutRelEntityMove.llIlIlIllIIlI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIllIIlllIllI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutRelEntityMove.llIlIlIllIIlI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutRelEntityMove.llIlIlIllIIlI[0];
        while (llIllIlIllIIIl(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (0 <= -1) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void llIllIlIllIIII() {
        (llIlIlIllIIlI = new int[9])[0] = 0;
        SPacketPlayOutRelEntityMove.llIlIlIllIIlI[1] = 1;
        SPacketPlayOutRelEntityMove.llIlIlIllIIlI[2] = 2;
        SPacketPlayOutRelEntityMove.llIlIlIllIIlI[3] = 3;
        SPacketPlayOutRelEntityMove.llIlIlIllIIlI[4] = 4;
        SPacketPlayOutRelEntityMove.llIlIlIllIIlI[5] = 5;
        SPacketPlayOutRelEntityMove.llIlIlIllIIlI[6] = 6;
        SPacketPlayOutRelEntityMove.llIlIlIllIIlI[7] = 7;
        SPacketPlayOutRelEntityMove.llIlIlIllIIlI[8] = 8;
    }
    
    private static boolean llIllIlIllIIIl(final int n, final int n2) {
        return n < n2;
    }
}
