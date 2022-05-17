package me.levansj01.verus.compat;

import me.levansj01.verus.util.*;
import org.bukkit.*;
import org.bukkit.block.*;

public class BlockPosition
{
    private int z;
    private int x;
    private int y;
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BlockPosition)) {
            return false;
        }
        final BlockPosition blockPosition = (BlockPosition)o;
        return blockPosition.canEqual(this) && this.getX() == blockPosition.getX() && this.getY() == blockPosition.getY() && this.getZ() == blockPosition.getZ();
    }
    
    public MutableBlockLocation toMutableBlock() {
        return new MutableBlockLocation(this.x, this.y, this.z);
    }
    
    public boolean nearby(final BlockPosition blockPosition) {
        return this.diff(blockPosition) == 1;
    }
    
    public int getX() {
        return this.x;
    }
    
    public Block getBlock(final World world) {
        return world.getBlockAt(this.x, this.y, this.z);
    }
    
    @Override
    public int hashCode() {
        final int n = 1 * 59 + this.getX();
        final int n2 = 1 * 59 + this.getY();
        final int n3 = 1 * 59 + this.getZ();
        return 1;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setZ(final int z) {
        this.z = z;
    }
    
    public BlockPosition(final int x, final int y, final int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public int diff(final BlockPosition blockPosition) {
        return Math.abs(this.x - blockPosition.x) + Math.abs(this.z - blockPosition.z);
    }
    
    protected boolean canEqual(final Object o) {
        return o instanceof BlockPosition;
    }
    
    public BlockPosition move(final Direction direction, final int n) {
        switch (direction) {
            case UP: {
                this.y += n;
                break;
            }
            case DOWN: {
                this.y -= n;
                break;
            }
            case SOUTH: {
                this.z += n;
                break;
            }
            case NORTH: {
                this.z -= n;
                break;
            }
            case EAST: {
                this.x += n;
                break;
            }
            case WEST: {
                this.x -= n;
                break;
            }
        }
        return this;
    }
    
    public int getZ() {
        return this.z;
    }
    
    public BlockPosition copy() {
        return new BlockPosition(this.x, this.y, this.z);
    }
    
    public void setY(final int y) {
        this.y = y;
    }
    
    public void setX(final int x) {
        this.x = x;
    }
}
