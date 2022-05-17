package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_12_R1.*;
import org.bukkit.craftbukkit.v1_12_R1.inventory.*;

public class SPacketPlayInWindowClick extends VPacketPlayInWindowClick
{
    private static final int[] lllIlIIIllIl;
    
    @Override
    public boolean isChest() {
        int n;
        if (lllIllIllIllI(this.window)) {
            n = SPacketPlayInWindowClick.lllIlIIIllIl[0];
            if (5 <= 0) {
                return false;
            }
        }
        else {
            n = SPacketPlayInWindowClick.lllIlIIIllIl[1];
        }
        return n != 0;
    }
    
    @Override
    public boolean isShiftClick() {
        return SPacketPlayInWindowClick.lllIlIIIllIl[1] != 0;
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInWindowClick)o);
    }
    
    @Override
    public boolean isItem() {
        int n;
        if (lllIllIllIlll(this.itemStack)) {
            n = SPacketPlayInWindowClick.lllIlIIIllIl[0];
            if (!true) {
                return false;
            }
        }
        else {
            n = SPacketPlayInWindowClick.lllIlIIIllIl[1];
        }
        return n != 0;
    }
    
    public void accept(final PacketPlayInWindowClick packetPlayInWindowClick) {
        this.slot = packetPlayInWindowClick.b();
        this.window = packetPlayInWindowClick.a();
        this.button = packetPlayInWindowClick.c();
        this.mode = SPacketPlayInWindowClick.lllIlIIIllIl[1];
        this.itemStack = CraftItemStack.asBukkitCopy(packetPlayInWindowClick.e());
    }
    
    static {
        lllIllIllIlIl();
    }
    
    private static void lllIllIllIlIl() {
        (lllIlIIIllIl = new int[2])[0] = 1;
        SPacketPlayInWindowClick.lllIlIIIllIl[1] = 0;
    }
    
    private static boolean lllIllIllIlll(final Object o) {
        return o != null;
    }
    
    private static boolean lllIllIllIllI(final int n) {
        return n != 0;
    }
}
