package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_12_R1.*;
import me.levansj01.verus.util.java.*;
import java.util.*;
import java.nio.charset.*;

public class SPacketPlayOutEntityDestroy extends VPacketPlayOutEntityDestroy
{
    private static final Field ids_field;
    private static final String[] lIlIlIlIIIlIl;
    private static final int[] lIlIlIlIIlIII;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntityDestroy)o);
    }
    
    public void accept(final PacketPlayOutEntityDestroy packetPlayOutEntityDestroy) {
        this.ids = (int[])SafeReflection.fetch(SPacketPlayOutEntityDestroy.ids_field, packetPlayOutEntityDestroy);
    }
    
    static {
        lIlIllIllIIlll();
        lIlIllIllIIIll();
        ids_field = SafeReflection.access(PacketPlayOutEntityDestroy.class, SPacketPlayOutEntityDestroy.lIlIlIlIIIlIl[SPacketPlayOutEntityDestroy.lIlIlIlIIlIII[0]]);
    }
    
    private static void lIlIllIllIIIll() {
        (lIlIlIlIIIlIl = new String[SPacketPlayOutEntityDestroy.lIlIlIlIIlIII[1]])[SPacketPlayOutEntityDestroy.lIlIlIlIIlIII[0]] = lIlIllIllIIIlI("NA==", "UCYxe");
    }
    
    private static String lIlIllIllIIIlI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutEntityDestroy.lIlIlIlIIlIII[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutEntityDestroy.lIlIlIlIIlIII[0];
        while (lIlIllIllIlIII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (4 != 4) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIlIllIllIIlll() {
        (lIlIlIlIIlIII = new int[2])[0] = 0;
        SPacketPlayOutEntityDestroy.lIlIlIlIIlIII[1] = 1;
    }
    
    private static boolean lIlIllIllIlIII(final int n, final int n2) {
        return n < n2;
    }
}
