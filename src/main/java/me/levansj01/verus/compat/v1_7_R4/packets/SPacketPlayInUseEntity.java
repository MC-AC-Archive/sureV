package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_7_R4.*;
import me.levansj01.verus.util.java.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.craftbukkit.v1_7_R4.*;
import java.lang.ref.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class SPacketPlayInUseEntity extends VPacketPlayInUseEntity
{
    private boolean fetchedEntity;
    private static final Field id_field;
    private static final String[] lIIIIlIlIIIII;
    private static final int[] lIIIIlIlIIIIl;
    
    static {
        lIIIlIIIIlIIlI();
        lIIIlIIIIlIIIl();
        id_field = SafeReflection.access(PacketPlayInUseEntity.class, SPacketPlayInUseEntity.lIIIIlIlIIIII[SPacketPlayInUseEntity.lIIIIlIlIIIIl[0]]);
    }
    
    public void accept(final PacketPlayInUseEntity packetPlayInUseEntity) {
        this.id = (int)SafeReflection.fetch(SPacketPlayInUseEntity.id_field, packetPlayInUseEntity);
        if (lIIIlIIIIlIIll(packetPlayInUseEntity.c())) {
            this.action = EntityUseAction.values()[packetPlayInUseEntity.c().ordinal()];
            if (0 > 0) {
                return;
            }
        }
        else {
            this.action = EntityUseAction.INTERACT_AT;
        }
        this.fetchedEntity = (SPacketPlayInUseEntity.lIIIIlIlIIIIl[0] != 0);
    }
    
    @Override
    public Entity getEntity(final World world) {
        if (lIIIlIIIIlIlII(this.fetchedEntity ? 1 : 0)) {
            final net.minecraft.server.v1_7_R4.Entity entity = ((CraftWorld)world).getHandle().getEntity(this.id);
            if (lIIIlIIIIlIlIl(entity)) {
                this.entity = new WeakReference<Entity>(null);
                if (4 <= 0) {
                    return null;
                }
            }
            else {
                this.entity = new WeakReference<Entity>(entity.getBukkitEntity());
            }
            this.fetchedEntity = (SPacketPlayInUseEntity.lIIIIlIlIIIIl[1] != 0);
        }
        Entity entity2;
        if (lIIIlIIIIlIlIl(this.entity)) {
            entity2 = null;
            if (1 >= 4) {
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
    
    private static void lIIIlIIIIlIIIl() {
        (lIIIIlIlIIIII = new String[SPacketPlayInUseEntity.lIIIIlIlIIIIl[1]])[SPacketPlayInUseEntity.lIIIIlIlIIIIl[0]] = lIIIlIIIIlIIII("OosuACNmURk=", "uKQBU");
    }
    
    private static String lIIIlIIIIlIIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(SPacketPlayInUseEntity.lIIIIlIlIIIIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIIIIlIIlI() {
        (lIIIIlIlIIIIl = new int[3])[0] = 0;
        SPacketPlayInUseEntity.lIIIIlIlIIIIl[1] = 1;
        SPacketPlayInUseEntity.lIIIIlIlIIIIl[2] = 2;
    }
    
    private static boolean lIIIlIIIIlIIll(final Object o) {
        return o != null;
    }
    
    private static boolean lIIIlIIIIlIlIl(final Object o) {
        return o == null;
    }
    
    private static boolean lIIIlIIIIlIlII(final int n) {
        return n == 0;
    }
}
