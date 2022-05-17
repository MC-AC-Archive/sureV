package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public abstract class VPacketPlayInBlockDig extends VPacket
{
    protected Direction face;
    protected BlockPosition blockPosition;
    protected PlayerDigType type;
    
    public BlockPosition getBlockPosition() {
        return this.blockPosition;
    }
    
    public PlayerDigType getType() {
        return this.type;
    }
    
    public Direction getFace() {
        return this.face;
    }
    
    public enum PlayerDigType
    {
        DROP_ITEM(PlayerDigType.lllIIlIllIIIl[PlayerDigType.lllIIlIlllIII[4]], PlayerDigType.lllIIlIlllIII[4]), 
        ABORT_DESTROY_BLOCK(PlayerDigType.lllIIlIllIIIl[PlayerDigType.lllIIlIlllIII[1]], PlayerDigType.lllIIlIlllIII[1]), 
        RELEASE_USE_ITEM(PlayerDigType.lllIIlIllIIIl[PlayerDigType.lllIIlIlllIII[5]], PlayerDigType.lllIIlIlllIII[5]), 
        STOP_DESTROY_BLOCK(PlayerDigType.lllIIlIllIIIl[PlayerDigType.lllIIlIlllIII[2]], PlayerDigType.lllIIlIlllIII[2]), 
        START_DESTROY_BLOCK(PlayerDigType.lllIIlIllIIIl[PlayerDigType.lllIIlIlllIII[0]], PlayerDigType.lllIIlIlllIII[0]), 
        DROP_ALL_ITEMS(PlayerDigType.lllIIlIllIIIl[PlayerDigType.lllIIlIlllIII[3]], PlayerDigType.lllIIlIlllIII[3]), 
        SWAP_HELD_ITEMS(PlayerDigType.lllIIlIllIIIl[PlayerDigType.lllIIlIlllIII[6]], PlayerDigType.lllIIlIlllIII[6]);
        
        private static final PlayerDigType[] $VALUES;
        private static final String[] lllIIlIllIIIl;
        private static final int[] lllIIlIlllIII;
        
        static {
            lllIlIIlllIIII();
            lllIlIIllIIIll();
            final PlayerDigType[] $values = new PlayerDigType[PlayerDigType.lllIIlIlllIII[7]];
            $values[PlayerDigType.lllIIlIlllIII[0]] = PlayerDigType.START_DESTROY_BLOCK;
            $values[PlayerDigType.lllIIlIlllIII[1]] = PlayerDigType.ABORT_DESTROY_BLOCK;
            $values[PlayerDigType.lllIIlIlllIII[2]] = PlayerDigType.STOP_DESTROY_BLOCK;
            $values[PlayerDigType.lllIIlIlllIII[3]] = PlayerDigType.DROP_ALL_ITEMS;
            $values[PlayerDigType.lllIIlIlllIII[4]] = PlayerDigType.DROP_ITEM;
            $values[PlayerDigType.lllIIlIlllIII[5]] = PlayerDigType.RELEASE_USE_ITEM;
            $values[PlayerDigType.lllIIlIlllIII[6]] = PlayerDigType.SWAP_HELD_ITEMS;
            $VALUES = $values;
        }
        
        private PlayerDigType(final String s, final int n) {
        }
        
        private static void lllIlIIllIIIll() {
            (lllIIlIllIIIl = new String[PlayerDigType.lllIIlIlllIII[7]])[PlayerDigType.lllIIlIlllIII[0]] = lllIlIIlIlllll("ch/5fJCsYgRHE7Ztymqzds16gJuF3CY0", "eFkGG");
            PlayerDigType.lllIIlIllIIIl[PlayerDigType.lllIIlIlllIII[1]] = lllIlIIllIIIIl("5lsAl2SumnGwcR8acoX+mVeZ7EtUdXpz", "xMWTd");
            PlayerDigType.lllIIlIllIIIl[PlayerDigType.lllIIlIlllIII[2]] = lllIlIIllIIIIl("uQ+TYBwSLo6OtSM8nqdkwuxMiq2RO95d", "DJlOh");
            PlayerDigType.lllIIlIllIIIl[PlayerDigType.lllIIlIlllIII[3]] = lllIlIIlIlllll("g3b0l5GcvZkMkvZrbL8G0g==", "EgImu");
            PlayerDigType.lllIIlIllIIIl[PlayerDigType.lllIIlIlllIII[4]] = lllIlIIllIIIIl("wXCyVcTHpudV3PCjczB74A==", "OwFaa");
            PlayerDigType.lllIIlIllIIIl[PlayerDigType.lllIIlIlllIII[5]] = lllIlIIllIIIIl("vzfWjoBUeT/JclY9AoTHAl1oZCcFzm5L", "NKMHo");
            PlayerDigType.lllIIlIllIIIl[PlayerDigType.lllIIlIlllIII[6]] = lllIlIIllIIIlI("ABgwKikbCj0+KRobNDcl", "SOqzv");
        }
        
        private static String lllIlIIllIIIIl(final String s, final String s2) {
            try {
                final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), PlayerDigType.lllIIlIlllIII[8]), "DES");
                final Cipher instance = Cipher.getInstance("DES");
                instance.init(PlayerDigType.lllIIlIlllIII[2], secretKeySpec);
                return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        
        private static String lllIlIIlIlllll(final String s, final String s2) {
            try {
                final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher instance = Cipher.getInstance("Blowfish");
                instance.init(PlayerDigType.lllIIlIlllIII[2], secretKeySpec);
                return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        
        private static String lllIlIIllIIIlI(String s, final String s2) {
            s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder sb = new StringBuilder();
            final char[] charArray = s2.toCharArray();
            int n = PlayerDigType.lllIIlIlllIII[0];
            final char[] charArray2 = s.toCharArray();
            final int length = charArray2.length;
            int n2 = PlayerDigType.lllIIlIlllIII[0];
            while (lllIlIIlllIIIl(n2, length)) {
                sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
                ++n;
                ++n2;
                if (2 < 0) {
                    return null;
                }
            }
            return String.valueOf(sb);
        }
        
        private static void lllIlIIlllIIII() {
            (lllIIlIlllIII = new int[9])[0] = 0;
            PlayerDigType.lllIIlIlllIII[1] = 1;
            PlayerDigType.lllIIlIlllIII[2] = 2;
            PlayerDigType.lllIIlIlllIII[3] = 3;
            PlayerDigType.lllIIlIlllIII[4] = 4;
            PlayerDigType.lllIIlIlllIII[5] = 5;
            PlayerDigType.lllIIlIlllIII[6] = 6;
            PlayerDigType.lllIIlIlllIII[7] = 7;
            PlayerDigType.lllIIlIlllIII[8] = 8;
        }
        
        private static boolean lllIlIIlllIIIl(final int n, final int n2) {
            return n < n2;
        }
    }
}
