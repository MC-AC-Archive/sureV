package me.levansj01.verus.compat.v1_8_R3.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_8_R3.*;

public class SPacketPlayInPosition extends VPacketPlayInPosition
{
    public void accept(final PacketPlayInFlying.PacketPlayInPosition packetPlayInPosition) {
        this.x = packetPlayInPosition.a();
        this.y = packetPlayInPosition.b();
        this.z = packetPlayInPosition.c();
        this.yaw = packetPlayInPosition.d();
        this.pitch = packetPlayInPosition.e();
        this.ground = packetPlayInPosition.f();
        this.pos = packetPlayInPosition.g();
        this.look = packetPlayInPosition.h();
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInFlying.PacketPlayInPosition)o);
    }
}
