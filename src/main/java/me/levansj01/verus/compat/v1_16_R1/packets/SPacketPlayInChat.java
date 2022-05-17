package me.levansj01.verus.compat.v1_16_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_16_R1.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayInChat extends VPacketPlayInChat
{
    private static final String[] lIlIIIllllIll;
    private static final int[] lIlIIIlllllII;
    
    public void accept(final PacketPlayInChat packetPlayInChat) {
        this.message = packetPlayInChat.b();
        this.command = this.message.startsWith(SPacketPlayInChat.lIlIIIllllIll[SPacketPlayInChat.lIlIIIlllllII[0]]);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInChat)o);
    }
    
    static {
        lIlIIllIllIlll();
        lIlIIllIllIllI();
    }
    
    private static void lIlIIllIllIllI() {
        (lIlIIIllllIll = new String[SPacketPlayInChat.lIlIIIlllllII[1]])[SPacketPlayInChat.lIlIIIlllllII[0]] = lIlIIllIllIlIl("ihNfwsbQ56g=", "FTIQM");
    }
    
    private static String lIlIIllIllIlIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayInChat.lIlIIIlllllII[2]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayInChat.lIlIIIlllllII[3], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIllIllIlll() {
        (lIlIIIlllllII = new int[4])[0] = 0;
        SPacketPlayInChat.lIlIIIlllllII[1] = 1;
        SPacketPlayInChat.lIlIIIlllllII[2] = 8;
        SPacketPlayInChat.lIlIIIlllllII[3] = 2;
    }
}
