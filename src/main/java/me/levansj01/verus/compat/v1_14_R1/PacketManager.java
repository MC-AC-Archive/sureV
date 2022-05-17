package me.levansj01.verus.compat.v1_14_R1;

import java.lang.reflect.*;
import io.netty.util.*;
import me.levansj01.verus.compat.*;
import me.levansj01.verus.util.java.*;
import me.levansj01.verus.compat.v1_14_R1.packets.*;
import me.levansj01.verus.data.*;
import org.bukkit.craftbukkit.v1_14_R1.entity.*;
import net.minecraft.server.v1_14_R1.*;
import io.netty.channel.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class PacketManager extends me.levansj01.verus.compat.PacketManager
{
    private final PacketTransformer[] outgoingRegistry;
    private final Field PlayerConnection_justTeleported;
    private static final int enumProtocolLength;
    private final PacketTransformer[] incomingRegistry;
    private static final AttributeKey currentStateAttrKey;
    private static String[] lIIllIIlIIlIl;
    private static int[] lIIllIIlIlIIl;
    
    static int toKey(final EnumProtocol enumProtocol, final int n) {
        return enumProtocol.ordinal() << PacketManager.lIIllIIlIlIIl[0] | n;
    }
    
    @Override
    public VPacket transform(final boolean b, final Object o, final Object o2) {
        return this.transform(b, (ChannelHandlerContext)o, (Packet)o2);
    }
    
    public void registerOut(final EnumProtocol enumProtocol, final int n, final Class clazz) {
        this.outgoingRegistry[toKey(enumProtocol, n)] = new PacketTransformer(clazz);
    }
    
    public PacketManager() {
        this.incomingRegistry = new PacketTransformer[PacketManager.enumProtocolLength * PacketManager.lIIllIIlIlIIl[1]];
        this.outgoingRegistry = new PacketTransformer[PacketManager.enumProtocolLength * PacketManager.lIIllIIlIlIIl[1]];
        this.PlayerConnection_justTeleported = SafeReflection.access(PlayerConnection.class, PacketManager.lIIllIIlIIlIl[PacketManager.lIIllIIlIlIIl[2]]);
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
    
    public void registerIn(final EnumProtocol enumProtocol, final int n, final Class clazz) {
        this.incomingRegistry[toKey(enumProtocol, n)] = new PacketTransformer(clazz);
    }
    
    @Override
    public void cancelPacket() {
        throw CancelledPacketHandleException.INSTANCE;
    }
    
    static {
        lIIlllIIIIIlIl();
        lIIlllIIIIIIlI();
        enumProtocolLength = EnumProtocol.values().length;
        currentStateAttrKey = NetworkManager.c;
    }
    
    @Override
    public void kickForcibly(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (lIIlllIIIIIllI(channel)) {
            channel.unsafe().closeForcibly();
        }
    }
    
    @Override
    public void close(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (lIIlllIIIIIllI(channel)) {
            channel.close();
        }
    }
    
    @Override
    public void uninject(final PlayerData playerData) {
        final PlayerConnection playerConnection = this.getEntityPlayer(playerData).playerConnection;
        if (lIIlllIIIIIllI(playerConnection) && lIIlllIIIIIlll(playerConnection.isDisconnected() ? 1 : 0)) {
            final Channel channel = playerConnection.networkManager.channel;
            channel.eventLoop().execute(PacketManager::lambda$inject$112);
        }
    }
    
    @Override
    public boolean inEventLoop(final PlayerData playerData) {
        return this.getEntityPlayer(playerData).playerConnection.networkManager.channel.eventLoop().inEventLoop();
    }
    
    @Override
    public void postToMainThread(final Runnable runnable) {
        MinecraftServer.getServer().execute(runnable);
    }
    
    private static void lambdaUninject(final Channel channel) {
        final ChannelPipeline pipeline = channel.pipeline();
        if (lIIlllIIIIIllI(pipeline.get(PacketManager.lIIllIIlIIlIl[PacketManager.lIIllIIlIlIIl[3]]))) {
            pipeline.remove(PacketManager.lIIllIIlIIlIl[PacketManager.lIIllIIlIlIIl[4]]);
        }
    }
    
    public EntityPlayer getEntityPlayer(final PlayerData playerData) {
        return ((CraftPlayer)playerData.getPlayer()).getHandle();
    }
    
    @Override
    public void inject(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (lIIlllIIIIIllI(channel)) {
            channel.eventLoop().execute(PacketManager::lambdaInject);
        }
    }
    
    @Override
    public boolean checkMovement(final PlayerData playerData) {
        throw new UnsupportedOperationException();
    }
    
    public VPacket transform(final boolean b, final ChannelHandlerContext channelHandlerContext, final Packet packet) {
        final EnumProtocol enumProtocol = (EnumProtocol)channelHandlerContext.channel().attr(PacketManager.currentStateAttrKey).get();
        try {
            final EnumProtocol enumProtocol2 = enumProtocol;
            if (lIIlllIIIIlIII(b ? 1 : 0)) {
                return null;
            }
            final Integer a = enumProtocol2.a(EnumProtocolDirection.CLIENTBOUND, packet);
            PacketTransformer[] array;
            if (lIIlllIIIIlIII(b ? 1 : 0)) {
                array = this.incomingRegistry;
                if (3 < 0) {
                    return null;
                }
            }
            else {
                array = this.outgoingRegistry;
            }
            final PacketTransformer packetTransformer = array[toKey(enumProtocol, a)];
            if (lIIlllIIIIIllI(packetTransformer)) {
                VPacket vPacket = (VPacket) packetTransformer.get();
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
    public void updatePing(final PlayerData playerData) {
        this.getEntityPlayer(playerData).ping = playerData.getAveragePing();
    }
    
    @Override
    public boolean isTeleporting(final PlayerData playerData) {
        return (boolean)SafeReflection.fetch(this.PlayerConnection_justTeleported, this.getEntityPlayer(playerData).playerConnection);
    }
    
    private static void lambdaInject(final Channel channel, final PacketHandler packetHandler) {
        final ChannelPipeline pipeline = channel.pipeline();
        if (lIIlllIIIIIllI(pipeline.get(PacketManager.lIIllIIlIIlIl[PacketManager.lIIllIIlIlIIl[5]]))) {
            pipeline.addBefore(PacketManager.lIIllIIlIIlIl[PacketManager.lIIllIIlIlIIl[6]], PacketManager.lIIllIIlIIlIl[PacketManager.lIIllIIlIlIIl[7]], (ChannelHandler)packetHandler);
        }
    }
    
    private static void lIIlllIIIIIIlI() {
        (lIIllIIlIIlIl = new String[PacketManager.lIIllIIlIlIIl[8]])[PacketManager.lIIllIIlIlIIl[2]] = lIIllIlllllIlI("ScgF9DbjAp9WiuSKa09gYg==", "IpQix");
        PacketManager.lIIllIIlIIlIl[PacketManager.lIIllIIlIlIIl[3]] = lIIllIlllllIlI("q3IaJZHPE/Uf6pbM+vv4dw==", "guHkm");
        PacketManager.lIIllIIlIIlIl[PacketManager.lIIllIIlIlIIl[4]] = lIIllIllllllII("Ej/5YqmC5SO5eLj1197bSg==", "Nncah");
        PacketManager.lIIllIIlIIlIl[PacketManager.lIIllIIlIlIIl[5]] = lIIllIllllllII("sWdfb8XJ3VlQjtPOyFSJCw==", "DQWES");
        PacketManager.lIIllIIlIIlIl[PacketManager.lIIllIIlIlIIl[6]] = lIIllIllllllII("9ODf1DHg5trBPqKfSExFuQ==", "SLncs");
        PacketManager.lIIllIIlIIlIl[PacketManager.lIIllIIlIlIIl[7]] = lIIllIlllllIlI("3wNJfy6kXiYgSpUa4gIlcQ==", "wEQpU");
    }
    
    private static String lIIllIllllllII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(PacketManager.lIIllIIlIlIIl[4], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllIlllllIlI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), PacketManager.lIIllIIlIlIIl[0]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(PacketManager.lIIllIIlIlIIl[4], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlllIIIIIlIl() {
        (lIIllIIlIlIIl = new int[9])[0] = 8;
        PacketManager.lIIllIIlIlIIl[1] = 256;
        PacketManager.lIIllIIlIlIIl[2] = 0;
        PacketManager.lIIllIIlIlIIl[3] = 1;
        PacketManager.lIIllIIlIlIIl[4] = 2;
        PacketManager.lIIllIIlIlIIl[5] = 3;
        PacketManager.lIIllIIlIlIIl[6] = 4;
        PacketManager.lIIllIIlIlIIl[7] = 5;
        PacketManager.lIIllIIlIlIIl[8] = 6;
    }
    
    private static boolean lIIlllIIIIIllI(final Object o) {
        return o != null;
    }
    
    private static boolean lIIlllIIIIlIII(final int n) {
        return n != 0;
    }
    
    private static boolean lIIlllIIIIIlll(final int n) {
        return n == 0;
    }
}
