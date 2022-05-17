package me.levansj01.verus.compat.v1_7_R4;

import me.levansj01.verus.util.java.*;
import net.minecraft.util.com.google.common.collect.*;
import me.levansj01.launcher.*;
import net.minecraft.server.v1_7_R4.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public enum ServerBoundPacket {

    PLAY_ANIMATION(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[18]], ServerBoundPacket.llIlllllllIIl[15], (Class) PacketPlayInArmAnimation.class),
    PLAY_WINDOW_CLICK(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[22]], ServerBoundPacket.llIlllllllIIl[19], (Class) PacketPlayInWindowClick.class),
    PLAY_WINDOW_TRANSACTION(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[23]], ServerBoundPacket.llIlllllllIIl[20], (Class) PacketPlayInTransaction.class),
    PLAY_UPDATE_SIGN(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[26]], ServerBoundPacket.llIlllllllIIl[23], (Class) PacketPlayInUpdateSign.class),
    PLAY_KEEP_ALIVE(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[8]], ServerBoundPacket.llIlllllllIIl[5], (Class) PacketPlayInKeepAlive.class),
    STATUS_PING(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[5]], ServerBoundPacket.llIlllllllIIl[2], (Class) PacketStatusInPing.class),
    PLAY_TRANSACTION(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[32]], ServerBoundPacket.llIlllllllIIl[29], (Class) PacketPlayInTransaction.class),
    PLAY_ABILITIES(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[27]], ServerBoundPacket.llIlllllllIIl[24], (Class) PacketPlayInAbilities.class),
    PLAY_POSITION(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[12]], ServerBoundPacket.llIlllllllIIl[9], (Class) PacketPlayInPosition.class),
    PLAY_PLAYER(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[11]], ServerBoundPacket.llIlllllllIIl[8], (Class) PacketPlayInFlying.class),
    LOGIN_START(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[6]], ServerBoundPacket.llIlllllllIIl[3], (Class) PacketLoginInStart.class),
    PLAY_CREATIVE_SET_SLOT(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[24]], ServerBoundPacket.llIlllllllIIl[21], (Class) PacketPlayInSetCreativeSlot.class),
    PLAY_LOOK(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[13]], ServerBoundPacket.llIlllllllIIl[10], (Class) PacketPlayInLook.class),
    PLAY_ENTITY_ACTION(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[19]], ServerBoundPacket.llIlllllllIIl[16], (Class) PacketPlayInEntityAction.class),
    PLAY_CHAT(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[9]], ServerBoundPacket.llIlllllllIIl[6], (Class) PacketPlayInChat.class),
    PLAY_CLIENT_COMMAND(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[30]], ServerBoundPacket.llIlllllllIIl[27], (Class) PacketPlayInClientCommand.class),
    PLAY_SETTINGS(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[29]], ServerBoundPacket.llIlllllllIIl[26], (Class) PacketPlayInSettings.class),
    HANDSHAKE_START(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[3]], ServerBoundPacket.llIlllllllIIl[0], (Class) PacketHandshakingInSetProtocol.class),
    PLAY_POSITION_LOOK(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[14]], ServerBoundPacket.llIlllllllIIl[11], (Class) PacketPlayInPositionLook.class),
    PLAY_CUSTOM_PAYLOAD(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[31]], ServerBoundPacket.llIlllllllIIl[28], (Class) PacketPlayInCustomPayload.class),
    PLAY_HELD_SLOT(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[17]], ServerBoundPacket.llIlllllllIIl[14], (Class) PacketPlayInHeldItemSlot.class),
    PLAY_BLOCK_PLACE(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[16]], ServerBoundPacket.llIlllllllIIl[13], (Class) PacketPlayInBlockPlace.class),
    LOGIN_ENCRYPTION_BEGIN(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[7]], ServerBoundPacket.llIlllllllIIl[4], (Class) PacketLoginInEncryptionBegin.class),
    PLAY_WINDOW_CLOSE(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[21]], ServerBoundPacket.llIlllllllIIl[18], (Class) PacketPlayInCloseWindow.class),
    STATUS_REQUEST(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[4]], ServerBoundPacket.llIlllllllIIl[1], (Class) PacketStatusInStart.class),
    PLAY_USE_ENTITY(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[10]], ServerBoundPacket.llIlllllllIIl[7], (Class) PacketPlayInUseEntity.class),
    PLAY_STEER_VEHICLE(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[20]], ServerBoundPacket.llIlllllllIIl[17], (Class) PacketPlayInSteerVehicle.class),
    PLAY_BLOCK_DIG(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[15]], ServerBoundPacket.llIlllllllIIl[12], (Class) PacketPlayInBlockDig.class),
    PLAY_TAB_COMPLETE(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[28]], ServerBoundPacket.llIlllllllIIl[25], (Class) PacketPlayInTabComplete.class),
    PLAY_ENCHANT_SELECT(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[25]], ServerBoundPacket.llIlllllllIIl[22], (Class) PacketPlayInEnchantItem.class);

    private int id;
    private EnumProtocol protocol;

    public static String[] llIlIlIlIIIll;
    public static int[] llIlllllllIIl;

    public int getId() {
        return this.id;
    }
    
    ServerBoundPacket(final String s, final int n, final Class clazz) {
        try {
            this.protocol = ((Map) SafeReflection.getLocalField(EnumProtocol.class, null, ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[0]])).get(clazz);
        } catch (Throwable t) {
            VerusLauncher.getPlugin().getLogger().severe(String.valueOf(new StringBuilder().append(ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[2]]).append(clazz.getSimpleName())));
            throw new IllegalArgumentException(t);
        }
    }
    
    static {
        lllIIlIIIlIIII();
        lllIIlIIIIlIIl();
    }
    
    private static void lllIIlIIIIlIIl() {
        (llIlIlIlIIIll = new String[ServerBoundPacket.llIlllllllIIl[33]])[ServerBoundPacket.llIlllllllIIl[0]] = llIllIlIIIlIIl("+tsPW0EWQYE=", "KmSYn");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[1]] = llIllIlIIlIlII("EQ==", "ydhMz");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[2]] = llIllIlIIlIlII("PwcnATEdRjoCdB8PIAl0KQctBjENLypNMhYUbg==", "yfNmT");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[3]] = llIllIlIIlIlII("ATgWJxYBOBMmGhotGTER", "IyXcE");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[4]] = llIllIlIIlIlIl("tNjnqkSU1B6mPCweItDCig==", "snxmQ");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[5]] = llIllIlIIlIlII("HwcEOxwfDBUmBws=", "LSEoI");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[6]] = llIllIlIIlIlIl("BaTatwVWE/trQb1r0BtS9w==", "NxrJz");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[7]] = llIllIlIIlIlIl("/3oMSp07XaQHJs5eFuPFJlu/uk8ku08v", "mcJFO");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[8]] = llIllIlIIlIlIl("8AZieFJlcIcE1iAvAubv4Q==", "qiLDM");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[9]] = llIllIlIIlIlIl("lOml8hZEdZkRxM9FJF6Wmw==", "IOWnT");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[10]] = llIllIlIIlIlII("FDgtNBsRJykyAQogJTkd", "DtlmD");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[11]] = llIllIlIIIlIIl("0jkaiaG3/qE40r8Gu/EeDA==", "uxviC");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[12]] = llIllIlIIlIlII("AD47NjMAPSkmOBk9NA==", "Przol");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[13]] = llIllIlIIlIlII("CAcxDRwUBD8f", "XKpTC");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[14]] = llIllIlIIlIlIl("vGCr9yVRLzFYkhfVYA6tGcXgAw4tXkwC", "bqEsx");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[15]] = llIllIlIIlIlIl("FC4odog3Niv2WxOxT2p3fQ==", "bqdgk");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[16]] = llIllIlIIIlIIl("MMar2pZPHDnF1IM8jCFq89SK9F7FX8mb", "bSlIf");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[17]] = llIllIlIIlIlIl("kbdmH8StQMQzVlyEHJHMiA==", "gwBzJ");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[18]] = llIllIlIIlIlII("EQsLMTIACQMlLBUOBSY=", "AGJhm");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[19]] = llIllIlIIlIlIl("duegvQEk88pSVA7ssak61w1BLIcB2GYG", "rIasb");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[20]] = llIllIlIIlIlIl("2xD1UZF+5SmM/MkUqPPGGJR3nDf5fRSN", "vOoBj");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[21]] = llIllIlIIlIlIl("pOcxnkgfqpwCR2E//6rc2FqsFBVzSaVe", "vKGXU");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[22]] = llIllIlIIIlIIl("W7eVQ3TmD0j30UAUy+W84iQ0FuOslc/Z", "LgAcD");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[23]] = llIllIlIIlIlII("PAEpPy07BCYiPTsSPDQzIh4pJSYlAiY=", "lMhfr");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[24]] = llIllIlIIlIlIl("swkYOyd9I/M2MGFzACNsVKx01/33pEQb", "ajDyS");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[25]] = llIllIlIIIlIIl("T+H8ORlRYmMjxff8mU1+DqLvu+j3JuR+", "MycTT");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[26]] = llIllIlIIlIlIl("4wgMxsn/3bYEXLcDMYjifJD6Lv1YYJ8q", "VFdxU");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[27]] = llIllIlIIlIlII("MQEPPScgDwcoMTUECzc=", "aMNdx");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[28]] = llIllIlIIIlIIl("W6lRZ8+yduwtenzrpgJIWmEEUjgJKjgY", "xNfLv");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[29]] = llIllIlIIIlIIl("l6xWOtuX9vX0AR/gchsIlQ==", "mWPXT");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[30]] = llIllIlIIlIlII("JTYbKRQ2NhM1BSElGT8GODsUNA==", "uzZpK");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[31]] = llIllIlIIlIlIl("MvtQPkf+PAfG5v2XHP9+Db6juiBnRpax", "QugMv");
        ServerBoundPacket.llIlIlIlIIIll[ServerBoundPacket.llIlllllllIIl[32]] = llIllIlIIlIlIl("vXQPnYdxDET/Mav7kScw4AYQ6TOuPTfS", "wrXOx");
    }
    
    private static String llIllIlIIIlIIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(ServerBoundPacket.llIlllllllIIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIllIlIIlIlII(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = ServerBoundPacket.llIlllllllIIl[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = ServerBoundPacket.llIlllllllIIl[0];
        while (lllIIlIIIlIIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (1 <= -1) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String llIllIlIIlIlIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), ServerBoundPacket.llIlllllllIIl[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(ServerBoundPacket.llIlllllllIIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIlIIIlIIII() {
        (llIlllllllIIl = new int[34])[0] = 0;
        ServerBoundPacket.llIlllllllIIl[1] = 1;
        ServerBoundPacket.llIlllllllIIl[2] = 2;
        ServerBoundPacket.llIlllllllIIl[3] = 3;
        ServerBoundPacket.llIlllllllIIl[4] = 4;
        ServerBoundPacket.llIlllllllIIl[5] = 5;
        ServerBoundPacket.llIlllllllIIl[6] = 6;
        ServerBoundPacket.llIlllllllIIl[7] = 7;
        ServerBoundPacket.llIlllllllIIl[8] = 8;
        ServerBoundPacket.llIlllllllIIl[9] = 9;
        ServerBoundPacket.llIlllllllIIl[10] = 10;
        ServerBoundPacket.llIlllllllIIl[11] = 11;
        ServerBoundPacket.llIlllllllIIl[12] = 12;
        ServerBoundPacket.llIlllllllIIl[13] = 13;
        ServerBoundPacket.llIlllllllIIl[14] = 14;
        ServerBoundPacket.llIlllllllIIl[15] = 15;
        ServerBoundPacket.llIlllllllIIl[16] = 16;
        ServerBoundPacket.llIlllllllIIl[17] = 17;
        ServerBoundPacket.llIlllllllIIl[18] = 18;
        ServerBoundPacket.llIlllllllIIl[19] = 19;
        ServerBoundPacket.llIlllllllIIl[20] = 20;
        ServerBoundPacket.llIlllllllIIl[21] = 21;
        ServerBoundPacket.llIlllllllIIl[22] = 22;
        ServerBoundPacket.llIlllllllIIl[23] = 23;
        ServerBoundPacket.llIlllllllIIl[24] = 24;
        ServerBoundPacket.llIlllllllIIl[25] = 25;
        ServerBoundPacket.llIlllllllIIl[26] = 26;
        ServerBoundPacket.llIlllllllIIl[27] = 27;
        ServerBoundPacket.llIlllllllIIl[28] = 28;
        ServerBoundPacket.llIlllllllIIl[29] = 29;
        ServerBoundPacket.llIlllllllIIl[30] = 30;
        ServerBoundPacket.llIlllllllIIl[31] = 31;
        ServerBoundPacket.llIlllllllIIl[32] = 32;
        ServerBoundPacket.llIlllllllIIl[33] = 33;
    }
    
    private static boolean lllIIlIIIlIIll(final int n, final int n2) {
        return n < n2;
    }
}
