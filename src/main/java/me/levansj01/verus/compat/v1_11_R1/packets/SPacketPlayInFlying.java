package me.levansj01.verus.compat.v1_11_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_11_R1.*;

public class SPacketPlayInFlying extends VPacketPlayInFlying
{
    private static final int[] lIIllIlIlIIll;
    
    public void accept(final PacketPlayInFlying packetPlayInFlying) {
        this.x = packetPlayInFlying.a(0.0);
        this.y = packetPlayInFlying.b(0.0);
        this.z = packetPlayInFlying.c(0.0);
        this.yaw = packetPlayInFlying.a(0.0f);
        this.pitch = packetPlayInFlying.b(0.0f);
        this.ground = packetPlayInFlying.a();
        this.pos = (SPacketPlayInFlying.lIIllIlIlIIll[0] != 0);
        this.look = (SPacketPlayInFlying.lIIllIlIlIIll[0] != 0);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInFlying)o);
    }
    
    static {
        lIIlllIllIIIIl();
    }
    
    private static void lIIlllIllIIIIl() {
        (lIIllIlIlIIll = new int[1])[0] = 0;
    }
}
