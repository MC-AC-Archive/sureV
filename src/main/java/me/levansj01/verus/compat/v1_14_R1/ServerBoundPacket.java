package me.levansj01.verus.compat.v1_14_R1;

import me.levansj01.verus.util.java.*;
import com.google.common.collect.*;
import net.minecraft.server.v1_14_R1.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public enum ServerBoundPacket
{
    PLAY_ENCHANT_SELECT(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[24]], ServerBoundPacket.lIIllIlllIIll[22], (Class)PacketPlayInEnchantItem.class),
    PLAY_POSITION_LOOK(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[13]], ServerBoundPacket.lIIllIlllIIll[11], (Class)PacketPlayInFlying.PacketPlayInPositionLook.class), 
    PLAY_WINDOW_CLICK(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[21]], ServerBoundPacket.lIIllIlllIIll[19], (Class)PacketPlayInWindowClick.class),
    PLAY_KEEP_ALIVE(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[7]], ServerBoundPacket.lIIllIlllIIll[5], (Class)PacketPlayInKeepAlive.class), 
    PLAY_SETTINGS(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[28]], ServerBoundPacket.lIIllIlllIIll[26], (Class)PacketPlayInSettings.class),
    PLAY_BLOCK_DIG(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[14]], ServerBoundPacket.lIIllIlllIIll[12], (Class)PacketPlayInBlockDig.class), 
    PLAY_LOOK(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[12]], ServerBoundPacket.lIIllIlllIIll[10], (Class)PacketPlayInFlying.PacketPlayInLook.class), 
    HANDSHAKE_START(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[2]], ServerBoundPacket.lIIllIlllIIll[0], (Class)PacketHandshakingInSetProtocol.class), 
    PLAY_WINDOW_CLOSE(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[20]], ServerBoundPacket.lIIllIlllIIll[18], (Class)PacketPlayInCloseWindow.class), 
    PLAY_PLAYER(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[10]], ServerBoundPacket.lIIllIlllIIll[8], (Class)PacketPlayInFlying.class), 
    LOGIN_START(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[5]], ServerBoundPacket.lIIllIlllIIll[3], (Class)PacketLoginInStart.class), 
    STATUS_REQUEST(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[3]], ServerBoundPacket.lIIllIlllIIll[1], (Class)PacketStatusInStart.class), 
    PLAY_BLOCK_PLACE(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[15]], ServerBoundPacket.lIIllIlllIIll[13], (Class)PacketPlayInBlockPlace.class), 
    PLAY_CLIENT_COMMAND(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[29]], ServerBoundPacket.lIIllIlllIIll[27], (Class)PacketPlayInClientCommand.class), 
    PLAY_TAB_COMPLETE(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[27]], ServerBoundPacket.lIIllIlllIIll[25], (Class)PacketPlayInTabComplete.class), 
    LOGIN_ENCRYPTION_BEGIN(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[6]], ServerBoundPacket.lIIllIlllIIll[4], (Class)PacketLoginInEncryptionBegin.class), 
    PLAY_ABILITIES(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[26]], ServerBoundPacket.lIIllIlllIIll[24], (Class)PacketPlayInAbilities.class), 
    PLAY_UPDATE_SIGN(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[25]], ServerBoundPacket.lIIllIlllIIll[23], (Class)PacketPlayInUpdateSign.class), 
    PLAY_VEHICLE_MOVE(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[31]], ServerBoundPacket.lIIllIlllIIll[29], (Class)PacketPlayInVehicleMove.class), 
    PLAY_ENTITY_ACTION(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[18]], ServerBoundPacket.lIIllIlllIIll[16], (Class)PacketPlayInEntityAction.class), 
    PLAY_TRANSACTION(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[32]], ServerBoundPacket.lIIllIlllIIll[30], (Class)PacketPlayInTransaction.class), 
    PLAY_CREATIVE_SET_SLOT(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[23]], ServerBoundPacket.lIIllIlllIIll[21], (Class)PacketPlayInSetCreativeSlot.class),
    STATUS_PING(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[4]], ServerBoundPacket.lIIllIlllIIll[2], (Class)PacketStatusInPing.class), 
    PLAY_CHAT(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[8]], ServerBoundPacket.lIIllIlllIIll[6], (Class)PacketPlayInChat.class), 
    PLAY_POSITION(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[11]], ServerBoundPacket.lIIllIlllIIll[9], (Class)PacketPlayInFlying.PacketPlayInPosition.class), 
    PLAY_CUSTOM_PAYLOAD(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[30]], ServerBoundPacket.lIIllIlllIIll[28], (Class)PacketPlayInCustomPayload.class), 
    PLAY_HELD_SLOT(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[16]], ServerBoundPacket.lIIllIlllIIll[14], (Class)PacketPlayInHeldItemSlot.class), 
    PLAY_USE_ENTITY(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[9]], ServerBoundPacket.lIIllIlllIIll[7], (Class)PacketPlayInUseEntity.class), 
    PLAY_ANIMATION(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[17]], ServerBoundPacket.lIIllIlllIIll[15], (Class)PacketPlayInArmAnimation.class), 
    PLAY_WINDOW_TRANSACTION(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[22]], ServerBoundPacket.lIIllIlllIIll[20], (Class)PacketPlayInTransaction.class), 
    PLAY_STEER_VEHICLE(ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[19]], ServerBoundPacket.lIIllIlllIIll[17], (Class)PacketPlayInSteerVehicle.class);

    private final int id;
    private final EnumProtocol protocol;
    private static String[] lIIllIllIlllI;
    private static int[] lIIllIlllIIll;

    ServerBoundPacket(final String s, final int n, final Class clazz) {
        this.protocol = ((Map)SafeReflection.getLocalField(EnumProtocol.class, null, clazz;
        this.id = (int)((Map)SafeReflection.getLocalField(EnumProtocol.class, this.protocol, ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[1]])).get(EnumProtocolDirection.SERVERBOUND).inverse().get((Object)clazz);
    }
    
    public static void init() {
    }
    
    public Packet get() throws IllegalAccessException, InstantiationException {
        return this.protocol.a(EnumProtocolDirection.SERVERBOUND, this.id);
    }
    
    static {
        lIIllllIlllIll();
        lIIllllIllIIIl();
    }
    
    public int getId() {
        return this.id;
    }
    
    private static void lIIllllIllIIIl() {
        (lIIllIllIlllI = new String[ServerBoundPacket.lIIllIlllIIll[33]])[ServerBoundPacket.lIIllIlllIIll[0]] = lIIllllIlIIIIl("sWWKTu11mYg=", "gDgWl");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[1]] = lIIllllIlIIIll("Jw==", "ONkhP");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[2]] = lIIllllIlIIlII("Lh7xqjSKStbsQJh11tU4lw==", "pdrgW");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[3]] = lIIllllIlIIlII("IugRNO/kOq4KojB/6K3V3g==", "clReo");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[4]] = lIIllllIlIIIll("OBksGgQ4Ej0HHyw=", "kMmNQ");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[5]] = lIIllllIlIIIIl("lWr0wUSBIYiDJgEbLqLs6g==", "wbXqn");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[6]] = lIIllllIlIIIIl("s5qTBjT7Gpdd+SQnsJ6bsGqwVPXbEibL", "xJoYr");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[7]] = lIIllllIlIIIIl("Fspx1eR7Y6ChfdmQLVFjAw==", "FKRON");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[8]] = lIIllllIlIIIll("KAMtEAc7By0d", "xOlIX");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[9]] = lIIllllIlIIIIl("D1b+ikXd+GnuLW7UpLYReg==", "Uuryp");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[10]] = lIIllllIlIIIll("Nj0HHQU2PQcdHzQ=", "fqFDZ");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[11]] = lIIllllIlIIIIl("9z2NrvO6HkMm2PuyDXxC6A==", "PFEay");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[12]] = lIIllllIlIIlII("CxRK/2diGUP7B9N5a6NBAw==", "aWmci");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[13]] = lIIllllIlIIlII("5MTu2mk2IwtPafxarvEtdC7ueFtqRS5o", "IXmjW");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[14]] = lIIllllIlIIIll("HgkmMQ4MCSgrGhEBLi8=", "NEghQ");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[15]] = lIIllllIlIIIIl("k8kGwN2HBv7jdJ+PFx2l9xk68FdoAbOS", "QuXfZ");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[16]] = lIIllllIlIIlII("wffI2nQGt7tOSGJtBRGGbg==", "ROHer");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[17]] = lIIllllIlIIIll("HAclKDENBS08LxgCKz8=", "LKdqn");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[18]] = lIIllllIlIIIIl("GJLjNcKsi4irZVerASvtQ8FiIca1vmpt", "yEWek");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[19]] = lIIllllIlIIIIl("r2t2iyDmlhkyUZwKWqxqNOVFKN9rbAh2", "XdkdD");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[20]] = lIIllllIlIIIll("IRo3ETcmHzgMJyYJNQQnIhM=", "qVvHh");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[21]] = lIIllllIlIIIIl("nZZXwdZJnoBiPa7laUk33T609O92X24h", "xndEx");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[22]] = lIIllllIlIIIll("BSYUMR0CIxssDQI1AToDGzkUKxYcJRs=", "UjUhB");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[23]] = lIIllllIlIIIll("Ch07CRIZAz8RGRMHPw8eHwUlAwEVBQ==", "ZQzPM");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[24]] = lIIllllIlIIlII("rCULd6yLe92VVu9Bt5lIHfZ/7wI3jU8a", "IRMdC");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[25]] = lIIllllIlIIlII("43adtk1jJfn+n7x8o+dCBq2umR+2ARdT", "PwIdM");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[26]] = lIIllllIlIIlII("NiwRB6D5p5u8Z0C5sto6DA==", "azqzN");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[27]] = lIIllllIlIIlII("uX44oF6l2zEOU3gfVU0Qb08ExrgAdrho", "jcJef");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[28]] = lIIllllIlIIlII("YDqWPwcGwuMunMVf30NyNQ==", "NSBYb");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[29]] = lIIllllIlIIIIl("eGw/okOnHOVqUA7DYDmFGRASgzqBQJaa", "yWpNj");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[30]] = lIIllllIlIIIll("JCYKGzg3PxgWKDk1GwM+OCUKBg==", "tjKBg");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[31]] = lIIllllIlIIlII("3erChnfLFLNHAW+OGXJBpBS9vPjhw9dJ", "xcFqb");
        ServerBoundPacket.lIIllIllIlllI[ServerBoundPacket.lIIllIlllIIll[32]] = lIIllllIlIIIIl("tdFpUfr9c8xDqZR4ERls1UrTS1gi22LX", "mjmAF");
    }
    
    private static String lIIllllIlIIIIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(ServerBoundPacket.lIIllIlllIIll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllllIlIIIll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = ServerBoundPacket.lIIllIlllIIll[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = ServerBoundPacket.lIIllIlllIIll[0];
        while (lIIllllIllllII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (4 < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIIllllIlIIlII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), ServerBoundPacket.lIIllIlllIIll[8]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(ServerBoundPacket.lIIllIlllIIll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIllllIlllIll() {
        (lIIllIlllIIll = new int[34])[0] = 0;
        ServerBoundPacket.lIIllIlllIIll[1] = 1;
        ServerBoundPacket.lIIllIlllIIll[2] = 2;
        ServerBoundPacket.lIIllIlllIIll[3] = 3;
        ServerBoundPacket.lIIllIlllIIll[4] = 4;
        ServerBoundPacket.lIIllIlllIIll[5] = 5;
        ServerBoundPacket.lIIllIlllIIll[6] = 6;
        ServerBoundPacket.lIIllIlllIIll[7] = 7;
        ServerBoundPacket.lIIllIlllIIll[8] = 8;
        ServerBoundPacket.lIIllIlllIIll[9] = 9;
        ServerBoundPacket.lIIllIlllIIll[10] = 10;
        ServerBoundPacket.lIIllIlllIIll[11] = 11;
        ServerBoundPacket.lIIllIlllIIll[12] = 12;
        ServerBoundPacket.lIIllIlllIIll[13] = 13;
        ServerBoundPacket.lIIllIlllIIll[14] = 14;
        ServerBoundPacket.lIIllIlllIIll[15] = 15;
        ServerBoundPacket.lIIllIlllIIll[16] = 16;
        ServerBoundPacket.lIIllIlllIIll[17] = 17;
        ServerBoundPacket.lIIllIlllIIll[18] = 18;
        ServerBoundPacket.lIIllIlllIIll[19] = 19;
        ServerBoundPacket.lIIllIlllIIll[20] = 20;
        ServerBoundPacket.lIIllIlllIIll[21] = 21;
        ServerBoundPacket.lIIllIlllIIll[22] = 22;
        ServerBoundPacket.lIIllIlllIIll[23] = 23;
        ServerBoundPacket.lIIllIlllIIll[24] = 24;
        ServerBoundPacket.lIIllIlllIIll[25] = 25;
        ServerBoundPacket.lIIllIlllIIll[26] = 26;
        ServerBoundPacket.lIIllIlllIIll[27] = 27;
        ServerBoundPacket.lIIllIlllIIll[28] = 28;
        ServerBoundPacket.lIIllIlllIIll[29] = 29;
        ServerBoundPacket.lIIllIlllIIll[30] = 30;
        ServerBoundPacket.lIIllIlllIIll[31] = 31;
        ServerBoundPacket.lIIllIlllIIll[32] = 32;
        ServerBoundPacket.lIIllIlllIIll[33] = 33;
    }
    
    private static boolean lIIllllIllllII(final int n, final int n2) {
        return n < n2;
    }
}
