package me.levansj01.verus.compat.v1_7_R4;

import me.levansj01.verus.data.*;
import net.minecraft.util.io.netty.channel.*;
import me.levansj01.launcher.*;
import java.util.logging.*;
import net.minecraft.server.v1_7_R4.*;
import me.levansj01.verus.compat.*;
import java.util.*;
import java.nio.charset.*;

public class PacketHandler extends ChannelDuplexHandler
{
    private final PlayerData playerData;
    private final PacketManager packetManager;
    private static final String[] lIlIIlIIIIIIl;
    private static final int[] lIlIIlIIIIIlI;
    
    public void write(final ChannelHandlerContext channelHandlerContext, final Object o, final ChannelPromise channelPromise) throws Exception {
        super.write(channelHandlerContext, o, channelPromise);
        try {
            this.handle(channelHandlerContext, o, (boolean)(PacketHandler.lIlIIlIIIIIlI[0] != 0));
            if (2 == 0) {
                return;
            }
        }
        catch (Throwable t) {
            VerusLauncher.getPlugin().getLogger().log(Level.SEVERE, PacketHandler.lIlIIlIIIIIIl[PacketHandler.lIlIIlIIIIIlI[0]], t);
        }
    }
    
    public void channelRead(final ChannelHandlerContext channelHandlerContext, final Object o) throws Exception {
        super.channelRead(channelHandlerContext, o);
        try {
            this.handle(channelHandlerContext, o, (boolean)(PacketHandler.lIlIIlIIIIIlI[1] != 0));
            if (-5 >= 0) {
                return;
            }
        }
        catch (Throwable t) {
            VerusLauncher.getPlugin().getLogger().log(Level.SEVERE, PacketHandler.lIlIIlIIIIIIl[PacketHandler.lIlIIlIIIIIlI[1]], t);
        }
    }
    
    public PacketHandler(final PlayerData playerData, final PacketManager packetManager) {
        this.playerData = playerData;
        this.packetManager = packetManager;
    }
    
    public void handle(final ChannelHandlerContext channelHandlerContext, final Object o, final boolean b) {
        final VPacket transform = this.packetManager.transform(b, channelHandlerContext, (Packet)o);
        if (lIlIIlllIIIIll(transform)) {
            this.playerData.postProcess(transform, b);
            transform.done();
        }
    }
    
    static {
        lIlIIlllIIIIlI();
        lIlIIlllIIIIIl();
    }
    
    private static void lIlIIlllIIIIIl() {
        (lIlIIlIIIIIIl = new String[PacketHandler.lIlIIlIIIIIlI[2]])[PacketHandler.lIlIIlIIIIIlI[0]] = lIlIIlllIIIIII("PCcxKRAeZiwqVRInNiEZH2Y3MAEdKTErElo2OSYeHzJ4", "zFXEu");
        PacketHandler.lIlIIlIIIIIIl[PacketHandler.lIlIIlIIIIIlI[1]] = lIlIIlllIIIIII("MSwHDiATbRoNZR8sAAYpEm0HDCYYIAcMIlc9DwEuEjlO", "wMnbE");
    }
    
    private static String lIlIIlllIIIIII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = PacketHandler.lIlIIlIIIIIlI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = PacketHandler.lIlIIlIIIIIlI[0];
        while (lIlIIlllIIIlII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (0 >= 2) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIlIIlllIIIIlI() {
        (lIlIIlIIIIIlI = new int[3])[0] = 0;
        PacketHandler.lIlIIlIIIIIlI[1] = 1;
        PacketHandler.lIlIIlIIIIIlI[2] = 2;
    }
    
    private static boolean lIlIIlllIIIlII(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean lIlIIlllIIIIll(final Object o) {
        return o != null;
    }
}
