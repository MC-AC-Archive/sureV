package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_7_R4.*;

public class SPacketPlayInClientCommand extends VPacketPlayInClientCommand
{
    public void accept(final PacketPlayInClientCommand packetPlayInClientCommand) {
        this.command = ClientCommand.values()[packetPlayInClientCommand.c().ordinal()];
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInClientCommand)o);
    }
}
