package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_12_R1.*;
import me.levansj01.verus.util.java.*;
import me.levansj01.verus.compat.*;
import java.util.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class SPacketPlayInAbilities extends VPacketPlayInAbilities
{
    private static final Field f_field;
    private static final Field e_field;
    private static final String[] lIllIIIIIIIII;
    private static final int[] lIllIIIIlIlIl;
    
    public void accept(final PacketPlayInAbilities packetPlayInAbilities) {
        this.abilities = new PlayerAbilities(packetPlayInAbilities.a(), packetPlayInAbilities.isFlying(), packetPlayInAbilities.c(), packetPlayInAbilities.d(), (float)SafeReflection.fetch(SPacketPlayInAbilities.e_field, packetPlayInAbilities), (float)SafeReflection.fetch(SPacketPlayInAbilities.f_field, packetPlayInAbilities));
    }
    
    static {
        lIllIlIIIIlIII();
        lIllIIlllIllII();
        e_field = SafeReflection.access(PacketPlayInAbilities.class, SPacketPlayInAbilities.lIllIIIIIIIII[SPacketPlayInAbilities.lIllIIIIlIlIl[0]]);
        f_field = SafeReflection.access(PacketPlayInAbilities.class, SPacketPlayInAbilities.lIllIIIIIIIII[SPacketPlayInAbilities.lIllIIIIlIlIl[1]]);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInAbilities)o);
    }
    
    private static void lIllIIlllIllII() {
        (lIllIIIIIIIII = new String[SPacketPlayInAbilities.lIllIIIIlIlIl[2]])[SPacketPlayInAbilities.lIllIIIIlIlIl[0]] = lIllIIlllIlIlI("Cg==", "ozLyT");
        SPacketPlayInAbilities.lIllIIIIIIIII[SPacketPlayInAbilities.lIllIIIIlIlIl[1]] = lIllIIlllIlIll("7Hsqnt7n3zs=", "uICCc");
    }
    
    private static String lIllIIlllIlIlI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayInAbilities.lIllIIIIlIlIl[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayInAbilities.lIllIIIIlIlIl[0];
        while (lIllIlIIIIlIIl(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (-3 > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIllIIlllIlIll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayInAbilities.lIllIIIIlIlIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIllIlIIIIlIII() {
        (lIllIIIIlIlIl = new int[3])[0] = 0;
        SPacketPlayInAbilities.lIllIIIIlIlIl[1] = 1;
        SPacketPlayInAbilities.lIllIIIIlIlIl[2] = 2;
    }
    
    private static boolean lIllIlIIIIlIIl(final int n, final int n2) {
        return n < n2;
    }
}
