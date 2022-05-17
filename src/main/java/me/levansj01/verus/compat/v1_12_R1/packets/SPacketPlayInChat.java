package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_12_R1.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayInChat extends VPacketPlayInChat
{
    private static final String[] lIIIlIlIllllI;
    private static final int[] lIIIlIllIIIlI;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInChat)o);
    }
    
    public void accept(final PacketPlayInChat packetPlayInChat) {
        this.message = packetPlayInChat.a();
        this.command = this.message.startsWith(SPacketPlayInChat.lIIIlIlIllllI[SPacketPlayInChat.lIIIlIllIIIlI[0]]);
    }
    
    static {
        lIIIlllIIIIlII();
        lIIIlllIIIIIlI();
    }
    
    private static void lIIIlllIIIIIlI() {
        (lIIIlIlIllllI = new String[SPacketPlayInChat.lIIIlIllIIIlI[1]])[SPacketPlayInChat.lIIIlIllIIIlI[0]] = lIIIlllIIIIIII("LqroVae0AC0=", "KvQcc");
    }
    
    private static String lIIIlllIIIIIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayInChat.lIIIlIllIIIlI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlllIIIIlII() {
        (lIIIlIllIIIlI = new int[3])[0] = 0;
        SPacketPlayInChat.lIIIlIllIIIlI[1] = 1;
        SPacketPlayInChat.lIIIlIllIIIlI[2] = 2;
    }
}
