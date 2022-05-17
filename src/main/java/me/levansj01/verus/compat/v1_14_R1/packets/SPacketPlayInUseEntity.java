package me.levansj01.verus.compat.v1_14_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.craftbukkit.v1_14_R1.*;
import java.lang.ref.*;
import me.levansj01.verus.util.java.*;
import net.minecraft.server.v1_14_R1.*;
import java.util.*;
import java.nio.charset.*;

public class SPacketPlayInUseEntity extends VPacketPlayInUseEntity
{
    private boolean fetchedEntity;
    private static final Field id_field;
    private static final String[] llIllllIllIll;
    private static final int[] llIllllIlllIl;
    
    @Override
    public Entity getEntity(final World world) {
        if (lllIIIllIlIllI(this.fetchedEntity ? 1 : 0)) {
            final net.minecraft.server.v1_14_R1.Entity entity = ((CraftWorld)world).getHandle().getEntity(this.id);
            if (lllIIIllIlIlll(entity)) {
                this.entity = new WeakReference<Entity>(null);
                if (null != null) {
                    return null;
                }
            }
            else {
                this.entity = new WeakReference<Entity>(entity.getBukkitEntity());
            }
            this.fetchedEntity = (SPacketPlayInUseEntity.llIllllIlllIl[0] != 0);
        }
        Entity entity2;
        if (lllIIIllIlIlll(this.entity)) {
            entity2 = null;
            if (1 < 0) {
                return null;
            }
        }
        else {
            entity2 = this.entity.get();
        }
        return entity2;
    }
    
    public void accept(final PacketPlayInUseEntity packetPlayInUseEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayInUseEntity.id_field, packetPlayInUseEntity);
        this.action = EntityUseAction.values()[packetPlayInUseEntity.b().ordinal()];
        if (lllIIIllIllIIl(this.action, EntityUseAction.INTERACT_AT)) {
            final Vec3D d = packetPlayInUseEntity.d();
            this.bodyX = d.x;
            this.bodyY = d.y;
            this.bodyZ = d.z;
            if (2 <= 0) {
                return;
            }
        }
        else {
            final double bodyX = 0.0;
            this.bodyZ = bodyX;
            this.bodyY = bodyX;
            this.bodyX = bodyX;
        }
        this.fetchedEntity = (SPacketPlayInUseEntity.llIllllIlllIl[1] != 0);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInUseEntity)o);
    }
    
    static {
        lllIIIllIlIlIl();
        lllIIIllIlIIlI();
        final Class<PacketPlayInUseEntity> clazz = PacketPlayInUseEntity.class;
        final String[] array = new String[SPacketPlayInUseEntity.llIllllIlllIl[2]];
        array[SPacketPlayInUseEntity.llIllllIlllIl[1]] = SPacketPlayInUseEntity.llIllllIllIll[SPacketPlayInUseEntity.llIllllIlllIl[1]];
        array[SPacketPlayInUseEntity.llIllllIlllIl[0]] = SPacketPlayInUseEntity.llIllllIllIll[SPacketPlayInUseEntity.llIllllIlllIl[0]];
        id_field = SafeReflection.access(clazz, array);
    }
    
    private static void lllIIIllIlIIlI() {
        (llIllllIllIll = new String[SPacketPlayInUseEntity.llIllllIlllIl[2]])[SPacketPlayInUseEntity.llIllllIlllIl[1]] = lllIIIllIlIIIl("Jg==", "GpYAb");
        SPacketPlayInUseEntity.llIllllIllIll[SPacketPlayInUseEntity.llIllllIlllIl[0]] = lllIIIllIlIIIl("IhI=", "Kvlwu");
    }
    
    private static String lllIIIllIlIIIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayInUseEntity.llIllllIlllIl[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayInUseEntity.llIllllIlllIl[1];
        while (lllIIIllIllIlI(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (!true) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lllIIIllIlIlIl() {
        (llIllllIlllIl = new int[3])[0] = 1;
        SPacketPlayInUseEntity.llIllllIlllIl[1] = 0;
        SPacketPlayInUseEntity.llIllllIlllIl[2] = 2;
    }
    
    private static boolean lllIIIllIllIlI(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean lllIIIllIllIIl(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean lllIIIllIlIlll(final Object o) {
        return o == null;
    }
    
    private static boolean lllIIIllIlIllI(final int n) {
        return n == 0;
    }
}
