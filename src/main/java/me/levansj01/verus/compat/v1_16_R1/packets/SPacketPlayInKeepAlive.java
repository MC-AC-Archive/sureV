package me.levansj01.verus.compat.v1_16_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_16_R1.*;
import java.math.*;

public class SPacketPlayInKeepAlive extends VPacketPlayInKeepAlive
{
    public void accept(final PacketPlayInKeepAlive packetPlayInKeepAlive) {
        this.id = BigInteger.valueOf(packetPlayInKeepAlive.b());
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInKeepAlive)o);
    }
}
