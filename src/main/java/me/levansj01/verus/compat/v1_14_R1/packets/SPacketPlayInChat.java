package me.levansj01.verus.compat.v1_14_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_14_R1.*;
import java.util.*;
import java.nio.charset.*;

public class SPacketPlayInChat extends VPacketPlayInChat
{
    private static String[] llIlIlIlIlIll;
    private static int[] llIlIlIlIllII;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInChat)o);
    }
    
    public void accept(final PacketPlayInChat packetPlayInChat) {
        this.message = packetPlayInChat.b();
        this.command = this.message.startsWith(SPacketPlayInChat.llIlIlIlIlIll[SPacketPlayInChat.llIlIlIlIllII[0]]);
    }
    
    static {
        llIllIlIlIIIlI();
        llIllIlIlIIIIl();
    }
    
    private static void llIllIlIlIIIIl() {
        (llIlIlIlIlIll = new String[SPacketPlayInChat.llIlIlIlIllII[1]])[SPacketPlayInChat.llIlIlIlIllII[0]] = llIllIlIlIIIII("TA==", "mwKir");
    }
    
    private static String llIllIlIlIIIII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayInChat.llIlIlIlIllII[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayInChat.llIlIlIlIllII[0];
        while (llIllIlIlIIIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (1 <= -1) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void llIllIlIlIIIlI() {
        (llIlIlIlIllII = new int[2])[0] = 0;
        SPacketPlayInChat.llIlIlIlIllII[1] = 1;
    }
    
    private static boolean llIllIlIlIIIll(final int n, final int n2) {
        return n < n2;
    }
}
