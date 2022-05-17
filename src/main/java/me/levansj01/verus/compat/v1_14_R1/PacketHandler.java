package me.levansj01.verus.compat.v1_14_R1;

import me.levansj01.verus.data.*;
import me.levansj01.launcher.*;
import java.util.logging.*;
import net.minecraft.server.v1_14_R1.*;
import me.levansj01.verus.compat.*;
import io.netty.channel.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class PacketHandler extends ChannelDuplexHandler
{
    private final PlayerData playerData;
    private final PacketManager packetManager;
    private static final String[] lllllIllIlIl;
    private static final int[] lllllIllIlll;
    
    public void channelRead(final ChannelHandlerContext channelHandlerContext, final Object o) throws Exception {
        super.channelRead(channelHandlerContext, o);
        try {
            this.handle(channelHandlerContext, o, (boolean)(PacketHandler.lllllIllIlll[0] != 0));
            if (5 == 0) {
                return;
            }
        }
        catch (Throwable t) {
            VerusLauncher.getPlugin().getLogger().log(Level.SEVERE, PacketHandler.lllllIllIlIl[PacketHandler.lllllIllIlll[1]], t);
        }
    }
    
    public void handle(final ChannelHandlerContext channelHandlerContext, final Object o, final boolean b) {
        final VPacket transform = this.packetManager.transform(b, channelHandlerContext, (Packet)o);
        if (lIIIIIIlIIIIIl(transform)) {
            this.playerData.postProcess(transform, b);
            transform.done();
        }
    }
    
    public void write(final ChannelHandlerContext channelHandlerContext, final Object o, final ChannelPromise channelPromise) throws Exception {
        super.write(channelHandlerContext, o, channelPromise);
        try {
            this.handle(channelHandlerContext, o, (boolean)(PacketHandler.lllllIllIlll[1] != 0));
            if (-3 > 0) {
                return;
            }
        }
        catch (Throwable t) {
            VerusLauncher.getPlugin().getLogger().log(Level.SEVERE, PacketHandler.lllllIllIlIl[PacketHandler.lllllIllIlll[0]], t);
        }
    }
    
    public PacketHandler(final PlayerData playerData, final PacketManager packetManager) {
        this.playerData = playerData;
        this.packetManager = packetManager;
    }
    
    static {
        lIIIIIIlIIIIII();
        lIIIIIIIlllIll();
    }
    
    private static void lIIIIIIIlllIll() {
        (lllllIllIlIl = new String[PacketHandler.lllllIllIlll[2]])[PacketHandler.lllllIllIlll[1]] = lIIIIIIIlllIlI("qJoEVO93taW28xDDM16FSj2mvQOSge0M0s4IrTG2QTtm4pbDH+T9kg==", "QmdxR");
        PacketHandler.lllllIllIlIl[PacketHandler.lllllIllIlll[0]] = lIIIIIIIlllIlI("V/yBSEV434hSZp3o7xRjB0/O/McLLRMofuIBvrPCR7UyFod3lgiWPw==", "wUbwQ");
    }
    
    private static String lIIIIIIIlllIlI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), PacketHandler.lllllIllIlll[3]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(PacketHandler.lllllIllIlll[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIIlIIIIII() {
        (lllllIllIlll = new int[4])[0] = 1;
        PacketHandler.lllllIllIlll[1] = 0;
        PacketHandler.lllllIllIlll[2] = 2;
        PacketHandler.lllllIllIlll[3] = 8;
    }
    
    private static boolean lIIIIIIlIIIIIl(final Object o) {
        return o != null;
    }
}
