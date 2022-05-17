package me.levansj01.verus.compat.v1_16_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_16_R1.*;

public class SPacketPlayInTransaction extends VPacketPlayInTransaction
{
    public void accept(final PacketPlayInTransaction packetPlayInTransaction) {
        this.specialId = packetPlayInTransaction.c();
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInTransaction)o);
    }
}
