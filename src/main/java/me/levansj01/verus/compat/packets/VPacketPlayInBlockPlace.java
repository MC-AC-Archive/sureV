package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;
import org.bukkit.inventory.*;

public abstract class VPacketPlayInBlockPlace extends VPacket
{
    protected int face;
    protected BlockPosition position;
    protected float blockY;
    protected float blockX;
    protected long timestamp;
    protected ItemStack itemStack;
    protected float blockZ;
    
    public float getBlockX() {
        return this.blockX;
    }
    
    public ItemStack getItemStack() {
        return this.itemStack;
    }
    
    public int getFace() {
        return this.face;
    }
    
    public float getBlockZ() {
        return this.blockZ;
    }
    
    public boolean isItem() {
        return this.itemStack != null && this.position.getX() == -1 && (this.position.getY() == -1 || this.position.getY() == 255) && this.position.getZ() == -1 && this.blockX == 0.0f && this.blockY == 0.0f && this.blockZ == 0.0f && this.face == 255;
    }
    
    public BlockPosition getPosition() {
        return this.position;
    }
    
    public float getBlockY() {
        return this.blockY;
    }
    
    public long getTimestamp() {
        return this.timestamp;
    }
}
