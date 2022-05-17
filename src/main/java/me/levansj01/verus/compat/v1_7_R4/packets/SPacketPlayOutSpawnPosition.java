package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_7_R4.*;
import me.levansj01.verus.compat.*;

public class SPacketPlayOutSpawnPosition extends VPacketPlayOutSpawnPosition
{
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutSpawnPosition)o);
    }
    
    public void accept(final PacketPlayOutSpawnPosition packetPlayOutSpawnPosition) {
        this.position = new BlockPosition(packetPlayOutSpawnPosition.x, packetPlayOutSpawnPosition.y, packetPlayOutSpawnPosition.z);
    }
}
