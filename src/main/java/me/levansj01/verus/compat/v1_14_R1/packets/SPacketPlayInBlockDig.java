package me.levansj01.verus.compat.v1_14_R1.packets;

import me.levansj01.verus.compat.BlockPosition;
import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_14_R1.*;
import me.levansj01.verus.compat.*;

public class SPacketPlayInBlockDig extends VPacketPlayInBlockDig
{
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInBlockDig)o);
    }
    
    public void accept(final PacketPlayInBlockDig packetPlayInBlockDig) {
        this.blockPosition = new BlockPosition(packetPlayInBlockDig.b().getX(), packetPlayInBlockDig.b().getY(), packetPlayInBlockDig.b().getZ());
        this.face = Direction.values()[packetPlayInBlockDig.c().ordinal()];
        this.type = PlayerDigType.values()[packetPlayInBlockDig.d().ordinal()];
    }
}
