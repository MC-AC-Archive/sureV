package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public abstract class VPacketPlayInClientCommand extends VPacket
{
    protected ClientCommand command;
    
    public ClientCommand getCommand() {
        return this.command;
    }
    
    public enum ClientCommand
    {
        REQUEST_STATS(ClientCommand.llIIIIllIIIII[ClientCommand.llIIIIllIlIII[1]], ClientCommand.llIIIIllIlIII[1]),
        OPEN_INVENTORY_ACHIEVEMENT(ClientCommand.llIIIIllIIIII[ClientCommand.llIIIIllIlIII[2]], ClientCommand.llIIIIllIlIII[2]), 
        PERFORM_RESPAWN(ClientCommand.llIIIIllIIIII[ClientCommand.llIIIIllIlIII[0]], ClientCommand.llIIIIllIlIII[0]);
        
        private ClientCommand(final String s, final int n) {
        }

        private static String[] llIIIIllIIIII;
        private static int[] llIIIIllIlIII;
        
        static {
            llIIIlllIlIIlI();
            llIIIllIlllIIl();
        }
        
        private static void llIIIllIlllIIl() {
            (llIIIIllIIIII = new String[ClientCommand.llIIIIllIlIII[3]])[ClientCommand.llIIIIllIlIII[0]] = llIIIllIllIlII("CjU2PxUIPTsrHwkgJS4U", "ZpdyZ");
            ClientCommand.llIIIIllIIIII[ClientCommand.llIIIIllIlIII[1]] = llIIIllIllIllI("lgx9oYRbF60b5ijS1O1UQA==", "nfSUH");
            ClientCommand.llIIIIllIIIII[ClientCommand.llIIIIllIlIII[2]] = llIIIllIllIlll("tfzQkBqspK8KlQkSzBngGWp7VbO4cjODOnmA0SFdWDs=", "gqgul");
        }
        
        private static String llIIIllIllIllI(final String s, final String s2) {
            try {
                final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), ClientCommand.llIIIIllIlIII[4]), "DES");
                final Cipher instance = Cipher.getInstance("DES");
                instance.init(ClientCommand.llIIIIllIlIII[2], secretKeySpec);
                return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        
        private static String llIIIllIllIlII(String s, final String s2) {
            s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder sb = new StringBuilder();
            final char[] charArray = s2.toCharArray();
            int n = ClientCommand.llIIIIllIlIII[0];
            final char[] charArray2 = s.toCharArray();
            final int length = charArray2.length;
            int n2 = ClientCommand.llIIIIllIlIII[0];
            while (llIIIlllIlIIll(n2, length)) {
                sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
                ++n;
                ++n2;
                if (1 == -1) {
                    return null;
                }
            }
            return String.valueOf(sb);
        }
        
        private static String llIIIllIllIlll(final String s, final String s2) {
            try {
                final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher instance = Cipher.getInstance("Blowfish");
                instance.init(ClientCommand.llIIIIllIlIII[2], secretKeySpec);
                return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        
        private static void llIIIlllIlIIlI() {
            (llIIIIllIlIII = new int[5])[0] = 0;
            ClientCommand.llIIIIllIlIII[1] = 1;
            ClientCommand.llIIIIllIlIII[2] = 2;
            ClientCommand.llIIIIllIlIII[3] = 3;
            ClientCommand.llIIIIllIlIII[4] = 8;
        }
        
        private static boolean llIIIlllIlIIll(final int n, final int n2) {
            return n < n2;
        }
    }
}
