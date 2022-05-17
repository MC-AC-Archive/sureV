package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_12_R1.*;
import me.levansj01.verus.compat.*;

public class SPacketPlayOutSpawnPosition extends VPacketPlayOutSpawnPosition
{
    public void accept(final PacketPlayOutSpawnPosition packetPlayOutSpawnPosition) {
        this.position = new BlockPosition(packetPlayOutSpawnPosition.position.getX(), packetPlayOutSpawnPosition.position.getY(), packetPlayOutSpawnPosition.position.getZ());
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutSpawnPosition)o);
    }
}
