package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;

public abstract class VPacketPlayInAbilities extends VPacket
{
    protected PlayerAbilities abilities;
    
    public PlayerAbilities getAbilities() {
        return this.abilities;
    }
}
