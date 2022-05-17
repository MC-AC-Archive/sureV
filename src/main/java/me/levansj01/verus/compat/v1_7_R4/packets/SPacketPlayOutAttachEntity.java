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

public class SPacketPlayOutAttachEntity extends VPacketPlayOutAttachEntity
{
    private static final Field c_field;
    private static final Field b_field;
    private static final Field a_field;
    private static final String[] llIIIIllIlIIl;
    private static final int[] llIIIIllIlIlI;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutAttachEntity)o);
    }
    
    public void accept(final PacketPlayOutAttachEntity packetPlayOutAttachEntity) {
        this.leash = (byte)(int)SafeReflection.fetch(SPacketPlayOutAttachEntity.a_field, packetPlayOutAttachEntity);
        this.entityId = (int)SafeReflection.fetch(SPacketPlayOutAttachEntity.b_field, packetPlayOutAttachEntity);
        this.attachId = (int)SafeReflection.fetch(SPacketPlayOutAttachEntity.c_field, packetPlayOutAttachEntity);
    }
    
    static {
        llIIIlllIlIlll();
        llIIIlllIlIllI();
        a_field = SafeReflection.access(PacketPlayOutAttachEntity.class, SPacketPlayOutAttachEntity.llIIIIllIlIIl[SPacketPlayOutAttachEntity.llIIIIllIlIlI[0]]);
        b_field = SafeReflection.access(PacketPlayOutAttachEntity.class, SPacketPlayOutAttachEntity.llIIIIllIlIIl[SPacketPlayOutAttachEntity.llIIIIllIlIlI[1]]);
        c_field = SafeReflection.access(PacketPlayOutAttachEntity.class, SPacketPlayOutAttachEntity.llIIIIllIlIIl[SPacketPlayOutAttachEntity.llIIIIllIlIlI[2]]);
    }
    
    private static void llIIIlllIlIllI() {
        (llIIIIllIlIIl = new String[SPacketPlayOutAttachEntity.llIIIIllIlIlI[3]])[SPacketPlayOutAttachEntity.llIIIIllIlIlI[0]] = llIIIlllIlIlII("Mg==", "SkROL");
        SPacketPlayOutAttachEntity.llIIIIllIlIIl[SPacketPlayOutAttachEntity.llIIIIllIlIlI[1]] = llIIIlllIlIlII("BA==", "fxFhp");
        SPacketPlayOutAttachEntity.llIIIIllIlIIl[SPacketPlayOutAttachEntity.llIIIIllIlIlI[2]] = llIIIlllIlIlIl("po07TCmzKc4=", "BSojq");
    }
    
    private static String llIIIlllIlIlIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutAttachEntity.llIIIIllIlIlI[4]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutAttachEntity.llIIIIllIlIlI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIlllIlIlII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutAttachEntity.llIIIIllIlIlI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutAttachEntity.llIIIIllIlIlI[0];
        while (llIIIlllIllIII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (0 > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void llIIIlllIlIlll() {
        (llIIIIllIlIlI = new int[5])[0] = 0;
        SPacketPlayOutAttachEntity.llIIIIllIlIlI[1] = 1;
        SPacketPlayOutAttachEntity.llIIIIllIlIlI[2] = 2;
        SPacketPlayOutAttachEntity.llIIIIllIlIlI[3] = 3;
        SPacketPlayOutAttachEntity.llIIIIllIlIlI[4] = 8;
    }
    
    private static boolean llIIIlllIllIII(final int n, final int n2) {
        return n < n2;
    }
}
