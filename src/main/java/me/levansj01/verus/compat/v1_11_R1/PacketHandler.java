package me.levansj01.verus.compat.v1_11_R1;

import me.levansj01.verus.data.*;
import net.minecraft.server.v1_11_R1.*;
import me.levansj01.verus.compat.*;
import me.levansj01.launcher.*;
import java.util.logging.*;
import io.netty.channel.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class PacketHandler extends ChannelDuplexHandler
{
    private final PacketManager packetManager;
    private final PlayerData playerData;
    private static final String[] lIllIlIllIlII;
    private static final int[] lIllIlIlllIII;
    
    public PacketHandler(final PlayerData playerData, final PacketManager packetManager) {
        this.playerData = playerData;
        this.packetManager = packetManager;
    }
    
    public void handle(final ChannelHandlerContext channelHandlerContext, final Object o, final boolean b) {
        final VPacket transform = this.packetManager.transform(b, channelHandlerContext, (Packet)o);
        if (lIlllIlIIIIIlI(transform)) {
            this.playerData.postProcess(transform, b);
            transform.done();
        }
    }
    
    public void channelRead(final ChannelHandlerContext channelHandlerContext, final Object o) throws Exception {
        super.channelRead(channelHandlerContext, o);
        try {
            this.handle(channelHandlerContext, o, (boolean)(PacketHandler.lIllIlIlllIII[0] != 0));
            if (5 == 0) {
                return;
            }
        }
        catch (Throwable t) {
            VerusLauncher.getPlugin().getLogger().log(Level.SEVERE, PacketHandler.lIllIlIllIlII[PacketHandler.lIllIlIlllIII[1]], t);
        }
    }
    
    public void write(final ChannelHandlerContext channelHandlerContext, final Object o, final ChannelPromise channelPromise) throws Exception {
        super.write(channelHandlerContext, o, channelPromise);
        try {
            this.handle(channelHandlerContext, o, (boolean)(PacketHandler.lIllIlIlllIII[1] != 0));
            if (2 > 2) {
                return;
            }
        }
        catch (Throwable t) {
            VerusLauncher.getPlugin().getLogger().log(Level.SEVERE, PacketHandler.lIllIlIllIlII[PacketHandler.lIllIlIlllIII[0]], t);
        }
    }
    
    static {
        lIlllIlIIIIIIl();
        lIlllIIllllllI();
    }
    
    private static void lIlllIIllllllI() {
        (lIllIlIllIlII = new String[PacketHandler.lIllIlIlllIII[2]])[PacketHandler.lIllIlIlllIII[1]] = lIlllIIllllIlI("shEYtb4gIJt/n/XC3pXyHYUFB7pvMeBZBY3+bsMTzsrmh9smz44gjw==", "WUjeK");
        PacketHandler.lIllIlIllIlII[PacketHandler.lIllIlIlllIII[0]] = lIlllIIlllllIl("yHySeJKQOS/zGuVDAEE2SLv1dcYHWN12TzhjFgCq54nWGAraMFMuyw==", "uBRzZ");
    }
    
    private static String lIlllIIllllIlI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), PacketHandler.lIllIlIlllIII[3]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(PacketHandler.lIllIlIlllIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIlllIIlllllIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(PacketHandler.lIllIlIlllIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIlllIlIIIIIIl() {
        (lIllIlIlllIII = new int[4])[0] = 1;
        PacketHandler.lIllIlIlllIII[1] = 0;
        PacketHandler.lIllIlIlllIII[2] = 2;
        PacketHandler.lIllIlIlllIII[3] = 8;
    }
    
    private static boolean lIlllIlIIIIIlI(final Object o) {
        return o != null;
    }
}
