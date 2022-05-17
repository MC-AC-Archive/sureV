package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_7_R4.*;
import me.levansj01.verus.util.java.*;
import java.util.*;
import java.nio.charset.*;

public class SPacketPlayOutEntityDestroy extends VPacketPlayOutEntityDestroy
{
    private static final Field ids_field;
    private static final String[] lllIIIIIlIIlI;
    private static final int[] lllIIIIIlIlII;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntityDestroy)o);
    }
    
    static {
        lllIIlIIllIIlI();
        lllIIlIIllIIII();
        ids_field = SafeReflection.access(PacketPlayOutEntityDestroy.class, SPacketPlayOutEntityDestroy.lllIIIIIlIIlI[SPacketPlayOutEntityDestroy.lllIIIIIlIlII[0]]);
    }
    
    public void accept(final PacketPlayOutEntityDestroy packetPlayOutEntityDestroy) {
        this.ids = (int[])SafeReflection.fetch(SPacketPlayOutEntityDestroy.ids_field, packetPlayOutEntityDestroy);
    }
    
    private static void lllIIlIIllIIII() {
        (lllIIIIIlIIlI = new String[SPacketPlayOutEntityDestroy.lllIIIIIlIlII[1]])[SPacketPlayOutEntityDestroy.lllIIIIIlIlII[0]] = lllIIlIIlIllll("KQ==", "HVomT");
    }
    
    private static String lllIIlIIlIllll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityDestroy.lllIIIIIlIlII[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityDestroy.lllIIIIIlIlII[0];
        while (lllIIlIIllIIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (-1 >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lllIIlIIllIIlI() {
        (lllIIIIIlIlII = new int[2])[0] = 0;
        SPacketPlayOutEntityDestroy.lllIIIIIlIlII[1] = 1;
    }
    
    private static boolean lllIIlIIllIIll(final int n, final int n2) {
        return n < n2;
    }
}
