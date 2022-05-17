package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;
import me.levansj01.verus.util.*;

public abstract class VPacketPlayOutNamedEntitySpawn extends VPacket
{
    protected double x;
    protected double y;
    protected double z;
    protected byte yaw;
    protected byte pitch;
    protected int id;
    
    public void setZ(final double z) {
        this.z = z;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public double getY() {
        return this.y;
    }
    
    public byte getYaw() {
        return this.yaw;
    }
    
    public void setX(final double x) {
        this.x = x;
    }
    
    public void setPitch(final byte pitch) {
        this.pitch = pitch;
    }
    
    public PacketLocation toLocation() {
        return new PacketLocation(System.currentTimeMillis(), 4294967295L, this.x, this.y, this.z);
    }
    
    public double getZ() {
        return this.z;
    }
    
    public double getX() {
        return this.x;
    }
    
    public void setY(final double y) {
        this.y = y;
    }
    
    public byte getPitch() {
        return this.pitch;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setYaw(final byte yaw) {
        this.yaw = yaw;
    }
}
