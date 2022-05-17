package me.levansj01.verus.compat.v1_16_R1;

import me.levansj01.verus.data.*;
import me.levansj01.launcher.*;
import java.util.logging.*;
import io.netty.channel.*;
import net.minecraft.server.v1_16_R1.*;
import me.levansj01.verus.compat.*;
import java.util.*;
import java.nio.charset.*;

public class PacketHandler extends ChannelDuplexHandler
{
    private final PlayerData playerData;
    private final PacketManager packetManager;
    private static final String[] lIlIIllllllII;
    private static final int[] lIlIIllllllIl;
    
    public void channelRead(final ChannelHandlerContext channelHandlerContext, final Object o) throws Exception {
        super.channelRead(channelHandlerContext, o);
        try {
            this.handle(channelHandlerContext, o, (boolean)(PacketHandler.lIlIIllllllIl[0] != 0));
            if (null != null) {
                return;
            }
        }
        catch (Throwable t) {
            VerusLauncher.getPlugin().getLogger().log(Level.SEVERE, PacketHandler.lIlIIllllllII[PacketHandler.lIlIIllllllIl[1]], t);
        }
    }
    
    public void write(final ChannelHandlerContext channelHandlerContext, final Object o, final ChannelPromise channelPromise) throws Exception {
        super.write(channelHandlerContext, o, channelPromise);
        try {
            this.handle(channelHandlerContext, o, (boolean)(PacketHandler.lIlIIllllllIl[1] != 0));
            if (-1 >= 0) {
                return;
            }
        }
        catch (Throwable t) {
            VerusLauncher.getPlugin().getLogger().log(Level.SEVERE, PacketHandler.lIlIIllllllII[PacketHandler.lIlIIllllllIl[0]], t);
        }
    }
    
    public void handle(final ChannelHandlerContext channelHandlerContext, final Object o, final boolean b) {
        final VPacket transform = this.packetManager.transform(b, channelHandlerContext, (Packet)o);
        if (lIlIlIlIllIlII(transform)) {
            this.playerData.postProcess(transform, b);
            transform.done();
        }
    }
    
    public PacketHandler(final PlayerData playerData, final PacketManager packetManager) {
        this.playerData = playerData;
        this.packetManager = packetManager;
    }
    
    static {
        lIlIlIlIllIIll();
        lIlIlIlIllIIlI();
    }
    
    private static void lIlIlIlIllIIlI() {
        (lIlIIllllllII = new String[PacketHandler.lIlIIllllllIl[2]])[PacketHandler.lIlIIllllllIl[1]] = lIlIlIlIllIIIl("LAIrHAYOQzYfQwICLBQPD0MrHgAFDiseBEoTIxMIDxdi", "jcBpc");
        PacketHandler.lIlIIllllllII[PacketHandler.lIlIIllllllIl[0]] = lIlIlIlIllIIIl("JQ87LgMHTiYtRgsPPCYKBk49NxIEATssAUMeMyENBhpy", "cnRBf");
    }
    
    private static String lIlIlIlIllIIIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = PacketHandler.lIlIIllllllIl[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = PacketHandler.lIlIIllllllIl[1];
        while (lIlIlIlIllIlIl(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (1 < -1) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIlIlIlIllIIll() {
        (lIlIIllllllIl = new int[3])[0] = 1;
        PacketHandler.lIlIIllllllIl[1] = 0;
        PacketHandler.lIlIIllllllIl[2] = 2;
    }
    
    private static boolean lIlIlIlIllIlIl(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean lIlIlIlIllIlII(final Object o) {
        return o != null;
    }
}
