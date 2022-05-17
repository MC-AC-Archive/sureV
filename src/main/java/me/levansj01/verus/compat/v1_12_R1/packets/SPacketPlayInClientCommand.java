package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_12_R1.*;

public class SPacketPlayInClientCommand extends VPacketPlayInClientCommand
{
    public void accept(final PacketPlayInClientCommand packetPlayInClientCommand) {
        this.command = ClientCommand.values()[packetPlayInClientCommand.a().ordinal()];
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInClientCommand)o);
    }
}
