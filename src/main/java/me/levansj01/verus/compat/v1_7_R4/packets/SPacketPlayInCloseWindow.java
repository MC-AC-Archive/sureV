package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_7_R4.*;
import me.levansj01.verus.util.java.*;
import java.util.*;
import java.nio.charset.*;

public class SPacketPlayInCloseWindow extends VPacketPlayInCloseWindow
{
    private static final Field window_field;
    private static final String[] lIlIllIlIlllI;
    private static final int[] lIlIllIlIllll;
    
    public void accept(final PacketPlayInCloseWindow packetPlayInCloseWindow) {
        this.window = (int)SafeReflection.fetch(SPacketPlayInCloseWindow.window_field, packetPlayInCloseWindow);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInCloseWindow)o);
    }
    
    static {
        lIllIIIIllIlll();
        lIllIIIIllIlIl();
        window_field = SafeReflection.access(PacketPlayInCloseWindow.class, SPacketPlayInCloseWindow.lIlIllIlIlllI[SPacketPlayInCloseWindow.lIlIllIlIllll[0]]);
    }
    
    private static void lIllIIIIllIlIl() {
        (lIlIllIlIlllI = new String[SPacketPlayInCloseWindow.lIlIllIlIllll[1]])[SPacketPlayInCloseWindow.lIlIllIlIllll[0]] = lIllIIIIllIlII("Ag==", "cGpsc");
    }
    
    private static String lIllIIIIllIlII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayInCloseWindow.lIlIllIlIllll[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayInCloseWindow.lIlIllIlIllll[0];
        while (lIllIIIIlllIII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIllIIIIllIlll() {
        (lIlIllIlIllll = new int[2])[0] = 0;
        SPacketPlayInCloseWindow.lIlIllIlIllll[1] = 1;
    }
    
    private static boolean lIllIIIIlllIII(final int n, final int n2) {
        return n < n2;
    }
}
