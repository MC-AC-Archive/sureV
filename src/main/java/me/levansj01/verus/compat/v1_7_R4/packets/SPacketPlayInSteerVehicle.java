package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_7_R4.*;

public class SPacketPlayInSteerVehicle extends VPacketPlayInSteerVehicle
{
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInSteerVehicle)o);
    }
    
    public void accept(final PacketPlayInSteerVehicle packetPlayInSteerVehicle) {
    }
}
