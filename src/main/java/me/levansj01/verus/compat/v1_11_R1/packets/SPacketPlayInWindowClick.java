package me.levansj01.verus.compat.v1_11_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_11_R1.*;
import org.bukkit.craftbukkit.v1_11_R1.inventory.*;

public class SPacketPlayInWindowClick extends VPacketPlayInWindowClick
{
    private static final int[] llIIIlIIllIII;
    
    @Override
    public boolean isShiftClick() {
        return SPacketPlayInWindowClick.llIIIlIIllIII[0] != 0;
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInWindowClick)o);
    }
    
    @Override
    public boolean isChest() {
        int n;
        if (llIIlIIIllIlll(this.window)) {
            n = SPacketPlayInWindowClick.llIIIlIIllIII[1];
            if (null != null) {
                return false;
            }
        }
        else {
            n = SPacketPlayInWindowClick.llIIIlIIllIII[0];
        }
        return n != 0;
    }
    
    public void accept(final PacketPlayInWindowClick packetPlayInWindowClick) {
        this.slot = packetPlayInWindowClick.b();
        this.window = packetPlayInWindowClick.a();
        this.button = packetPlayInWindowClick.c();
        this.mode = SPacketPlayInWindowClick.llIIIlIIllIII[0];
        this.itemStack = CraftItemStack.asBukkitCopy(packetPlayInWindowClick.e());
    }
    
    @Override
    public boolean isItem() {
        int n;
        if (llIIlIIIlllIII(this.itemStack)) {
            n = SPacketPlayInWindowClick.llIIIlIIllIII[1];
            if (2 <= -1) {
                return false;
            }
        }
        else {
            n = SPacketPlayInWindowClick.llIIIlIIllIII[0];
        }
        return n != 0;
    }
    
    static {
        llIIlIIIllIllI();
    }
    
    private static void llIIlIIIllIllI() {
        (llIIIlIIllIII = new int[2])[0] = 0;
        SPacketPlayInWindowClick.llIIIlIIllIII[1] = 1;
    }
    
    private static boolean llIIlIIIlllIII(final Object o) {
        return o != null;
    }
    
    private static boolean llIIlIIIllIlll(final int n) {
        return n != 0;
    }
}
