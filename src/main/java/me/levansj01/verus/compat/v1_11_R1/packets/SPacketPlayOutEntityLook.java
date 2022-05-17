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

public class SPacketPlayOutEntityLook extends VPacketPlayOutEntityLook
{
    private static final Field x_field;
    private static final Field ground_field;
    private static final Field look_field;
    private static final Field yaw_field;
    private static final Field y_field;
    private static final Field pitch_field;
    private static final Field id_field;
    private static final Field z_field;
    private static final String[] llIIIlIlIlIIl;
    private static final int[] llIIIlIlIlIlI;
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntityLook.id_field, packetPlayOutEntity);
        this.x = (int)SafeReflection.fetch(SPacketPlayOutEntityLook.x_field, packetPlayOutEntity);
        this.y = (int)SafeReflection.fetch(SPacketPlayOutEntityLook.y_field, packetPlayOutEntity);
        this.z = (int)SafeReflection.fetch(SPacketPlayOutEntityLook.z_field, packetPlayOutEntity);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutEntityLook.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutEntityLook.look_field, packetPlayOutEntity);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    static {
        llIIlIIlIlllll();
        llIIlIIlIllllI();
        id_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[0]]);
        x_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[1]]);
        y_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[2]]);
        z_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[3]]);
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[4]]);
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[5]]);
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[6]]);
        look_field = SafeReflection.access(PacketPlayOutEntity.class, SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[7]]);
    }
    
    private static void llIIlIIlIllllI() {
        (llIIIlIlIlIIl = new String[SPacketPlayOutEntityLook.llIIIlIlIlIlI[8]])[SPacketPlayOutEntityLook.llIIIlIlIlIlI[0]] = llIIlIIlIlllII("EFLAlmozlaA=", "UQcEQ");
        SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[1]] = llIIlIIlIlllII("XFszKMXKRSA=", "wfAkq");
        SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[2]] = llIIlIIlIlllIl("Cg==", "idfua");
        SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[3]] = llIIlIIlIlllII("zqyNyjhz9KQ=", "KPGDH");
        SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[4]] = llIIlIIlIlllIl("KA==", "MCOdS");
        SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[5]] = llIIlIIlIlllII("cPqkQJoj87M=", "Egmrg");
        SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[6]] = llIIlIIlIlllII("R6q0JcBL7dQ=", "IXlrd");
        SPacketPlayOutEntityLook.llIIIlIlIlIIl[SPacketPlayOutEntityLook.llIIIlIlIlIlI[7]] = llIIlIIlIlllII("eKoV6d7B4lo=", "EttNq");
    }
    
    private static String llIIlIIlIlllII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityLook.llIIIlIlIlIlI[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityLook.llIIIlIlIlIlI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIIlIIlIlllIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityLook.llIIIlIlIlIlI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityLook.llIIIlIlIlIlI[0];
        while (llIIlIIllIIIII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void llIIlIIlIlllll() {
        (llIIIlIlIlIlI = new int[9])[0] = 0;
        SPacketPlayOutEntityLook.llIIIlIlIlIlI[1] = 1;
        SPacketPlayOutEntityLook.llIIIlIlIlIlI[2] = 2;
        SPacketPlayOutEntityLook.llIIIlIlIlIlI[3] = 3;
        SPacketPlayOutEntityLook.llIIIlIlIlIlI[4] = 4;
        SPacketPlayOutEntityLook.llIIIlIlIlIlI[5] = 5;
        SPacketPlayOutEntityLook.llIIIlIlIlIlI[6] = 6;
        SPacketPlayOutEntityLook.llIIIlIlIlIlI[7] = 7;
        SPacketPlayOutEntityLook.llIIIlIlIlIlI[8] = 8;
    }
    
    private static boolean llIIlIIllIIIII(final int n, final int n2) {
        return n < n2;
    }
}
