package me.levansj01.verus.compat.v1_11_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_11_R1.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayInChat extends VPacketPlayInChat
{
    private static final String[] lIlIIllIlIlII;
    private static final int[] lIlIIllIlIllI;
    
    public void accept(final PacketPlayInChat packetPlayInChat) {
        this.message = packetPlayInChat.a();
        this.command = this.message.startsWith(SPacketPlayInChat.lIlIIllIlIlII[SPacketPlayInChat.lIlIIllIlIllI[0]]);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInChat)o);
    }
    
    static {
        lIlIlIIllIIIII();
        lIlIlIIlIllllI();
    }
    
    private static void lIlIlIIlIllllI() {
        (lIlIIllIlIlII = new String[SPacketPlayInChat.lIlIIllIlIllI[1]])[SPacketPlayInChat.lIlIIllIlIllI[0]] = lIlIlIIlIlllIl("7AEIRIGk7CM=", "IYHyg");
    }
    
    private static String lIlIlIIlIlllIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayInChat.lIlIIllIlIllI[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIlIIllIIIII() {
        (lIlIIllIlIllI = new int[3])[0] = 0;
        SPacketPlayInChat.lIlIIllIlIllI[1] = 1;
        SPacketPlayInChat.lIlIIllIlIllI[2] = 2;
    }
}
