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

public class SPacketPlayOutAttachEntity extends VPacketPlayOutAttachEntity
{
    private static final Field a_field;
    private static final Field b_field;
    private static final String[] lIlIIlllIIllI;
    private static final int[] lIlIlIIIlllIl;
    
    public void accept(final PacketPlayOutAttachEntity packetPlayOutAttachEntity) {
        this.leash = (byte)SPacketPlayOutAttachEntity.lIlIlIIIlllIl[0];
        this.entityId = (int)SafeReflection.fetch(SPacketPlayOutAttachEntity.a_field, packetPlayOutAttachEntity);
        this.attachId = (int)SafeReflection.fetch(SPacketPlayOutAttachEntity.b_field, packetPlayOutAttachEntity);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutAttachEntity)o);
    }
    
    static {
        lIlIllIIIIllIl();
        lIlIlIIllllIlI();
        a_field = SafeReflection.access(PacketPlayOutAttachEntity.class, SPacketPlayOutAttachEntity.lIlIIlllIIllI[SPacketPlayOutAttachEntity.lIlIlIIIlllIl[0]]);
        b_field = SafeReflection.access(PacketPlayOutAttachEntity.class, SPacketPlayOutAttachEntity.lIlIIlllIIllI[SPacketPlayOutAttachEntity.lIlIlIIIlllIl[1]]);
    }
    
    private static void lIlIlIIllllIlI() {
        (lIlIIlllIIllI = new String[SPacketPlayOutAttachEntity.lIlIlIIIlllIl[2]])[SPacketPlayOutAttachEntity.lIlIlIIIlllIl[0]] = lIlIlIIlllIlll("p2v6s6w0jeU=", "bJkXu");
        SPacketPlayOutAttachEntity.lIlIIlllIIllI[SPacketPlayOutAttachEntity.lIlIlIIIlllIl[1]] = lIlIlIIlllIlll("AWnrIK8JKtQ=", "JRxHE");
    }
    
    private static String lIlIlIIlllIlll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayOutAttachEntity.lIlIlIIIlllIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIllIIIIllIl() {
        (lIlIlIIIlllIl = new int[3])[0] = 0;
        SPacketPlayOutAttachEntity.lIlIlIIIlllIl[1] = 1;
        SPacketPlayOutAttachEntity.lIlIlIIIlllIl[2] = 2;
    }
}
