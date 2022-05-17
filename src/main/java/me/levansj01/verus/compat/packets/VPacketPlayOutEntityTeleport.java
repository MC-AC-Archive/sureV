package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;
import me.levansj01.verus.util.*;

public abstract class VPacketPlayOutEntityTeleport extends VPacket
{
    protected boolean ground;
    protected int id;
    protected byte yaw;
    protected double y;
    protected double z;
    protected double x;
    protected byte pitch;
    
    public double getY() {
        return this.y;
    }
    
    public byte getPitch() {
        return this.pitch;
    }
    
    public PacketLocation toLocation(final long n) {
        return new PacketLocation(n, 4294967295L, this.x, this.y, this.z);
    }
    
    public byte getYaw() {
        return this.yaw;
    }
    
    public double getZ() {
        return this.z;
    }
    
    public boolean isGround() {
        return this.ground;
    }
    
    public double getX() {
        return this.x;
    }
    
    public int getId() {
        return this.id;
    }
}
