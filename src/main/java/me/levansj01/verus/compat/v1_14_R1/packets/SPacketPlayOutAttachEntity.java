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

public class SPacketPlayOutAttachEntity extends VPacketPlayOutAttachEntity
{
    private static final Field a_field;
    private static final Field b_field;
    private static final String[] lIllIIlllIIII;
    private static final int[] lIllIIlllIlIl;
    
    public void accept(final PacketPlayOutAttachEntity packetPlayOutAttachEntity) {
        this.leash = (byte)SPacketPlayOutAttachEntity.lIllIIlllIlIl[0];
        this.entityId = (int)SafeReflection.fetch(SPacketPlayOutAttachEntity.a_field, packetPlayOutAttachEntity);
        this.attachId = (int)SafeReflection.fetch(SPacketPlayOutAttachEntity.b_field, packetPlayOutAttachEntity);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutAttachEntity)o);
    }
    
    static {
        lIllIllIlllIIl();
        lIllIllIllIIIl();
        a_field = SafeReflection.access(PacketPlayOutAttachEntity.class, SPacketPlayOutAttachEntity.lIllIIlllIIII[SPacketPlayOutAttachEntity.lIllIIlllIlIl[0]]);
        b_field = SafeReflection.access(PacketPlayOutAttachEntity.class, SPacketPlayOutAttachEntity.lIllIIlllIIII[SPacketPlayOutAttachEntity.lIllIIlllIlIl[1]]);
    }
    
    private static void lIllIllIllIIIl() {
        (lIllIIlllIIII = new String[SPacketPlayOutAttachEntity.lIllIIlllIlIl[2]])[SPacketPlayOutAttachEntity.lIllIIlllIlIl[0]] = lIllIllIlIllll("Jw==", "FUhcg");
        SPacketPlayOutAttachEntity.lIllIIlllIIII[SPacketPlayOutAttachEntity.lIllIIlllIlIl[1]] = lIllIllIllIIII("waQ8fAd/a/w=", "krgnT");
    }
    
    private static String lIllIllIllIIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutAttachEntity.lIllIIlllIlIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIllIllIlIllll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutAttachEntity.lIllIIlllIlIl[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutAttachEntity.lIllIIlllIlIl[0];
        while (lIllIllIlllIlI(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (3 >= 4) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIllIllIlllIIl() {
        (lIllIIlllIlIl = new int[3])[0] = 0;
        SPacketPlayOutAttachEntity.lIllIIlllIlIl[1] = 1;
        SPacketPlayOutAttachEntity.lIllIIlllIlIl[2] = 2;
    }
    
    private static boolean lIllIllIlllIlI(final int n, final int n2) {
        return n < n2;
    }
}
