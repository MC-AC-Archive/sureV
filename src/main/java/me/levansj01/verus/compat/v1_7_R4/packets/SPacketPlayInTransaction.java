package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_7_R4.*;

public class SPacketPlayInTransaction extends VPacketPlayInTransaction
{
    public void accept(final PacketPlayInTransaction packetPlayInTransaction) {
        this.specialId = packetPlayInTransaction.d();
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInTransaction)o);
    }
}
