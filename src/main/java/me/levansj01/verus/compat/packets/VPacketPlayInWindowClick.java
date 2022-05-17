package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;
import org.bukkit.inventory.*;

public abstract class VPacketPlayInWindowClick extends VPacket
{
    protected Integer mode;
    protected Integer slot;
    protected Integer window;
    protected Integer button;
    protected ItemStack itemStack;
    
    public ItemStack getItemStack() {
        return this.itemStack;
    }
    
    public Integer getSlot() {
        return this.slot;
    }
    
    public abstract boolean isChest();
    
    public abstract boolean isItem();
    
    public Integer getWindow() {
        return this.window;
    }
    
    public Integer getButton() {
        return this.button;
    }
    
    public Integer getMode() {
        return this.mode;
    }
    
    public abstract boolean isShiftClick();
}
