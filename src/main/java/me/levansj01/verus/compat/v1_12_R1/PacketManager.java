package me.levansj01.verus.compat.v1_12_R1;

import io.netty.util.*;
import java.lang.reflect.*;
import me.levansj01.verus.util.java.*;
import me.levansj01.verus.compat.v1_12_R1.packets.*;
import me.levansj01.verus.compat.*;
import me.levansj01.verus.data.*;
import io.netty.channel.*;
import net.minecraft.server.v1_12_R1.*;
import org.bukkit.craftbukkit.v1_12_R1.entity.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class PacketManager extends me.levansj01.verus.compat.PacketManager
{
    private final PacketTransformer[] incomingRegistry;
    private static final AttributeKey currentStateAttrKey;
    private static final int enumProtocolLength;
    private final Field PlayerConnection_justTeleported;
    private final PacketTransformer[] outgoingRegistry;
    private static final String[] llIIIIIIIIIIl;
    private static final int[] llIIIIIIIIIll;
    
    public PacketManager() {
        this.incomingRegistry = new PacketTransformer[PacketManager.enumProtocolLength * PacketManager.llIIIIIIIIIll[0]];
        this.outgoingRegistry = new PacketTransformer[PacketManager.enumProtocolLength * PacketManager.llIIIIIIIIIll[0]];
        this.PlayerConnection_justTeleported = SafeReflection.access(PlayerConnection.class, PacketManager.llIIIIIIIIIIl[PacketManager.llIIIIIIIIIll[1]]);
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
        this.registerIn(EnumProtocol.PLAY, ServerBoundPacket.PLAY_USE_ITEM.getId(), SPacketPlayInUseItem.class);
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
    
    public void registerOut(final EnumProtocol enumProtocol, final int n, final Class clazz) {
        this.outgoingRegistry[toKey(enumProtocol, n)] = new PacketTransformer(clazz);
    }
    
    public void registerIn(final EnumProtocol enumProtocol, final int n, final Class clazz) {
        this.incomingRegistry[toKey(enumProtocol, n)] = new PacketTransformer(clazz);
    }
    
    @Override
    public void postToMainThread(final Runnable runnable) {
        MinecraftServer.getServer().postToMainThread(runnable);
    }
    
    @Override
    public VPacket transform(final boolean b, final Object o, final Object o2) {
        return this.transform(b, (ChannelHandlerContext)o, (Packet)o2);
    }
    
    @Override
    public void updatePing(final PlayerData playerData) {
        this.getEntityPlayer(playerData).ping = playerData.getAveragePing();
    }
    
    @Override
    public void uninject(final PlayerData playerData) {
        final PlayerConnection playerConnection = this.getEntityPlayer(playerData).playerConnection;
        if (llIIIIllllIlIl(playerConnection) && llIIIIllllIllI(playerConnection.isDisconnected() ? 1 : 0)) {
            final Channel channel = playerConnection.networkManager.channel;
            channel.eventLoop().execute(PacketManager::lambda$uninject$251);
        }
    }
    
    static {
        llIIIIllllIlII();
        llIIIIlllIlIlI();
        enumProtocolLength = EnumProtocol.values().length;
        currentStateAttrKey = NetworkManager.c;
    }
    
    private static void lambda$inject$250(final Channel channel, final PacketHandler packetHandler) {
        final ChannelPipeline pipeline = channel.pipeline();
        if (llIIIIllllIlIl(pipeline.get(PacketManager.llIIIIIIIIIIl[PacketManager.llIIIIIIIIIll[2]]))) {
            pipeline.addBefore(PacketManager.llIIIIIIIIIIl[PacketManager.llIIIIIIIIIll[3]], PacketManager.llIIIIIIIIIIl[PacketManager.llIIIIIIIIIll[4]], (ChannelHandler)packetHandler);
        }
    }
    
    @Override
    public void kickForcibly(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (llIIIIllllIlIl(channel)) {
            channel.unsafe().closeForcibly();
        }
    }
    
    @Override
    public boolean isTeleporting(final PlayerData playerData) {
        return (boolean)SafeReflection.fetch(this.PlayerConnection_justTeleported, this.getEntityPlayer(playerData).playerConnection);
    }
    
    public VPacket transform(final boolean b, final ChannelHandlerContext channelHandlerContext, final Packet packet) {
        final EnumProtocol enumProtocol = (EnumProtocol)channelHandlerContext.channel().attr(PacketManager.currentStateAttrKey).get();
        try {
            final EnumProtocol enumProtocol2 = enumProtocol;
            EnumProtocolDirection enumProtocolDirection;
            if (llIIIIllllIlll(b ? 1 : 0)) {
                enumProtocolDirection = EnumProtocolDirection.SERVERBOUND;
                if (1 < 0) {
                    return null;
                }
            }
            else {
                enumProtocolDirection = EnumProtocolDirection.CLIENTBOUND;
            }
            final Integer a = enumProtocol2.a(enumProtocolDirection, packet);
            PacketTransformer[] array;
            if (llIIIIllllIlll(b ? 1 : 0)) {
                array = this.incomingRegistry;
                if (2 == 0) {
                    return null;
                }
            }
            else {
                array = this.outgoingRegistry;
            }
            final PacketTransformer packetTransformer = array[toKey(enumProtocol, a)];
            if (llIIIIllllIlIl(packetTransformer)) {
                final VPacket vPacket = packetTransformer.get();
                vPacket.accept(packet);
                return vPacket;
            }
            return null;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean checkMovement(final PlayerData playerData) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void cancelPacket() {
        throw CancelledPacketHandleException.INSTANCE;
    }
    
    static int toKey(final EnumProtocol enumProtocol, final int n) {
        return enumProtocol.ordinal() << PacketManager.llIIIIIIIIIll[5] | n;
    }
    
    @Override
    public boolean inEventLoop(final PlayerData playerData) {
        return this.getEntityPlayer(playerData).playerConnection.networkManager.channel.eventLoop().inEventLoop();
    }
    
    @Override
    public void inject(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (llIIIIllllIlIl(channel)) {
            channel.eventLoop().execute(PacketManager::lambda$inject$250);
        }
    }
    
    private static void lambda$uninject$251(final Channel channel) {
        final ChannelPipeline pipeline = channel.pipeline();
        if (llIIIIllllIlIl(pipeline.get(PacketManager.llIIIIIIIIIIl[PacketManager.llIIIIIIIIIll[6]]))) {
            pipeline.remove(PacketManager.llIIIIIIIIIIl[PacketManager.llIIIIIIIIIll[7]]);
        }
    }
    
    @Override
    public void close(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (llIIIIllllIlIl(channel)) {
            channel.close();
        }
    }
    
    public EntityPlayer getEntityPlayer(final PlayerData playerData) {
        return ((CraftPlayer)playerData.getPlayer()).getHandle();
    }
    
    private static void llIIIIlllIlIlI() {
        (llIIIIIIIIIIl = new String[PacketManager.llIIIIIIIIIll[8]])[PacketManager.llIIIIIIIIIll[1]] = llIIIIlllIIlll("lxqv80W3A/wHuWcW1sSRyA==", "EOOhT");
        PacketManager.llIIIIIIIIIIl[PacketManager.llIIIIIIIIIll[2]] = llIIIIlllIIlll("6/7T/vgBrC4y2G4yw/OKNQ==", "vHQjW");
        PacketManager.llIIIIIIIIIIl[PacketManager.llIIIIIIIIIll[3]] = llIIIIlllIIlll("OPVtw/Ib4H76b2UCmk8Zxg==", "VHANH");
        PacketManager.llIIIIIIIIIIl[PacketManager.llIIIIIIIIIll[4]] = llIIIIlllIIlll("9Of0R5M+P+0Kf8Q6qvzDZw==", "FKhJt");
        PacketManager.llIIIIIIIIIIl[PacketManager.llIIIIIIIIIll[6]] = llIIIIlllIlIIl("/PL/NNKV4lc4DrjWWiJLOw==", "ODjCV");
        PacketManager.llIIIIIIIIIIl[PacketManager.llIIIIIIIIIll[7]] = llIIIIlllIlIIl("pbH7s59bBbSAHOHIbnlrGQ==", "zINTu");
    }
    
    private static String llIIIIlllIlIIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(PacketManager.llIIIIIIIIIll[3], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIIlllIIlll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), PacketManager.llIIIIIIIIIll[5]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(PacketManager.llIIIIIIIIIll[3], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void llIIIIllllIlII() {
        (llIIIIIIIIIll = new int[9])[0] = 256;
        PacketManager.llIIIIIIIIIll[1] = 0;
        PacketManager.llIIIIIIIIIll[2] = 1;
        PacketManager.llIIIIIIIIIll[3] = 2;
        PacketManager.llIIIIIIIIIll[4] = 3;
        PacketManager.llIIIIIIIIIll[5] = 8;
        PacketManager.llIIIIIIIIIll[6] = 4;
        PacketManager.llIIIIIIIIIll[7] = 5;
        PacketManager.llIIIIIIIIIll[8] = 6;
    }
    
    private static boolean llIIIIllllIlIl(final Object o) {
        return o != null;
    }
    
    private static boolean llIIIIllllIlll(final int n) {
        return n != 0;
    }
    
    private static boolean llIIIIllllIllI(final int n) {
        return n == 0;
    }
}
