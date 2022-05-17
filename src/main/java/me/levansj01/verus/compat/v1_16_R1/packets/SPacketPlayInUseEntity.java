package me.levansj01.verus.compat.v1_16_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import me.levansj01.verus.util.java.*;
import net.minecraft.server.v1_16_R1.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.craftbukkit.v1_16_R1.*;
import java.lang.ref.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayInUseEntity extends VPacketPlayInUseEntity
{
    private static final Field id_field;
    private boolean fetchedEntity;
    private static final String[] llllIlllIlIl;
    private static final int[] llllIlllIllI;
    
    public void accept(final PacketPlayInUseEntity packetPlayInUseEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayInUseEntity.id_field, packetPlayInUseEntity);
        this.action = EntityUseAction.values()[packetPlayInUseEntity.b().ordinal()];
        if (llllllIIIlIII(this.action, EntityUseAction.INTERACT_AT)) {
            final Vec3D d = packetPlayInUseEntity.d();
            this.bodyX = d.x;
            this.bodyY = d.y;
            this.bodyZ = d.z;
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
        this.fetchedEntity = (SPacketPlayInUseEntity.llllIlllIllI[0] != 0);
    }
    
    static {
        llllllIIIIlll();
        llllllIIIIlIl();
        final Class<PacketPlayInUseEntity> clazz = PacketPlayInUseEntity.class;
        final String[] array = new String[SPacketPlayInUseEntity.llllIlllIllI[1]];
        array[SPacketPlayInUseEntity.llllIlllIllI[0]] = SPacketPlayInUseEntity.llllIlllIlIl[SPacketPlayInUseEntity.llllIlllIllI[0]];
        array[SPacketPlayInUseEntity.llllIlllIllI[2]] = SPacketPlayInUseEntity.llllIlllIlIl[SPacketPlayInUseEntity.llllIlllIllI[2]];
        id_field = SafeReflection.access(clazz, array);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInUseEntity)o);
    }
    
    @Override
    public Entity getEntity(final World world) {
        if (llllllIIIlIIl(this.fetchedEntity ? 1 : 0)) {
            final net.minecraft.server.v1_16_R1.Entity entity = ((CraftWorld)world).getHandle().getEntity(this.id);
            if (llllllIIIlIlI(entity)) {
                this.entity = new WeakReference<Entity>(null);
                return null;
            }
            this.entity = new WeakReference<Entity>(entity.getBukkitEntity());
            this.fetchedEntity = (SPacketPlayInUseEntity.llllIlllIllI[2] != 0);
        }
        Entity entity2;
        if (llllllIIIlIlI(this.entity)) {
            entity2 = null;
            if (false) {
                return null;
            }
        }
        else {
            entity2 = this.entity.get();
        }
        return entity2;
    }
    
    private static void llllllIIIIlIl() {
        (llllIlllIlIl = new String[SPacketPlayInUseEntity.llllIlllIllI[1]])[SPacketPlayInUseEntity.llllIlllIllI[0]] = llllllIIIIlII("d4CvL9tWq10=", "ukYSx");
        SPacketPlayInUseEntity.llllIlllIlIl[SPacketPlayInUseEntity.llllIlllIllI[2]] = llllllIIIIlII("98RZ7RZ/6EA=", "WYDIR");
    }
    
    private static String llllllIIIIlII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayInUseEntity.llllIlllIllI[1], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void llllllIIIIlll() {
        (llllIlllIllI = new int[3])[0] = 0;
        SPacketPlayInUseEntity.llllIlllIllI[1] = 2;
        SPacketPlayInUseEntity.llllIlllIllI[2] = 1;
    }
    
    private static boolean llllllIIIlIII(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean llllllIIIlIlI(final Object o) {
        return o == null;
    }
    
    private static boolean llllllIIIlIIl(final int n) {
        return n == 0;
    }
}
