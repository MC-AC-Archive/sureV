package me.levansj01.verus.compat.v1_8_R3.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_8_R3.*;

public class SPacketPlayInPositionLook extends VPacketPlayInPositionLook
{
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInFlying.PacketPlayInPositionLook)o);
    }
    
    public void accept(final PacketPlayInFlying.PacketPlayInPositionLook packetPlayInPositionLook) {
        this.x = packetPlayInPositionLook.a();
        this.y = packetPlayInPositionLook.b();
        this.z = packetPlayInPositionLook.c();
        this.yaw = packetPlayInPositionLook.d();
        this.pitch = packetPlayInPositionLook.e();
        this.ground = packetPlayInPositionLook.f();
        this.pos = packetPlayInPositionLook.g();
        this.look = packetPlayInPositionLook.h();
    }
}
