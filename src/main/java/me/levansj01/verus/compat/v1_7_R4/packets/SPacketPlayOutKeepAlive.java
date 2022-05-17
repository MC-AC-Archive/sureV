package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_7_R4.*;
import me.levansj01.verus.util.java.*;
import java.math.*;
import java.util.*;
import java.nio.charset.*;

public class SPacketPlayOutKeepAlive extends VPacketPlayOutKeepAlive
{
    private static final Field id_field;
    private static final String[] lIIlllIlllIIl;
    private static final int[] lIIlllIlllIll;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutKeepAlive)o);
    }
    
    public void accept(final PacketPlayOutKeepAlive packetPlayOutKeepAlive) {
        this.id = BigInteger.valueOf((long)SafeReflection.fetch(SPacketPlayOutKeepAlive.id_field, packetPlayOutKeepAlive));
    }
    
    static {
        lIlIIIIIlIIllI();
        lIlIIIIIlIIlII();
        id_field = SafeReflection.access(PacketPlayOutKeepAlive.class, SPacketPlayOutKeepAlive.lIIlllIlllIIl[SPacketPlayOutKeepAlive.lIIlllIlllIll[0]]);
    }
    
    private static void lIlIIIIIlIIlII() {
        (lIIlllIlllIIl = new String[SPacketPlayOutKeepAlive.lIIlllIlllIll[1]])[SPacketPlayOutKeepAlive.lIIlllIlllIll[0]] = lIlIIIIIlIIIll("AA==", "aYXoq");
    }
    
    private static String lIlIIIIIlIIIll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutKeepAlive.lIIlllIlllIll[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutKeepAlive.lIIlllIlllIll[0];
        while (lIlIIIIIlIlIII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIlIIIIIlIIllI() {
        (lIIlllIlllIll = new int[2])[0] = 0;
        SPacketPlayOutKeepAlive.lIIlllIlllIll[1] = 1;
    }
    
    private static boolean lIlIIIIIlIlIII(final int n, final int n2) {
        return n < n2;
    }
}
