package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_7_R4.*;
import org.bukkit.craftbukkit.v1_7_R4.inventory.*;

public class SPacketPlayInWindowClick extends VPacketPlayInWindowClick
{
    private static final int[] llIIlIllllllI;
    
    @Override
    public boolean isShiftClick() {
        int n;
        if (llIlIIIIlIIlIl(this.isChest() ? 1 : 0) && llIlIIIIlIIllI(this.mode, SPacketPlayInWindowClick.llIIlIllllllI[0]) && llIlIIIIlIIlll(this.button, SPacketPlayInWindowClick.llIIlIllllllI[1])) {
            n = SPacketPlayInWindowClick.llIIlIllllllI[0];
            if (3 <= 0) {
                return false;
            }
        }
        else {
            n = SPacketPlayInWindowClick.llIIlIllllllI[2];
        }
        return n != 0;
    }
    
    @Override
    public boolean isItem() {
        int n;
        if (llIlIIIIlIlIII(this.itemStack)) {
            n = SPacketPlayInWindowClick.llIIlIllllllI[0];
            if (3 <= -1) {
                return false;
            }
        }
        else {
            n = SPacketPlayInWindowClick.llIIlIllllllI[2];
        }
        return n != 0;
    }
    
    @Override
    public boolean isChest() {
        int n;
        if (llIlIIIIlIIlIl(this.window)) {
            n = SPacketPlayInWindowClick.llIIlIllllllI[0];
            if (4 <= 0) {
                return false;
            }
        }
        else {
            n = SPacketPlayInWindowClick.llIIlIllllllI[2];
        }
        return n != 0;
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInWindowClick)o);
    }
    
    public void accept(final PacketPlayInWindowClick packetPlayInWindowClick) {
        this.slot = packetPlayInWindowClick.d();
        this.window = packetPlayInWindowClick.c();
        this.button = packetPlayInWindowClick.e();
        this.mode = packetPlayInWindowClick.h();
        this.itemStack = CraftItemStack.asBukkitCopy(packetPlayInWindowClick.g());
    }
    
    static {
        llIlIIIIlIIlII();
    }
    
    private static void llIlIIIIlIIlII() {
        (llIIlIllllllI = new int[3])[0] = 1;
        SPacketPlayInWindowClick.llIIlIllllllI[1] = 2;
        SPacketPlayInWindowClick.llIIlIllllllI[2] = 0;
    }
    
    private static boolean llIlIIIIlIIllI(final int n, final int n2) {
        return n == n2;
    }
    
    private static boolean llIlIIIIlIIlll(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean llIlIIIIlIlIII(final Object o) {
        return o != null;
    }
    
    private static boolean llIlIIIIlIIlIl(final int n) {
        return n != 0;
    }
}
