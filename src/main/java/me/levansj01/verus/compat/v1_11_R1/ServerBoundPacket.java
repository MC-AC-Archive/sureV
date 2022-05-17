package me.levansj01.verus.compat.v1_11_R1;

import me.levansj01.verus.util.java.*;
import com.google.common.collect.*;
import net.minecraft.server.v1_11_R1.*;
import net.minecraft.server.v1_8_R3.EnumProtocol;
import net.minecraft.server.v1_8_R3.EnumProtocolDirection;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public enum ServerBoundPacket
{
    HANDSHAKE_START(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[2]], ServerBoundPacket.llllIlllIIIl[0], (Class)PacketHandshakingInSetProtocol.class), 
    PLAY_POSITION_LOOK(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[13]], ServerBoundPacket.llllIlllIIIl[11], (Class)PacketPlayInFlying.PacketPlayInPositionLook.class), 
    STATUS_REQUEST(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[3]], ServerBoundPacket.llllIlllIIIl[1], (Class)PacketStatusInStart.class), 
    PLAY_KEEP_ALIVE(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[7]], ServerBoundPacket.llllIlllIIIl[5], (Class)PacketPlayInKeepAlive.class), 
    PLAY_CUSTOM_PAYLOAD(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[30]], ServerBoundPacket.llllIlllIIIl[28], (Class)PacketPlayInCustomPayload.class), 
    PLAY_BLOCK_DIG(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[14]], ServerBoundPacket.llllIlllIIIl[12], (Class)PacketPlayInBlockDig.class), 
    PLAY_STEER_VEHICLE(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[19]], ServerBoundPacket.llllIlllIIIl[17], (Class)PacketPlayInSteerVehicle.class), 
    PLAY_TAB_COMPLETE(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[27]], ServerBoundPacket.llllIlllIIIl[25], (Class)PacketPlayInTabComplete.class), 
    LOGIN_ENCRYPTION_BEGIN(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[6]], ServerBoundPacket.llllIlllIIIl[4], (Class)PacketLoginInEncryptionBegin.class), 
    PLAY_UPDATE_SIGN(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[25]], ServerBoundPacket.llllIlllIIIl[23], (Class)PacketPlayInUpdateSign.class), 
    PLAY_HELD_SLOT(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[16]], ServerBoundPacket.llllIlllIIIl[14], (Class)PacketPlayInHeldItemSlot.class), 
    PLAY_TRANSACTION(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[33]], ServerBoundPacket.llllIlllIIIl[31], (Class)PacketPlayInTransaction.class),
    PLAY_WINDOW_TRANSACTION(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[22]], ServerBoundPacket.llllIlllIIIl[20], (Class)PacketPlayInTransaction.class), 
    PLAY_ENTITY_ACTION(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[18]], ServerBoundPacket.llllIlllIIIl[16], (Class)PacketPlayInEntityAction.class),
    PLAY_ABILITIES(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[26]], ServerBoundPacket.llllIlllIIIl[24], (Class)PacketPlayInAbilities.class), 
    STATUS_PING(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[4]], ServerBoundPacket.llllIlllIIIl[2], (Class)PacketStatusInPing.class), 
    PLAY_BLOCK_PLACE(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[15]], ServerBoundPacket.llllIlllIIIl[13], (Class)PacketPlayInBlockPlace.class), 
    PLAY_WINDOW_CLICK(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[21]], ServerBoundPacket.llllIlllIIIl[19], (Class)PacketPlayInWindowClick.class), 
    PLAY_CLIENT_COMMAND(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[29]], ServerBoundPacket.llllIlllIIIl[27], (Class)PacketPlayInClientCommand.class), 
    PLAY_ENCHANT_SELECT(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[24]], ServerBoundPacket.llllIlllIIIl[22], (Class)PacketPlayInEnchantItem.class), 
    LOGIN_START(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[5]], ServerBoundPacket.llllIlllIIIl[3], (Class)PacketLoginInStart.class), 
    PLAY_CHAT(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[8]], ServerBoundPacket.llllIlllIIIl[6], (Class)PacketPlayInChat.class), 
    PLAY_SETTINGS(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[28]], ServerBoundPacket.llllIlllIIIl[26], (Class)PacketPlayInSettings.class), 
    PLAY_ANIMATION(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[17]], ServerBoundPacket.llllIlllIIIl[15], (Class)PacketPlayInArmAnimation.class),
    PLAY_CREATIVE_SET_SLOT(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[23]], ServerBoundPacket.llllIlllIIIl[21], (Class)PacketPlayInSetCreativeSlot.class), 
    PLAY_VEHICLE_MOVE(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[31]], ServerBoundPacket.llllIlllIIIl[29], (Class)PacketPlayInVehicleMove.class), 
    PLAY_LOOK(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[12]], ServerBoundPacket.llllIlllIIIl[10], (Class)PacketPlayInFlying.PacketPlayInLook.class), 
    PLAY_WINDOW_CLOSE(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[20]], ServerBoundPacket.llllIlllIIIl[18], (Class)PacketPlayInCloseWindow.class), 
    PLAY_POSITION(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[11]], ServerBoundPacket.llllIlllIIIl[9], (Class)PacketPlayInFlying.PacketPlayInPosition.class), 
    PLAY_PLAYER(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[10]], ServerBoundPacket.llllIlllIIIl[8], (Class)PacketPlayInFlying.class), 
    PLAY_USE_ENTITY(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[9]], ServerBoundPacket.llllIlllIIIl[7], (Class)PacketPlayInUseEntity.class), 
    PLAY_USE_ITEM(ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[32]], ServerBoundPacket.llllIlllIIIl[30], (Class)PacketPlayInUseItem.class);


    private final EnumProtocol protocol;
    private final int id;
    private static String[] llllIllIIlll;
    private static int[] llllIlllIIIl;
    
    public static void init() {
    }
    
    ServerBoundPacket(final String s, final int n, final Class clazz) {
        this.protocol = ((Map)SafeReflection.getLocalField(EnumProtocol.class, null, ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[0]])).get(clazz);
        this.id = (int)((Map)SafeReflection.getLocalField(EnumProtocol.class, this.protocol, ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[1]])).get(EnumProtocolDirection.SERVERBOUND).inverse().get((Object)clazz);
    }
    
    public Packet get() throws IllegalAccessException, InstantiationException {
        return this.protocol.a(EnumProtocolDirection.SERVERBOUND, this.id);
    }
    
    public int getId() {
        return this.id;
    }
    
    static {
        lllllIlllllll();
        lllllIlllIlll();
        final ServerBoundPacket[] $values = new ServerBoundPacket[ServerBoundPacket.llllIlllIIIl[32]];
        $values[ServerBoundPacket.llllIlllIIIl[0]] = ServerBoundPacket.HANDSHAKE_START;
        $values[ServerBoundPacket.llllIlllIIIl[1]] = ServerBoundPacket.STATUS_REQUEST;
        $values[ServerBoundPacket.llllIlllIIIl[2]] = ServerBoundPacket.STATUS_PING;
        $values[ServerBoundPacket.llllIlllIIIl[3]] = ServerBoundPacket.LOGIN_START;
        $values[ServerBoundPacket.llllIlllIIIl[4]] = ServerBoundPacket.LOGIN_ENCRYPTION_BEGIN;
        $values[ServerBoundPacket.llllIlllIIIl[5]] = ServerBoundPacket.PLAY_KEEP_ALIVE;
        $values[ServerBoundPacket.llllIlllIIIl[6]] = ServerBoundPacket.PLAY_CHAT;
        $values[ServerBoundPacket.llllIlllIIIl[7]] = ServerBoundPacket.PLAY_USE_ENTITY;
        $values[ServerBoundPacket.llllIlllIIIl[8]] = ServerBoundPacket.PLAY_PLAYER;
        $values[ServerBoundPacket.llllIlllIIIl[9]] = ServerBoundPacket.PLAY_POSITION;
        $values[ServerBoundPacket.llllIlllIIIl[10]] = ServerBoundPacket.PLAY_LOOK;
        $values[ServerBoundPacket.llllIlllIIIl[11]] = ServerBoundPacket.PLAY_POSITION_LOOK;
        $values[ServerBoundPacket.llllIlllIIIl[12]] = ServerBoundPacket.PLAY_BLOCK_DIG;
        $values[ServerBoundPacket.llllIlllIIIl[13]] = ServerBoundPacket.PLAY_BLOCK_PLACE;
        $values[ServerBoundPacket.llllIlllIIIl[14]] = ServerBoundPacket.PLAY_HELD_SLOT;
        $values[ServerBoundPacket.llllIlllIIIl[15]] = ServerBoundPacket.PLAY_ANIMATION;
        $values[ServerBoundPacket.llllIlllIIIl[16]] = ServerBoundPacket.PLAY_ENTITY_ACTION;
        $values[ServerBoundPacket.llllIlllIIIl[17]] = ServerBoundPacket.PLAY_STEER_VEHICLE;
        $values[ServerBoundPacket.llllIlllIIIl[18]] = ServerBoundPacket.PLAY_WINDOW_CLOSE;
        $values[ServerBoundPacket.llllIlllIIIl[19]] = ServerBoundPacket.PLAY_WINDOW_CLICK;
        $values[ServerBoundPacket.llllIlllIIIl[20]] = ServerBoundPacket.PLAY_WINDOW_TRANSACTION;
        $values[ServerBoundPacket.llllIlllIIIl[21]] = ServerBoundPacket.PLAY_CREATIVE_SET_SLOT;
        $values[ServerBoundPacket.llllIlllIIIl[22]] = ServerBoundPacket.PLAY_ENCHANT_SELECT;
        $values[ServerBoundPacket.llllIlllIIIl[23]] = ServerBoundPacket.PLAY_UPDATE_SIGN;
        $values[ServerBoundPacket.llllIlllIIIl[24]] = ServerBoundPacket.PLAY_ABILITIES;
        $values[ServerBoundPacket.llllIlllIIIl[25]] = ServerBoundPacket.PLAY_TAB_COMPLETE;
        $values[ServerBoundPacket.llllIlllIIIl[26]] = ServerBoundPacket.PLAY_SETTINGS;
        $values[ServerBoundPacket.llllIlllIIIl[27]] = ServerBoundPacket.PLAY_CLIENT_COMMAND;
        $values[ServerBoundPacket.llllIlllIIIl[28]] = ServerBoundPacket.PLAY_CUSTOM_PAYLOAD;
        $values[ServerBoundPacket.llllIlllIIIl[29]] = ServerBoundPacket.PLAY_VEHICLE_MOVE;
        $values[ServerBoundPacket.llllIlllIIIl[30]] = ServerBoundPacket.PLAY_USE_ITEM;
        $values[ServerBoundPacket.llllIlllIIIl[31]] = ServerBoundPacket.PLAY_TRANSACTION;
        $VALUES = $values;
    }
    
    private static void lllllIlllIlll() {
        (llllIllIIlll = new String[ServerBoundPacket.llllIlllIIIl[34]])[ServerBoundPacket.llllIlllIIIl[0]] = lllllIlllIIIl("AZs79pOKKds=", "GQrer");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[1]] = lllllIlllIIlI("Cw==", "cvgzb");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[2]] = lllllIlllIIlI("LREhFCMtESQVLzYELgIk", "ePoPp");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[3]] = lllllIlllIIlI("OiMWJwc6KAU2AzwyBCc=", "iwWsR");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[4]] = lllllIlllIIlI("ASErAS8BKjocNBU=", "RujUz");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[5]] = lllllIlllIIll("qRblyUV//ahnstbh743pMw==", "zYRyQ");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[6]] = lllllIlllIIll("23X3qUIY/ASNhKKd42dz+upJKCaz+TKv", "esuYX");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[7]] = lllllIlllIIIl("S4PnYHxhfxUEVKPdeTcqRA==", "suTTY");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[8]] = lllllIlllIIll("JCQfsj/d2swxfBuPvm3cZg==", "cKCQn");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[9]] = lllllIlllIIIl("s6QMDST1bpaz+aie+PA5Zg==", "DRjiR");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[10]] = lllllIlllIIIl("qM/ZX+tsueyNKULCW45Jow==", "yfIpZ");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[11]] = lllllIlllIIll("Cd4WpYlG0L4KMxHCzyvzSw==", "XuzjM");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[12]] = lllllIlllIIlI("CiMiNAcWICwm", "ZocmX");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[13]] = lllllIlllIIll("ikqWJEcTSt80yJzBfBeMHaJ0XpROBMu+", "QdDpb");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[14]] = lllllIlllIIIl("df8sKls/jA299WC8+9bCow==", "xchtt");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[15]] = lllllIlllIIll("WHUStfUNiyRfhjGQ41tBaBVGVD6ew3SB", "fnook");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[16]] = lllllIlllIIIl("pzx7sEUq8vHlK4GmqVcgnw==", "lfcHB");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[17]] = lllllIlllIIll("VOfwnz9SzDDDI1FDO1jtiw==", "VTADq");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[18]] = lllllIlllIIIl("2Nm/UDcTDXc/YkNipgJJ8pZFgA7/0HNy", "Drwge");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[19]] = lllllIlllIIIl("HvIJ1t34p7OFY+n4WlcWxK34CICsVHZJ", "xDkeM");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[20]] = lllllIlllIIlI("IAs3KignDjg3OCcYNT84IwI=", "pGvsw");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[21]] = lllllIlllIIIl("TYxLyJDavVsJEWczTo1XPhBxFhR5rknM", "NhDjN");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[22]] = lllllIlllIIlI("FiQXPgkRIRgjGRE3AjUXCDsXJAIPJxg=", "FhVgV");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[23]] = lllllIlllIIll("xksDqxAArcCUFynh1SaqRmjOZFs1dE3q", "QdJhN");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[24]] = lllllIlllIIIl("D/6eFQ97H43Cx4G0Cw6lqkyYJ2YgDJms", "qnSSJ");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[25]] = lllllIlllIIIl("zhSJ0Rz6ygmBMu/f1o9e3EUOJEdhsZhr", "kdNtc");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[26]] = lllllIlllIIll("QwyodZWol39/7+KeobygAw==", "nbLpI");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[27]] = lllllIlllIIIl("C/MB0Bfrr5G6xHo+vYek3vDIArGzrdtM", "XIYqy");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[28]] = lllllIlllIIll("R7+ONyaFKnxztjJllKmTsA==", "tdiWu");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[29]] = lllllIlllIIlI("HjorPzsNOiMjKhopKSkpAzckIg==", "Nvjfd");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[30]] = lllllIlllIIll("sOlmWVJ8pmmDxPoTf/QMWhGpyEZT/Dpi", "zObAy");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[31]] = lllllIlllIIIl("DaiFt8Kzu91EPgsKf99x5MISqv3IDPBd", "qettJ");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[32]] = lllllIlllIIll("OBU+X9HD5XTgj5EXR3JWTg==", "KrLDm");
        ServerBoundPacket.llllIllIIlll[ServerBoundPacket.llllIlllIIIl[33]] = lllllIlllIIll("5aOut6tjPWbx07tVIdlgMwRVC8sLq962", "dXjEO");
    }
    
    private static String lllllIlllIIIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), ServerBoundPacket.llllIlllIIIl[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(ServerBoundPacket.llllIlllIIIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lllllIlllIIlI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = ServerBoundPacket.llllIlllIIIl[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = ServerBoundPacket.llllIlllIIIl[0];
        if (llllllIIIIIII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            return null;
        }
        return String.valueOf(sb);
    }
    
    private static String lllllIlllIIll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(ServerBoundPacket.llllIlllIIIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lllllIlllllll() {
        (llllIlllIIIl = new int[35])[0] = 0;
        ServerBoundPacket.llllIlllIIIl[1] = 1;
        ServerBoundPacket.llllIlllIIIl[2] = 2;
        ServerBoundPacket.llllIlllIIIl[3] = 3;
        ServerBoundPacket.llllIlllIIIl[4] = 4;
        ServerBoundPacket.llllIlllIIIl[5] = 5;
        ServerBoundPacket.llllIlllIIIl[6] = 6;
        ServerBoundPacket.llllIlllIIIl[7] = 7;
        ServerBoundPacket.llllIlllIIIl[8] = 8;
        ServerBoundPacket.llllIlllIIIl[9] = 9;
        ServerBoundPacket.llllIlllIIIl[10] = 10;
        ServerBoundPacket.llllIlllIIIl[11] = 11;
        ServerBoundPacket.llllIlllIIIl[12] = 12;
        ServerBoundPacket.llllIlllIIIl[13] = 13;
        ServerBoundPacket.llllIlllIIIl[14] = 14;
        ServerBoundPacket.llllIlllIIIl[15] = 15;
        ServerBoundPacket.llllIlllIIIl[16] = 16;
        ServerBoundPacket.llllIlllIIIl[17] = 17;
        ServerBoundPacket.llllIlllIIIl[18] = 18;
        ServerBoundPacket.llllIlllIIIl[19] = 19;
        ServerBoundPacket.llllIlllIIIl[20] = 20;
        ServerBoundPacket.llllIlllIIIl[21] = 21;
        ServerBoundPacket.llllIlllIIIl[22] = 22;
        ServerBoundPacket.llllIlllIIIl[23] = 23;
        ServerBoundPacket.llllIlllIIIl[24] = 24;
        ServerBoundPacket.llllIlllIIIl[25] = 25;
        ServerBoundPacket.llllIlllIIIl[26] = 26;
        ServerBoundPacket.llllIlllIIIl[27] = 27;
        ServerBoundPacket.llllIlllIIIl[28] = 28;
        ServerBoundPacket.llllIlllIIIl[29] = 29;
        ServerBoundPacket.llllIlllIIIl[30] = 30;
        ServerBoundPacket.llllIlllIIIl[31] = 31;
        ServerBoundPacket.llllIlllIIIl[32] = 32;
        ServerBoundPacket.llllIlllIIIl[33] = 33;
        ServerBoundPacket.llllIlllIIIl[34] = 34;
    }
    
    private static boolean llllllIIIIIII(final int n, final int n2) {
        return n < n2;
    }
}
