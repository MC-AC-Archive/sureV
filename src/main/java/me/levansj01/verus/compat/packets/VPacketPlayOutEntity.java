package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;
import me.levansj01.verus.util.*;

public abstract class VPacketPlayOutEntity extends VPacket
{
    protected byte pitch;
    protected byte yaw;
    protected int id;
    protected int y;
    protected int z;
    protected int x;
    protected boolean ground;
    private final double divider;
    protected boolean look;
    
    public byte getPitch() {
        return this.pitch;
    }
    
    public byte getYaw() {
        return this.yaw;
    }
    
    public boolean isGround() {
        return this.ground;
    }
    
    public int getId() {
        return this.id;
    }
    
    public VPacketPlayOutEntity() {
        this.divider = (NMSManager.getInstance().getServerVersion().after(ServerVersion.v1_8_R3) ? 4096.0 : 32.0);
    }
    
    public double getDivider() {
        return this.divider;
    }
    
    public int getX() {
        return this.x;
    }
    
    public PacketLocation move(final PacketLocation packetLocation) {
        return packetLocation.add(this.x / this.divider, this.y / this.divider, this.z / this.divider);
    }
    
    public boolean isLook() {
        return this.look;
    }
    
    public int getY() {
        return this.y;
    }
    
    public int getZ() {
        return this.z;
    }
}
