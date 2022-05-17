package me.levansj01.verus.compat.v1_14_R1;

import com.google.common.collect.*;
import me.levansj01.verus.util.java.*;
import net.minecraft.server.v1_14_R1.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ClientBoundPacket
{
    public static final int PLAY_SPAWN_PAINTING_ID;
    public static final int PLAY_KICK_DISCONNECT_ID;
    public static final int PLAY_RESPAWN_ID;
    public static final int PLAY_ENTITY_STATUS_ID;
    public static final int PLAY_SPAWN_OBJECT_ID;
    public static final int PLAY_CHUNK_SINGLE_ID;
    public static final int PLAY_CHAT_ID;
    public static final int PLAY_SCOREBOARD_TEAM_ID;
    public static final int PLAY_ENTITY_HEAD_ROTATION_ID;
    public static final int PLAY_SPAWN_EXP_ORB_ID;
    public static final int PLAY_ENTITY_DESTROY_ID;
    public static final int PLAY_SIGN_EDITOR_ID;
    public static final int PLAY_UPDATE_TIME_ID;
    public static final int PLAY_MAP_ID;
    public static final int PLAY_ENTITY_VELOCITY_ID;
    public static final int PLAY_EXPLOSION_ID;
    public static final int PLAY_EXPERIENCE_ID;
    public static final int PLAY_ENTITY_ATTRIBUTES_ID;
    public static final int PLAY_ABILITIES_ID;
    public static final int PLAY_WINDOW_SET_SLOT_ID;
    public static final int LOGIN_DISCONNECT_ID;
    public static final int PLAY_WINDOW_DATA_ID;
    public static final int PLAY_ENTITY_REL_MOVE_LOOK_ID;
    public static final int PLAY_WORLD_PARTICLES_ID;
    public static final int PLAY_WINDOW_CLOSE_ID;
    public static final int PLAY_ENTITY_TELEPORT_ID;
    public static final int PLAY_UPDATE_HEALTH_ID;
    public static final int STATUS_PONG_ID;
    public static final int PLAY_BLOCK_BREAK_ANIMATION_ID;
    public static final int PLAY_ENTITY_REL_MOVE_ID;
    public static final int LOGIN_SUCCESS_ID;
    public static final int PLAY_PLAYER_INFO_ID;
    public static final int PLAY_POSITION_ID;
    public static final int PLAY_SPAWN_POSITION_ID;
    public static final int PLAY_BLOCK_CHANGE_SINGLE_ID;
    public static final int PLAY_ANIMATION_ID;
    public static final int PLAY_ENTITY_EQUIPMENT_ID;
    public static final int PLAY_LOGIN_ID;
    public static final int STATUS_SERVER_INFO_ID;
    public static final int PLAY_ENTITY_ID;
    public static final int PLAY_ENTITY_EFFECT_REMOVE_ID;
    public static final int PLAY_WINDOW_OPEN_ID;
    public static final int PLAY_ENTITY_EFFECT_ADD_ID;
    public static final int PLAY_KEEP_ALIVE_ID;
    public static final int PLAY_STATISTICS;
    public static final int PLAY_SPAWN_LIVING_ID;
    public static final int PLAY_WORLD_EVENT_ID;
    public static final int PLAY_BLOCK_ACTION_ID;
    public static final int PLAY_TAB_COMPLETE_ID;
    public static final int PLAY_CUSTOM_PAYLOAD_ID;
    public static final int PLAY_WORLD_SOUND_ID;
    public static final int PLAY_GAME_STATE_CHANGE_ID;
    public static final int PLAY_ENTITY_LOOK_ID;
    public static final int PLAY_SPAWN_NAMED_ID;
    public static final int PLAY_SPAWN_WEATHER_ID;
    public static final int PLAY_SCOREBOARD_OBJECTIVE_ID;
    public static final int PLAY_WINDOW_SET_ITEMS_ID;
    public static final int LOGIN_ENCRYPTION_BEGIN_ID;
    public static final int PLAY_ENTITY_METADATA_ID;
    public static final int PLAY_WINDOW_TRANSACTION_ID;
    public static final int PLAY_SCOREBOARD_DISPLAY_SLOT_ID;
    public static final int PLAY_RESOURCE_PACK_ID;
    public static final int PLAY_UPDATE_TILE_ID;
    public static final int PLAY_ENTITY_ATTACH_ID;
    public static final int PLAY_COLLECT_EFFECT_ID;
    public static final int PLAY_HELD_SLOT_ID;
    public static final int PLAY_SCOREBOARD_SCORE_ID;
    public static final int PLAY_BLOCK_CHANGE_MULTI_ID;
    private static final String[] llIlIllIIlIll;
    private static final int[] llIlIllIIllIl;
    
    static {
        llIllIllIlIlll();
        llIllIllIlIIII();
        LOGIN_DISCONNECT_ID = getId(PacketLoginOutDisconnect.class);
        LOGIN_ENCRYPTION_BEGIN_ID = getId(PacketLoginOutEncryptionBegin.class);
        LOGIN_SUCCESS_ID = getId(PacketLoginOutSuccess.class);
        STATUS_SERVER_INFO_ID = getId(PacketStatusOutServerInfo.class);
        STATUS_PONG_ID = getId(PacketStatusOutPong.class);
        PLAY_KEEP_ALIVE_ID = getId(PacketPlayOutKeepAlive.class);
        PLAY_LOGIN_ID = getId(PacketPlayOutLogin.class);
        PLAY_CHAT_ID = getId(PacketPlayOutChat.class);
        PLAY_UPDATE_TIME_ID = getId(PacketPlayOutUpdateTime.class);
        PLAY_ENTITY_EQUIPMENT_ID = getId(PacketPlayOutEntityEquipment.class);
        PLAY_SPAWN_POSITION_ID = getId(PacketPlayOutSpawnPosition.class);
        PLAY_UPDATE_HEALTH_ID = getId(PacketPlayOutUpdateHealth.class);
        PLAY_RESPAWN_ID = getId(PacketPlayOutRespawn.class);
        PLAY_POSITION_ID = getId(PacketPlayOutPosition.class);
        PLAY_HELD_SLOT_ID = getId(PacketPlayOutHeldItemSlot.class);
        PLAY_ANIMATION_ID = getId(PacketPlayOutAnimation.class);
        PLAY_SPAWN_NAMED_ID = getId(PacketPlayOutNamedEntitySpawn.class);
        PLAY_COLLECT_EFFECT_ID = getId(PacketPlayOutCollect.class);
        PLAY_SPAWN_OBJECT_ID = getId(PacketPlayOutSpawnEntity.class);
        PLAY_SPAWN_LIVING_ID = getId(PacketPlayOutSpawnEntityLiving.class);
        PLAY_SPAWN_PAINTING_ID = getId(PacketPlayOutSpawnEntityPainting.class);
        PLAY_SPAWN_EXP_ORB_ID = getId(PacketPlayOutSpawnEntityExperienceOrb.class);
        PLAY_ENTITY_VELOCITY_ID = getId(PacketPlayOutEntityVelocity.class);
        PLAY_ENTITY_DESTROY_ID = getId(PacketPlayOutEntityDestroy.class);
        PLAY_ENTITY_ID = getId(PacketPlayOutEntity.class);
        PLAY_ENTITY_REL_MOVE_ID = getId(PacketPlayOutEntity.PacketPlayOutRelEntityMove.class);
        PLAY_ENTITY_LOOK_ID = getId(PacketPlayOutEntity.PacketPlayOutEntityLook.class);
        PLAY_ENTITY_REL_MOVE_LOOK_ID = getId(PacketPlayOutEntity.PacketPlayOutRelEntityMoveLook.class);
        PLAY_ENTITY_TELEPORT_ID = getId(PacketPlayOutEntityTeleport.class);
        PLAY_ENTITY_HEAD_ROTATION_ID = getId(PacketPlayOutEntityHeadRotation.class);
        PLAY_ENTITY_STATUS_ID = getId(PacketPlayOutEntityStatus.class);
        PLAY_ENTITY_ATTACH_ID = getId(PacketPlayOutAttachEntity.class);
        PLAY_ENTITY_METADATA_ID = getId(PacketPlayOutEntityMetadata.class);
        PLAY_ENTITY_EFFECT_ADD_ID = getId(PacketPlayOutEntityEffect.class);
        PLAY_ENTITY_EFFECT_REMOVE_ID = getId(PacketPlayOutRemoveEntityEffect.class);
        PLAY_EXPERIENCE_ID = getId(PacketPlayOutExperience.class);
        PLAY_ENTITY_ATTRIBUTES_ID = getId(PacketPlayOutUpdateAttributes.class);
        PLAY_CHUNK_SINGLE_ID = getId(PacketPlayOutMapChunk.class);
        PLAY_BLOCK_CHANGE_MULTI_ID = getId(PacketPlayOutMultiBlockChange.class);
        PLAY_BLOCK_CHANGE_SINGLE_ID = getId(PacketPlayOutBlockChange.class);
        PLAY_BLOCK_ACTION_ID = getId(PacketPlayOutBlockAction.class);
        PLAY_BLOCK_BREAK_ANIMATION_ID = getId(PacketPlayOutBlockBreakAnimation.class);
        PLAY_EXPLOSION_ID = getId(PacketPlayOutExplosion.class);
        PLAY_WORLD_EVENT_ID = getId(PacketPlayOutWorldEvent.class);
        PLAY_WORLD_SOUND_ID = getId(PacketPlayOutNamedSoundEffect.class);
        PLAY_WORLD_PARTICLES_ID = getId(PacketPlayOutWorldParticles.class);
        PLAY_GAME_STATE_CHANGE_ID = getId(PacketPlayOutGameStateChange.class);
        PLAY_SPAWN_WEATHER_ID = getId(PacketPlayOutSpawnEntityWeather.class);
        PLAY_WINDOW_OPEN_ID = getId(PacketPlayOutOpenWindow.class);
        PLAY_WINDOW_CLOSE_ID = getId(PacketPlayOutCloseWindow.class);
        PLAY_WINDOW_SET_SLOT_ID = getId(PacketPlayOutSetSlot.class);
        PLAY_WINDOW_SET_ITEMS_ID = getId(PacketPlayOutWindowItems.class);
        PLAY_WINDOW_DATA_ID = getId(PacketPlayOutWindowData.class);
        PLAY_WINDOW_TRANSACTION_ID = getId(PacketPlayOutTransaction.class);
        PLAY_MAP_ID = getId(PacketPlayOutMap.class);
        PLAY_UPDATE_TILE_ID = getId(PacketPlayOutTileEntityData.class);
        PLAY_SIGN_EDITOR_ID = getId(PacketPlayOutOpenSignEditor.class);
        PLAY_STATISTICS = getId(PacketPlayOutStatistic.class);
        PLAY_PLAYER_INFO_ID = getId(PacketPlayOutPlayerInfo.class);
        PLAY_ABILITIES_ID = getId(PacketPlayOutAbilities.class);
        PLAY_TAB_COMPLETE_ID = getId(PacketPlayOutTabComplete.class);
        PLAY_SCOREBOARD_OBJECTIVE_ID = getId(PacketPlayOutScoreboardObjective.class);
        PLAY_SCOREBOARD_SCORE_ID = getId(PacketPlayOutScoreboardScore.class);
        PLAY_SCOREBOARD_DISPLAY_SLOT_ID = getId(PacketPlayOutScoreboardDisplayObjective.class);
        PLAY_SCOREBOARD_TEAM_ID = getId(PacketPlayOutScoreboardTeam.class);
        PLAY_CUSTOM_PAYLOAD_ID = getId(PacketPlayOutCustomPayload.class);
        PLAY_KICK_DISCONNECT_ID = getId(PacketPlayOutKickDisconnect.class);
        PLAY_RESOURCE_PACK_ID = getId(PacketPlayOutResourcePackSend.class);
    }
    
    private static final int getId(final Class clazz) {
        return (int)((Map)SafeReflection.getLocalField(EnumProtocol.class, ((Map)SafeReflection.getLocalField(EnumProtocol.class, null, ClientBoundPacket.llIlIllIIlIll[ClientBoundPacket.llIlIllIIllIl[0]])).get(clazz), ClientBoundPacket.llIlIllIIlIll[ClientBoundPacket.llIlIllIIllIl[1]])).get(EnumProtocolDirection.CLIENTBOUND).inverse().get((Object)clazz);
    }
    
    private static void llIllIllIlIIII() {
        (llIlIllIIlIll = new String[ClientBoundPacket.llIlIllIIllIl[2]])[ClientBoundPacket.llIlIllIIllIl[0]] = llIllIllIIllII("fCu15c8ebJs=", "CqvUr");
        ClientBoundPacket.llIlIllIIlIll[ClientBoundPacket.llIlIllIIllIl[1]] = llIllIllIIllIl("65q0KHA6hgk=", "xEySS");
    }
    
    private static String llIllIllIIllII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(ClientBoundPacket.llIlIllIIllIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIllIllIIllIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), ClientBoundPacket.llIlIllIIllIl[3]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(ClientBoundPacket.llIlIllIIllIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void llIllIllIlIlll() {
        (llIlIllIIllIl = new int[4])[0] = 0;
        ClientBoundPacket.llIlIllIIllIl[1] = 1;
        ClientBoundPacket.llIlIllIIllIl[2] = 2;
        ClientBoundPacket.llIlIllIIllIl[3] = 8;
    }
}
