package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_7_R4.*;
import me.levansj01.verus.util.java.*;
import java.util.*;
import java.nio.charset.*;

public class SPacketPlayInCustomPayload extends VPacketPlayInCustomPayload
{
    private static final Field tag_field;
    private static final String[] lllIIIllIlIII;
    private static final int[] lllIIIllIlllI;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInCustomPayload)o);
    }
    
    @Override
    protected byte[] fetchData() {
        return new byte[SPacketPlayInCustomPayload.lllIIIllIlllI[0]];
    }
    
    static {
        lllIIllllIIIIl();
        lllIIlllIllllI();
        tag_field = SafeReflection.access(PacketPlayInCustomPayload.class, SPacketPlayInCustomPayload.lllIIIllIlIII[SPacketPlayInCustomPayload.lllIIIllIlllI[0]]);
    }
    
    public void accept(final PacketPlayInCustomPayload packetPlayInCustomPayload) {
        this.channel = (String)SafeReflection.fetch(SPacketPlayInCustomPayload.tag_field, packetPlayInCustomPayload);
        this.length = this.channel.length();
        this.data = packetPlayInCustomPayload.e();
    }
    
    private static void lllIIlllIllllI() {
        (lllIIIllIlIII = new String[SPacketPlayInCustomPayload.lllIIIllIlllI[1]])[SPacketPlayInCustomPayload.lllIIIllIlllI[0]] = lllIIlllIlllIl("Ii8w", "VNWEJ");
    }
    
    private static String lllIIlllIlllIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayInCustomPayload.lllIIIllIlllI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayInCustomPayload.lllIIIllIlllI[0];
        while (lllIIllllIIIlI(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (!true) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lllIIllllIIIIl() {
        (lllIIIllIlllI = new int[2])[0] = 0;
        SPacketPlayInCustomPayload.lllIIIllIlllI[1] = 1;
    }
    
    private static boolean lllIIllllIIIlI(final int n, final int n2) {
        return n < n2;
    }
}
