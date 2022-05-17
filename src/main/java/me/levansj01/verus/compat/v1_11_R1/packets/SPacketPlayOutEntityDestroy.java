package me.levansj01.verus.compat.v1_11_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_11_R1.*;
import me.levansj01.verus.util.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayOutEntityDestroy extends VPacketPlayOutEntityDestroy
{
    private static final Field ids_field;
    private static final String[] llIIlllIllIII;
    private static final int[] llIIlllIllIIl;
    
    public void accept(final PacketPlayOutEntityDestroy packetPlayOutEntityDestroy) {
        this.ids = (int[])SafeReflection.fetch(SPacketPlayOutEntityDestroy.ids_field, packetPlayOutEntityDestroy);
    }
    
    static {
        llIlIIlllIIIII();
        llIlIIllIlllll();
        ids_field = SafeReflection.access(PacketPlayOutEntityDestroy.class, SPacketPlayOutEntityDestroy.llIIlllIllIII[SPacketPlayOutEntityDestroy.llIIlllIllIIl[0]]);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutEntityDestroy)o);
    }
    
    private static void llIlIIllIlllll() {
        (llIIlllIllIII = new String[SPacketPlayOutEntityDestroy.llIIlllIllIIl[1]])[SPacketPlayOutEntityDestroy.llIIlllIllIIl[0]] = llIlIIllIllllI("4mMwlk2R54Q=", "zfnrO");
    }
    
    private static String llIlIIllIllllI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), SPacketPlayOutEntityDestroy.llIIlllIllIIl[2]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(SPacketPlayOutEntityDestroy.llIIlllIllIIl[3], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void llIlIIlllIIIII() {
        (llIIlllIllIIl = new int[4])[0] = 0;
        SPacketPlayOutEntityDestroy.llIIlllIllIIl[1] = 1;
        SPacketPlayOutEntityDestroy.llIIlllIllIIl[2] = 8;
        SPacketPlayOutEntityDestroy.llIIlllIllIIl[3] = 2;
    }
}
