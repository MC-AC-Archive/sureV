package me.levansj01.verus.compat.v1_14_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_14_R1.*;

public class SPacketPlayOutRespawn extends VPacketPlayOutRespawn
{
    public void accept(final PacketPlayOutRespawn packetPlayOutRespawn) {
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutRespawn)o);
    }
}
