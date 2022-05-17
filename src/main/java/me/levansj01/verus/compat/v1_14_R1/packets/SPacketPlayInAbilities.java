package me.levansj01.verus.compat.v1_14_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_14_R1.*;
import me.levansj01.verus.util.java.*;
import me.levansj01.verus.compat.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayInAbilities extends VPacketPlayInAbilities
{
    private static final Field f_field;
    private static final Field e_field;
    private static final String[] llIIIlIIlllll;
    private static final int[] llIIIlIlIIIII;
    
    static {
        llIIlIIlIllIlI();
        llIIlIIlIllIIl();
        e_field = SafeReflection.access(PacketPlayInAbilities.class, SPacketPlayInAbilities.llIIIlIIlllll[SPacketPlayInAbilities.llIIIlIlIIIII[0]]);
        f_field = SafeReflection.access(PacketPlayInAbilities.class, SPacketPlayInAbilities.llIIIlIIlllll[SPacketPlayInAbilities.llIIIlIlIIIII[1]]);
    }
    
    public void accept(final PacketPlayInAbilities packetPlayInAbilities) {
        this.abilities = new PlayerAbilities(packetPlayInAbilities.b(), packetPlayInAbilities.isFlying(), packetPlayInAbilities.d(), packetPlayInAbilities.e(), (float)SafeReflection.fetch(SPacketPlayInAbilities.e_field, packetPlayInAbilities), (float)SafeReflection.fetch(SPacketPlayInAbilities.f_field, packetPlayInAbilities));
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInAbilities)o);
    }
    
    private static void llIIlIIlIllIIl() {
        (llIIIlIIlllll = new String[SPacketPlayInAbilities.llIIIlIlIIIII[2]])[SPacketPlayInAbilities.llIIIlIlIIIII[0]] = llIIlIIlIllIII("5a5iV5B8yOs=", "dEpgD");
        SPacketPlayInAbilities.llIIIlIIlllll[SPacketPlayInAbilities.llIIIlIlIIIII[1]] = llIIlIIlIllIII("XN6659fSONY=", "VkXmO");
    }
    
    private static String llIIlIIlIllIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayInAbilities.llIIIlIlIIIII[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void llIIlIIlIllIlI() {
        (llIIIlIlIIIII = new int[3])[0] = 0;
        SPacketPlayInAbilities.llIIIlIlIIIII[1] = 1;
        SPacketPlayInAbilities.llIIIlIlIIIII[2] = 2;
    }
}
