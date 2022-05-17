package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;

public abstract class VPacketPlayOutAttachEntity extends VPacket
{
    protected int entityId;
    protected int attachId;
    protected byte leash;
    
    public int getAttachId() {
        return this.attachId;
    }
    
    public byte getLeash() {
        return this.leash;
    }
    
    public int getEntityId() {
        return this.entityId;
    }
}
