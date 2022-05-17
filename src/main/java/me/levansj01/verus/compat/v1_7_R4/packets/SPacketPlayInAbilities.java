package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_7_R4.*;
import me.levansj01.verus.compat.*;

public class SPacketPlayInAbilities extends VPacketPlayInAbilities
{
    public void accept(final PacketPlayInAbilities packetPlayInAbilities) {
        this.abilities = new PlayerAbilities(packetPlayInAbilities.c(), packetPlayInAbilities.isFlying(), packetPlayInAbilities.e(), packetPlayInAbilities.f(), packetPlayInAbilities.g(), packetPlayInAbilities.h());
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInAbilities)o);
    }
}
