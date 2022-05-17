package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;
import me.levansj01.verus.verus2.data.player.*;
import me.levansj01.verus.data.*;
import me.levansj01.verus.util.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public abstract class VPacketPlayOutPosition extends VPacket
{
    protected double y;
    protected float pitch;
    protected float yaw;
    protected Set<TeleportFlag> flags;
    protected double x;
    protected double z;
    
    public Teleport toTeleport(final int n, final long n2) {
        return new Teleport(this.x, this.y, this.z, this.yaw, this.pitch, this.flags, n, n2);
    }
    
    public float getPitch() {
        return this.pitch;
    }
    
    public double getY() {
        return this.y;
    }
    
    public double getZ() {
        return this.z;
    }
    
    public float getYaw() {
        return this.yaw;
    }
    
    public PlayerLocation toLocation(final PlayerData playerData) {
        return new PlayerLocation(System.currentTimeMillis(), playerData.getTotalTicks(), this.x, this.y, this.z, this.yaw, this.pitch, null);
    }
    
    public Set getFlags() {
        return this.flags;
    }
    
    public double getX() {
        return this.x;
    }
    
    public enum TeleportFlag
    {
        X_ROT(TeleportFlag.llIlllIlIIlIl[TeleportFlag.llIlllIlIlIIl[4]], TeleportFlag.llIlllIlIlIIl[4]), 
        Z(TeleportFlag.llIlllIlIIlIl[TeleportFlag.llIlllIlIlIIl[2]], TeleportFlag.llIlllIlIlIIl[2]), 
        Y_ROT(TeleportFlag.llIlllIlIIlIl[TeleportFlag.llIlllIlIlIIl[3]], TeleportFlag.llIlllIlIlIIl[3]), 
        Y(TeleportFlag.llIlllIlIIlIl[TeleportFlag.llIlllIlIlIIl[1]], TeleportFlag.llIlllIlIlIIl[1]), 
        X(TeleportFlag.llIlllIlIIlIl[TeleportFlag.llIlllIlIlIIl[0]], TeleportFlag.llIlllIlIlIIl[0]);
        
        private static final TeleportFlag[] $VALUES;
        private static final String[] llIlllIlIIlIl;
        private static final int[] llIlllIlIlIIl;
        
        private TeleportFlag(final String s, final int n) {
        }
        
        static {
            lllIIIIllllllI();
            lllIIIIlllllII();
            final TeleportFlag[] $values = new TeleportFlag[TeleportFlag.llIlllIlIlIIl[5]];
            $values[TeleportFlag.llIlllIlIlIIl[0]] = TeleportFlag.X;
            $values[TeleportFlag.llIlllIlIlIIl[1]] = TeleportFlag.Y;
            $values[TeleportFlag.llIlllIlIlIIl[2]] = TeleportFlag.Z;
            $values[TeleportFlag.llIlllIlIlIIl[3]] = TeleportFlag.Y_ROT;
            $values[TeleportFlag.llIlllIlIlIIl[4]] = TeleportFlag.X_ROT;
            $VALUES = $values;
        }
        
        private static void lllIIIIlllllII() {
            (llIlllIlIIlIl = new String[TeleportFlag.llIlllIlIlIIl[5]])[TeleportFlag.llIlllIlIlIIl[0]] = lllIIIIllllIII("G3KbwKbDuOo=", "QZuXj");
            TeleportFlag.llIlllIlIIlIl[TeleportFlag.llIlllIlIlIIl[1]] = lllIIIIllllIIl("r8O5mRS6sM0=", "zwoiO");
            TeleportFlag.llIlllIlIIlIl[TeleportFlag.llIlllIlIlIIl[2]] = lllIIIIllllIIl("kuZ7VnPbpGc=", "WYiAu");
            TeleportFlag.llIlllIlIIlIl[TeleportFlag.llIlllIlIlIIl[3]] = lllIIIIllllIIl("pE2Ija+3bL4=", "SYHzp");
            TeleportFlag.llIlllIlIIlIl[TeleportFlag.llIlllIlIlIIl[4]] = lllIIIIllllIII("51ReFBSy51s=", "VaDse");
        }
        
        private static String lllIIIIllllIIl(final String s, final String s2) {
            try {
                final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher instance = Cipher.getInstance("Blowfish");
                instance.init(TeleportFlag.llIlllIlIlIIl[2], secretKeySpec);
                return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        
        private static String lllIIIIllllIII(final String s, final String s2) {
            try {
                final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), TeleportFlag.llIlllIlIlIIl[6]), "DES");
                final Cipher instance = Cipher.getInstance("DES");
                instance.init(TeleportFlag.llIlllIlIlIIl[2], secretKeySpec);
                return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        
        private static void lllIIIIllllllI() {
            (llIlllIlIlIIl = new int[7])[0] = 0;
            TeleportFlag.llIlllIlIlIIl[1] = 1;
            TeleportFlag.llIlllIlIlIIl[2] = 2;
            TeleportFlag.llIlllIlIlIIl[3] = 3;
            TeleportFlag.llIlllIlIlIIl[4] = 4;
            TeleportFlag.llIlllIlIlIIl[5] = 5;
            TeleportFlag.llIlllIlIlIIl[6] = 8;
        }
    }
}
