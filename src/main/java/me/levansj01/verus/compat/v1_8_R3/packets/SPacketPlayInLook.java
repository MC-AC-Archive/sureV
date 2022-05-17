package me.levansj01.verus.compat.v1_8_R3.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_8_R3.*;

public class SPacketPlayInLook extends VPacketPlayInLook
{
    public void accept(final PacketPlayInFlying.PacketPlayInLook packetPlayInLook) {
        this.x = packetPlayInLook.a();
        this.y = packetPlayInLook.b();
        this.z = packetPlayInLook.c();
        this.yaw = packetPlayInLook.d();
        this.pitch = packetPlayInLook.e();
        this.ground = packetPlayInLook.f();
        this.pos = packetPlayInLook.g();
        this.look = packetPlayInLook.h();
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInFlying.PacketPlayInLook)o);
    }
}
