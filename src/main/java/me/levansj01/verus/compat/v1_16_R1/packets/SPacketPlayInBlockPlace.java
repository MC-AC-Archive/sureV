package me.levansj01.verus.compat.v1_16_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_16_R1.*;

public class SPacketPlayInBlockPlace extends VPacketPlayInBlockPlace
{
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInBlockPlace)o);
    }
    
    public void accept(final PacketPlayInBlockPlace packetPlayInBlockPlace) {
        this.timestamp = packetPlayInBlockPlace.timestamp;
    }
}
