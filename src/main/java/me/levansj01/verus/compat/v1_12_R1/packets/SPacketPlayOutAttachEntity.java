package me.levansj01.verus.compat.v1_12_R1.packets;

import me.levansj01.verus.compat.packets.*;
import java.lang.reflect.*;
import net.minecraft.server.v1_12_R1.*;
import me.levansj01.verus.util.java.*;
import java.util.*;
import java.nio.charset.*;

public class SPacketPlayOutAttachEntity extends VPacketPlayOutAttachEntity
{
    private static final Field a_field;
    private static final Field b_field;
    private static final String[] llIIIIIlIlIIl;
    private static final int[] llIIIIlIIIIlI;
    
    public void accept(final PacketPlayOutAttachEntity packetPlayOutAttachEntity) {
        this.leash = (byte)SPacketPlayOutAttachEntity.llIIIIlIIIIlI[0];
        this.entityId = (int)SafeReflection.fetch(SPacketPlayOutAttachEntity.a_field, packetPlayOutAttachEntity);
        this.attachId = (int)SafeReflection.fetch(SPacketPlayOutAttachEntity.b_field, packetPlayOutAttachEntity);
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayOutAttachEntity)o);
    }
    
    static {
        llIIIllIIIlIII();
        llIIIlIlIIIllI();
        a_field = SafeReflection.access(PacketPlayOutAttachEntity.class, SPacketPlayOutAttachEntity.llIIIIIlIlIIl[SPacketPlayOutAttachEntity.llIIIIlIIIIlI[0]]);
        b_field = SafeReflection.access(PacketPlayOutAttachEntity.class, SPacketPlayOutAttachEntity.llIIIIIlIlIIl[SPacketPlayOutAttachEntity.llIIIIlIIIIlI[1]]);
    }
    
    private static void llIIIlIlIIIllI() {
        (llIIIIIlIlIIl = new String[SPacketPlayOutAttachEntity.llIIIIlIIIIlI[2]])[SPacketPlayOutAttachEntity.llIIIIlIIIIlI[0]] = llIIIlIlIIIlIl("EQ==", "pFQqF");
        SPacketPlayOutAttachEntity.llIIIIIlIlIIl[SPacketPlayOutAttachEntity.llIIIIlIIIIlI[1]] = llIIIlIlIIIlIl("OA==", "ZsKVe");
    }
    
    private static String llIIIlIlIIIlIl(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = SPacketPlayOutAttachEntity.llIIIIlIIIIlI[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = SPacketPlayOutAttachEntity.llIIIIlIIIIlI[0];
        while (llIIIllIIIlIIl(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (2 < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void llIIIllIIIlIII() {
        (llIIIIlIIIIlI = new int[3])[0] = 0;
        SPacketPlayOutAttachEntity.llIIIIlIIIIlI[1] = 1;
        SPacketPlayOutAttachEntity.llIIIIlIIIIlI[2] = 2;
    }
    
    private static boolean llIIIllIIIlIIl(final int n, final int n2) {
        return n < n2;
    }
}
