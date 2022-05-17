package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_12_R1.*;

public class SPacketPlayOutExplosion extends VPacketPlayOutExplosion
{
    public void accept(final PacketPlayOutExplosion packetPlayOutExplosion) {
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutExplosion)o);
    }
}
