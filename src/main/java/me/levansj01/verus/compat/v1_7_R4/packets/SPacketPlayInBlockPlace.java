package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_7_R4.*;
import me.levansj01.verus.compat.*;
import org.bukkit.craftbukkit.v1_7_R4.inventory.*;

public class SPacketPlayInBlockPlace extends VPacketPlayInBlockPlace
{
    public void accept(final PacketPlayInBlockPlace packetPlayInBlockPlace) {
        this.position = new BlockPosition(packetPlayInBlockPlace.c(), packetPlayInBlockPlace.d(), packetPlayInBlockPlace.e());
        this.face = packetPlayInBlockPlace.getFace();
        this.itemStack = CraftItemStack.asBukkitCopy(packetPlayInBlockPlace.getItemStack());
        this.blockX = packetPlayInBlockPlace.h();
        this.blockY = packetPlayInBlockPlace.i();
        this.blockZ = packetPlayInBlockPlace.j();
        this.timestamp = packetPlayInBlockPlace.timestamp;
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInBlockPlace)o);
    }
}
