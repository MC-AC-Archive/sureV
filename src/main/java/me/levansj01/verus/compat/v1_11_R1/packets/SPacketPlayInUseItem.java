package me.levansj01.verus.compat.v1_11_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_11_R1.*;
import me.levansj01.verus.compat.*;

public class SPacketPlayInUseItem extends VPacketPlayInUseItem
{
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInUseItem)o);
    }
    
    public void accept(final PacketPlayInUseItem packetPlayInUseItem) {
        this.position = new BlockPosition(packetPlayInUseItem.a().getX(), packetPlayInUseItem.a().getY(), packetPlayInUseItem.a().getZ());
        this.face = packetPlayInUseItem.b().ordinal();
        this.blockX = packetPlayInUseItem.d();
        this.blockY = packetPlayInUseItem.e();
        this.blockZ = packetPlayInUseItem.f();
        this.timestamp = packetPlayInUseItem.timestamp;
    }
}
