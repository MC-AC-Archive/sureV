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

public class SPacketPlayOutRelEntityMove extends VPacketPlayOutRelEntityMove
{
    private static final Field z_field;
    private static final Field id_field;
    private static final Field pitch_field;
    private static final Field x_field;
    private static final Field y_field;
    private static final Field ground_field;
    private static final Field look_field;
    private static final Field yaw_field;
    private static final String[] lIllIIlllIIll;
    private static final int[] lIllIIllllIII;
    
    static {
        lIllIlllIIIIII();
        lIllIllIlllIII();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[7]]);
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
    
    private static void lIllIllIlllIII() {
        (lIllIIlllIIll = new String[SPacketPlayOutRelEntityMove.lIllIIllllIII[8]])[SPacketPlayOutRelEntityMove.lIllIIllllIII[0]] = lIllIllIllIlII("Aw==", "bMQwE");
        SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[1]] = lIllIllIllIlII("BQ==", "gTaCk");
        SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[2]] = lIllIllIllIlIl("mjYvY/J7sFY=", "XAsdu");
        SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[3]] = lIllIllIllIllI("cH1Ki+T8M1A=", "DsgFS");
        SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[4]] = lIllIllIllIlII("Cw==", "nFaZR");
        SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[5]] = lIllIllIllIlIl("dowiuZU/SXM=", "ZDGKQ");
        SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[6]] = lIllIllIllIllI("ko2AjR4wEa4=", "tvuBB");
        SPacketPlayOutRelEntityMove.lIllIIlllIIll[SPacketPlayOutRelEntityMove.lIllIIllllIII[7]] = lIllIllIllIlIl("fgYHyomoo7E=", "Ccetj");
    }
    
    private static String lIllIllIllIlIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutRelEntityMove.lIllIIllllIII[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutRelEntityMove.lIllIIllllIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIllIllIllIllI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutRelEntityMove.lIllIIllllIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIllIllIllIlII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutRelEntityMove.lIllIIllllIII[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutRelEntityMove.lIllIIllllIII[0];
        while (lIllIlllIIIlIl(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (-4 >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIllIlllIIIIII() {
        (lIllIIllllIII = new int[9])[0] = 0;
        SPacketPlayOutRelEntityMove.lIllIIllllIII[1] = 1;
        SPacketPlayOutRelEntityMove.lIllIIllllIII[2] = 2;
        SPacketPlayOutRelEntityMove.lIllIIllllIII[3] = 3;
        SPacketPlayOutRelEntityMove.lIllIIllllIII[4] = 4;
        SPacketPlayOutRelEntityMove.lIllIIllllIII[5] = 5;
        SPacketPlayOutRelEntityMove.lIllIIllllIII[6] = 6;
        SPacketPlayOutRelEntityMove.lIllIIllllIII[7] = 7;
        SPacketPlayOutRelEntityMove.lIllIIllllIII[8] = 8;
    }
    
    private static boolean lIllIlllIIIlIl(final int n, final int n2) {
        return n < n2;
    }
}
