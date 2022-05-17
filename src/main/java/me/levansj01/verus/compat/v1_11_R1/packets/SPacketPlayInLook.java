package me.levansj01.verus.compat.v1_11_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_11_R1.*;

public class SPacketPlayInLook extends VPacketPlayInLook
{
    private static final int[] llIIllIlllllI;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInFlying.PacketPlayInLook)o);
    }
    
    public void accept(final PacketPlayInFlying.PacketPlayInLook packetPlayInLook) {
        this.x = packetPlayInLook.a(0.0);
        this.y = packetPlayInLook.b(0.0);
        this.z = packetPlayInLook.c(0.0);
        this.yaw = packetPlayInLook.a(0.0f);
        this.pitch = packetPlayInLook.b(0.0f);
        this.ground = packetPlayInLook.a();
        this.pos = (SPacketPlayInLook.llIIllIlllllI[0] != 0);
        this.look = (SPacketPlayInLook.llIIllIlllllI[1] != 0);
    }
    
    static {
        llIlIIlIlIlIII();
    }
    
    private static void llIlIIlIlIlIII() {
        (llIIllIlllllI = new int[2])[0] = 0;
        SPacketPlayInLook.llIIllIlllllI[1] = 1;
    }
}
