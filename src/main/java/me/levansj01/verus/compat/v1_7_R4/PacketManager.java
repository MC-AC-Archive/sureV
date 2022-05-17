package me.levansj01.verus.compat.v1_7_R4;

import java.lang.reflect.*;
import net.minecraft.util.io.netty.util.*;
import me.levansj01.verus.data.*;
import me.levansj01.verus.util.java.*;
import me.levansj01.verus.compat.*;
import net.minecraft.util.io.netty.channel.*;
import net.minecraft.server.v1_7_R4.*;
import org.bukkit.craftbukkit.v1_7_R4.entity.*;
import me.levansj01.verus.compat.v1_7_R4.packets.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class PacketManager extends me.levansj01.verus.compat.PacketManager
{
    private final PacketTransformer[] outgoingRegistry;
    private final Field PlayerConnection_justTeleported;
    private final Field PlayerConnection_checkMovement;
    private static final Field channel_field;
    private final PacketTransformer[] incomingRegistry;
    private static final int enumProtocolLength;
    private static final AttributeKey currentStateAttrKey;
    private static final String[] llIlllIIIIlIl;
    private static final int[] llIlllIIIIllI;
    
    @Override
    public void close(final PlayerData playerData) {
        final Channel channel = this.getChannel(playerData);
        if (lllIIIIIllllll(channel)) {
            channel.close();
        }
    }
    
    private static void lambda$uninject$192(final Channel channel) {
        final ChannelPipeline pipeline = channel.pipeline();
        if (lllIIIIIllllll(pipeline.get(PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[0]]))) {
            pipeline.remove(PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[1]]);
        }
    }
    
    @Override
    public void postToMainThread(final Runnable runnable) {
        MinecraftServer.getServer().processQueue.add(runnable);
    }
    
    private static void lambda$inject$191(final Channel channel, final PacketHandler packetHandler) {
        final ChannelPipeline pipeline = channel.pipeline();
        if (lllIIIIIllllll(pipeline.get(PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[2]]))) {
            pipeline.addBefore(PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[3]], PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[4]], (ChannelHandler)packetHandler);
        }
    }
    
    static {
        lllIIIIIlllllI();
        lllIIIIIllllIl();
        enumProtocolLength = EnumProtocol.values().length;
        currentStateAttrKey = NetworkManager.d;
        final Class<NetworkManager> clazz = NetworkManager.class;
        final String[] array = new String[PacketManager.llIlllIIIIllI[3]];
        array[PacketManager.llIlllIIIIllI[0]] = PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[5]];
        array[PacketManager.llIlllIIIIllI[1]] = PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[6]];
        array[PacketManager.llIlllIIIIllI[2]] = PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[7]];
        channel_field = SafeReflection.access(clazz, array);
    }
    
    @Override
    public void kickForcibly(final PlayerData playerData) {
        final Channel channel = this.getChannel(playerData);
        if (lllIIIIIllllll(channel)) {
            channel.unsafe().closeForcibly();
        }
    }
    
    @Override
    public void uninject(final PlayerData playerData) {
        final PlayerConnection playerConnection = this.getEntityPlayer(playerData).playerConnection;
        if (lllIIIIIllllll(playerConnection) && lllIIIIlIIIIII(playerConnection.isDisconnected() ? 1 : 0)) {
            final Channel channel = this.getChannel(playerData);
            channel.eventLoop().execute(PacketManager::lambda$uninject$192);
        }
    }
    
    @Override
    public VPacket transform(final boolean b, final Object o, final Object o2) {
        return this.transform(b, (ChannelHandlerContext)o, (Packet)o2);
    }
    
    @Override
    public void cancelPacket() {
        throw new IllegalArgumentException(PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[8]]);
    }
    
    @Override
    public void inject(final PlayerData playerData) {
        final Channel channel = this.getChannel(playerData);
        if (lllIIIIIllllll(channel)) {
            channel.eventLoop().execute(PacketManager::lambda$inject$191);
        }
    }
    
    @Override
    public boolean inEventLoop(final PlayerData playerData) {
        return this.getChannel(playerData).eventLoop().inEventLoop();
    }
    
    public EntityPlayer getEntityPlayer(final PlayerData playerData) {
        return ((CraftPlayer)playerData.getPlayer()).getHandle();
    }
    
    @Override
    public void updatePing(final PlayerData playerData) {
        this.getEntityPlayer(playerData).ping = playerData.getAveragePing();
    }
    
    @Override
    public boolean checkMovement(final PlayerData playerData) {
        return (boolean)SafeReflection.fetch(this.PlayerConnection_checkMovement, this.getEntityPlayer(playerData).playerConnection);
    }
    
    public void registerOut(final EnumProtocol enumProtocol, final int n, final Class clazz) {
        this.outgoingRegistry[toKey(enumProtocol, n)] = new PacketTransformer(clazz);
    }
    
    @Override
    public boolean isTeleporting(final PlayerData playerData) {
        return (boolean)SafeReflection.fetch(this.PlayerConnection_justTeleported, this.getEntityPlayer(playerData).playerConnection);
    }
    
    public Channel getChannel(final PlayerData playerData) {
        return (Channel)SafeReflection.fetch(PacketManager.channel_field, this.getEntityPlayer(playerData).playerConnection.networkManager);
    }
    
    public VPacket transform(final boolean b, final ChannelHandlerContext channelHandlerContext, final Packet packet) {
        final EnumProtocol enumProtocol = (EnumProtocol)channelHandlerContext.channel().attr(PacketManager.currentStateAttrKey).get();
        final Integer n = (Integer)enumProtocol.b(b).inverse().get((Object)packet.getClass());
        PacketTransformer[] array;
        if (lllIIIIlIIIIIl(b ? 1 : 0)) {
            array = this.incomingRegistry;
            if (-1 > 2) {
                return null;
            }
        }
        else {
            array = this.outgoingRegistry;
        }
        final PacketTransformer packetTransformer = array[toKey(enumProtocol, n)];
        if (lllIIIIIllllll(packetTransformer)) {
            final VPacket vPacket = packetTransformer.get();
            vPacket.accept(packet);
            return vPacket;
        }
        return null;
    }
    
    static int toKey(final EnumProtocol enumProtocol, final int n) {
        return enumProtocol.ordinal() << PacketManager.llIlllIIIIllI[8] | n;
    }
    
    public PacketManager() {
        this.incomingRegistry = new PacketTransformer[PacketManager.enumProtocolLength * PacketManager.llIlllIIIIllI[9]];
        this.outgoingRegistry = new PacketTransformer[PacketManager.enumProtocolLength * PacketManager.llIlllIIIIllI[9]];
        this.PlayerConnection_justTeleported = SafeReflection.access(PlayerConnection.class, PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[10]]);
        this.PlayerConnection_checkMovement = SafeReflection.access(PlayerConnection.class, PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[11]]);
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
    
    private static void lllIIIIIllllIl() {
        (llIlllIIIIlIl = new String[PacketManager.llIlllIIIIllI[12]])[PacketManager.llIlllIIIIllI[0]] = lllIIIIIlllIlI("ma1tNMdRtf27wpnBK0Qw5A==", "qgkHF");
        PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[1]] = lllIIIIIlllIlI("vj1UeXFB5cPwXLtHNlr3gw==", "dcbvX");
        PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[2]] = lllIIIIIlllIll("wpK20WYI8BhpNiN9EGGH7w==", "DYxiC");
        PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[3]] = lllIIIIIllllII("AxYCPS4HKAk3JRcbBCQ=", "swaVK");
        PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[4]] = lllIIIIIlllIll("n/yMrJvz9i81co6/nI5dmg==", "pRRrO");
        PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[5]] = lllIIIIIllllII("PQ==", "PJVnu");
        PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[6]] = lllIIIIIllllII("Bh0MAQMgGQ==", "Eumom");
        PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[7]] = lllIIIIIlllIll("1YVN+L/qOwE=", "foBZV");
        PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[8]] = lllIIIIIlllIlI("Wn9e56KgEiUGVDDM8GeR/WRae3YhMPbuBtCQVfrfySz8A+3AyO/xBjC+3ZBO3mWLE+gL3uJSHwWrN/piac4ZPxUN2CxvX/og", "gTixN");
        PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[10]] = lllIIIIIlllIlI("R2dvStm/E+iqrfLa0d0RJg==", "zRPzB");
        PacketManager.llIlllIIIIlIl[PacketManager.llIlllIIIIllI[11]] = lllIIIIIlllIlI("f+2mJrK+fCGRHJlcb1OcNg==", "KZfJi");
    }
    
    private static String lllIIIIIlllIlI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), PacketManager.llIlllIIIIllI[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(PacketManager.llIlllIIIIllI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIIIIlllIll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(PacketManager.llIlllIIIIllI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIIIIllllII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = PacketManager.llIlllIIIIllI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = PacketManager.llIlllIIIIllI[0];
        while (lllIIIIlIIIIlI(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (3 < 1) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lllIIIIIlllllI() {
        (llIlllIIIIllI = new int[13])[0] = 0;
        PacketManager.llIlllIIIIllI[1] = 1;
        PacketManager.llIlllIIIIllI[2] = 2;
        PacketManager.llIlllIIIIllI[3] = 3;
        PacketManager.llIlllIIIIllI[4] = 4;
        PacketManager.llIlllIIIIllI[5] = 5;
        PacketManager.llIlllIIIIllI[6] = 6;
        PacketManager.llIlllIIIIllI[7] = 7;
        PacketManager.llIlllIIIIllI[8] = 8;
        PacketManager.llIlllIIIIllI[9] = 256;
        PacketManager.llIlllIIIIllI[10] = 9;
        PacketManager.llIlllIIIIllI[11] = 10;
        PacketManager.llIlllIIIIllI[12] = 11;
    }
    
    private static boolean lllIIIIlIIIIlI(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean lllIIIIIllllll(final Object o) {
        return o != null;
    }
    
    private static boolean lllIIIIlIIIIIl(final int n) {
        return n != 0;
    }
    
    private static boolean lllIIIIlIIIIII(final int n) {
        return n == 0;
    }
}
