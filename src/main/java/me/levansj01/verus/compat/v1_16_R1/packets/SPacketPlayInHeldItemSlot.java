package me.levansj01.verus.compat.v1_16_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_16_R1.*;

public class SPacketPlayInHeldItemSlot extends VPacketPlayInHeldItemSlot
{
    public void accept(final PacketPlayInHeldItemSlot packetPlayInHeldItemSlot) {
        this.slot = packetPlayInHeldItemSlot.b();
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInHeldItemSlot)o);
    }
}
