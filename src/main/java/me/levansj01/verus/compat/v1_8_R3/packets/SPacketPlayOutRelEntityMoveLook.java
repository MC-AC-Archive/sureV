package me.levansj01.verus.compat.v1_8_R3.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_8_R3.*;
import me.levansj01.verus.util.java.*;

public class SPacketPlayOutRelEntityMoveLook extends VPacketPlayOutRelEntityMoveLook
{
    private static final Field z_field;
    private static final Field id_field;
    private static final Field pitch_field;
    private static final Field yaw_field;
    private static final Field look_field;
    private static final Field x_field;
    private static final Field y_field;
    private static final Field ground_field;
    
    @Override
    public PacketPlayOutEntity.PacketPlayOutRelEntityMoveLook create() {
        final PacketPlayOutEntity.PacketPlayOutRelEntityMoveLook packetPlayOutRelEntityMoveLook = new PacketPlayOutEntity.PacketPlayOutRelEntityMoveLook();
        SafeReflection.set(SPacketPlayOutRelEntityMoveLook.id_field, packetPlayOutRelEntityMoveLook, this.id);
        SafeReflection.set(SPacketPlayOutRelEntityMoveLook.x_field, packetPlayOutRelEntityMoveLook, this.x);
        SafeReflection.set(SPacketPlayOutRelEntityMoveLook.y_field, packetPlayOutRelEntityMoveLook, this.y);
        SafeReflection.set(SPacketPlayOutRelEntityMoveLook.z_field, packetPlayOutRelEntityMoveLook, this.z);
        SafeReflection.set(SPacketPlayOutRelEntityMoveLook.yaw_field, packetPlayOutRelEntityMoveLook, this.yaw);
        SafeReflection.set(SPacketPlayOutRelEntityMoveLook.pitch_field, packetPlayOutRelEntityMoveLook, this.pitch);
        SafeReflection.set(SPacketPlayOutRelEntityMoveLook.ground_field, packetPlayOutRelEntityMoveLook, this.ground);
        SafeReflection.set(SPacketPlayOutRelEntityMoveLook.look_field, packetPlayOutRelEntityMoveLook, this.look);
        return packetPlayOutRelEntityMoveLook;
    }
    
    @Override
    public Object create() {
        return this.create();
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.id_field, packetPlayOutEntity);
        this.x = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.x_field, packetPlayOutEntity);
        this.y = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.y_field, packetPlayOutEntity);
        this.z = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.z_field, packetPlayOutEntity);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutRelEntityMoveLook.look_field, packetPlayOutEntity);
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
}
