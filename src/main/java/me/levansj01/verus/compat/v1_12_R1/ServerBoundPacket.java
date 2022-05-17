package me.levansj01.verus.compat.v1_12_R1;

import me.levansj01.verus.util.java.*;
import com.google.common.collect.*;
import net.minecraft.server.v1_12_R1.*;
import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public enum ServerBoundPacket
{
    PLAY_POSITION_LOOK(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[13]], ServerBoundPacket.lIllIllllIlll[11], (Class)PacketPlayInFlying.PacketPlayInPositionLook.class), 
    PLAY_CHAT(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[8]], ServerBoundPacket.lIllIllllIlll[6], (Class)PacketPlayInChat.class), 
    LOGIN_START(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[5]], ServerBoundPacket.lIllIllllIlll[3], (Class)PacketLoginInStart.class), 
    PLAY_ENTITY_ACTION(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[18]], ServerBoundPacket.lIllIllllIlll[16], (Class)PacketPlayInEntityAction.class), 
    PLAY_WINDOW_CLICK(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[21]], ServerBoundPacket.lIllIllllIlll[19], (Class)PacketPlayInWindowClick.class),
    PLAY_CREATIVE_SET_SLOT(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[23]], ServerBoundPacket.lIllIllllIlll[21], (Class)PacketPlayInSetCreativeSlot.class),
    STATUS_REQUEST(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[3]], ServerBoundPacket.lIllIllllIlll[1], (Class)PacketStatusInStart.class), 
    PLAY_TAB_COMPLETE(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[27]], ServerBoundPacket.lIllIllllIlll[25], (Class)PacketPlayInTabComplete.class), 
    PLAY_POSITION(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[11]], ServerBoundPacket.lIllIllllIlll[9], (Class)PacketPlayInFlying.PacketPlayInPosition.class), 
    HANDSHAKE_START(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[2]], ServerBoundPacket.lIllIllllIlll[0], (Class)PacketHandshakingInSetProtocol.class), 
    STATUS_PING(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[4]], ServerBoundPacket.lIllIllllIlll[2], (Class)PacketStatusInPing.class), 
    PLAY_SETTINGS(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[28]], ServerBoundPacket.lIllIllllIlll[26], (Class)PacketPlayInSettings.class), 
    PLAY_HELD_SLOT(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[16]], ServerBoundPacket.lIllIllllIlll[14], (Class)PacketPlayInHeldItemSlot.class), 
    PLAY_CLIENT_COMMAND(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[29]], ServerBoundPacket.lIllIllllIlll[27], (Class)PacketPlayInClientCommand.class), 
    PLAY_VEHICLE_MOVE(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[31]], ServerBoundPacket.lIllIllllIlll[29], (Class)PacketPlayInVehicleMove.class), 
    PLAY_UPDATE_SIGN(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[25]], ServerBoundPacket.lIllIllllIlll[23], (Class)PacketPlayInUpdateSign.class), 
    PLAY_BLOCK_PLACE(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[15]], ServerBoundPacket.lIllIllllIlll[13], (Class)PacketPlayInBlockPlace.class), 
    PLAY_USE_ENTITY(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[9]], ServerBoundPacket.lIllIllllIlll[7], (Class)PacketPlayInUseEntity.class), 
    PLAY_ENCHANT_SELECT(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[24]], ServerBoundPacket.lIllIllllIlll[22], (Class)PacketPlayInEnchantItem.class), 
    PLAY_WINDOW_TRANSACTION(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[22]], ServerBoundPacket.lIllIllllIlll[20], (Class)PacketPlayInTransaction.class), 
    PLAY_LOOK(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[12]], ServerBoundPacket.lIllIllllIlll[10], (Class)PacketPlayInFlying.PacketPlayInLook.class), 
    PLAY_USE_ITEM(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[32]], ServerBoundPacket.lIllIllllIlll[30], (Class)PacketPlayInUseItem.class), 
    PLAY_STEER_VEHICLE(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[19]], ServerBoundPacket.lIllIllllIlll[17], (Class)PacketPlayInSteerVehicle.class), 
    PLAY_TRANSACTION(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[33]], ServerBoundPacket.lIllIllllIlll[31], (Class)PacketPlayInTransaction.class), 
    PLAY_ANIMATION(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[17]], ServerBoundPacket.lIllIllllIlll[15], (Class)PacketPlayInArmAnimation.class), 
    PLAY_ABILITIES(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[26]], ServerBoundPacket.lIllIllllIlll[24], (Class)PacketPlayInAbilities.class), 
    PLAY_PLAYER(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[10]], ServerBoundPacket.lIllIllllIlll[8], (Class)PacketPlayInFlying.class), 
    PLAY_CUSTOM_PAYLOAD(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[30]], ServerBoundPacket.lIllIllllIlll[28], (Class)PacketPlayInCustomPayload.class), 
    PLAY_BLOCK_DIG(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[14]], ServerBoundPacket.lIllIllllIlll[12], (Class)PacketPlayInBlockDig.class), 
    PLAY_KEEP_ALIVE(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[7]], ServerBoundPacket.lIllIllllIlll[5], (Class)PacketPlayInKeepAlive.class), 
    LOGIN_ENCRYPTION_BEGIN(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[6]], ServerBoundPacket.lIllIllllIlll[4], (Class)PacketLoginInEncryptionBegin.class),
    PLAY_WINDOW_CLOSE(ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[20]], ServerBoundPacket.lIllIllllIlll[18], (Class)PacketPlayInCloseWindow.class);

    private final int id;
    private final EnumProtocol protocol;
    private static String[] lIllIlllIllll;
    private static int[] lIllIllllIlll;
    
    public Packet get() throws IllegalAccessException, InstantiationException {
        return this.protocol.a(EnumProtocolDirection.SERVERBOUND, this.id);
    }
    
    public int getId() {
        return this.id;
    }
    
    ServerBoundPacket(final String s, final int n, final Class clazz) {
        this.protocol = ((Map)SafeReflection.getLocalField(EnumProtocol.class, null, ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[0]])).get(clazz);
        this.id = (int)((Map)SafeReflection.getLocalField(EnumProtocol.class, this.protocol, ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[1]])).get(EnumProtocolDirection.SERVERBOUND).inverse().get((Object)clazz);
    }

    static {
        lIllllIIlIlIll();
        lIllllIIIllIIl();
    }
    
    public static void init() {
    }
    
    private static void lIllllIIIllIIl() {
        (lIllIlllIllll = new String[ServerBoundPacket.lIllIllllIlll[34]])[ServerBoundPacket.lIllIllllIlll[0]] = lIlllIllllllll("oUFCgi+bscw=", "sEnLQ");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[1]] = lIlllIllllllll("8gGM9jWTBGE=", "zipeF");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[2]] = lIllllIIIIIlIl("PgY5MAE+BjwxDSUTNiYG", "vGwtR");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[3]] = lIllllIIIIIllI("RfxrSfNNtaWzC7BaX+MMew==", "bCWUY");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[4]] = lIllllIIIIIlIl("PhY4EzY+HSkOLSo=", "mByGc");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[5]] = lIlllIllllllll("hKYSJaoZTNoi3ztNG8/96g==", "lnfUd");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[6]] = lIlllIllllllll("5YqDp7pfqwBPI/qR8GBzA+IRmB9+5Ol/", "iiZBb");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[7]] = lIllllIIIIIllI("HBca2JZrdNF5zuEhPBYS8Q==", "mQTuf");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[8]] = lIllllIIIIIllI("1B+VWgmF2gl2uVO8Q/5Z+w==", "KxKDb");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[9]] = lIllllIIIIIllI("VA0Z3xXnFOs5jkwITrpXMA==", "jygkK");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[10]] = lIllllIIIIIllI("l6+03CtNn/1pGHOvD5y9Dw==", "BsAoe");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[11]] = lIlllIllllllll("X62fYok1Mgo76MpoAzLiAg==", "PTwOx");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[12]] = lIllllIIIIIllI("WoRvyhtFH7VvE2ixvCiuZw==", "oXSHF");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[13]] = lIllllIIIIIllI("426XB4nlBpl9kyYftTwaR1h87zPmPaqs", "JsHNO");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[14]] = lIlllIllllllll("u4vV0PUWvkcRoRVgVDK7eQ==", "Pgheh");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[15]] = lIlllIllllllll("hEGKTyFaYrgyhoxjGq95PZI4gjDP7Ggz", "MpVkJ");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[16]] = lIllllIIIIIlIl("NCoTEzYsIx4ONjcqHR4=", "dfRJi");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[17]] = lIllllIIIIIllI("tLVuvGBrSUikKlp7//XIxQ==", "uMhft");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[18]] = lIlllIllllllll("1cB96/O3WLWBMmr1Bzv3iBjSkltunCRp", "IjvzB");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[19]] = lIllllIIIIIllI("5qO6nkkL03xS9DpLvhB0grI2KkkOqeGK", "RWkgW");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[20]] = lIllllIIIIIlIl("CAU0IDwPADs9LA8WNjUsCww=", "XIuyc");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[21]] = lIllllIIIIIlIl("Cio3NCYNLzgpNg05NSEwGS0=", "Zfvmy");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[22]] = lIllllIIIIIlIl("KhsPEistHgAPOy0IGhk1NAQPCCAzGAA=", "zWNKt");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[23]] = lIllllIIIIIlIl("Gxo2CiUIBDISLgIAMgwpDgIoADYEAg==", "KVwSz");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[24]] = lIlllIllllllll("xeecKZ+EgdTUoXc63AkLdfrxSIcqgHXq", "OoYbL");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[25]] = lIllllIIIIIllI("Q9+MXzy4qX5gngqC4ySh2gdsKz2KVjcp", "PnnKV");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[26]] = lIlllIllllllll("hKvoi1cl/3ThXCYO+uDv6Q==", "FxCwM");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[27]] = lIllllIIIIIlIl("EiYKNicWKwkwOw0nGyM9Fi8=", "BjKox");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[28]] = lIllllIIIIIllI("GcIvs/A46WcQKIPksdoiNQ==", "EXppx");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[29]] = lIlllIllllllll("QSA+LW5+2WwrEQR30Yuyn3cVsDs14mXC", "SSWOP");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[30]] = lIllllIIIIIllI("ICHJB7ajkOMmK6idABJ/iFjcrr4e72YM", "HkiqO");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[31]] = lIllllIIIIIlIl("OSEWPww/KB8vECUoCCscPyg=", "imWfS");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[32]] = lIllllIIIIIlIl("AwcPGAUGGAseEwcOAw==", "SKNAZ");
        ServerBoundPacket.lIllIlllIllll[ServerBoundPacket.lIllIllllIlll[33]] = lIllllIIIIIllI("NnfXGIQq3uu54Qi2zz7DA+iEq93t+akC", "YWOXL");
    }
    
    private static String lIllllIIIIIlIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = ServerBoundPacket.lIllIllllIlll[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = ServerBoundPacket.lIllIllllIlll[0];
        while (lIllllIIlIllII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (-4 >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIllllIIIIIllI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), ServerBoundPacket.lIllIllllIlll[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(ServerBoundPacket.lIllIllllIlll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIlllIllllllll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(ServerBoundPacket.lIllIllllIlll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIllllIIlIlIll() {
        (lIllIllllIlll = new int[35])[0] = 0;
        ServerBoundPacket.lIllIllllIlll[1] = 1;
        ServerBoundPacket.lIllIllllIlll[2] = 2;
        ServerBoundPacket.lIllIllllIlll[3] = 3;
        ServerBoundPacket.lIllIllllIlll[4] = 4;
        ServerBoundPacket.lIllIllllIlll[5] = 5;
        ServerBoundPacket.lIllIllllIlll[6] = 6;
        ServerBoundPacket.lIllIllllIlll[7] = 7;
        ServerBoundPacket.lIllIllllIlll[8] = 8;
        ServerBoundPacket.lIllIllllIlll[9] = 9;
        ServerBoundPacket.lIllIllllIlll[10] = 10;
        ServerBoundPacket.lIllIllllIlll[11] = 11;
        ServerBoundPacket.lIllIllllIlll[12] = 12;
        ServerBoundPacket.lIllIllllIlll[13] = 13;
        ServerBoundPacket.lIllIllllIlll[14] = 14;
        ServerBoundPacket.lIllIllllIlll[15] = 15;
        ServerBoundPacket.lIllIllllIlll[16] = 16;
        ServerBoundPacket.lIllIllllIlll[17] = 17;
        ServerBoundPacket.lIllIllllIlll[18] = 18;
        ServerBoundPacket.lIllIllllIlll[19] = 19;
        ServerBoundPacket.lIllIllllIlll[20] = 20;
        ServerBoundPacket.lIllIllllIlll[21] = 21;
        ServerBoundPacket.lIllIllllIlll[22] = 22;
        ServerBoundPacket.lIllIllllIlll[23] = 23;
        ServerBoundPacket.lIllIllllIlll[24] = 24;
        ServerBoundPacket.lIllIllllIlll[25] = 25;
        ServerBoundPacket.lIllIllllIlll[26] = 26;
        ServerBoundPacket.lIllIllllIlll[27] = 27;
        ServerBoundPacket.lIllIllllIlll[28] = 28;
        ServerBoundPacket.lIllIllllIlll[29] = 29;
        ServerBoundPacket.lIllIllllIlll[30] = 30;
        ServerBoundPacket.lIllIllllIlll[31] = 31;
        ServerBoundPacket.lIllIllllIlll[32] = 32;
        ServerBoundPacket.lIllIllllIlll[33] = 33;
        ServerBoundPacket.lIllIllllIlll[34] = 34;
    }
    
    private static boolean lIllllIIlIllII(final int n, final int n2) {
        return n < n2;
    }
}
