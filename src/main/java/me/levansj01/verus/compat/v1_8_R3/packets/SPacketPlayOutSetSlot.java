package me.levansj01.verus.compat.v1_8_R3.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_8_R3.*;

public class SPacketPlayOutSetSlot extends VPacketPlayOutSetSlot
{
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutSetSlot)o);
    }
    
    public void accept(final PacketPlayOutSetSlot packetPlayOutSetSlot) {
    }
}
