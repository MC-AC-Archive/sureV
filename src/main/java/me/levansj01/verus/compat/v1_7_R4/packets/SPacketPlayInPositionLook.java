package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_7_R4.*;

public class SPacketPlayInPositionLook extends VPacketPlayInPositionLook
{
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInFlying)o);
    }
    
    public void accept(final PacketPlayInFlying packetPlayInFlying) {
        this.x = packetPlayInFlying.c();
        this.y = packetPlayInFlying.d();
        this.z = packetPlayInFlying.e();
        this.yaw = packetPlayInFlying.g();
        this.pitch = packetPlayInFlying.h();
        this.ground = packetPlayInFlying.i();
        this.pos = packetPlayInFlying.j();
        this.look = packetPlayInFlying.k();
    }
}
