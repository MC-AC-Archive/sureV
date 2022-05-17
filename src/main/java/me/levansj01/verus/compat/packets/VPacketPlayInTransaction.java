package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;

public abstract class VPacketPlayInTransaction extends VPacket
{
    protected short specialId;
    
    public short getSpecialId() {
        return this.specialId;
    }
}
