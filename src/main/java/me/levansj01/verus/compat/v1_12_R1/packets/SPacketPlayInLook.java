package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_12_R1.*;

public class SPacketPlayInLook extends VPacketPlayInLook
{
    private static final int[] lIllIIIIIllII;
    
    public void accept(final PacketPlayInFlying.PacketPlayInLook packetPlayInLook) {
        this.x = packetPlayInLook.a(0.0);
        this.y = packetPlayInLook.b(0.0);
        this.z = packetPlayInLook.c(0.0);
        this.yaw = packetPlayInLook.a(0.0f);
        this.pitch = packetPlayInLook.b(0.0f);
        this.ground = packetPlayInLook.a();
        this.pos = (SPacketPlayInLook.lIllIIIIIllII[0] != 0);
        this.look = (SPacketPlayInLook.lIllIIIIIllII[1] != 0);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInFlying.PacketPlayInLook)o);
    }
    
    static {
        lIllIIlllllIll();
    }
    
    private static void lIllIIlllllIll() {
        (lIllIIIIIllII = new int[2])[0] = 0;
        SPacketPlayInLook.lIllIIIIIllII[1] = 1;
    }
}
