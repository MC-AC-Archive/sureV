package me.levansj01.verus.compat.v1_16_R1;

import io.netty.util.*;
import java.lang.reflect.*;
import me.levansj01.verus.data.*;
import me.levansj01.verus.util.java.*;
import me.levansj01.verus.compat.*;
import io.netty.channel.*;
import me.levansj01.verus.compat.v1_16_R1.packets.*;
import org.bukkit.craftbukkit.v1_16_R1.entity.*;
import net.minecraft.server.v1_16_R1.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class PacketManager extends me.levansj01.verus.compat.PacketManager
{
    private static final int enumProtocolLength;
    private final PacketTransformer[] outgoingRegistry;
    private static final AttributeKey currentStateAttrKey;
    private final PacketTransformer[] incomingRegistry;
    private final Field PlayerConnection_justTeleported;
    private static final String[] llIlllllllIlI;
    private static final int[] lllIIIIIIIllI;
    
    static int toKey(final EnumProtocol enumProtocol, final int n) {
        return enumProtocol.ordinal() << PacketManager.lllIIIIIIIllI[0] | n;
    }
    
    @Override
    public boolean checkMovement(final PlayerData playerData) {
        throw new UnsupportedOperationException();
    }
    
    public void registerOut(final EnumProtocol enumProtocol, final int n, final Class clazz) {
        this.outgoingRegistry[toKey(enumProtocol, n)] = new PacketTransformer(clazz);
    }
    
    private static void lambda$inject$167(final Channel channel, final PacketHandler packetHandler) {
        final ChannelPipeline pipeline = channel.pipeline();
        if (lllIIlIIIllIll(pipeline.get(PacketManager.llIlllllllIlI[PacketManager.lllIIIIIIIllI[1]]))) {
            pipeline.addBefore(PacketManager.llIlllllllIlI[PacketManager.lllIIIIIIIllI[2]], PacketManager.llIlllllllIlI[PacketManager.lllIIIIIIIllI[3]], (ChannelHandler)packetHandler);
        }
    }
    
    @Override
    public boolean isTeleporting(final PlayerData playerData) {
        return (boolean)SafeReflection.fetch(this.PlayerConnection_justTeleported, this.getEntityPlayer(playerData).playerConnection);
    }
    
    private static void lambda$uninject$168(final Channel channel) {
        final ChannelPipeline pipeline = channel.pipeline();
        if (lllIIlIIIllIll(pipeline.get(PacketManager.llIlllllllIlI[PacketManager.lllIIIIIIIllI[4]]))) {
            pipeline.remove(PacketManager.llIlllllllIlI[PacketManager.lllIIIIIIIllI[5]]);
        }
    }
    
    @Override
    public void uninject(final PlayerData playerData) {
        final PlayerConnection playerConnection = this.getEntityPlayer(playerData).playerConnection;
        if (lllIIlIIIllIll(playerConnection) && lllIIlIIIlllII(playerConnection.isDisconnected() ? 1 : 0)) {
            final Channel channel = playerConnection.networkManager.channel;
            channel.eventLoop().execute(PacketManager::lambda$uninject$168);
        }
    }
    
    @Override
    public VPacket transform(final boolean b, final Object o, final Object o2) {
        return this.transform(b, (ChannelHandlerContext)o, (Packet)o2);
    }
    
    static {
        lllIIlIIIllIlI();
        lllIIlIIIlIlIl();
        enumProtocolLength = EnumProtocol.values().length;
        currentStateAttrKey = NetworkManager.c;
    }
    
    @Override
    public void postToMainThread(final Runnable runnable) {
        MinecraftServer.getServer().execute(runnable);
    }
    
    @Override
    public void updatePing(final PlayerData playerData) {
        this.getEntityPlayer(playerData).ping = playerData.getAveragePing();
    }
    
    public PacketManager() {
        this.incomingRegistry = new PacketTransformer[PacketManager.enumProtocolLength * PacketManager.lllIIIIIIIllI[6]];
        this.outgoingRegistry = new PacketTransformer[PacketManager.enumProtocolLength * PacketManager.lllIIIIIIIllI[6]];
        this.PlayerConnection_justTeleported = SafeReflection.access(PlayerConnection.class, PacketManager.llIlllllllIlI[PacketManager.lllIIIIIIIllI[7]]);
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
    
    @Override
    public void kickForcibly(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (lllIIlIIIllIll(channel)) {
            channel.unsafe().closeForcibly();
        }
    }
    
    @Override
    public void close(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (lllIIlIIIllIll(channel)) {
            channel.close();
        }
    }
    
    @Override
    public void cancelPacket() {
        throw CancelledPacketHandleException.INSTANCE;
    }
    
    @Override
    public void inject(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (lllIIlIIIllIll(channel)) {
            channel.eventLoop().execute(PacketManager::lambda$inject$167);
        }
    }
    
    public void registerIn(final EnumProtocol enumProtocol, final int n, final Class clazz) {
        this.incomingRegistry[toKey(enumProtocol, n)] = new PacketTransformer(clazz);
    }
    
    public EntityPlayer getEntityPlayer(final PlayerData playerData) {
        return ((CraftPlayer)playerData.getPlayer()).getHandle();
    }
    
    public VPacket transform(final boolean b, final ChannelHandlerContext channelHandlerContext, final Packet packet) {
        final EnumProtocol enumProtocol = (EnumProtocol)channelHandlerContext.channel().attr(PacketManager.currentStateAttrKey).get();
        try {
            final EnumProtocol enumProtocol2 = enumProtocol;
            EnumProtocolDirection enumProtocolDirection;
            if (lllIIlIIIllllI(b ? 1 : 0)) {
                enumProtocolDirection = EnumProtocolDirection.SERVERBOUND;
                if (-1 > 0) {
                    return null;
                }
            }
            else {
                enumProtocolDirection = EnumProtocolDirection.CLIENTBOUND;
            }
            final Integer a = enumProtocol2.a(enumProtocolDirection, packet);
            PacketTransformer[] array;
            if (lllIIlIIIllllI(b ? 1 : 0)) {
                array = this.incomingRegistry;
                if (0 > 0) {
                    return null;
                }
            }
            else {
                array = this.outgoingRegistry;
            }
            final PacketTransformer packetTransformer = array[toKey(enumProtocol, a)];
            if (lllIIlIIIllIll(packetTransformer)) {
                final VPacket vPacket = packetTransformer.get();
                vPacket.accept(packet);
                return vPacket;
            }
            if (-3 > 0) {
                return null;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    @Override
    public boolean inEventLoop(final PlayerData playerData) {
        return this.getEntityPlayer(playerData).playerConnection.networkManager.channel.eventLoop().inEventLoop();
    }
    
    private static void lllIIlIIIlIlIl() {
        (llIlllllllIlI = new String[PacketManager.lllIIIIIIIllI[8]])[PacketManager.lllIIIIIIIllI[1]] = lllIIlIIIIlllI("zFRFr00bfk59U2aYY0CWbA==", "WJPmT");
        PacketManager.llIlllllllIlI[PacketManager.lllIIIIIIIllI[2]] = lllIIlIIIIlllI("kn/ve+FR8ofXztR4dMWImQ==", "dkwaY");
        PacketManager.llIlllllllIlI[PacketManager.lllIIIIIIIllI[3]] = lllIIlIIIIlllI("2Zgf9nWgS/7lAlIxo0rSNw==", "snDvW");
        PacketManager.llIlllllllIlI[PacketManager.lllIIIIIIIllI[4]] = lllIIlIIIlIlII("kMTHPkGmi1XFyXyRSv7uBg==", "CFMZh");
        PacketManager.llIlllllllIlI[PacketManager.lllIIIIIIIllI[5]] = lllIIlIIIlIlII("2BsRKYhuYvUOkGa/aaV5aA==", "snUgh");
        PacketManager.llIlllllllIlI[PacketManager.lllIIIIIIIllI[7]] = lllIIlIIIlIlII("/8xskUorWO9dmU1G4H75ag==", "Qxbrb");
    }
    
    private static String lllIIlIIIlIlII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), PacketManager.lllIIIIIIIllI[0]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(PacketManager.lllIIIIIIIllI[3], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIlIIIIlllI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(PacketManager.lllIIIIIIIllI[3], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIlIIIllIlI() {
        (lllIIIIIIIllI = new int[9])[0] = 8;
        PacketManager.lllIIIIIIIllI[1] = 0;
        PacketManager.lllIIIIIIIllI[2] = 1;
        PacketManager.lllIIIIIIIllI[3] = 2;
        PacketManager.lllIIIIIIIllI[4] = 3;
        PacketManager.lllIIIIIIIllI[5] = 4;
        PacketManager.lllIIIIIIIllI[6] = 256;
        PacketManager.lllIIIIIIIllI[7] = 5;
        PacketManager.lllIIIIIIIllI[8] = 6;
    }
    
    private static boolean lllIIlIIIllIll(final Object o) {
        return o != null;
    }
    
    private static boolean lllIIlIIIllllI(final int n) {
        return n != 0;
    }
    
    private static boolean lllIIlIIIlllII(final int n) {
        return n == 0;
    }
}
