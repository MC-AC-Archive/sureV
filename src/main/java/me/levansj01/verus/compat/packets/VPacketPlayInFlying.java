package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;
import me.levansj01.verus.verus2.data.player.*;

public abstract class VPacketPlayInFlying extends VPacket
{
    protected float yaw;
    protected double z;
    protected boolean ground;
    protected double y;
    protected boolean pos;
    protected double x;
    protected boolean look;
    protected float pitch;
    
    public double getZ() {
        return this.z;
    }
    
    public double getX() {
        return this.x;
    }
    
    public float getYaw() {
        return this.yaw;
    }
    
    public boolean isLook() {
        return this.look;
    }
    
    public float getPitch() {
        return this.pitch;
    }
    
    public boolean isGround() {
        return this.ground;
    }
    
    public double getY() {
        return this.y;
    }
    
    public PacketLocation from(final PacketLocation packetLocation) {
        double n;
        double n2;
        double n3;
        if (this.pos) {
            n = this.x;
            n2 = this.y;
            n3 = this.z;
        }
        else {
            n = packetLocation.getX();
            n2 = packetLocation.getY();
            n3 = packetLocation.getZ();
        }
        float n4;
        float n5;
        if (this.look) {
            n4 = this.yaw;
            n5 = this.pitch;
        }
        else {
            n4 = packetLocation.getYaw();
            n5 = packetLocation.getPitch();
        }
        return new PacketLocation(n, n2, n3, n4, n5, this.ground, this.pos, this.look);
    }
    
    public boolean isPos() {
        return this.pos;
    }
}
