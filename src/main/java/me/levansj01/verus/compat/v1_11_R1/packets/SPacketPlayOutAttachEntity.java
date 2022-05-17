package me.levansj01.verus.compat.v1_11_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_11_R1.*;
import me.levansj01.verus.util.java.*;
import java.util.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class SPacketPlayOutAttachEntity extends VPacketPlayOutAttachEntity
{
    private static final Field a_field;
    private static final Field b_field;
    private static final String[] llllllIllIII;
    private static final int[] llllllIllIll;
    
    public void accept(final PacketPlayOutAttachEntity packetPlayOutAttachEntity) {
        this.leash = (byte)SPacketPlayOutAttachEntity.llllllIllIll[0];
        this.entityId = (int)SafeReflection.fetch(SPacketPlayOutAttachEntity.a_field, packetPlayOutAttachEntity);
        this.attachId = (int)SafeReflection.fetch(SPacketPlayOutAttachEntity.b_field, packetPlayOutAttachEntity);
    }
    
    static {
        lIIIIIlIIlIIlI();
        lIIIIIlIIIlIlI();
        a_field = SafeReflection.access(PacketPlayOutAttachEntity.class, SPacketPlayOutAttachEntity.llllllIllIII[SPacketPlayOutAttachEntity.llllllIllIll[0]]);
        b_field = SafeReflection.access(PacketPlayOutAttachEntity.class, SPacketPlayOutAttachEntity.llllllIllIII[SPacketPlayOutAttachEntity.llllllIllIll[1]]);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutAttachEntity)o);
    }
    
    private static void lIIIIIlIIIlIlI() {
        (llllllIllIII = new String[SPacketPlayOutAttachEntity.llllllIllIll[2]])[SPacketPlayOutAttachEntity.llllllIllIll[0]] = lIIIIIlIIIIlII("n/0or+AAuZw=", "KLBGY");
        SPacketPlayOutAttachEntity.llllllIllIII[SPacketPlayOutAttachEntity.llllllIllIll[1]] = lIIIIIlIIIlIIl("GA==", "zmOdh");
    }
    
    private static String lIIIIIlIIIlIIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutAttachEntity.llllllIllIll[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutAttachEntity.llllllIllIll[0];
        while (lIIIIIlIIllIII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (2 == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIIIIIlIIIIlII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutAttachEntity.llllllIllIll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIlIIlIIlI() {
        (llllllIllIll = new int[3])[0] = 0;
        SPacketPlayOutAttachEntity.llllllIllIll[1] = 1;
        SPacketPlayOutAttachEntity.llllllIllIll[2] = 2;
    }
    
    private static boolean lIIIIIlIIllIII(final int n, final int n2) {
        return n < n2;
    }
}
