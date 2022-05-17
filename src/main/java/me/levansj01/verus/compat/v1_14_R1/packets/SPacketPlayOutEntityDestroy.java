package me.levansj01.verus.compat.v1_14_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_14_R1.*;
import me.levansj01.verus.util.java.*;
import java.util.*;
import java.nio.charset.*;

public class SPacketPlayOutEntityDestroy extends VPacketPlayOutEntityDestroy
{
    private static final Field ids_field;
    private static final String[] lIIIIIIIllIII;
    private static final int[] lIIIIIIIllIlI;
    
    static {
        lIIIIlIIIlIIlI();
        lIIIIlIIIIllll();
        ids_field = SafeReflection.access(PacketPlayOutEntityDestroy.class, SPacketPlayOutEntityDestroy.lIIIIIIIllIII[SPacketPlayOutEntityDestroy.lIIIIIIIllIlI[0]]);
    }
    
    public void accept(final PacketPlayOutEntityDestroy packetPlayOutEntityDestroy) {
        this.ids = (int[])SafeReflection.fetch(SPacketPlayOutEntityDestroy.ids_field, packetPlayOutEntityDestroy);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntityDestroy)o);
    }
    
    private static void lIIIIlIIIIllll() {
        (lIIIIIIIllIII = new String[SPacketPlayOutEntityDestroy.lIIIIIIIllIlI[1]])[SPacketPlayOutEntityDestroy.lIIIIIIIllIlI[0]] = lIIIIlIIIIlllI("Dw==", "nLAiM");
    }
    
    private static String lIIIIlIIIIlllI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityDestroy.lIIIIIIIllIlI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityDestroy.lIIIIIIIllIlI[0];
        while (lIIIIlIIIlIIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (-1 >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIIIIlIIIlIIlI() {
        (lIIIIIIIllIlI = new int[2])[0] = 0;
        SPacketPlayOutEntityDestroy.lIIIIIIIllIlI[1] = 1;
    }
    
    private static boolean lIIIIlIIIlIIll(final int n, final int n2) {
        return n < n2;
    }
}
