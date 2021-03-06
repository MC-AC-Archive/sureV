package me.levansj01.verus.compat.v1_8_R3.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_8_R3.*;
import org.bukkit.craftbukkit.v1_8_R3.inventory.*;

public class SPacketPlayInWindowClick extends VPacketPlayInWindowClick
{
    public void accept(final PacketPlayInWindowClick packetPlayInWindowClick) {
        this.slot = packetPlayInWindowClick.b();
        this.window = packetPlayInWindowClick.a();
        this.button = packetPlayInWindowClick.c();
        this.mode = packetPlayInWindowClick.f();
        this.itemStack = CraftItemStack.asBukkitCopy(packetPlayInWindowClick.e());
    }
    
    @Override
    public boolean isChest() {
        return this.window != 0;
    }
    
    @Override
    public boolean isItem() {
        return this.itemStack != null;
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInWindowClick)o);
    }
    
    @Override
    public boolean isShiftClick() {
        return this.isChest() && this.mode == 1 && this.button < 2;
    }
}
