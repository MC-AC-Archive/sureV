package me.levansj01.verus.compat.v1_11_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_11_R1.*;

public class SPacketPlayInVehicleMove extends VPacketPlayInVehicleMove
{
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInVehicleMove)o);
    }
    
    public void accept(final PacketPlayInVehicleMove packetPlayInVehicleMove) {
        this.x = packetPlayInVehicleMove.getZ();
        this.y = packetPlayInVehicleMove.getY();
        this.z = packetPlayInVehicleMove.getZ();
        this.yaw = packetPlayInVehicleMove.getYaw();
        this.pitch = packetPlayInVehicleMove.getPitch();
    }
}
