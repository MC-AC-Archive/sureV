package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;
import java.math.*;

public abstract class VPacketPlayOutKeepAlive extends VPacket
{
    protected BigInteger id;
    
    public long getId() {
        return this.id.longValueExact();
    }
}
