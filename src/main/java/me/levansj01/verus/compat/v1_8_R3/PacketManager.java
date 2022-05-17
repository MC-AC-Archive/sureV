package me.levansj01.verus.compat.v1_8_R3;

import io.netty.util.*;
import me.levansj01.verus.compat.*;
import java.lang.reflect.*;
import me.levansj01.verus.data.*;
import org.bukkit.craftbukkit.v1_8_R3.entity.*;
import io.netty.channel.*;
import me.levansj01.verus.util.java.*;
import me.levansj01.verus.compat.v1_8_R3.packets.*;
import net.minecraft.server.v1_8_R3.*;

public class PacketManager extends me.levansj01.verus.compat.PacketManager
{
    private static final AttributeKey<EnumProtocol> currentStateAttrKey;
    private final PacketTransformer<VPacket<Packet>>[] outgoingRegistry;
    private static final int enumProtocolLength;
    private final Field PlayerConnection_justTeleported;
    private final PacketTransformer<VPacket<Packet>>[] incomingRegistry;
    private final Field PlayerConnection_checkMovement;
    
    public EntityPlayer getEntityPlayer(final PlayerData playerData) {
        return ((CraftPlayer)playerData.getPlayer()).getHandle();
    }
    
    @Override
    public void inject(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (channel != null) {
            channel.eventLoop().execute(PacketManager::lambda$inject$0);
        }
    }
    
    @Override
    public boolean inEventLoop(final PlayerData playerData) {
        return this.getEntityPlayer(playerData).playerConnection.networkManager.channel.eventLoop().inEventLoop();
    }
    
    public void registerOut(final EnumProtocol enumProtocol, final int n, final Class clazz) {
        this.outgoingRegistry[toKey(enumProtocol, n)] = (PacketTransformer<VPacket<Packet>>)new PacketTransformer(clazz);
    }
    
    @Override
    public void postToMainThread(final Runnable runnable) {
        MinecraftServer.getServer().postToMainThread(runnable);
    }
    
    public void registerIn(final EnumProtocol enumProtocol, final int n, final Class clazz) {
        this.incomingRegistry[toKey(enumProtocol, n)] = (PacketTransformer<VPacket<Packet>>)new PacketTransformer(clazz);
    }
    
    private static void lambda$inject$0(final Channel channel, final PacketHandler packetHandler) {
        final ChannelPipeline pipeline = channel.pipeline();
        if (pipeline.get("packet_handler") != null) {
            pipeline.addBefore("packet_handler", "verus-handler", (ChannelHandler)packetHandler);
        }
    }
    
    public VPacket transform(final boolean b, final ChannelHandlerContext channelHandlerContext, final Packet packet) {
        final EnumProtocol enumProtocol = (EnumProtocol)channelHandlerContext.channel().attr((AttributeKey)PacketManager.currentStateAttrKey).get();
        final PacketTransformer<VPacket<Packet>> packetTransformer = (b ? this.incomingRegistry : this.outgoingRegistry)[toKey(enumProtocol, enumProtocol.a(b ? EnumProtocolDirection.SERVERBOUND : EnumProtocolDirection.CLIENTBOUND, packet))];
        if (packetTransformer != null) {
            final VPacket vPacket = packetTransformer.get();
            vPacket.accept(packet);
            return vPacket;
        }
        return null;
    }
    
    @Override
    public void close(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (channel != null) {
            channel.close();
        }
    }
    
    public PacketManager() {
        this.incomingRegistry = (PacketTransformer<VPacket<Packet>>[])new PacketTransformer[PacketManager.enumProtocolLength * 256];
        this.outgoingRegistry = (PacketTransformer<VPacket<Packet>>[])new PacketTransformer[PacketManager.enumProtocolLength * 256];
        this.PlayerConnection_justTeleported = SafeReflection.access(PlayerConnection.class, "justTeleported");
        this.PlayerConnection_checkMovement = SafeReflection.access(PlayerConnection.class, "checkMovement");
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_PLAYER.getId(), SPacketPlayInFlying.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_POSITION.getId(), SPacketPlayInPosition.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_POSITION_LOOK.getId(), SPacketPlayInPositionLook.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_LOOK.getId(), SPacketPlayInLook.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_USE_ENTITY.getId(), SPacketPlayInUseEntity.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_ENTITY_ACTION.getId(), SPacketPlayInEntityAction.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_KEEP_ALIVE.getId(), SPacketPlayInKeepAlive.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_CUSTOM_PAYLOAD.getId(), SPacketPlayInCustomPayload.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_CLIENT_COMMAND.getId(), SPacketPlayInClientCommand.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_WINDOW_CLOSE.getId(), SPacketPlayInCloseWindow.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_BLOCK_DIG.getId(), SPacketPlayInBlockDig.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_BLOCK_PLACE.getId(), SPacketPlayInBlockPlace.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_WINDOW_CLICK.getId(), SPacketPlayInWindowClick.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_STEER_VEHICLE.getId(), SPacketPlayInSteerVehicle.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_ANIMATION.getId(), SPacketPlayInArmAnimation.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_HELD_SLOT.getId(), SPacketPlayInHeldItemSlot.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_TRANSACTION.getId(), SPacketPlayInTransaction.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_ABILITIES.getId(), SPacketPlayInAbilities.class);
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_CREATIVE_SET_SLOT.getId(), SPacketPlayInSetCreativeSlot.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_KEEP_ALIVE_ID, SPacketPlayOutKeepAlive.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_ENTITY_VELOCITY_ID, SPacketPlayOutEntityVelocity.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_POSITION_ID, SPacketPlayOutPosition.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_EXPLOSION_ID, SPacketPlayOutExplosion.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_ENTITY_TELEPORT_ID, SPacketPlayOutEntityTeleport.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_ENTITY_ID, SPacketPlayOutEntity.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_ENTITY_LOOK_ID, SPacketPlayOutEntityLook.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_ENTITY_REL_MOVE_ID, SPacketPlayOutRelEntityMove.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_ENTITY_REL_MOVE_LOOK_ID, SPacketPlayOutRelEntityMoveLook.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_ENTITY_DESTROY_ID, SPacketPlayOutEntityDestroy.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_WINDOW_OPEN_ID, SPacketPlayOutOpenWindow.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_WINDOW_SET_SLOT_ID, SPacketPlayOutSetSlot.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_SPAWN_POSITION_ID, SPacketPlayOutSpawnPosition.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_RESPAWN_ID, SPacketPlayOutRespawn.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_SPAWN_NAMED_ID, SPacketPlayOutNamedEntitySpawn.class);
        this.registerOut(EnumProtocol.PLAY, ClientBoundPacket.PLAY_ENTITY_ATTACH_ID, SPacketPlayOutAttachEntity.class);
    }
    
    private static void lambda$uninject$1(final Channel channel) {
        final ChannelPipeline pipeline = channel.pipeline();
        if (pipeline.get("verus-handler") != null) {
            pipeline.remove("verus-handler");
        }
    }
    
    static {
        enumProtocolLength = EnumProtocol.values().length;
        currentStateAttrKey = NetworkManager.c;
    }
    
    @Override
    public void uninject(final PlayerData playerData) {
        final PlayerConnection playerConnection = this.getEntityPlayer(playerData).playerConnection;
        if (playerConnection != null && !playerConnection.isDisconnected()) {
            final Channel channel = playerConnection.networkManager.channel;
            channel.eventLoop().execute(PacketManager::lambda$uninject$1);
        }
    }
    
    @Override
    public boolean checkMovement(final PlayerData playerData) {
        return (boolean)SafeReflection.fetch(this.PlayerConnection_checkMovement, this.getEntityPlayer(playerData).playerConnection);
    }
    
    @Override
    public void updatePing(final PlayerData playerData) {
        this.getEntityPlayer(playerData).ping = playerData.getAveragePing();
    }
    
    @Override
    public void cancelPacket() {
        throw CancelledPacketHandleException.INSTANCE;
    }
    
    @Override
    public VPacket transform(final boolean b, final Object o, final Object o2) {
        return this.transform(b, (ChannelHandlerContext)o, (Packet)o2);
    }
    
    static int toKey(final EnumProtocol enumProtocol, final int n) {
        return enumProtocol.ordinal() << 8 | n;
    }
    
    @Override
    public void kickForcibly(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (channel != null) {
            channel.unsafe().closeForcibly();
        }
    }
    
    @Override
    public boolean isTeleporting(final PlayerData playerData) {
        return (boolean)SafeReflection.fetch(this.PlayerConnection_justTeleported, this.getEntityPlayer(playerData).playerConnection);
    }
}
