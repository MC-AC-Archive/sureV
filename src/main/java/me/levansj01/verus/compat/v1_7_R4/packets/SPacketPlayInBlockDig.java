package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_7_R4.*;
import me.levansj01.verus.compat.*;

public class SPacketPlayInBlockDig extends VPacketPlayInBlockDig
{
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInBlockDig)o);
    }
    
    public void accept(final PacketPlayInBlockDig packetPlayInBlockDig) {
        this.blockPosition = new BlockPosition(packetPlayInBlockDig.c(), packetPlayInBlockDig.d(), packetPlayInBlockDig.e());
        this.face = Direction.values()[packetPlayInBlockDig.f() % Direction.values().length];
        this.type = PlayerDigType.values()[packetPlayInBlockDig.g()];
    }
}
