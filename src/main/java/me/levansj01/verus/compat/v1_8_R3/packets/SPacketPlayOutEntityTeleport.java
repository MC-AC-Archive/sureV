package me.levansj01.verus.compat.v1_8_R3.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import me.levansj01.verus.util.java.*;
import net.minecraft.server.v1_8_R3.*;

public class SPacketPlayOutEntityTeleport extends VPacketPlayOutEntityTeleport
{
    private static final Field ground_field;
    private static final Field yaw_field;
    private static final Field y_field;
    private static final Field x_field;
    private static final Field pitch_field;
    private static final Field id_field;
    private static final Field z_field;
    
    @Override
    public PacketPlayOutEntityTeleport create() {
        final PacketPlayOutEntityTeleport packetPlayOutEntityTeleport = new PacketPlayOutEntityTeleport();
        SafeReflection.set(SPacketPlayOutEntityTeleport.id_field, packetPlayOutEntityTeleport, this.id);
        SafeReflection.set(SPacketPlayOutEntityTeleport.x_field, packetPlayOutEntityTeleport, MathHelper.floor(this.x * 32.0));
        SafeReflection.set(SPacketPlayOutEntityTeleport.y_field, packetPlayOutEntityTeleport, MathHelper.floor(this.y * 32.0));
        SafeReflection.set(SPacketPlayOutEntityTeleport.z_field, packetPlayOutEntityTeleport, MathHelper.floor(this.z * 32.0));
        SafeReflection.set(SPacketPlayOutEntityTeleport.yaw_field, packetPlayOutEntityTeleport, this.yaw);
        SafeReflection.set(SPacketPlayOutEntityTeleport.pitch_field, packetPlayOutEntityTeleport, this.pitch);
        SafeReflection.set(SPacketPlayOutEntityTeleport.ground_field, packetPlayOutEntityTeleport, this.ground);
        return packetPlayOutEntityTeleport;
    }
    
    public void accept(final PacketPlayOutEntityTeleport packetPlayOutEntityTeleport) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntityTeleport.id_field, packetPlayOutEntityTeleport);
        this.x = (int)SafeReflection.fetch(SPacketPlayOutEntityTeleport.x_field, packetPlayOutEntityTeleport) / 32.0;
        this.y = (int)SafeReflection.fetch(SPacketPlayOutEntityTeleport.y_field, packetPlayOutEntityTeleport) / 32.0;
        this.z = (int)SafeReflection.fetch(SPacketPlayOutEntityTeleport.z_field, packetPlayOutEntityTeleport) / 32.0;
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutEntityTeleport.yaw_field, packetPlayOutEntityTeleport);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutEntityTeleport.pitch_field, packetPlayOutEntityTeleport);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutEntityTeleport.ground_field, packetPlayOutEntityTeleport);
    }
    
    @Override
    public Object create() {
        return this.create();
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntityTeleport)o);
    }
    
    static {
        id_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, "a");
        x_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, "b");
        y_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, "c");
        z_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, "d");
        yaw_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, "e");
        pitch_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, "f");
        ground_field = SafeReflection.access(PacketPlayOutEntityTeleport.class, "g");
    }
}
