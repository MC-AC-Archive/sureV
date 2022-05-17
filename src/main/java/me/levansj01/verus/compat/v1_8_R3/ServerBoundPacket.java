package me.levansj01.verus.compat.v1_8_R3;

import java.util.*;
import me.levansj01.verus.util.java.*;
import com.google.common.collect.*;
import net.minecraft.server.v1_8_R3.*;

public enum ServerBoundPacket
{
    PLAY_WINDOW_CLICK("PLAY_WINDOW_CLICK", 19, (Class)PacketPlayInWindowClick.class), 
    HANDSHAKE_START("HANDSHAKE_START", 0, (Class)PacketHandshakingInSetProtocol.class), 
    PLAY_ABILITIES("PLAY_ABILITIES", 24, (Class)PacketPlayInAbilities.class), 
    PLAY_BLOCK_DIG("PLAY_BLOCK_DIG", 12, (Class)PacketPlayInBlockDig.class),
    PLAY_CHAT("PLAY_CHAT", 6, (Class)PacketPlayInChat.class), 
    PLAY_ENTITY_ACTION("PLAY_ENTITY_ACTION", 16, (Class)PacketPlayInEntityAction.class),
    PLAY_POSITION("PLAY_POSITION", 9, (Class)PacketPlayInFlying.PacketPlayInPosition.class), 
    PLAY_ANIMATION("PLAY_ANIMATION", 15, (Class)PacketPlayInArmAnimation.class), 
    PLAY_TRANSACTION("PLAY_TRANSACTION", 29, (Class)PacketPlayInTransaction.class), 
    PLAY_LOOK("PLAY_LOOK", 10, (Class)PacketPlayInFlying.PacketPlayInLook.class), 
    STATUS_PING("STATUS_PING", 2, (Class)PacketStatusInPing.class), 
    PLAY_ENCHANT_SELECT("PLAY_ENCHANT_SELECT", 22, (Class)PacketPlayInEnchantItem.class), 
    PLAY_CLIENT_COMMAND("PLAY_CLIENT_COMMAND", 27, (Class)PacketPlayInClientCommand.class), 
    PLAY_POSITION_LOOK("PLAY_POSITION_LOOK", 11, (Class)PacketPlayInFlying.PacketPlayInPositionLook.class), 
    PLAY_KEEP_ALIVE("PLAY_KEEP_ALIVE", 5, (Class)PacketPlayInKeepAlive.class), 
    PLAY_BLOCK_PLACE("PLAY_BLOCK_PLACE", 13, (Class)PacketPlayInBlockPlace.class), 
    PLAY_SETTINGS("PLAY_SETTINGS", 26, (Class)PacketPlayInSettings.class), 
    PLAY_UPDATE_SIGN("PLAY_UPDATE_SIGN", 23, (Class)PacketPlayInUpdateSign.class), 
    PLAY_CREATIVE_SET_SLOT("PLAY_CREATIVE_SET_SLOT", 21, (Class)PacketPlayInSetCreativeSlot.class), 
    LOGIN_ENCRYPTION_BEGIN("LOGIN_ENCRYPTION_BEGIN", 4, (Class)PacketLoginInEncryptionBegin.class), 
    PLAY_WINDOW_TRANSACTION("PLAY_WINDOW_TRANSACTION", 20, (Class)PacketPlayInTransaction.class), 
    STATUS_REQUEST("STATUS_REQUEST", 1, (Class)PacketStatusInStart.class), 
    PLAY_CUSTOM_PAYLOAD("PLAY_CUSTOM_PAYLOAD", 28, (Class)PacketPlayInCustomPayload.class), 
    LOGIN_START("LOGIN_START", 3, (Class)PacketLoginInStart.class),
    PLAY_USE_ENTITY("PLAY_USE_ENTITY", 7, (Class)PacketPlayInUseEntity.class), 
    PLAY_HELD_SLOT("PLAY_HELD_SLOT", 14, (Class)PacketPlayInHeldItemSlot.class), 
    PLAY_TAB_COMPLETE("PLAY_TAB_COMPLETE", 25, (Class)PacketPlayInTabComplete.class), 
    PLAY_WINDOW_CLOSE("PLAY_WINDOW_CLOSE", 18, (Class)PacketPlayInCloseWindow.class), 
    PLAY_STEER_VEHICLE("PLAY_STEER_VEHICLE", 17, (Class)PacketPlayInSteerVehicle.class), 
    PLAY_PLAYER("PLAY_PLAYER", 8, (Class)PacketPlayInFlying.class);

    private final EnumProtocol protocol;
    private final int id;

    public int getId() {
        return this.id;
    }
    
    public static void init() {
    }
    
    ServerBoundPacket(final String s, final int n, final Class clazz) {
        this.protocol = ((Map)SafeReflection.getLocalField(EnumProtocol.class, null, "h")).get(clazz);
        this.id = (int)((Map)SafeReflection.getLocalField(EnumProtocol.class, this.protocol, "j")).get(EnumProtocolDirection.SERVERBOUND).inverse().get((Object)clazz);
    }
    
    public Packet get() throws IllegalAccessException, InstantiationException {
        return this.protocol.a(EnumProtocolDirection.SERVERBOUND, this.id);
    }
}
