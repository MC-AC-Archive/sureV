package me.levansj01.verus.compat.v1_8_R3.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_8_R3.*;
import me.levansj01.verus.compat.*;
import org.bukkit.craftbukkit.v1_8_R3.inventory.*;

public class SPacketPlayInBlockPlace extends VPacketPlayInBlockPlace
{
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInBlockPlace)o);
    }
    
    public void accept(final PacketPlayInBlockPlace packetPlayInBlockPlace) {
        this.position = new BlockPosition(packetPlayInBlockPlace.a().getX(), packetPlayInBlockPlace.a().getY(), packetPlayInBlockPlace.a().getZ());
        this.face = packetPlayInBlockPlace.getFace();
        this.itemStack = CraftItemStack.asBukkitCopy(packetPlayInBlockPlace.getItemStack());
        this.blockX = packetPlayInBlockPlace.d();
        this.blockY = packetPlayInBlockPlace.e();
        this.blockZ = packetPlayInBlockPlace.f();
        this.timestamp = packetPlayInBlockPlace.timestamp;
    }
}
