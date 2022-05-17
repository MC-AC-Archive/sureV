package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;

public abstract class VPacketPlayOutEntityVelocity extends VPacket
{
    protected int motX;
    protected int motY;
    protected int motZ;
    protected int id;
    
    public int getMotX() {
        return this.motX;
    }
    
    public int getMotY() {
        return this.motY;
    }
    
    public int getId() {
        return this.id;
    }
    
    public int getMotZ() {
        return this.motZ;
    }
}
