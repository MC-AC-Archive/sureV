package me.levansj01.verus.compat.v1_11_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_11_R1.*;
import me.levansj01.verus.util.java.*;
import me.levansj01.verus.compat.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayInAbilities extends VPacketPlayInAbilities
{
    private static final Field f_field;
    private static final Field e_field;
    private static final String[] lIllllIIIlIll;
    private static final int[] lIllllIIIllII;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInAbilities)o);
    }
    
    static {
        llIIIIIIllIlll();
        llIIIIIIllIllI();
        e_field = SafeReflection.access(PacketPlayInAbilities.class, SPacketPlayInAbilities.lIllllIIIlIll[SPacketPlayInAbilities.lIllllIIIllII[0]]);
        f_field = SafeReflection.access(PacketPlayInAbilities.class, SPacketPlayInAbilities.lIllllIIIlIll[SPacketPlayInAbilities.lIllllIIIllII[1]]);
    }
    
    public void accept(final PacketPlayInAbilities packetPlayInAbilities) {
        this.abilities = new PlayerAbilities(packetPlayInAbilities.a(), packetPlayInAbilities.isFlying(), packetPlayInAbilities.c(), packetPlayInAbilities.d(), (float)SafeReflection.fetch(SPacketPlayInAbilities.e_field, packetPlayInAbilities), (float)SafeReflection.fetch(SPacketPlayInAbilities.f_field, packetPlayInAbilities));
    }
    
    private static void llIIIIIIllIllI() {
        (lIllllIIIlIll = new String[SPacketPlayInAbilities.lIllllIIIllII[2]])[SPacketPlayInAbilities.lIllllIIIllII[0]] = llIIIIIIllIlII("YT9CrrQ5wdY=", "YrAmS");
        SPacketPlayInAbilities.lIllllIIIlIll[SPacketPlayInAbilities.lIllllIIIllII[1]] = llIIIIIIllIlIl("JQ==", "CqiJZ");
    }
    
    private static String llIIIIIIllIlII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayInAbilities.lIllllIIIllII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIIIIllIlIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayInAbilities.lIllllIIIllII[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayInAbilities.lIllllIIIllII[0];
        while (llIIIIIIlllIII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (-1 == 2) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void llIIIIIIllIlll() {
        (lIllllIIIllII = new int[3])[0] = 0;
        SPacketPlayInAbilities.lIllllIIIllII[1] = 1;
        SPacketPlayInAbilities.lIllllIIIllII[2] = 2;
    }
    
    private static boolean llIIIIIIlllIII(final int n, final int n2) {
        return n < n2;
    }
}
