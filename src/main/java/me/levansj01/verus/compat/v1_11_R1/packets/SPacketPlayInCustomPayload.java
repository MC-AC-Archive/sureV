package me.levansj01.verus.compat.v1_11_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_11_R1.*;
import io.netty.buffer.*;

public class SPacketPlayInCustomPayload extends VPacketPlayInCustomPayload
{
    private PacketDataSerializer dataSerializer;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInCustomPayload)o);
    }
    
    @Override
    protected byte[] fetchData() {
        final ByteBuf copiedBuffer = Unpooled.copiedBuffer((ByteBuf)this.dataSerializer);
        final byte[] array = new byte[copiedBuffer.readableBytes()];
        copiedBuffer.readBytes(array);
        return array;
    }
    
    public void accept(final PacketPlayInCustomPayload packetPlayInCustomPayload) {
        this.channel = packetPlayInCustomPayload.a();
        this.length = this.channel.length();
        this.data = null;
        this.dataSerializer = packetPlayInCustomPayload.b();
    }
}
