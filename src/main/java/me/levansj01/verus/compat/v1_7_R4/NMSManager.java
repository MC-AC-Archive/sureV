package me.levansj01.verus.compat.v1_7_R4;

import org.bukkit.craftbukkit.v1_7_R4.*;
import org.bukkit.material.*;
import org.bukkit.craftbukkit.v1_7_R4.util.*;
import org.bukkit.entity.*;
import me.levansj01.verus.util.*;
import org.bukkit.craftbukkit.v1_7_R4.entity.*;
import me.levansj01.verus.data.version.*;
import me.levansj01.verus.compat.*;
import net.minecraft.util.com.google.common.cache.*;
import java.util.concurrent.*;
import org.bukkit.inventory.*;
import org.bukkit.craftbukkit.v1_7_R4.inventory.*;
import org.bukkit.*;
import me.levansj01.verus.data.*;
import net.minecraft.server.v1_7_R4.*;
import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class NMSManager extends me.levansj01.verus.compat.NMSManager
{
    private static final String[] lIlIlllIIlIll;
    private static final int[] lIlIlllIIllIl;
    
    @Override
    public boolean setInWater(final Player player, final boolean b) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        return handle.inWater = handle.inWater;
    }
    
    @Override
    public void sendTransaction(final Player player, final short n) {
        this.getConnection(player).sendPacket((Packet)new PacketPlayOutTransaction(NMSManager.lIlIlllIIllIl[0], n, (boolean)(NMSManager.lIlIlllIIllIl[0] != 0)));
    }
    
    @Override
    public void sendBlockUpdate(final Player player, final Location location) {
        if (lIllIIlIIIlIll(((WorldServer)location.getWorld()).isLoaded(location.getBlockX(), location.getBlockY(), location.getBlockZ()) ? 1 : 0)) {
            ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)new PacketPlayOutBlockChange(location.getBlockX(), location.getBlockY(), location.getBlockZ(), (World)location.getWorld()));
        }
    }
    
    @Override
    public boolean setOnGround(final Player player, final boolean onGround) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        final boolean onGround2 = handle.onGround;
        handle.onGround = onGround;
        return onGround2;
    }
    
    @Override
    public boolean rayTrace(final org.bukkit.World world, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final boolean b, final boolean b2, final boolean b3) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        final MovingObjectPosition rayTrace = handle.rayTrace(Vec3D.a(n, n2, n3), Vec3D.a(n4, n5, n6), b, b2, b3);
        if (lIllIIlIIIllII(rayTrace)) {
            return NMSManager.lIlIlllIIllIl[0] != 0;
        }
        int n7;
        if (lIllIIlIIIllIl(handle.getType(rayTrace.b, rayTrace.c, rayTrace.d), Blocks.ENDER_PORTAL)) {
            n7 = NMSManager.lIlIlllIIllIl[1];
            if (2 == 3) {
                return false;
            }
        }
        else {
            n7 = NMSManager.lIlIlllIIllIl[0];
        }
        return n7 != 0;
    }
    
    @Override
    public MaterialData getTypeAndData(final Player player, final org.bukkit.World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        if (lIllIIlIIIlIll(handle.isLoaded(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ()) ? 1 : 0)) {
            return CraftMagicNumbers.getMaterial(handle.getType(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ())).getNewData((byte)handle.getData(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ()));
        }
        return new MaterialData(NMSManager.lIlIlllIIllIl[0]);
    }
    
    @Override
    public boolean isEmpty(final org.bukkit.World world, final Entity entity, final Cuboid cuboid, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        if (lIllIIlIIIlIll(handle.isLoaded(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ()) ? 1 : 0)) {
            final Block type = handle.getType(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
            final AxisAlignedBB a = AxisAlignedBB.a(cuboid.getX1(), cuboid.getY1(), cuboid.getZ1(), cuboid.getX2(), cuboid.getY2(), cuboid.getZ2());
            final ArrayList list = new ArrayList(NMSManager.lIlIlllIIllIl[1]);
            type.a((World)handle, mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ(), a, (List)list, ((CraftEntity)entity).getHandle());
            return list.isEmpty();
        }
        return NMSManager.lIlIlllIIllIl[1] != 0;
    }
    
    @Override
    public float getFrictionFactor(final org.bukkit.block.Block block) {
        return CraftMagicNumbers.getBlock(block).frictionFactor;
    }
    
    @Override
    public ClientVersion getVersion(final Player player) {
        ClientVersion clientVersion = null;
        switch (this.getConnection(player).networkManager.getVersion()) {
            case 4:
            case 5: {
                clientVersion = ClientVersion.VERSION1_7;
                if (-1 >= 2) {
                    return null;
                }
                break;
            }
            case 47: {
                clientVersion = ClientVersion.VERSION1_8;
                if (-1 >= 1) {
                    return null;
                }
                break;
            }
            default: {
                clientVersion = ClientVersion.VERSION_UNSUPPORTED;
                break;
            }
        }
        return clientVersion;
    }
    
    @Override
    public float getFrictionFactor(final Player player, final org.bukkit.World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        if (lIllIIlIIIlIll(handle.isLoaded(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ()) ? 1 : 0)) {
            return handle.getType(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ()).frictionFactor;
        }
        return Blocks.AIR.frictionFactor;
    }
    
    @Override
    public float getDamage(final Player player, final org.bukkit.World world, final BlockPosition blockPosition) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        if (lIllIIlIIIlIll(handle.isLoaded(blockPosition.getX(), blockPosition.getY(), blockPosition.getZ()) ? 1 : 0)) {
            return handle.getType(blockPosition.getX(), blockPosition.getY(), blockPosition.getZ()).getDamage((EntityHuman)((CraftPlayer)player).getHandle(), (World)handle, blockPosition.getX(), blockPosition.getY(), blockPosition.getZ());
        }
        return 0.0f;
    }
    
    @Override
    public Map createCache(final Long n, final Long n2) {
        final CacheBuilder builder = CacheBuilder.newBuilder();
        if (lIllIIlIIIlllI(n)) {
            builder.expireAfterAccess((long)n, TimeUnit.MILLISECONDS);
        }
        if (lIllIIlIIIlllI(n2)) {
            builder.expireAfterWrite((long)n2, TimeUnit.MILLISECONDS);
        }
        return builder.build().asMap();
    }
    
    @Override
    public double getMovementSpeed(final Player player) {
        return ((CraftPlayer)player).getHandle().getAttributeInstance(GenericAttributes.d).getValue();
    }
    
    @Override
    public double getItemModifier(final ItemStack itemStack) {
        final net.minecraft.server.v1_7_R4.ItemStack nmsCopy = CraftItemStack.asNMSCopy(itemStack);
        if (lIllIIlIIIlllI(nmsCopy) && lIllIIlIIIlIll(nmsCopy.hasTag() ? 1 : 0)) {
            final NBTBase value = nmsCopy.getTag().get(NMSManager.lIlIlllIIlIll[NMSManager.lIlIlllIIllIl[0]]);
            if (lIllIIlIIIlIll((value instanceof NBTTagList) ? 1 : 0)) {
                final NBTTagList list = (NBTTagList)value;
                double n = 0.0;
                final int size = list.size();
                int n2 = NMSManager.lIlIlllIIllIl[0];
                while (lIllIIlIIIllll(n2, size)) {
                    final NBTTagCompound value2 = list.get(n2);
                    if (lIllIIlIIIlIll(value2.getString(NMSManager.lIlIlllIIlIll[NMSManager.lIlIlllIIllIl[1]]).equals(NMSManager.lIlIlllIIlIll[NMSManager.lIlIlllIIllIl[2]]) ? 1 : 0) && lIllIIlIIlIIII(value2.getInt(NMSManager.lIlIlllIIlIll[NMSManager.lIlIlllIIllIl[3]]))) {
                        n += value2.getDouble(NMSManager.lIlIlllIIlIll[NMSManager.lIlIlllIIllIl[4]]);
                    }
                    ++n2;
                    if (null != null) {
                        return 0.0;
                    }
                }
                return n;
            }
        }
        return 0.0;
    }
    
    @Override
    public Cuboid getBoundingBox(final Player player, final org.bukkit.World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        if (lIllIIlIIIlIll(handle.isLoaded(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ()) ? 1 : 0)) {
            final AxisAlignedBB a = handle.getType(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ()).a((World)handle, mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
            return new Cuboid(a.a, a.d, a.b, a.e, a.c, a.f);
        }
        return new Cuboid(mutableBlockLocation).add(new Cuboid(1.0, 1.0, 1.0));
    }
    
    @Override
    public boolean isLoaded(final org.bukkit.World world, final int n, final int n2) {
        return ((CraftWorld)world).getHandle().chunkProvider.isChunkLoaded(n >> NMSManager.lIlIlllIIllIl[4], n2 >> NMSManager.lIlIlllIIllIl[4]);
    }
    
    @Override
    public int getCurrentTick() {
        return MinecraftServer.currentTick;
    }
    
    @Override
    public Material getType(final Player player, final org.bukkit.World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        if (lIllIIlIIIlIll(handle.isLoaded(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ()) ? 1 : 0)) {
            return CraftMagicNumbers.getMaterial(handle.getType(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ()));
        }
        return Material.AIR;
    }
    
    @Override
    public int sendFakeEntity(final PlayerData playerData, final PlayerData playerData2) {
        return NMSManager.lIlIlllIIllIl[5];
    }
    
    @Override
    public void setPing(final Player player, final int ping) {
        ((CraftPlayer)player).getHandle().ping = ping;
    }
    
    public PlayerConnection getConnection(final Player player) {
        return ((CraftPlayer)player).getHandle().playerConnection;
    }
    
    static {
        lIllIIlIIIlIlI();
        lIllIIlIIIIllI();
    }
    
    private static void lIllIIlIIIIllI() {
        (lIlIlllIIlIll = new String[NMSManager.lIlIlllIIllIl[6]])[NMSManager.lIlIlllIIllIl[0]] = lIllIIlIIIIIll("OwI9KA0YAz0/KRUSIDwNHwQ6", "zvIZd");
        NMSManager.lIlIlllIIlIll[NMSManager.lIlIlllIIllIl[1]] = lIllIIlIIIIlII("TPorbkjUmRXhDfiPC06aiA==", "XfTYX");
        NMSManager.lIlIlllIIlIll[NMSManager.lIlIlllIIllIl[2]] = lIllIIlIIIIIll("IhApNRQsFmk9CTMQKjUIMSY3NQMh", "EuGPf");
        NMSManager.lIlIlllIIlIll[NMSManager.lIlIlllIIllIl[3]] = lIllIIlIIIIIll("IBYzPQMbDzkh", "ofVOb");
        NMSManager.lIlIlllIIlIll[NMSManager.lIlIlllIIllIl[4]] = lIllIIlIIIIIll("EAQhFD0l", "QiNaS");
    }
    
    private static String lIllIIlIIIIIll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = NMSManager.lIlIlllIIllIl[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = NMSManager.lIlIlllIIllIl[0];
        while (lIllIIlIIIllll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (2 != 2) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIllIIlIIIIlII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), NMSManager.lIlIlllIIllIl[7]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(NMSManager.lIlIlllIIllIl[2], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIllIIlIIIlIlI() {
        (lIlIlllIIllIl = new int[8])[0] = 0;
        NMSManager.lIlIlllIIllIl[1] = 1;
        NMSManager.lIlIlllIIllIl[2] = 2;
        NMSManager.lIlIlllIIllIl[3] = 3;
        NMSManager.lIlIlllIIllIl[4] = 4;
        NMSManager.lIlIlllIIllIl[5] = -1;
        NMSManager.lIlIlllIIllIl[6] = 5;
        NMSManager.lIlIlllIIllIl[7] = 8;
    }
    
    private static boolean lIllIIlIIIllll(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean lIllIIlIIIllIl(final Object o, final Object o2) {
        return o != o2;
    }
    
    private static boolean lIllIIlIIIlllI(final Object o) {
        return o != null;
    }
    
    private static boolean lIllIIlIIIllII(final Object o) {
        return o == null;
    }
    
    private static boolean lIllIIlIIIlIll(final int n) {
        return n != 0;
    }
    
    private static boolean lIllIIlIIlIIII(final int n) {
        return n == 0;
    }
}
