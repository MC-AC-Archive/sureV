package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_7_R4.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayInChat extends VPacketPlayInChat
{
    private static final String[] lIIIIllIlllII;
    private static final int[] lIIIIllIllllI;
    
    public void accept(final PacketPlayInChat packetPlayInChat) {
        this.message = packetPlayInChat.c();
        this.command = this.message.startsWith(SPacketPlayInChat.lIIIIllIlllII[SPacketPlayInChat.lIIIIllIllllI[0]]);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInChat)o);
    }
    
    static {
        lIIIlIlIIllIlI();
        lIIIlIlIIllIII();
    }
    
    private static void lIIIlIlIIllIII() {
        (lIIIIllIlllII = new String[SPacketPlayInChat.lIIIIllIllllI[1]])[SPacketPlayInChat.lIIIIllIllllI[0]] = lIIIlIlIIlIlll("yVWuLv/5vtE=", "hOgOC");
    }
    
    private static String lIIIlIlIIlIlll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayInChat.lIIIIllIllllI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIlIIllIlI() {
        (lIIIIllIllllI = new int[3])[0] = 0;
        SPacketPlayInChat.lIIIIllIllllI[1] = 1;
        SPacketPlayInChat.lIIIIllIllllI[2] = 2;
    }
}
