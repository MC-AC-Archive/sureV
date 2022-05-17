package me.levansj01.verus.compat.v1_8_R3.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_8_R3.*;
import me.levansj01.verus.util.java.*;

public class SPacketPlayOutRelEntityMove extends VPacketPlayOutRelEntityMove
{
    private static final Field z_field;
    private static final Field pitch_field;
    private static final Field ground_field;
    private static final Field y_field;
    private static final Field look_field;
    private static final Field x_field;
    private static final Field yaw_field;
    private static final Field id_field;
    
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
    
    public void accept(final PacketPlayOutEntity packetPlayOutEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayOutRelEntityMove.id_field, packetPlayOutEntity);
        this.x = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMove.x_field, packetPlayOutEntity);
        this.y = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMove.y_field, packetPlayOutEntity);
        this.z = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMove.z_field, packetPlayOutEntity);
        this.yaw = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMove.yaw_field, packetPlayOutEntity);
        this.pitch = (byte)SafeReflection.fetch(SPacketPlayOutRelEntityMove.pitch_field, packetPlayOutEntity);
        this.ground = (boolean)SafeReflection.fetch(SPacketPlayOutRelEntityMove.ground_field, packetPlayOutEntity);
        this.look = (boolean)SafeReflection.fetch(SPacketPlayOutRelEntityMove.look_field, packetPlayOutEntity);
    }
    
    @Override
    public Object create() {
        return this.create();
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntity)o);
    }
    
    @Override
    public PacketPlayOutEntity.PacketPlayOutRelEntityMove create() {
        final PacketPlayOutEntity.PacketPlayOutRelEntityMove packetPlayOutRelEntityMove = new PacketPlayOutEntity.PacketPlayOutRelEntityMove();
        SafeReflection.set(SPacketPlayOutRelEntityMove.id_field, packetPlayOutRelEntityMove, this.id);
        SafeReflection.set(SPacketPlayOutRelEntityMove.x_field, packetPlayOutRelEntityMove, this.x);
        SafeReflection.set(SPacketPlayOutRelEntityMove.y_field, packetPlayOutRelEntityMove, this.y);
        SafeReflection.set(SPacketPlayOutRelEntityMove.z_field, packetPlayOutRelEntityMove, this.z);
        SafeReflection.set(SPacketPlayOutRelEntityMove.yaw_field, packetPlayOutRelEntityMove, this.yaw);
        SafeReflection.set(SPacketPlayOutRelEntityMove.pitch_field, packetPlayOutRelEntityMove, this.pitch);
        SafeReflection.set(SPacketPlayOutRelEntityMove.ground_field, packetPlayOutRelEntityMove, this.ground);
        SafeReflection.set(SPacketPlayOutRelEntityMove.look_field, packetPlayOutRelEntityMove, this.look);
        return packetPlayOutRelEntityMove;
    }
}
