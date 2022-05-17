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

public class SPacketPlayOutEntityLook extends VPacketPlayOutEntityLook
{
    private static final Field look_field;
    private static final Field y_field;
    private static final Field yaw_field;
    private static final Field x_field;
    private static final Field ground_field;
    private static final Field id_field;
    private static final Field z_field;
    private static final Field pitch_field;
    private static final String[] lIIlIIlIllIII;
    private static final int[] lIIlIIllIIlII;
    
    static {
        lIIlIlIlllllll();
        lIIlIlIlllllII();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[7]]);
    }
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntityLook.id_field, packetPlayOutEntity);
        this.x = (short)SafeReflection.fetch(SPacketPlayOutEntityLook.x_field, packetPlayOutEntity, Short.TYPE);
        this.y = (short)SafeReflection.fetch(SPacketPlayOutEntityLook.y_field, packetPlayOutEntity, Short.TYPE);
        this.z = (short)SafeReflection.fetch(SPacketPlayOutEntityLook.z_field, packetPlayOutEntity, Short.TYPE);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutEntityLook.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutEntityLook.look_field, packetPlayOutEntity);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    private static void lIIlIlIlllllII() {
        (lIIlIIlIllIII = new String[SPacketPlayOutEntityLook.lIIlIIllIIlII[8]])[SPacketPlayOutEntityLook.lIIlIIllIIlII[0]] = lIIlIlIlllIlII("newBXfWpGrg=", "VrtwJ");
        SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[1]] = lIIlIlIllllIII("LQ==", "OLEtQ");
        SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[2]] = lIIlIlIllllIII("OQ==", "ZfoLP");
        SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[3]] = lIIlIlIllllIII("Ag==", "fORoJ");
        SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[4]] = lIIlIlIllllIIl("z7KYl5LHVBE=", "TArKS");
        SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[5]] = lIIlIlIllllIIl("He7QT/l1PPw=", "Zpqkw");
        SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[6]] = lIIlIlIlllIlII("b2AnQHlX638=", "cdzQo");
        SPacketPlayOutEntityLook.lIIlIIlIllIII[SPacketPlayOutEntityLook.lIIlIIllIIlII[7]] = lIIlIlIlllIlII("Qh4DL7AROE4=", "Fndly");
    }
    
    private static String lIIlIlIllllIIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityLook.lIIlIIllIIlII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIlIllllIII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityLook.lIIlIIllIIlII[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityLook.lIIlIIllIIlII[0];
        if (lIIlIllIIIIIII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            return null;
        }
        return String.valueOf(sb);
    }
    
    private static String lIIlIlIlllIlII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityLook.lIIlIIllIIlII[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityLook.lIIlIIllIIlII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIlIlllllll() {
        (lIIlIIllIIlII = new int[9])[0] = 0;
        SPacketPlayOutEntityLook.lIIlIIllIIlII[1] = 1;
        SPacketPlayOutEntityLook.lIIlIIllIIlII[2] = 2;
        SPacketPlayOutEntityLook.lIIlIIllIIlII[3] = 3;
        SPacketPlayOutEntityLook.lIIlIIllIIlII[4] = 4;
        SPacketPlayOutEntityLook.lIIlIIllIIlII[5] = 5;
        SPacketPlayOutEntityLook.lIIlIIllIIlII[6] = 6;
        SPacketPlayOutEntityLook.lIIlIIllIIlII[7] = 7;
        SPacketPlayOutEntityLook.lIIlIIllIIlII[8] = 8;
    }
    
    private static boolean lIIlIllIIIIIII(final int n, final int n2) {
        return n < n2;
    }
}
