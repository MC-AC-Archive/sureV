package me.levansj01.verus.compat.v1_12_R1;

import me.levansj01.verus.data.*;
import me.levansj01.launcher.*;
import java.util.logging.*;
import io.netty.channel.*;
import net.minecraft.server.v1_12_R1.*;
import me.levansj01.verus.compat.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class PacketHandler extends ChannelDuplexHandler
{
    private final PlayerData playerData;
    private final PacketManager packetManager;
    private static final String[] llIIlIIllIIll;
    private static final int[] llIIlIIllIlIl;
    
    public void channelRead(final ChannelHandlerContext channelHandlerContext, final Object o) throws Exception {
        super.channelRead(channelHandlerContext, o);
        try {
            this.handle(channelHandlerContext, o, (boolean)(PacketHandler.llIIlIIllIlIl[0] != 0));
            if (-3 > 0) {
                return;
            }
        }
        catch (Throwable t) {
            VerusLauncher.getPlugin().getLogger().log(Level.SEVERE, PacketHandler.llIIlIIllIIll[PacketHandler.llIIlIIllIlIl[1]], t);
        }
    }
    
    public PacketHandler(final PlayerData playerData, final PacketManager packetManager) {
        this.playerData = playerData;
        this.packetManager = packetManager;
    }
    
    public void write(final ChannelHandlerContext channelHandlerContext, final Object o, final ChannelPromise channelPromise) throws Exception {
        super.write(channelHandlerContext, o, channelPromise);
        try {
            this.handle(channelHandlerContext, o, (boolean)(PacketHandler.llIIlIIllIlIl[1] != 0));
            if (0 >= 2) {
                return;
            }
        }
        catch (Throwable t) {
            VerusLauncher.getPlugin().getLogger().log(Level.SEVERE, PacketHandler.llIIlIIllIIll[PacketHandler.llIIlIIllIlIl[0]], t);
        }
    }
    
    public void handle(final ChannelHandlerContext channelHandlerContext, final Object o, final boolean b) {
        final VPacket transform = this.packetManager.transform(b, channelHandlerContext, (Packet)o);
        if (llIIlllIlIIIII(transform)) {
            this.playerData.postProcess(transform, b);
            transform.done();
        }
    }
    
    static {
        llIIlllIIlllll();
        llIIlllIIlllII();
    }
    
    private static void llIIlllIIlllII() {
        (llIIlIIllIIll = new String[PacketHandler.llIIlIIllIlIl[2]])[PacketHandler.llIIlIIllIlIl[1]] = llIIlllIIlIlll("l/DkBYDV3Y/msSmj6Co+RMo9X6NDy6EVtgdeXxWj20AdWrbLdIpwNw==", "qrWWa");
        PacketHandler.llIIlIIllIIll[PacketHandler.llIIlIIllIlIl[0]] = llIIlllIIllIll("IwAqGw0BQTcYSA0ALRMEAEEsAhwCDioZD0URIhQDABVj", "eaCwh");
    }
    
    private static String llIIlllIIlIlll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(PacketHandler.llIIlIIllIlIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llIIlllIIllIll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = PacketHandler.llIIlIIllIlIl[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = PacketHandler.llIIlIIllIlIl[1];
        while (llIIlllIlIIIIl(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (2 <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void llIIlllIIlllll() {
        (llIIlIIllIlIl = new int[3])[0] = 1;
        PacketHandler.llIIlIIllIlIl[1] = 0;
        PacketHandler.llIIlIIllIlIl[2] = 2;
    }
    
    private static boolean llIIlllIlIIIIl(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean llIIlllIlIIIII(final Object o) {
        return o != null;
    }
}
