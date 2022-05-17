package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public abstract class VPacketPlayInEntityAction extends VPacket
{
    protected int value;
    protected PlayerAction action;
    
    public int getValue() {
        return this.value;
    }
    
    public PlayerAction getAction() {
        return this.action;
    }
    
    public enum PlayerAction
    {

        STOP_SNEAKING(PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[1]], PlayerAction.llIlllIIIllIl[1], Type.SNEAK, (boolean)(PlayerAction.llIlllIIIllIl[0] != 0)), 
        STOP_SLEEPING(PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[2]], PlayerAction.llIlllIIIllIl[2], (boolean)(PlayerAction.llIlllIIIllIl[0] != 0)), 
        START_SPRINTING(PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[3]], PlayerAction.llIlllIIIllIl[3], Type.SPRINT, (boolean)(PlayerAction.llIlllIIIllIl[1] != 0)), 
        STOP_SPRINTING(PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[4]], PlayerAction.llIlllIIIllIl[4], Type.SPRINT, (boolean)(PlayerAction.llIlllIIIllIl[0] != 0)),
        START_FALL_FLYING(PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[7]], PlayerAction.llIlllIIIllIl[7], (boolean)(PlayerAction.llIlllIIIllIl[1] != 0)), 
        START_SNEAKING(PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[0]], PlayerAction.llIlllIIIllIl[0], Type.SNEAK, (boolean)(PlayerAction.llIlllIIIllIl[1] != 0)), 
        OPEN_INVENTORY(PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[6]], PlayerAction.llIlllIIIllIl[6], (boolean)(PlayerAction.llIlllIIIllIl[1] != 0)),
        RIDING_JUMP(PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[5]], PlayerAction.llIlllIIIllIl[5], (boolean)(PlayerAction.llIlllIIIllIl[1] != 0)),

        private static String[] llIllIlIIIIll;
        private static int[] llIlllIIIllIl;

        private final Type type;

        private final boolean value;

        public boolean isValue() {
            return this.value;
        }
        
        public Type getType() {
            return this.type;
        }
        
        PlayerAction(final String s, final int n, final boolean b) {
            this(s, n, Type.OTHER, b);
        }
        
        static {
            lllIIIIlIlIIIl();
            llIllllIllIIll();
        }
        
        public boolean isSprint() {
            int n;
            if (lllIIIIlIlIIlI(this.type, Type.SPRINT)) {
                n = PlayerAction.llIlllIIIllIl[1];
                if (3 == 0) {
                    return false;
                }
            }
            else {
                n = PlayerAction.llIlllIIIllIl[0];
            }
            return n != 0;
        }
        
        PlayerAction(final String s, final int n, final Type type, final boolean value) {
            this.type = type;
            this.value = value;
        }
        
        public boolean isSneak() {
            int n;
            if (lllIIIIlIlIIlI(this.type, Type.SNEAK)) {
                n = PlayerAction.llIlllIIIllIl[1];
                if (!true) {
                    return false;
                }
            }
            else {
                n = PlayerAction.llIlllIIIllIl[0];
            }
            return n != 0;
        }
        
        private static void llIllllIllIIll() {
            (llIllIlIIIIll = new String[PlayerAction.llIlllIIIllIl[8]])[PlayerAction.llIlllIIIllIl[0]] = llIllllIlIllIl("Nju3XPdLfvbFrBWEHx40rg==", "IucAG");
            PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[1]] = llIllllIllIIII("HRcjKAUdDSk5EQcNKw==", "NClxZ");
            PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[2]] = llIllllIllIIIl("O+UwDM8tanSadQ0lfLeMww==", "BnAmU");
            PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[3]] = llIllllIllIIII("FiIGAgMaJRcCHgsiDh4Q", "EvGPW");
            PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[4]] = llIllllIlIllIl("Vu5jjJuG5xZVvhvPbJllYg==", "eIEjY");
            PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[5]] = llIllllIlIllIl("Vw7d9aAv4HI/o1bSSOjsLQ==", "NpcEN");
            PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[6]] = llIllllIllIIII("BR8QDzUDAQMEJB4ABxg=", "JOUAj");
            PlayerAction.llIllIlIIIIll[PlayerAction.llIlllIIIllIl[7]] = llIllllIlIllIl("jlvkKR0GC9+N+HDsvWwIwYJQLtR/a1su", "hYnIC");
        }
        
        private static String llIllllIlIllIl(final String s, final String s2) {
            try {
                final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher instance = Cipher.getInstance("Blowfish");
                instance.init(PlayerAction.llIlllIIIllIl[2], secretKeySpec);
                return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        
        private static String llIllllIllIIII(String s, final String s2) {
            s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder sb = new StringBuilder();
            final char[] charArray = s2.toCharArray();
            int n = PlayerAction.llIlllIIIllIl[0];
            final char[] charArray2 = s.toCharArray();
            final int length = charArray2.length;
            int n2 = PlayerAction.llIlllIIIllIl[0];
            while (lllIIIIlIlIIll(n2, length)) {
                sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
                ++n;
                ++n2;
                if (2 <= -1) {
                    return null;
                }
            }
            return String.valueOf(sb);
        }
        
        private static String llIllllIllIIIl(final String s, final String s2) {
            try {
                final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), PlayerAction.llIlllIIIllIl[8]), "DES");
                final Cipher instance = Cipher.getInstance("DES");
                instance.init(PlayerAction.llIlllIIIllIl[2], secretKeySpec);
                return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        
        private static void lllIIIIlIlIIIl() {
            (llIlllIIIllIl = new int[9])[0] = 0;
            PlayerAction.llIlllIIIllIl[1] = 1;
            PlayerAction.llIlllIIIllIl[2] = 2;
            PlayerAction.llIlllIIIllIl[3] = 3;
            PlayerAction.llIlllIIIllIl[4] = 4;
            PlayerAction.llIlllIIIllIl[5] = 5;
            PlayerAction.llIlllIIIllIl[6] = 6;
            PlayerAction.llIlllIIIllIl[7] = 7;
            PlayerAction.llIlllIIIllIl[8] = 8;
        }
        
        private static boolean lllIIIIlIlIIll(final int n, final int n2) {
            return n < n2;
        }
        
        private static boolean lllIIIIlIlIIlI(final Object o, final Object o2) {
            return o == o2;
        }
        
        public enum Type
        {
            SPRINT(Type.lllIlIIIIIIl[Type.lllIlllIlIIl[1]], Type.lllIlllIlIIl[1]),
            OTHER(Type.lllIlIIIIIIl[Type.lllIlllIlIIl[2]], Type.lllIlllIlIIl[2]), 
            SNEAK(Type.lllIlIIIIIIl[Type.lllIlllIlIIl[0]], Type.lllIlllIlIIl[0]);

            Type(final String s, final int n) {
            }

            private static String[] lllIlIIIIIIl;
            private static int[] lllIlllIlIIl;
            
            static {
                llllIIlIllllI();
                lllIllIlIIllI();
            }
            
            private static void lllIllIlIIllI() {
                (lllIlIIIIIIl = new String[Type.lllIlllIlIIl[3]])[Type.lllIlllIlIIl[0]] = lllIllIlIIlII("73Al78Ab/iw=", "mxUjn");
                Type.lllIlIIIIIIl[Type.lllIlllIlIIl[1]] = lllIllIlIIlII("hLsPkZPJVCo=", "bMsTw");
                Type.lllIlIIIIIIl[Type.lllIlllIlIIl[2]] = lllIllIlIIlII("bucw6sSrcyI=", "HfMVp");
            }
            
            private static String lllIllIlIIlII(final String s, final String s2) {
                try {
                    final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), Type.lllIlllIlIIl[4]), "DES");
                    final Cipher instance = Cipher.getInstance("DES");
                    instance.init(Type.lllIlllIlIIl[2], secretKeySpec);
                    return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                    return null;
                }
            }
            
            private static void llllIIlIllllI() {
                (lllIlllIlIIl = new int[5])[0] = 0;
                Type.lllIlllIlIIl[1] = 1;
                Type.lllIlllIlIIl[2] = 2;
                Type.lllIlllIlIIl[3] = 3;
                Type.lllIlllIlIIl[4] = 8;
            }
        }
    }
}
