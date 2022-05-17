package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;

public abstract class VPacketPlayInHeldItemSlot extends VPacket
{
    protected int slot;
    
    public int getSlot() {
        return this.slot;
    }
}
