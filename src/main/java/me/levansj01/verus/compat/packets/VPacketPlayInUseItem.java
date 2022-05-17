package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;

public abstract class VPacketPlayInUseItem extends VPacket
{
    protected float blockZ;
    protected BlockPosition position;
    protected float blockY;
    protected float blockX;
    protected long timestamp;
    protected int face;
}
