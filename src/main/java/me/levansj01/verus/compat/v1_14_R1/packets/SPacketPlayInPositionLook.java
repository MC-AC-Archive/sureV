package me.levansj01.verus.compat.v1_14_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_14_R1.*;

public class SPacketPlayInPositionLook extends VPacketPlayInPositionLook
{
    private static final int[] lIIIlIIIIIlII;
    
    public void accept(final PacketPlayInFlying.PacketPlayInPositionLook packetPlayInPositionLook) {
        this.x = packetPlayInPositionLook.a(0.0);
        this.y = packetPlayInPositionLook.b(0.0);
        this.z = packetPlayInPositionLook.c(0.0);
        this.yaw = packetPlayInPositionLook.a(0.0f);
        this.pitch = packetPlayInPositionLook.b(0.0f);
        this.ground = packetPlayInPositionLook.b();
        this.pos = (SPacketPlayInPositionLook.lIIIlIIIIIlII[0] != 0);
        this.look = (SPacketPlayInPositionLook.lIIIlIIIIIlII[0] != 0);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInFlying.PacketPlayInPositionLook)o);
    }
    
    static {
        lIIIlIllIlIlll();
    }
    
    private static void lIIIlIllIlIlll() {
        (lIIIlIIIIIlII = new int[1])[0] = 1;
    }
}
