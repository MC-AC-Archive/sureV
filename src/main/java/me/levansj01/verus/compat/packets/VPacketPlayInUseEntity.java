package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;
import java.lang.ref.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public abstract class VPacketPlayInUseEntity extends VPacket
{
    protected EntityUseAction action;
    protected WeakReference<Entity> entity;
    protected int id;
    protected double bodyY;
    protected double bodyX;
    protected double bodyZ;
    
    public double getBodyY() {
        return this.bodyY;
    }
    
    public EntityUseAction getAction() {
        return this.action;
    }
    
    @Override
    public void done() {
        if (this.entity != null) {
            this.entity.clear();
        }
        this.entity = null;
    }
    
    public double getBodyX() {
        return this.bodyX;
    }
    
    public double getBodyZ() {
        return this.bodyZ;
    }
    
    public int getId() {
        return this.id;
    }
    
    public abstract Entity getEntity(final World p0);
    
    public enum EntityUseAction
    {
        ATTACK(EntityUseAction.lIIIIlIlIIIlI[EntityUseAction.lIIIIlIlIIlII[0]], EntityUseAction.lIIIIlIlIIlII[0]),
        INTERACT_AT(EntityUseAction.lIIIIlIlIIIlI[EntityUseAction.lIIIIlIlIIlII[2]], EntityUseAction.lIIIIlIlIIlII[2]), 
        INTERACT(EntityUseAction.lIIIIlIlIIIlI[EntityUseAction.lIIIIlIlIIlII[1]], EntityUseAction.lIIIIlIlIIlII[1]);

        private static String[] lIIIIlIlIIIlI;
        private static int[] lIIIIlIlIIlII;
        
        public boolean isAttack() {
            int n;
            if (lIIIlIIIIlllIl(this, EntityUseAction.ATTACK)) {
                n = EntityUseAction.lIIIIlIlIIlII[0];
                if (null != null) {
                    return false;
                }
            }
            else {
                n = EntityUseAction.lIIIIlIlIIlII[1];
            }
            return n != 0;
        }
        
        public boolean isInteract() {
            int n;
            if (lIIIlIIIIlllIl(this, EntityUseAction.INTERACT)) {
                n = EntityUseAction.lIIIIlIlIIlII[0];
                if (null != null) {
                    return false;
                }
            }
            else {
                n = EntityUseAction.lIIIIlIlIIlII[1];
            }
            return n != 0;
        }
        
        static {
            lIIIlIIIIlllII();
            lIIIlIIIIllIII();
        }
        
        public boolean isInteractAt() {
            int n;
            if (lIIIlIIIIlllIl(this, EntityUseAction.INTERACT_AT)) {
                n = EntityUseAction.lIIIIlIlIIlII[0];
                if (2 == -1) {
                    return false;
                }
            }
            else {
                n = EntityUseAction.lIIIIlIlIIlII[1];
            }
            return n != 0;
        }
        
        EntityUseAction(final String s, final int n) {
        }
        
        private static void lIIIlIIIIllIII() {
            (lIIIIlIlIIIlI = new String[EntityUseAction.lIIIIlIlIIlII[3]])[EntityUseAction.lIIIIlIlIIlII[1]] = lIIIlIIIIlIllI("GC0EITUQIAQ=", "QcPdg");
            EntityUseAction.lIIIIlIlIIIlI[EntityUseAction.lIIIIlIlIIlII[0]] = lIIIlIIIIlIllI("NAItNQY+", "uVytE");
            EntityUseAction.lIIIIlIlIIIlI[EntityUseAction.lIIIIlIlIIlII[2]] = lIIIlIIIIlIlll("M3/2kBx2pbp08KdWYtFkjA==", "xksBX");
        }
        
        private static String lIIIlIIIIlIlll(final String s, final String s2) {
            try {
                final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), EntityUseAction.lIIIIlIlIIlII[4]), "DES");
                final Cipher instance = Cipher.getInstance("DES");
                instance.init(EntityUseAction.lIIIIlIlIIlII[2], secretKeySpec);
                return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        
        private static String lIIIlIIIIlIllI(String s, final String s2) {
            s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder sb = new StringBuilder();
            final char[] charArray = s2.toCharArray();
            int n = EntityUseAction.lIIIIlIlIIlII[1];
            final char[] charArray2 = s.toCharArray();
            final int length = charArray2.length;
            int n2 = EntityUseAction.lIIIIlIlIIlII[1];
            while (lIIIlIIIIllllI(n2, length)) {
                sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
                ++n;
                ++n2;
                if (-1 >= 1) {
                    return null;
                }
            }
            return String.valueOf(sb);
        }
        
        private static void lIIIlIIIIlllII() {
            (lIIIIlIlIIlII = new int[5])[0] = 1;
            EntityUseAction.lIIIIlIlIIlII[1] = 0;
            EntityUseAction.lIIIIlIlIIlII[2] = 2;
            EntityUseAction.lIIIIlIlIIlII[3] = 3;
            EntityUseAction.lIIIIlIlIIlII[4] = 8;
        }
        
        private static boolean lIIIlIIIIllllI(final int n, final int n2) {
            return n < n2;
        }
        
        private static boolean lIIIlIIIIlllIl(final Object o, final Object o2) {
            return o == o2;
        }
    }
}
