package me.levansj01.verus.compat.v1_8_R3.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_8_R3.*;
import me.levansj01.verus.util.java.*;

public class SPacketPlayOutEntityLook extends VPacketPlayOutEntityLook
{
    private static final Field z_field;
    private static final Field ground_field;
    private static final Field pitch_field;
    private static final Field look_field;
    private static final Field id_field;
    private static final Field y_field;
    private static final Field x_field;
    private static final Field yaw_field;
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutEntityLook.id_field, packetPlayOutEntity);
        this.x = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.x_field, packetPlayOutEntity);
        this.y = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.y_field, packetPlayOutEntity);
        this.z = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.z_field, packetPlayOutEntity);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutEntityLook.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutEntityLook.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutEntityLook.look_field, packetPlayOutEntity);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    static {
        id_field = SafeReflection.access(PacketPlayOutEntity.class, "a");
        x_field = SafeReflection.access(PacketPlayOutEntity.class, "b");
        y_field = SafeReflection.access(PacketPlayOutEntity.class, "c");
        z_field = SafeReflection.access(PacketPlayOutEntity.class, "d");
        yaw_field = SafeReflection.access(PacketPlayOutEntity.class, "e");
        pitch_field = SafeReflection.access(PacketPlayOutEntity.class, "f");
        ground_field = SafeReflection.access(PacketPlayOutEntity.class, "g");
        look_field = SafeReflection.access(PacketPlayOutEntity.class, "h");
    }
    
    @Override
    public PacketPlayOutEntity.PacketPlayOutEntityLook create() {
        final PacketPlayOutEntity.PacketPlayOutEntityLook packetPlayOutEntityLook = new PacketPlayOutEntity.PacketPlayOutEntityLook();
        SafeReflection.set(SPacketPlayOutEntityLook.id_field, packetPlayOutEntityLook, this.id);
        SafeReflection.set(SPacketPlayOutEntityLook.x_field, packetPlayOutEntityLook, this.x);
        SafeReflection.set(SPacketPlayOutEntityLook.y_field, packetPlayOutEntityLook, this.y);
        SafeReflection.set(SPacketPlayOutEntityLook.z_field, packetPlayOutEntityLook, this.z);
        SafeReflection.set(SPacketPlayOutEntityLook.yaw_field, packetPlayOutEntityLook, this.yaw);
        SafeReflection.set(SPacketPlayOutEntityLook.pitch_field, packetPlayOutEntityLook, this.pitch);
        SafeReflection.set(SPacketPlayOutEntityLook.ground_field, packetPlayOutEntityLook, this.ground);
        SafeReflection.set(SPacketPlayOutEntityLook.look_field, packetPlayOutEntityLook, this.look);
        return packetPlayOutEntityLook;
    }
    
    @Override
    public Object create() {
        return this.create();
    }
}
