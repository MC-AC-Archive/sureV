package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_12_R1.*;
import me.levansj01.verus.util.java.*;
import java.math.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayOutKeepAlive extends VPacketPlayOutKeepAlive
{
    private static final Field id_field;
    private static final String[] llllllllIlII;
    private static final int[] llllllllIlIl;
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutKeepAlive)o);
    }
    
    public void accept(final PacketPlayOutKeepAlive packetPlayOutKeepAlive) {
        this.id = BigInteger.valueOf((long)SafeReflection.fetch(SPacketPlayOutKeepAlive.id_field, packetPlayOutKeepAlive));
    }
    
    static {
        lIIIIIlIlllIlI();
        lIIIIIlIlllIIl();
        id_field = SafeReflection.access(PacketPlayOutKeepAlive.class, SPacketPlayOutKeepAlive.llllllllIlII[SPacketPlayOutKeepAlive.llllllllIlIl[0]]);
    }
    
    private static void lIIIIIlIlllIIl() {
        (llllllllIlII = new String[SPacketPlayOutKeepAlive.llllllllIlIl[1]])[SPacketPlayOutKeepAlive.llllllllIlIl[0]] = lIIIIIlIlllIII("aa4pwfNA//4=", "XMYby");
    }
    
    private static String lIIIIIlIlllIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutKeepAlive.llllllllIlIl[2]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutKeepAlive.llllllllIlIl[3], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIlIlllIlI() {
        (llllllllIlIl = new int[4])[0] = 0;
        SPacketPlayOutKeepAlive.llllllllIlIl[1] = 1;
        SPacketPlayOutKeepAlive.llllllllIlIl[2] = 8;
        SPacketPlayOutKeepAlive.llllllllIlIl[3] = 2;
    }
}
