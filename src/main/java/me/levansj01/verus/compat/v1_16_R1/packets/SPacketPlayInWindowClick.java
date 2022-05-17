package me.levansj01.verus.compat.v1_16_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_16_R1.*;
import org.bukkit.craftbukkit.v1_16_R1.inventory.*;

public class SPacketPlayInWindowClick extends VPacketPlayInWindowClick
{
    private static final int[] lIlIIIIlIIlII;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInWindowClick)o);
    }
    
    public void accept(final PacketPlayInWindowClick packetPlayInWindowClick) {
        this.slot = packetPlayInWindowClick.c();
        this.window = packetPlayInWindowClick.b();
        this.button = packetPlayInWindowClick.d();
        this.mode = SPacketPlayInWindowClick.lIlIIIIlIIlII[0];
        this.itemStack = CraftItemStack.asBukkitCopy(packetPlayInWindowClick.f());
    }
    
    @Override
    public boolean isItem() {
        int n;
        if (lIlIIlIIIlIIII(this.itemStack)) {
            n = SPacketPlayInWindowClick.lIlIIIIlIIlII[1];
            if (!true) {
                return false;
            }
        }
        else {
            n = SPacketPlayInWindowClick.lIlIIIIlIIlII[0];
        }
        return n != 0;
    }
    
    @Override
    public boolean isShiftClick() {
        return SPacketPlayInWindowClick.lIlIIIIlIIlII[0] != 0;
    }
    
    @Override
    public boolean isChest() {
        int n;
        if (lIlIIlIIIlIIIl(this.window)) {
            n = SPacketPlayInWindowClick.lIlIIIIlIIlII[1];
            if (true != true) {
                return false;
            }
        }
        else {
            n = SPacketPlayInWindowClick.lIlIIIIlIIlII[0];
        }
        return n != 0;
    }
    
    static {
        lIlIIlIIIIllll();
    }
    
    private static void lIlIIlIIIIllll() {
        (lIlIIIIlIIlII = new int[2])[0] = 0;
        SPacketPlayInWindowClick.lIlIIIIlIIlII[1] = 1;
    }
    
    private static boolean lIlIIlIIIlIIII(final Object o) {
        return o != null;
    }
    
    private static boolean lIlIIlIIIlIIIl(final int n) {
        return n != 0;
    }
}
