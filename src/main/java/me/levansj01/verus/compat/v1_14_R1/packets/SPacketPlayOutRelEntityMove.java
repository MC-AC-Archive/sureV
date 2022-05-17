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

public class SPacketPlayOutRelEntityMove extends VPacketPlayOutRelEntityMove
{
    private static final Field ground_field;
    private static final Field yaw_field;
    private static final Field x_field;
    private static final Field pitch_field;
    private static final Field look_field;
    private static final Field y_field;
    private static final Field id_field;
    private static final Field z_field;
    private static final String[] lIIIllIIIIlll;
    private static final int[] lIIIllIIIlIII;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
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
        lIIIlllIlllllI();
        lIIIlllIllllIl();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[7]]);
    }
    
    private static void lIIIlllIllllIl() {
        (lIIIllIIIIlll = new String[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[8]])[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[0]] = lIIIlllIlllIll("yPoKi92hJmM=", "ntBkk");
        SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[1]] = lIIIlllIllllII("unndVrFL+XY=", "kNzBx");
        SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[2]] = lIIIlllIllllII("RqnHRqDeetg=", "PjxWX");
        SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[3]] = lIIIlllIllllII("h2+VWeVactI=", "yLFWp");
        SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[4]] = lIIIlllIlllIll("FKeGwfXRLPo=", "AYcdj");
        SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[5]] = lIIIlllIllllII("7qrFuIkPyCs=", "vGwea");
        SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[6]] = lIIIlllIlllIll("P8sB3U3YWb4=", "qmYNS");
        SPacketPlayOutRelEntityMove.lIIIllIIIIlll[SPacketPlayOutRelEntityMove.lIIIllIIIlIII[7]] = lIIIlllIllllII("W1FbDZcLLzY=", "geBkf");
    }
    
    private static String lIIIlllIlllIll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutRelEntityMove.lIIIllIIIlIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIlllIllllII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutRelEntityMove.lIIIllIIIlIII[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutRelEntityMove.lIIIllIIIlIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlllIlllllI() {
        (lIIIllIIIlIII = new int[9])[0] = 0;
        SPacketPlayOutRelEntityMove.lIIIllIIIlIII[1] = 1;
        SPacketPlayOutRelEntityMove.lIIIllIIIlIII[2] = 2;
        SPacketPlayOutRelEntityMove.lIIIllIIIlIII[3] = 3;
        SPacketPlayOutRelEntityMove.lIIIllIIIlIII[4] = 4;
        SPacketPlayOutRelEntityMove.lIIIllIIIlIII[5] = 5;
        SPacketPlayOutRelEntityMove.lIIIllIIIlIII[6] = 6;
        SPacketPlayOutRelEntityMove.lIIIllIIIlIII[7] = 7;
        SPacketPlayOutRelEntityMove.lIIIllIIIlIII[8] = 8;
    }
}
