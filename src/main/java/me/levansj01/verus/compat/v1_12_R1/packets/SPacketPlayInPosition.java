package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_12_R1.*;

public class SPacketPlayInPosition extends VPacketPlayInPosition
{
    private static final int[] llIllIIIIIlII;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInFlying.PacketPlayInPosition)o);
    }
    
    public void accept(final PacketPlayInFlying.PacketPlayInPosition packetPlayInPosition) {
        this.x = packetPlayInPosition.a(0.0);
        this.y = packetPlayInPosition.b(0.0);
        this.z = packetPlayInPosition.c(0.0);
        this.yaw = packetPlayInPosition.a(0.0f);
        this.pitch = packetPlayInPosition.b(0.0f);
        this.ground = packetPlayInPosition.a();
        this.pos = (SPacketPlayInPosition.llIllIIIIIlII[0] != 0);
        this.look = (SPacketPlayInPosition.llIllIIIIIlII[1] != 0);
    }
    
    static {
        llIlllIIlllIll();
    }
    
    private static void llIlllIIlllIll() {
        (llIllIIIIIlII = new int[2])[0] = 1;
        SPacketPlayInPosition.llIllIIIIIlII[1] = 0;
    }
}
