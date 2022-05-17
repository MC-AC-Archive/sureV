package me.levansj01.verus.compat.v1_8_R3;

import me.levansj01.verus.data.*;
import me.levansj01.launcher.*;
import java.util.logging.*;
import net.minecraft.server.v1_8_R3.*;
import me.levansj01.verus.compat.*;
import io.netty.channel.*;

public class PacketHandler extends ChannelDuplexHandler
{
    private final PlayerData playerData;
    private final PacketManager packetManager;
    
    public void channelRead(final ChannelHandlerContext channelHandlerContext, final Object o) throws Exception {
        super.channelRead(channelHandlerContext, o);
        try {
            this.handle(channelHandlerContext, o, true);
        }
        catch (Throwable t) {
            VerusLauncher.getPlugin().getLogger().log(Level.SEVERE, "Failed to handle incoming packet ", t);
        }
    }
    
    public void handle(final ChannelHandlerContext channelHandlerContext, final Object o, final boolean b) {
        final VPacket transform = this.packetManager.transform(b, channelHandlerContext, (Packet)o);
        if (transform != null) {
            this.playerData.postProcess(transform, b);
            transform.done();
        }
    }
    
    public PacketHandler(final PlayerData playerData, final PacketManager packetManager) {
        this.playerData = playerData;
        this.packetManager = packetManager;
    }
    
    public void write(final ChannelHandlerContext channelHandlerContext, final Object o, final ChannelPromise channelPromise) throws Exception {
        super.write(channelHandlerContext, o, channelPromise);
        try {
            this.handle(channelHandlerContext, o, false);
        }
        catch (Throwable t) {
            VerusLauncher.getPlugin().getLogger().log(Level.SEVERE, "Failed to handle outgoing packet ", t);
        }
    }
}
