package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.craftbukkit.v1_12_R1.*;
import java.lang.ref.*;
import me.levansj01.verus.util.java.*;
import net.minecraft.server.v1_12_R1.*;
import java.util.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class SPacketPlayInUseEntity extends VPacketPlayInUseEntity
{
    private static final Field id_field;
    private boolean fetchedEntity;
    private static final String[] lllIIIIIllllI;
    private static final int[] lllIIIIIlllll;
    
    @Override
    public Entity getEntity(final World world) {
        if (lllIIlIlIllIlI(this.fetchedEntity ? 1 : 0)) {
            final net.minecraft.server.v1_12_R1.Entity entity = ((CraftWorld)world).getHandle().getEntity(this.id);
            if (lllIIlIlIllIll(entity)) {
                this.entity = new WeakReference<Entity>(null);
                if (1 > 2) {
                    return null;
                }
            }
            else {
                this.entity = new WeakReference<Entity>(entity.getBukkitEntity());
            }
            this.fetchedEntity = (SPacketPlayInUseEntity.lllIIIIIlllll[0] != 0);
        }
        Entity entity2;
        if (lllIIlIlIllIll(this.entity)) {
            entity2 = null;
            if (-4 >= 0) {
                return null;
            }
        }
        else {
            entity2 = this.entity.get();
        }
        return entity2;
    }
    
    static {
        lllIIlIlIllIIl();
        lllIIlIlIllIII();
        final Class<PacketPlayInUseEntity> clazz = PacketPlayInUseEntity.class;
        final String[] array = new String[SPacketPlayInUseEntity.lllIIIIIlllll[1]];
        array[SPacketPlayInUseEntity.lllIIIIIlllll[2]] = SPacketPlayInUseEntity.lllIIIIIllllI[SPacketPlayInUseEntity.lllIIIIIlllll[2]];
        array[SPacketPlayInUseEntity.lllIIIIIlllll[0]] = SPacketPlayInUseEntity.lllIIIIIllllI[SPacketPlayInUseEntity.lllIIIIIlllll[0]];
        id_field = SafeReflection.access(clazz, array);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInUseEntity)o);
    }
    
    public void accept(final PacketPlayInUseEntity packetPlayInUseEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayInUseEntity.id_field, packetPlayInUseEntity);
        this.action = EntityUseAction.values()[packetPlayInUseEntity.a().ordinal()];
        if (lllIIlIlIlllII(this.action, EntityUseAction.INTERACT_AT)) {
            final Vec3D c = packetPlayInUseEntity.c();
            this.bodyX = c.x;
            this.bodyY = c.y;
            this.bodyZ = c.z;
            if (null != null) {
                return;
            }
        }
        else {
            final double bodyX = 0.0;
            this.bodyZ = bodyX;
            this.bodyY = bodyX;
            this.bodyX = bodyX;
        }
        this.fetchedEntity = (SPacketPlayInUseEntity.lllIIIIIlllll[2] != 0);
    }
    
    private static void lllIIlIlIllIII() {
        (lllIIIIIllllI = new String[SPacketPlayInUseEntity.lllIIIIIlllll[1]])[SPacketPlayInUseEntity.lllIIIIIlllll[2]] = lllIIlIlIlIlIl("Ow==", "ZnxXq");
        SPacketPlayInUseEntity.lllIIIIIllllI[SPacketPlayInUseEntity.lllIIIIIlllll[0]] = lllIIlIlIlIllI("l2xmrLpHu0I=", "cvzbH");
    }
    
    private static String lllIIlIlIlIlIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayInUseEntity.lllIIIIIlllll[2];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayInUseEntity.lllIIIIIlllll[2];
        while (lllIIlIlIlllIl(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (0 >= 2) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lllIIlIlIlIllI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayInUseEntity.lllIIIIIlllll[1], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIlIlIllIIl() {
        (lllIIIIIlllll = new int[3])[0] = 1;
        SPacketPlayInUseEntity.lllIIIIIlllll[1] = 2;
        SPacketPlayInUseEntity.lllIIIIIlllll[2] = 0;
    }
    
    private static boolean lllIIlIlIlllIl(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean lllIIlIlIlllII(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean lllIIlIlIllIll(final Object o) {
        return o == null;
    }
    
    private static boolean lllIIlIlIllIlI(final int n) {
        return n == 0;
    }
}
