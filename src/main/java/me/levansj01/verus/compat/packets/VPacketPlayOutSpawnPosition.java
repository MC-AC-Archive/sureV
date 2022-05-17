package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;

public abstract class VPacketPlayOutSpawnPosition extends VPacket
{
    protected BlockPosition position;
    
    public BlockPosition getPosition() {
        return this.position;
    }
}
