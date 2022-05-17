package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;

public abstract class VPacketPlayInVehicleMove extends VPacket
{
    protected double z;
    protected float pitch;
    protected float yaw;
    protected double x;
    protected double y;
    
    public double getX() {
        return this.x;
    }
    
    public double getZ() {
        return this.z;
    }
    
    public double getY() {
        return this.y;
    }
    
    public float getYaw() {
        return this.yaw;
    }
    
    public float getPitch() {
        return this.pitch;
    }
}
