package me.levansj01.verus.compat.v1_14_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_14_R1.*;

public class SPacketPlayInLook extends VPacketPlayInLook
{
    private static final int[] lllllIIllIIl;
    
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
        this.ground = packetPlayInLook.b();
        this.pos = (SPacketPlayInLook.lllllIIllIIl[0] != 0);
        this.look = (SPacketPlayInLook.lllllIIllIIl[1] != 0);
    }
    
    static {
        lllllllllIlIl();
    }
    
    private static void lllllllllIlIl() {
        (lllllIIllIIl = new int[2])[0] = 0;
        SPacketPlayInLook.lllllIIllIIl[1] = 1;
    }
}
