package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_12_R1.*;

public class SPacketPlayInFlying extends VPacketPlayInFlying
{
    private static final int[] lIIIlIIllIllI;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInFlying)o);
    }
    
    public void accept(final PacketPlayInFlying packetPlayInFlying) {
        this.x = packetPlayInFlying.a(0.0);
        this.y = packetPlayInFlying.b(0.0);
        this.z = packetPlayInFlying.c(0.0);
        this.yaw = packetPlayInFlying.a(0.0f);
        this.pitch = packetPlayInFlying.b(0.0f);
        this.ground = packetPlayInFlying.a();
        this.pos = (SPacketPlayInFlying.lIIIlIIllIllI[0] != 0);
        this.look = (SPacketPlayInFlying.lIIIlIIllIllI[0] != 0);
    }
    
    static {
        lIIIllIIlIIlIl();
    }
    
    private static void lIIIllIIlIIlIl() {
        (lIIIlIIllIllI = new int[1])[0] = 0;
    }
}
