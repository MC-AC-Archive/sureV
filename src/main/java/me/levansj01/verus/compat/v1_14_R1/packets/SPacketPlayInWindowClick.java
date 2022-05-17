package me.levansj01.verus.compat.v1_14_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_14_R1.*;
import org.bukkit.craftbukkit.v1_14_R1.inventory.*;

public class SPacketPlayInWindowClick extends VPacketPlayInWindowClick
{
    private static final int[] lllIIIIlIIlll;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInWindowClick)o);
    }
    
    @Override
    public boolean isShiftClick() {
        return SPacketPlayInWindowClick.lllIIIIlIIlll[0] != 0;
    }
    
    public void accept(final PacketPlayInWindowClick packetPlayInWindowClick) {
        this.slot = packetPlayInWindowClick.c();
        this.window = packetPlayInWindowClick.b();
        this.button = packetPlayInWindowClick.d();
        this.mode = SPacketPlayInWindowClick.lllIIIIlIIlll[0];
        this.itemStack = CraftItemStack.asBukkitCopy(packetPlayInWindowClick.f());
    }
    
    @Override
    public boolean isItem() {
        int n;
        if (lllIIlIllIIIIl(this.itemStack)) {
            n = SPacketPlayInWindowClick.lllIIIIlIIlll[1];
            if (2 < -1) {
                return false;
            }
        }
        else {
            n = SPacketPlayInWindowClick.lllIIIIlIIlll[0];
        }
        return n != 0;
    }
    
    @Override
    public boolean isChest() {
        int n;
        if (lllIIlIllIIIlI(this.window)) {
            n = SPacketPlayInWindowClick.lllIIIIlIIlll[1];
            if (2 < 0) {
                return false;
            }
        }
        else {
            n = SPacketPlayInWindowClick.lllIIIIlIIlll[0];
        }
        return n != 0;
    }
    
    static {
        lllIIlIllIIIII();
    }
    
    private static void lllIIlIllIIIII() {
        (lllIIIIlIIlll = new int[2])[0] = 0;
        SPacketPlayInWindowClick.lllIIIIlIIlll[1] = 1;
    }
    
    private static boolean lllIIlIllIIIIl(final Object o) {
        return o != null;
    }
    
    private static boolean lllIIlIllIIIlI(final int n) {
        return n != 0;
    }
}
