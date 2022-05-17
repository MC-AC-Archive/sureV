package me.levansj01.verus.compat.v1_14_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_14_R1.*;

public class SPacketPlayInSteerVehicle extends VPacketPlayInSteerVehicle
{
    public void accept(final PacketPlayInSteerVehicle packetPlayInSteerVehicle) {
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInSteerVehicle)o);
    }
}
