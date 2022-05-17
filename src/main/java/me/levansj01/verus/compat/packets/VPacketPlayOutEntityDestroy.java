package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;

public abstract class VPacketPlayOutEntityDestroy extends VPacket
{
    protected int[] ids;
    
    public int[] getIds() {
        return this.ids;
    }
}
