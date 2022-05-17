package me.levansj01.verus.compat.v1_16_R1;

import me.levansj01.verus.util.java.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_16_R1.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public enum ServerBoundPacket
{
    PLAY_ENTITY_ACTION(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[19]], ServerBoundPacket.lIIIIIIIIIIIl[16], (Class)PacketPlayInEntityAction.class);
    
    private final EnumProtocol protocol;
    
    PLAY_UPDATE_SIGN(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[26]], ServerBoundPacket.lIIIIIIIIIIIl[23], (Class)PacketPlayInUpdateSign.class), 
    PLAY_BLOCK_DIG(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[15]], ServerBoundPacket.lIIIIIIIIIIIl[12], (Class)PacketPlayInBlockDig.class), 
    PLAY_POSITION_LOOK(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[14]], ServerBoundPacket.lIIIIIIIIIIIl[11], (Class)PacketPlayInFlying.PacketPlayInPositionLook.class), 
    PLAY_ENCHANT_SELECT(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[25]], ServerBoundPacket.lIIIIIIIIIIIl[22], (Class)PacketPlayInEnchantItem.class), 
    PLAY_TRANSACTION(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[33]], ServerBoundPacket.lIIIIIIIIIIIl[30], (Class)PacketPlayInTransaction.class), 
    PLAY_WINDOW_CLICK(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[22]], ServerBoundPacket.lIIIIIIIIIIIl[19], (Class)PacketPlayInWindowClick.class), 
    PLAY_KEEP_ALIVE(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[8]], ServerBoundPacket.lIIIIIIIIIIIl[5], (Class)PacketPlayInKeepAlive.class), 
    PLAY_ANIMATION(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[18]], ServerBoundPacket.lIIIIIIIIIIIl[15], (Class)PacketPlayInArmAnimation.class), 
    PLAY_VEHICLE_MOVE(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[32]], ServerBoundPacket.lIIIIIIIIIIIl[29], (Class)PacketPlayInVehicleMove.class), 
    PLAY_BLOCK_PLACE(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[16]], ServerBoundPacket.lIIIIIIIIIIIl[13], (Class)PacketPlayInBlockPlace.class), 
    LOGIN_ENCRYPTION_BEGIN(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[7]], ServerBoundPacket.lIIIIIIIIIIIl[4], (Class)PacketLoginInEncryptionBegin.class), 
    LOGIN_START(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[6]], ServerBoundPacket.lIIIIIIIIIIIl[3], (Class)PacketLoginInStart.class), 
    HANDSHAKE_START(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[3]], ServerBoundPacket.lIIIIIIIIIIIl[0], (Class)PacketHandshakingInSetProtocol.class);
    
    private static final ServerBoundPacket[] $VALUES;
    
    PLAY_STEER_VEHICLE(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[20]], ServerBoundPacket.lIIIIIIIIIIIl[17], (Class)PacketPlayInSteerVehicle.class), 
    PLAY_WINDOW_TRANSACTION(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[23]], ServerBoundPacket.lIIIIIIIIIIIl[20], (Class)PacketPlayInTransaction.class), 
    PLAY_WINDOW_CLOSE(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[21]], ServerBoundPacket.lIIIIIIIIIIIl[18], (Class)PacketPlayInCloseWindow.class), 
    PLAY_HELD_SLOT(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[17]], ServerBoundPacket.lIIIIIIIIIIIl[14], (Class)PacketPlayInHeldItemSlot.class), 
    PLAY_CREATIVE_SET_SLOT(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[24]], ServerBoundPacket.lIIIIIIIIIIIl[21], (Class)PacketPlayInSetCreativeSlot.class), 
    STATUS_REQUEST(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[4]], ServerBoundPacket.lIIIIIIIIIIIl[1], (Class)PacketStatusInStart.class), 
    PLAY_SETTINGS(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[29]], ServerBoundPacket.lIIIIIIIIIIIl[26], (Class)PacketPlayInSettings.class), 
    PLAY_CHAT(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[9]], ServerBoundPacket.lIIIIIIIIIIIl[6], (Class)PacketPlayInChat.class), 
    PLAY_CUSTOM_PAYLOAD(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[31]], ServerBoundPacket.lIIIIIIIIIIIl[28], (Class)PacketPlayInCustomPayload.class);
    
    private final int id;
    
    PLAY_TAB_COMPLETE(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[28]], ServerBoundPacket.lIIIIIIIIIIIl[25], (Class)PacketPlayInTabComplete.class), 
    PLAY_POSITION(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[12]], ServerBoundPacket.lIIIIIIIIIIIl[9], (Class)PacketPlayInFlying.PacketPlayInPosition.class), 
    PLAY_CLIENT_COMMAND(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[30]], ServerBoundPacket.lIIIIIIIIIIIl[27], (Class)PacketPlayInClientCommand.class), 
    PLAY_USE_ENTITY(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[10]], ServerBoundPacket.lIIIIIIIIIIIl[7], (Class)PacketPlayInUseEntity.class), 
    PLAY_ABILITIES(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[27]], ServerBoundPacket.lIIIIIIIIIIIl[24], (Class)PacketPlayInAbilities.class), 
    PLAY_LOOK(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[13]], ServerBoundPacket.lIIIIIIIIIIIl[10], (Class)PacketPlayInFlying.PacketPlayInLook.class), 
    PLAY_PLAYER(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[11]], ServerBoundPacket.lIIIIIIIIIIIl[8], (Class)PacketPlayInFlying.class), 
    STATUS_PING(ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[5]], ServerBoundPacket.lIIIIIIIIIIIl[2], (Class)PacketStatusInPing.class);
    
    private static final String[] lllllllllIII;
    private static final int[] lIIIIIIIIIIIl;
    
    public int getId() {
        return this.id;
    }
    
    public Packet get() throws IllegalAccessException, InstantiationException {
        return this.protocol.a(EnumProtocolDirection.SERVERBOUND, this.id);
    }
    
    private ServerBoundPacket(final String s, final int n, final Class clazz) {
        this.protocol = ((Map)SafeReflection.getLocalField(EnumProtocol.class, null, ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[0]])).get(clazz);
        final Object value = ((Map)SafeReflection.getLocalField(EnumProtocol.class, this.protocol, ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[1]])).get(EnumProtocolDirection.SERVERBOUND);
        final Class<?> class1 = value.getClass();
        final String s2 = ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[2]];
        final Class[] array = new Class[ServerBoundPacket.lIIIIIIIIIIIl[1]];
        array[ServerBoundPacket.lIIIIIIIIIIIl[0]] = Class.class;
        final Method access = SafeReflection.access(class1, s2, array);
        final Object o = value;
        final Object[] array2 = new Object[ServerBoundPacket.lIIIIIIIIIIIl[1]];
        array2[ServerBoundPacket.lIIIIIIIIIIIl[0]] = clazz;
        this.id = (int)SafeReflection.execute(access, o, array2);
    }
    
    static {
        lIIIIIlllIIIll();
        lIIIIIllIlllII();
        final ServerBoundPacket[] $values = new ServerBoundPacket[ServerBoundPacket.lIIIIIIIIIIIl[31]];
        $values[ServerBoundPacket.lIIIIIIIIIIIl[0]] = ServerBoundPacket.HANDSHAKE_START;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[1]] = ServerBoundPacket.STATUS_REQUEST;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[2]] = ServerBoundPacket.STATUS_PING;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[3]] = ServerBoundPacket.LOGIN_START;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[4]] = ServerBoundPacket.LOGIN_ENCRYPTION_BEGIN;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[5]] = ServerBoundPacket.PLAY_KEEP_ALIVE;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[6]] = ServerBoundPacket.PLAY_CHAT;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[7]] = ServerBoundPacket.PLAY_USE_ENTITY;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[8]] = ServerBoundPacket.PLAY_PLAYER;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[9]] = ServerBoundPacket.PLAY_POSITION;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[10]] = ServerBoundPacket.PLAY_LOOK;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[11]] = ServerBoundPacket.PLAY_POSITION_LOOK;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[12]] = ServerBoundPacket.PLAY_BLOCK_DIG;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[13]] = ServerBoundPacket.PLAY_BLOCK_PLACE;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[14]] = ServerBoundPacket.PLAY_HELD_SLOT;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[15]] = ServerBoundPacket.PLAY_ANIMATION;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[16]] = ServerBoundPacket.PLAY_ENTITY_ACTION;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[17]] = ServerBoundPacket.PLAY_STEER_VEHICLE;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[18]] = ServerBoundPacket.PLAY_WINDOW_CLOSE;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[19]] = ServerBoundPacket.PLAY_WINDOW_CLICK;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[20]] = ServerBoundPacket.PLAY_WINDOW_TRANSACTION;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[21]] = ServerBoundPacket.PLAY_CREATIVE_SET_SLOT;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[22]] = ServerBoundPacket.PLAY_ENCHANT_SELECT;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[23]] = ServerBoundPacket.PLAY_UPDATE_SIGN;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[24]] = ServerBoundPacket.PLAY_ABILITIES;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[25]] = ServerBoundPacket.PLAY_TAB_COMPLETE;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[26]] = ServerBoundPacket.PLAY_SETTINGS;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[27]] = ServerBoundPacket.PLAY_CLIENT_COMMAND;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[28]] = ServerBoundPacket.PLAY_CUSTOM_PAYLOAD;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[29]] = ServerBoundPacket.PLAY_VEHICLE_MOVE;
        $values[ServerBoundPacket.lIIIIIIIIIIIl[30]] = ServerBoundPacket.PLAY_TRANSACTION;
        $VALUES = $values;
    }
    
    public static void init() {
    }
    
    private static void lIIIIIllIlllII() {
        (lllllllllIII = new String[ServerBoundPacket.lIIIIIIIIIIIl[34]])[ServerBoundPacket.lIIIIIIIIIIIl[0]] = lIIIIIllIlIIII("k9+XeIXdkbE=", "zBZdG");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[1]] = lIIIIIllIlIIIl("8R5VBINfT58=", "ZyJIX");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[2]] = lIIIIIllIlIIlI("CQ==", "hKZcw");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[3]] = lIIIIIllIlIIIl("Dey3P+moUrQ0o5PHY+ATtA==", "DSelH");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[4]] = lIIIIIllIlIIIl("/edL7HzjqzMbPIFTW92YZQ==", "lJuFb");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[5]] = lIIIIIllIlIIlI("CzELPhQLOhojDx8=", "XeJjA");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[6]] = lIIIIIllIlIIII("CVPIbnPDCN0iBEfr0WHdIA==", "GlwMm");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[7]] = lIIIIIllIlIIlI("OgUzBzQpDzoNKC8aIAc1OBU2Cz0/BA==", "vJtNz");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[8]] = lIIIIIllIlIIII("c7bZMpJZbmgl0xlFJn6USQ==", "hFBhS");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[9]] = lIIIIIllIlIIII("f0XWQKPj+QwhLYy/v8459g==", "pcZPV");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[10]] = lIIIIIllIlIIlI("OAQtLTY9GykrLCYcJSAw", "hHlti");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[11]] = lIIIIIllIlIIII("8OdUnSxImXGqJtRVuESXqg==", "NyzBA");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[12]] = lIIIIIllIlIIIl("ELX8MjtZKgc984q6iM4RRQ==", "pvLAa");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[13]] = lIIIIIllIlIIII("+2OpeuJWJuhi2ydWckyEzA==", "AVprN");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[14]] = lIIIIIllIlIIII("88mh+vMzD+mdXovupXU0xKFjZW3H5APW", "vTGRI");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[15]] = lIIIIIllIlIIII("KxlcdSPK3zGfHrhy68AzLQ==", "ldLPK");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[16]] = lIIIIIllIlIIIl("4FbkEteT8lREa5hDnKLwsLo5mlv7vd2V", "MLzol");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[17]] = lIIIIIllIlIIIl("PIjbOpvEeImn2RWTbQcmUQ==", "SKqJp");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[18]] = lIIIIIllIlIIII("YwquXiri9Z9a8CibUu+uuw==", "YpUVw");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[19]] = lIIIIIllIlIIII("sDpU9jDhHiP5JppZOnJ7ugmzStoSheXm", "QTFJK");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[20]] = lIIIIIllIlIIlI("Kg4SPDMpFhYgPiUUFi0lOQ4W", "zBSel");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[21]] = lIIIIIllIlIIIl("u9KLu31zC4pmb6GE/ekcXOxeQn8jahHq", "AYZxq");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[22]] = lIIIIIllIlIIII("x5Cm4vaSbKANpG1WvhTOtln4cUdMM35U", "wiAld");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[23]] = lIIIIIllIlIIII("Td1f5BDgjPyu/ndGT2SCvgiQSudwY4Q6", "fKCJT");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[24]] = lIIIIIllIlIIlI("MQMMGi8iHQgCJCgZCBwjJBsSEDwuGw==", "aOMCp");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[25]] = lIIIIIllIlIIlI("GxwPLTQOHg08KgUEEScuBxUNIA==", "KPNtk");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[26]] = lIIIIIllIlIIlI("Fwg0KTUSFDExPgIbJjktCQ==", "GDupj");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[27]] = lIIIIIllIlIIIl("/rCsxw9CCz2VwJlNL+AFlQ==", "WgFDe");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[28]] = lIIIIIllIlIIlI("HQcACy8ZCgMNMwIGER41GQ4=", "MKARp");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[29]] = lIIIIIllIlIIIl("eJZHJ64lvv5kCgm59eK+oQ==", "GnPQj");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[30]] = lIIIIIllIlIIIl("UMBNQ8BcR9LovL8wJaIn0WbV3qWtsBKJ", "GAscj");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[31]] = lIIIIIllIlIIlI("JB8PMDs3Bh09KzkMHig9OBwPLQ==", "tSNid");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[32]] = lIIIIIllIlIIlI("NAE7PxcyCDIvCygIJSsHMgg=", "dMzfH");
        ServerBoundPacket.lllllllllIII[ServerBoundPacket.lIIIIIIIIIIIl[33]] = lIIIIIllIlIIII("cI95N+wMTqiZylLD1fFpjw4+ZLU6mVgf", "kDWPZ");
    }
    
    private static String lIIIIIllIlIIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), ServerBoundPacket.lIIIIIIIIIIIl[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(ServerBoundPacket.lIIIIIIIIIIIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIIllIlIIlI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = ServerBoundPacket.lIIIIIIIIIIIl[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = ServerBoundPacket.lIIIIIIIIIIIl[0];
        while (lIIIIIlllIIlII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIIIIIllIlIIIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(ServerBoundPacket.lIIIIIIIIIIIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIlllIIIll() {
        (lIIIIIIIIIIIl = new int[35])[0] = 0;
        ServerBoundPacket.lIIIIIIIIIIIl[1] = 1;
        ServerBoundPacket.lIIIIIIIIIIIl[2] = 2;
        ServerBoundPacket.lIIIIIIIIIIIl[3] = 3;
        ServerBoundPacket.lIIIIIIIIIIIl[4] = 4;
        ServerBoundPacket.lIIIIIIIIIIIl[5] = 5;
        ServerBoundPacket.lIIIIIIIIIIIl[6] = 6;
        ServerBoundPacket.lIIIIIIIIIIIl[7] = 7;
        ServerBoundPacket.lIIIIIIIIIIIl[8] = 8;
        ServerBoundPacket.lIIIIIIIIIIIl[9] = 9;
        ServerBoundPacket.lIIIIIIIIIIIl[10] = 10;
        ServerBoundPacket.lIIIIIIIIIIIl[11] = 11;
        ServerBoundPacket.lIIIIIIIIIIIl[12] = 12;
        ServerBoundPacket.lIIIIIIIIIIIl[13] = 13;
        ServerBoundPacket.lIIIIIIIIIIIl[14] = 14;
        ServerBoundPacket.lIIIIIIIIIIIl[15] = 15;
        ServerBoundPacket.lIIIIIIIIIIIl[16] = 16;
        ServerBoundPacket.lIIIIIIIIIIIl[17] = 17;
        ServerBoundPacket.lIIIIIIIIIIIl[18] = 18;
        ServerBoundPacket.lIIIIIIIIIIIl[19] = 19;
        ServerBoundPacket.lIIIIIIIIIIIl[20] = 20;
        ServerBoundPacket.lIIIIIIIIIIIl[21] = 21;
        ServerBoundPacket.lIIIIIIIIIIIl[22] = 22;
        ServerBoundPacket.lIIIIIIIIIIIl[23] = 23;
        ServerBoundPacket.lIIIIIIIIIIIl[24] = 24;
        ServerBoundPacket.lIIIIIIIIIIIl[25] = 25;
        ServerBoundPacket.lIIIIIIIIIIIl[26] = 26;
        ServerBoundPacket.lIIIIIIIIIIIl[27] = 27;
        ServerBoundPacket.lIIIIIIIIIIIl[28] = 28;
        ServerBoundPacket.lIIIIIIIIIIIl[29] = 29;
        ServerBoundPacket.lIIIIIIIIIIIl[30] = 30;
        ServerBoundPacket.lIIIIIIIIIIIl[31] = 31;
        ServerBoundPacket.lIIIIIIIIIIIl[32] = 32;
        ServerBoundPacket.lIIIIIIIIIIIl[33] = 33;
        ServerBoundPacket.lIIIIIIIIIIIl[34] = 34;
    }
    
    private static boolean lIIIIIlllIIlII(final int n, final int n2) {
        return n < n2;
    }
}
