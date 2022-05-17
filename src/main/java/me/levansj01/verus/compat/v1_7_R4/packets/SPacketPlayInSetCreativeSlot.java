package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_7_R4.*;

public class SPacketPlayInSetCreativeSlot extends VPacketPlayInSetCreativeSlot
{
    public void accept(final PacketPlayInSetCreativeSlot packetPlayInSetCreativeSlot) {
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInSetCreativeSlot)o);
    }
}
