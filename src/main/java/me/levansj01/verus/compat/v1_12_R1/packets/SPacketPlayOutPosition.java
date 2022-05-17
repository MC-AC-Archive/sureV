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

public class SPacketPlayOutPosition extends VPacketPlayOutPosition
{
    private static final Field y_field;
    private static final Field flags_field;
    private static final Field x_field;
    private static final Field pitch_field;
    private static final Field z_field;
    private static final Field yaw_field;
    private static final String[] llIIIlIIlllIl;
    private static final int[] llIIIlIIllllI;
    
    static {
        llIIlIIlIlIllI();
        llIIlIIlIlIlIl();
        final Class<PacketPlayOutPosition> clazz = PacketPlayOutPosition.class;
        final String[] array = new String[SPacketPlayOutPosition.llIIIlIIllllI[0]];
        array[SPacketPlayOutPosition.llIIIlIIllllI[1]] = SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[1]];
        array[SPacketPlayOutPosition.llIIIlIIllllI[2]] = SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[2]];
        x_field = SafeReflection.access(clazz, array);
        final Class<PacketPlayOutPosition> clazz2 = PacketPlayOutPosition.class;
        final String[] array2 = new String[SPacketPlayOutPosition.llIIIlIIllllI[0]];
        array2[SPacketPlayOutPosition.llIIIlIIllllI[1]] = SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[0]];
        array2[SPacketPlayOutPosition.llIIIlIIllllI[2]] = SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[3]];
        y_field = SafeReflection.access(clazz2, array2);
        final Class<PacketPlayOutPosition> clazz3 = PacketPlayOutPosition.class;
        final String[] array3 = new String[SPacketPlayOutPosition.llIIIlIIllllI[0]];
        array3[SPacketPlayOutPosition.llIIIlIIllllI[1]] = SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[4]];
        array3[SPacketPlayOutPosition.llIIIlIIllllI[2]] = SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[5]];
        z_field = SafeReflection.access(clazz3, array3);
        final Class<PacketPlayOutPosition> clazz4 = PacketPlayOutPosition.class;
        final String[] array4 = new String[SPacketPlayOutPosition.llIIIlIIllllI[0]];
        array4[SPacketPlayOutPosition.llIIIlIIllllI[1]] = SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[6]];
        array4[SPacketPlayOutPosition.llIIIlIIllllI[2]] = SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[7]];
        yaw_field = SafeReflection.access(clazz4, array4);
        final Class<PacketPlayOutPosition> clazz5 = PacketPlayOutPosition.class;
        final String[] array5 = new String[SPacketPlayOutPosition.llIIIlIIllllI[0]];
        array5[SPacketPlayOutPosition.llIIIlIIllllI[1]] = SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[8]];
        array5[SPacketPlayOutPosition.llIIIlIIllllI[2]] = SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[9]];
        pitch_field = SafeReflection.access(clazz5, array5);
        final Class<PacketPlayOutPosition> clazz6 = PacketPlayOutPosition.class;
        final String[] array6 = new String[SPacketPlayOutPosition.llIIIlIIllllI[0]];
        array6[SPacketPlayOutPosition.llIIIlIIllllI[1]] = SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[10]];
        array6[SPacketPlayOutPosition.llIIIlIIllllI[2]] = SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[11]];
        flags_field = SafeReflection.access(clazz6, array6);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutPosition)o);
    }
    
    public void accept(final PacketPlayOutPosition packetPlayOutPosition) {
        this.x = (double)SafeReflection.fetch(SPacketPlayOutPosition.x_field, packetPlayOutPosition);
        this.y = (double)SafeReflection.fetch(SPacketPlayOutPosition.y_field, packetPlayOutPosition);
        this.z = (double)SafeReflection.fetch(SPacketPlayOutPosition.z_field, packetPlayOutPosition);
        this.yaw = (float)SafeReflection.fetch(SPacketPlayOutPosition.yaw_field, packetPlayOutPosition);
        this.pitch = (float)SafeReflection.fetch(SPacketPlayOutPosition.pitch_field, packetPlayOutPosition);
        this.flags = (Set<TeleportFlag>)SafeReflection.fetch(SPacketPlayOutPosition.flags_field, packetPlayOutPosition);
    }
    
    private static void llIIlIIlIlIlIl() {
        (llIIIlIIlllIl = new String[SPacketPlayOutPosition.llIIIlIIllllI[12]])[SPacketPlayOutPosition.llIIIlIIllllI[1]] = llIIlIIlIlIIlI("qSeXT8pvTUo=", "QRksC");
        SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[2]] = llIIlIIlIlIIll("AA==", "xmRgs");
        SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[0]] = llIIlIIlIlIlII("apC8wGaXkeo=", "FsfcI");
        SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[3]] = llIIlIIlIlIIll("DA==", "uiFRQ");
        SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[4]] = llIIlIIlIlIIll("Gg==", "yaCII");
        SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[5]] = llIIlIIlIlIlII("j4+D12mgTK4=", "vIzaC");
        SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[6]] = llIIlIIlIlIIll("AA==", "dStGl");
        SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[7]] = llIIlIIlIlIIlI("X+MQuuEaZfk=", "eDwjo");
        SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[8]] = llIIlIIlIlIIlI("UJHd25Zu0l0=", "FbVFj");
        SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[9]] = llIIlIIlIlIIlI("hV11K3XoZ00=", "UpCKo");
        SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[10]] = llIIlIIlIlIIlI("GJwQPjrs7iY=", "jIfVy");
        SPacketPlayOutPosition.llIIIlIIlllIl[SPacketPlayOutPosition.llIIIlIIllllI[11]] = llIIlIIlIlIIlI("NE7ZDU7gMXw=", "POACM");
    }
    
    private static String llIIlIIlIlIIlI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutPosition.llIIIlIIllllI[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutPosition.llIIIlIIllllI[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIIlIIlIlIlII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutPosition.llIIIlIIllllI[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIIlIIlIlIIll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutPosition.llIIIlIIllllI[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutPosition.llIIIlIIllllI[1];
        while (llIIlIIlIlIlll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (3 > 3) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void llIIlIIlIlIllI() {
        (llIIIlIIllllI = new int[13])[0] = 2;
        SPacketPlayOutPosition.llIIIlIIllllI[1] = 0;
        SPacketPlayOutPosition.llIIIlIIllllI[2] = 1;
        SPacketPlayOutPosition.llIIIlIIllllI[3] = 3;
        SPacketPlayOutPosition.llIIIlIIllllI[4] = 4;
        SPacketPlayOutPosition.llIIIlIIllllI[5] = 5;
        SPacketPlayOutPosition.llIIIlIIllllI[6] = 6;
        SPacketPlayOutPosition.llIIIlIIllllI[7] = 7;
        SPacketPlayOutPosition.llIIIlIIllllI[8] = 8;
        SPacketPlayOutPosition.llIIIlIIllllI[9] = 9;
        SPacketPlayOutPosition.llIIIlIIllllI[10] = 10;
        SPacketPlayOutPosition.llIIIlIIllllI[11] = 11;
        SPacketPlayOutPosition.llIIIlIIllllI[12] = 12;
    }
    
    private static boolean llIIlIIlIlIlll(final int n, final int n2) {
        return n < n2;
    }
}
