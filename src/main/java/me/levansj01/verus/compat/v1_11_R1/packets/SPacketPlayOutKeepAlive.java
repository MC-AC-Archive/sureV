package me.levansj01.verus.compat.v1_11_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_11_R1.*;
import me.levansj01.verus.util.java.*;
import java.math.*;
import java.util.*;
import java.nio.charset.*;

public class SPacketPlayOutKeepAlive extends VPacketPlayOutKeepAlive
{
    private static final Field id_field;
    private static final String[] lIIlIlIlIIIlI;
    private static final int[] lIIlIlIlIIIll;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutKeepAlive)o);
    }
    
    static {
        lIIllIIIIIlIll();
        lIIllIIIIIlIlI();
        id_field = SafeReflection.access(PacketPlayOutKeepAlive.class, SPacketPlayOutKeepAlive.lIIlIlIlIIIlI[SPacketPlayOutKeepAlive.lIIlIlIlIIIll[0]]);
    }
    
    public void accept(final PacketPlayOutKeepAlive packetPlayOutKeepAlive) {
        this.id = BigInteger.valueOf((long)SafeReflection.fetch(SPacketPlayOutKeepAlive.id_field, packetPlayOutKeepAlive));
    }
    
    private static void lIIllIIIIIlIlI() {
        (lIIlIlIlIIIlI = new String[SPacketPlayOutKeepAlive.lIIlIlIlIIIll[1]])[SPacketPlayOutKeepAlive.lIIlIlIlIIIll[0]] = lIIllIIIIIlIIl("Jw==", "FfPuP");
    }
    
    private static String lIIllIIIIIlIIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutKeepAlive.lIIlIlIlIIIll[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutKeepAlive.lIIlIlIlIIIll[0];
        while (lIIllIIIIIllII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (4 == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIIllIIIIIlIll() {
        (lIIlIlIlIIIll = new int[2])[0] = 0;
        SPacketPlayOutKeepAlive.lIIlIlIlIIIll[1] = 1;
    }
    
    private static boolean lIIllIIIIIllII(final int n, final int n2) {
        return n < n2;
    }
}
