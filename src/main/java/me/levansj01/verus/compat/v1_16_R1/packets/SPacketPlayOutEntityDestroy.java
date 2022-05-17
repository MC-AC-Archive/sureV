package me.levansj01.verus.compat.v1_16_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_16_R1.*;
import me.levansj01.verus.util.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayOutEntityDestroy extends VPacketPlayOutEntityDestroy
{
    private static final Field ids_field;
    private static final String[] llIIlIlIIIlll;
    private static final int[] llIIlIlIIlIII;
    
    public void accept(final PacketPlayOutEntityDestroy packetPlayOutEntityDestroy) {
        this.ids = (int[])SafeReflection.fetch(SPacketPlayOutEntityDestroy.ids_field, packetPlayOutEntityDestroy);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntityDestroy)o);
    }
    
    static {
        llIIllllIIIllI();
        llIIllllIIIlII();
        ids_field = SafeReflection.access(PacketPlayOutEntityDestroy.class, SPacketPlayOutEntityDestroy.llIIlIlIIIlll[SPacketPlayOutEntityDestroy.llIIlIlIIlIII[0]]);
    }
    
    private static void llIIllllIIIlII() {
        (llIIlIlIIIlll = new String[SPacketPlayOutEntityDestroy.llIIlIlIIlIII[1]])[SPacketPlayOutEntityDestroy.llIIlIlIIlIII[0]] = llIIllllIIIIIl("hdaXsw0nHdA=", "ZCgpS");
    }
    
    private static String llIIllllIIIIIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutEntityDestroy.llIIlIlIIlIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void llIIllllIIIllI() {
        (llIIlIlIIlIII = new int[3])[0] = 0;
        SPacketPlayOutEntityDestroy.llIIlIlIIlIII[1] = 1;
        SPacketPlayOutEntityDestroy.llIIlIlIIlIII[2] = 2;
    }
}
