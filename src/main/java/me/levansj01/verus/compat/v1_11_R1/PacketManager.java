package me.levansj01.verus.compat.v1_11_R1;

import java.lang.reflect.*;
import io.netty.util.*;
import me.levansj01.verus.util.java.*;
import me.levansj01.verus.compat.v1_11_R1.packets.*;
import me.levansj01.verus.data.*;
import org.bukkit.craftbukkit.v1_11_R1.entity.*;
import io.netty.channel.*;
import me.levansj01.verus.compat.*;
import net.minecraft.server.v1_11_R1.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class PacketManager extends me.levansj01.verus.compat.PacketManager
{
    private final PacketTransformer[] outgoingRegistry;
    private final Field PlayerConnection_justTeleported;
    private final PacketTransformer[] incomingRegistry;
    private static final int enumProtocolLength;
    private static final AttributeKey currentStateAttrKey;
    private static final String[] lIIlllIIIlIIl;
    private static final int[] lIIlllIIlIIIl;
    
    public PacketManager() {
        this.incomingRegistry = new PacketTransformer[PacketManager.enumProtocolLength * PacketManager.lIIlllIIlIIIl[0]];
        this.outgoingRegistry = new PacketTransformer[PacketManager.enumProtocolLength * PacketManager.lIIlllIIlIIIl[0]];
        this.PlayerConnection_justTeleported = SafeReflection.access(PlayerConnection.class, PacketManager.lIIlllIIIlIIl[PacketManager.lIIlllIIlIIIl[1]]);
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
    
    @Override
    public boolean isTeleporting(final PlayerData playerData) {
        return (boolean)SafeReflection.fetch(this.PlayerConnection_justTeleported, this.getEntityPlayer(playerData).playerConnection);
    }
    
    @Override
    public void postToMainThread(final Runnable runnable) {
        MinecraftServer.getServer().postToMainThread(runnable);
    }
    
    private static void lambda$inject$219(final Channel channel, final PacketHandler packetHandler) {
        final ChannelPipeline pipeline = channel.pipeline();
        if (lIIlllllllIlII(pipeline.get(PacketManager.lIIlllIIIlIIl[PacketManager.lIIlllIIlIIIl[2]]))) {
            pipeline.addBefore(PacketManager.lIIlllIIIlIIl[PacketManager.lIIlllIIlIIIl[3]], PacketManager.lIIlllIIIlIIl[PacketManager.lIIlllIIlIIIl[4]], (ChannelHandler)packetHandler);
        }
    }
    
    static int toKey(final EnumProtocol enumProtocol, final int n) {
        return enumProtocol.ordinal() << PacketManager.lIIlllIIlIIIl[5] | n;
    }
    
    @Override
    public void cancelPacket() {
        throw CancelledPacketHandleException.INSTANCE;
    }
    
    public void registerIn(final EnumProtocol enumProtocol, final int n, final Class clazz) {
        this.incomingRegistry[toKey(enumProtocol, n)] = new PacketTransformer(clazz);
    }
    
    public void registerOut(final EnumProtocol enumProtocol, final int n, final Class clazz) {
        this.outgoingRegistry[toKey(enumProtocol, n)] = new PacketTransformer(clazz);
    }
    
    static {
        lIIlllllllIIll();
        lIIllllllIlIII();
        enumProtocolLength = EnumProtocol.values().length;
        currentStateAttrKey = NetworkManager.c;
    }
    
    public EntityPlayer getEntityPlayer(final PlayerData playerData) {
        return ((CraftPlayer)playerData.getPlayer()).getHandle();
    }
    
    @Override
    public void uninject(final PlayerData playerData) {
        final PlayerConnection playerConnection = this.getEntityPlayer(playerData).playerConnection;
        if (lIIlllllllIlII(playerConnection) && lIIlllllllIlIl(playerConnection.isDisconnected() ? 1 : 0)) {
            final Channel channel = playerConnection.networkManager.channel;
            channel.eventLoop().execute(PacketManager::lambda$uninject$220);
        }
    }
    
    public VPacket transform(final boolean b, final ChannelHandlerContext channelHandlerContext, final Packet packet) {
        final EnumProtocol enumProtocol = (EnumProtocol)channelHandlerContext.channel().attr(PacketManager.currentStateAttrKey).get();
        try {
            final EnumProtocol enumProtocol2 = enumProtocol;
            EnumProtocolDirection enumProtocolDirection;
            if (lIIlllllllIllI(b ? 1 : 0)) {
                enumProtocolDirection = EnumProtocolDirection.SERVERBOUND;
                if (5 <= 0) {
                    return null;
                }
            }
            else {
                enumProtocolDirection = EnumProtocolDirection.CLIENTBOUND;
            }
            final Integer a = enumProtocol2.a(enumProtocolDirection, packet);
            PacketTransformer[] array;
            if (lIIlllllllIllI(b ? 1 : 0)) {
                array = this.incomingRegistry;
                if (null != null) {
                    return null;
                }
            }
            else {
                array = this.outgoingRegistry;
            }
            final PacketTransformer packetTransformer = array[toKey(enumProtocol, a)];
            if (lIIlllllllIlII(packetTransformer)) {
                final VPacket vPacket = packetTransformer.get();
                vPacket.accept(packet);
                return vPacket;
            }
            if (4 < 0) {
                return null;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    @Override
    public void close(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (lIIlllllllIlII(channel)) {
            channel.close();
        }
    }
    
    @Override
    public boolean inEventLoop(final PlayerData playerData) {
        return this.getEntityPlayer(playerData).playerConnection.networkManager.channel.eventLoop().inEventLoop();
    }
    
    @Override
    public VPacket transform(final boolean b, final Object o, final Object o2) {
        return this.transform(b, (ChannelHandlerContext)o, (Packet)o2);
    }
    
    @Override
    public void inject(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (lIIlllllllIlII(channel)) {
            channel.eventLoop().execute(PacketManager::lambda$inject$219);
        }
    }
    
    @Override
    public void updatePing(final PlayerData playerData) {
        this.getEntityPlayer(playerData).ping = playerData.getAveragePing();
    }
    
    @Override
    public boolean checkMovement(final PlayerData playerData) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void kickForcibly(final PlayerData playerData) {
        final Channel channel = this.getEntityPlayer(playerData).playerConnection.networkManager.channel;
        if (lIIlllllllIlII(channel)) {
            channel.unsafe().closeForcibly();
        }
    }
    
    private static void lambda$uninject$220(final Channel channel) {
        final ChannelPipeline pipeline = channel.pipeline();
        if (lIIlllllllIlII(pipeline.get(PacketManager.lIIlllIIIlIIl[PacketManager.lIIlllIIlIIIl[6]]))) {
            pipeline.remove(PacketManager.lIIlllIIIlIIl[PacketManager.lIIlllIIlIIIl[7]]);
        }
    }
    
    private static void lIIllllllIlIII() {
        (lIIlllIIIlIIl = new String[PacketManager.lIIlllIIlIIIl[8]])[PacketManager.lIIlllIIlIIIl[1]] = lIIlllllIlllll("SUmWL6wwMC5qoI7IRhA9lg==", "Vseby");
        PacketManager.lIIlllIIIlIIl[PacketManager.lIIlllIIlIIIl[2]] = lIIllllllIIIII("KkTtxxMOKUgMe0HpLdThqA==", "eXpkr");
        PacketManager.lIIlllIIIlIIl[PacketManager.lIIlllIIlIIIl[3]] = lIIllllllIIIII("HrsIoj3jKAHpTQU6hxRJ+g==", "LPELG");
        PacketManager.lIIlllIIIlIIl[PacketManager.lIIlllIIlIIIl[4]] = lIIllllllIIlIl("JSohPDd+JzInID8qIQ==", "SOSID");
        PacketManager.lIIlllIIIlIIl[PacketManager.lIIlllIIlIIIl[6]] = lIIllllllIIIII("YuQkEsE0nnqBdWvuKaTA+Q==", "ketwz");
        PacketManager.lIIlllIIIlIIl[PacketManager.lIIlllIIlIIIl[7]] = lIIlllllIlllll("mkjItVWLcWVjsFseJCiJAw==", "lmbnY");
    }
    
    private static String lIIllllllIIIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(PacketManager.lIIlllIIlIIIl[3], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlllllIlllll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), PacketManager.lIIlllIIlIIIl[5]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(PacketManager.lIIlllIIlIIIl[3], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllllllIIlIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = PacketManager.lIIlllIIlIIIl[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = PacketManager.lIIlllIIlIIIl[1];
        while (lIIlllllllIlll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIIlllllllIIll() {
        (lIIlllIIlIIIl = new int[9])[0] = 256;
        PacketManager.lIIlllIIlIIIl[1] = 0;
        PacketManager.lIIlllIIlIIIl[2] = 1;
        PacketManager.lIIlllIIlIIIl[3] = 2;
        PacketManager.lIIlllIIlIIIl[4] = 3;
        PacketManager.lIIlllIIlIIIl[5] = 8;
        PacketManager.lIIlllIIlIIIl[6] = 4;
        PacketManager.lIIlllIIlIIIl[7] = 5;
        PacketManager.lIIlllIIlIIIl[8] = 6;
    }
    
    private static boolean lIIlllllllIlll(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean lIIlllllllIlII(final Object o) {
        return o != null;
    }
    
    private static boolean lIIlllllllIllI(final int n) {
        return n != 0;
    }
    
    private static boolean lIIlllllllIlIl(final int n) {
        return n == 0;
    }
}
