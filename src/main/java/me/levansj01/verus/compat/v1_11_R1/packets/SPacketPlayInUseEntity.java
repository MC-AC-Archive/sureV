package me.levansj01.verus.compat.v1_11_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import me.levansj01.verus.util.java.*;
import net.minecraft.server.v1_11_R1.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.craftbukkit.v1_11_R1.*;
import java.lang.ref.*;
import java.util.*;
import java.nio.charset.*;

public class SPacketPlayInUseEntity extends VPacketPlayInUseEntity
{
    private static final Field id_field;
    private boolean fetchedEntity;
    private static final String[] lIlIlIlllIlII;
    private static final int[] lIlIlIlllIlIl;
    
    static {
        lIlIllllIlllll();
        lIlIllllIllllI();
        final Class<PacketPlayInUseEntity> clazz = PacketPlayInUseEntity.class;
        final String[] array = new String[SPacketPlayInUseEntity.lIlIlIlllIlIl[0]];
        array[SPacketPlayInUseEntity.lIlIlIlllIlIl[1]] = SPacketPlayInUseEntity.lIlIlIlllIlII[SPacketPlayInUseEntity.lIlIlIlllIlIl[1]];
        array[SPacketPlayInUseEntity.lIlIlIlllIlIl[2]] = SPacketPlayInUseEntity.lIlIlIlllIlII[SPacketPlayInUseEntity.lIlIlIlllIlIl[2]];
        id_field = SafeReflection.access(clazz, array);
    }
    
    public void accept(final PacketPlayInUseEntity packetPlayInUseEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayInUseEntity.id_field, packetPlayInUseEntity);
        this.action = EntityUseAction.values()[packetPlayInUseEntity.a().ordinal()];
        if (lIlIlllllIIIII(this.action, EntityUseAction.INTERACT_AT)) {
            final Vec3D c = packetPlayInUseEntity.c();
            this.bodyX = c.x;
            this.bodyY = c.y;
            this.bodyZ = c.z;
            if (-4 > 0) {
                return;
            }
        }
        else {
            final double bodyX = 0.0;
            this.bodyZ = bodyX;
            this.bodyY = bodyX;
            this.bodyX = bodyX;
        }
        this.fetchedEntity = (SPacketPlayInUseEntity.lIlIlIlllIlIl[1] != 0);
    }
    
    @Override
    public Entity getEntity(final World world) {
        if (lIlIlllllIIIIl(this.fetchedEntity ? 1 : 0)) {
            final net.minecraft.server.v1_11_R1.Entity entity = ((CraftWorld)world).getHandle().getEntity(this.id);
            if (lIlIlllllIIIlI(entity)) {
                this.entity = new WeakReference<Entity>(null);
                if (null != null) {
                    return null;
                }
            }
            else {
                this.entity = new WeakReference<Entity>(entity.getBukkitEntity());
            }
            this.fetchedEntity = (SPacketPlayInUseEntity.lIlIlIlllIlIl[2] != 0);
        }
        Entity entity2;
        if (lIlIlllllIIIlI(this.entity)) {
            entity2 = null;
            if (3 < 0) {
                return null;
            }
        }
        else {
            entity2 = this.entity.get();
        }
        return entity2;
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInUseEntity)o);
    }
    
    private static void lIlIllllIllllI() {
        (lIlIlIlllIlII = new String[SPacketPlayInUseEntity.lIlIlIlllIlIl[0]])[SPacketPlayInUseEntity.lIlIlIlllIlIl[1]] = lIlIllllIlllIl("Kw==", "JvFdM");
        SPacketPlayInUseEntity.lIlIlIlllIlII[SPacketPlayInUseEntity.lIlIlIlllIlIl[2]] = lIlIllllIlllIl("OjY=", "SRmgD");
    }
    
    private static String lIlIllllIlllIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayInUseEntity.lIlIlIlllIlIl[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayInUseEntity.lIlIlIlllIlIl[1];
        while (lIlIlllllIIIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (0 > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIlIllllIlllll() {
        (lIlIlIlllIlIl = new int[3])[0] = 2;
        SPacketPlayInUseEntity.lIlIlIlllIlIl[1] = 0;
        SPacketPlayInUseEntity.lIlIlIlllIlIl[2] = 1;
    }
    
    private static boolean lIlIlllllIIIll(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean lIlIlllllIIIII(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean lIlIlllllIIIlI(final Object o) {
        return o == null;
    }
    
    private static boolean lIlIlllllIIIIl(final int n) {
        return n == 0;
    }
}
