package me.levansj01.verus.compat.v1_11_R1;

import java.lang.reflect.*;
import me.levansj01.verus.util.*;
import org.bukkit.craftbukkit.v1_11_R1.*;
import org.bukkit.entity.*;
import org.bukkit.material.*;
import org.bukkit.craftbukkit.v1_11_R1.util.*;
import me.levansj01.verus.data.*;
import org.bukkit.craftbukkit.v1_11_R1.entity.*;
import org.bukkit.inventory.*;
import me.levansj01.verus.util.java.*;
import me.levansj01.verus.data.version.*;
import us.myles.ViaVersion.api.*;
import protocolsupport.api.*;
import org.bukkit.craftbukkit.v1_11_R1.inventory.*;
import org.bukkit.plugin.*;
import org.bukkit.*;
import com.google.common.cache.*;
import java.util.concurrent.*;
import net.minecraft.server.v1_11_R1.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class NMSManager extends me.levansj01.verus.compat.NMSManager
{
    private final boolean viaversionplugin;
    private final boolean protocolsupportplugin;
    private static final Field effects;
    private final BlockPosition.MutableBlockPosition blockPosition;
    private static final String[] lIIlIlIIIIlll;
    private static final int[] lIIlIlIIIlIIl;
    
    @Override
    public boolean isEmpty(final World world, final Entity entity, final Cuboid cuboid, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lIIlIlllIIllII(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            final AxisAlignedBB axisAlignedBB = new AxisAlignedBB(cuboid.getX1(), cuboid.getY1(), cuboid.getZ1(), cuboid.getX2(), cuboid.getY2(), cuboid.getZ2());
            final ArrayList list = new ArrayList(NMSManager.lIIlIlIIIlIIl[0]);
            type.getBlock().a(type, (net.minecraft.server.v1_11_R1.World)handle, (BlockPosition)this.blockPosition, axisAlignedBB, (List)list, ((CraftEntity)entity).getHandle(), (boolean)(NMSManager.lIIlIlIIIlIIl[1] != 0));
            return list.isEmpty();
        }
        return NMSManager.lIIlIlIIIlIIl[0] != 0;
    }
    
    @Override
    public MaterialData getTypeAndData(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lIIlIlllIIllII(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            final Block block = type.getBlock();
            return CraftMagicNumbers.getMaterial(block).getNewData((byte)block.toLegacyData(type));
        }
        return new MaterialData(NMSManager.lIIlIlIIIlIIl[1]);
    }
    
    @Override
    public int getCurrentTick() {
        return MinecraftServer.currentTick;
    }
    
    @Override
    public int sendFakeEntity(final PlayerData playerData, final PlayerData playerData2) {
        return NMSManager.lIIlIlIIIlIIl[2];
    }
    
    @Override
    public float getDamage(final Player player, final World world, final me.levansj01.verus.compat.BlockPosition blockPosition) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(blockPosition.getX(), blockPosition.getY(), blockPosition.getZ());
        if (lIIlIlllIIllII(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            return handle.getType((BlockPosition)this.blockPosition).a((EntityHuman)((CraftPlayer)player).getHandle(), (net.minecraft.server.v1_11_R1.World)handle, (BlockPosition)this.blockPosition);
        }
        return 0.0f;
    }
    
    @Override
    public ItemStack getOffHand(final Player player) {
        return ((CraftInventoryPlayer)player.getInventory()).getItemInOffHand();
    }
    
    @Override
    public void setAsyncPotionEffects(final Player player) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        final Map effects = handle.effects;
        if (lIIlIlllIIllII((effects instanceof HashMap) ? 1 : 0)) {
            SafeReflection.set(NMSManager.effects, handle, new ConcurrentHashMap(effects));
        }
    }
    
    @Override
    public Material getType(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lIIlIlllIIllII(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            return CraftMagicNumbers.getMaterial(handle.getType((BlockPosition)this.blockPosition).getBlock());
        }
        return Material.AIR;
    }
    
    @Override
    public boolean setInWater(final Player player, final boolean b) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        return handle.inWater = handle.inWater;
    }
    
    @Override
    public double getMovementSpeed(final Player player) {
        return ((CraftPlayer)player).getHandle().getAttributeInstance(GenericAttributes.MOVEMENT_SPEED).getValue();
    }
    
    @Override
    public void sendTransaction(final Player player, final short n) {
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)new PacketPlayOutTransaction(NMSManager.lIIlIlIIIlIIl[1], n, (boolean)(NMSManager.lIIlIlIIIlIIl[1] != 0)));
    }
    
    @Override
    public float getFrictionFactor(final org.bukkit.block.Block block) {
        return CraftMagicNumbers.getBlock(block).frictionFactor;
    }
    
    @Override
    public float getFrictionFactor(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lIIlIlllIIllII(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            return handle.getType((BlockPosition)this.blockPosition).getBlock().frictionFactor;
        }
        return Blocks.AIR.frictionFactor;
    }
    
    @Override
    public ClientVersion getVersion(final Player player) {
        if (lIIlIlllIIllII(this.viaversionplugin ? 1 : 0)) {
            final int playerVersion = Via.getAPI().getPlayerVersion(player.getUniqueId());
            if (lIIlIlllIIllIl(playerVersion, NMSManager.lIIlIlIIIlIIl[3])) {
                return ClientVersion.VERSION1_7;
            }
            if (lIIlIlllIIllIl(playerVersion, NMSManager.lIIlIlIIIlIIl[4])) {
                return ClientVersion.VERSION1_8;
            }
            if (!lIIlIlllIIllII(this.protocolsupportplugin ? 1 : 0) || lIIlIlllIIlllI(playerVersion, NMSManager.lIIlIlIIIlIIl[5])) {
                if (lIIlIlllIIllIl(playerVersion, NMSManager.lIIlIlIIIlIIl[6])) {
                    return ClientVersion.VERSION1_9;
                }
                return ClientVersion.VERSION1_13;
            }
        }
        if (!lIIlIlllIIllII(this.protocolsupportplugin ? 1 : 0)) {
            return ClientVersion.VERSION1_9;
        }
        final ProtocolVersion protocolVersion = ProtocolSupportAPI.getProtocolVersion(player);
        if (lIIlIlllIIllll(protocolVersion)) {
            return ClientVersion.VERSION_UNSUPPORTED;
        }
        final String name = protocolVersion.name();
        int n = NMSManager.lIIlIlIIIlIIl[2];
        switch (name.hashCode()) {
            case 1927600109: {
                if (!lIIlIlllIIllII(name.equals(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[1]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIIlIlIIIlIIl[1];
                if (4 < 0) {
                    return null;
                }
                break;
            }
            case -373938841: {
                if (!lIIlIlllIIllII(name.equals(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[0]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIIlIlIIIlIIl[0];
                if (-2 > 0) {
                    return null;
                }
                break;
            }
            case 591949304: {
                if (!lIIlIlllIIllII(name.equals(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[7]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIIlIlIIIlIIl[7];
                if (0 <= -1) {
                    return null;
                }
                break;
            }
            case 591949305: {
                if (!lIIlIlllIIllII(name.equals(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[8]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIIlIlIIIlIIl[8];
                if (2 > 4) {
                    return null;
                }
                break;
            }
            case 1927602027: {
                if (!lIIlIlllIIllII(name.equals(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[9]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIIlIlIIIlIIl[9];
                if (-1 >= 0) {
                    return null;
                }
                break;
            }
            case 1927602028: {
                if (!lIIlIlllIIllII(name.equals(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[3]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIIlIlIIIlIIl[3];
                if (-1 < -1) {
                    return null;
                }
                break;
            }
            case 1927602030: {
                if (!lIIlIlllIIllII(name.equals(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[10]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIIlIlIIIlIIl[10];
                if (null != null) {
                    return null;
                }
                break;
            }
            case 1170559071: {
                if (!lIIlIlllIIllII(name.equals(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[11]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIIlIlIIIlIIl[11];
                if (-1 >= 3) {
                    return null;
                }
                break;
            }
            case 1170559072: {
                if (!lIIlIlllIIllII(name.equals(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[12]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIIlIlIIIlIIl[12];
                if (1 < 1) {
                    return null;
                }
                break;
            }
            case -374160366: {
                if (!lIIlIlllIIllII(name.equals(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[13]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIIlIlIIIlIIl[13];
                if (3 != 3) {
                    return null;
                }
                break;
            }
            case 218893493: {
                if (lIIlIlllIIllII(name.equals(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[14]]) ? 1 : 0)) {
                    n = NMSManager.lIIlIlIIIlIIl[14];
                    break;
                }
                break;
            }
        }
        switch (n) {
            case 0:
            case 1: {
                return ClientVersion.VERSION1_7;
            }
            case 2: {
                return ClientVersion.VERSION1_8;
            }
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: {
                return ClientVersion.VERSION1_9;
            }
            default: {
                if (lIIlIlllIlIIII(protocolVersion.getId(), NMSManager.lIIlIlIIIlIIl[4])) {
                    return ClientVersion.VERSION1_9;
                }
                return ClientVersion.VERSION_UNSUPPORTED;
            }
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
    public double getItemModifier(final ItemStack itemStack) {
        final net.minecraft.server.v1_11_R1.ItemStack nmsCopy = CraftItemStack.asNMSCopy(itemStack);
        if (lIIlIlllIlIIIl(nmsCopy) && lIIlIlllIIllII(nmsCopy.hasTag() ? 1 : 0)) {
            final NBTBase value = nmsCopy.getTag().get(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[15]]);
            if (lIIlIlllIIllII((value instanceof NBTTagList) ? 1 : 0)) {
                final NBTTagList list = (NBTTagList)value;
                double n = 0.0;
                final int size = list.size();
                int n2 = NMSManager.lIIlIlIIIlIIl[1];
                while (lIIlIlllIlIIlI(n2, size)) {
                    final NBTTagCompound value2 = list.get(n2);
                    if (lIIlIlllIIllII(value2.getString(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[16]]).equals(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[17]]) ? 1 : 0) && lIIlIlllIlIIll(value2.getInt(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[18]]))) {
                        n += value2.getDouble(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[19]]);
                    }
                    ++n2;
                    if (-2 > 0) {
                        return 0.0;
                    }
                }
                return n;
            }
        }
        return 0.0;
    }
    
    @Override
    public Cuboid getBoundingBox(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lIIlIlllIIllII(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            final AxisAlignedBB b = type.getBlock().b(type, (IBlockAccess)handle, (BlockPosition)this.blockPosition);
            return new Cuboid(b.a, b.d, b.b, b.e, b.c, b.f);
        }
        return new Cuboid(mutableBlockLocation).add(new Cuboid(1.0, 1.0, 1.0));
    }
    
    public NMSManager() {
        this.blockPosition = new BlockPosition.MutableBlockPosition();
        final PluginManager pluginManager = Bukkit.getPluginManager();
        this.protocolsupportplugin = pluginManager.isPluginEnabled(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[20]]);
        this.viaversionplugin = pluginManager.isPluginEnabled(NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[21]]);
    }
    
    @Override
    public boolean rayTrace(final World world, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final boolean b, final boolean b2, final boolean b3) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        final MovingObjectPosition rayTrace = handle.rayTrace(new Vec3D(n, n2, n3), new Vec3D(n4, n5, n6), b, b2, b3);
        if (lIIlIlllIIllll(rayTrace)) {
            return NMSManager.lIIlIlIIIlIIl[1] != 0;
        }
        int n7;
        if (lIIlIlllIlIlII(handle.getType(rayTrace.a()).getBlock(), Blocks.END_PORTAL)) {
            n7 = NMSManager.lIIlIlIIIlIIl[0];
            if (3 <= 0) {
                return false;
            }
        }
        else {
            n7 = NMSManager.lIIlIlIIIlIIl[1];
        }
        return n7 != 0;
    }
    
    @Override
    public void sendBlockUpdate(final Player player, final Location location) {
        final WorldServer worldServer = (WorldServer)location.getWorld();
        this.blockPosition.c(location.getBlockX(), location.getBlockY(), location.getBlockZ());
        if (lIIlIlllIIllII(worldServer.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)new PacketPlayOutBlockChange((net.minecraft.server.v1_11_R1.World)worldServer, (BlockPosition)this.blockPosition));
        }
    }
    
    @Override
    public boolean isLoaded(final World world, final int n, final int n2) {
        return ((CraftWorld)world).getHandle().getChunkProviderServer().isLoaded(n >> NMSManager.lIIlIlIIIlIIl[9], n2 >> NMSManager.lIIlIlIIIlIIl[9]);
    }
    
    @Override
    public void setPing(final Player player, final int ping) {
        ((CraftPlayer)player).getHandle().ping = ping;
    }
    
    @Override
    public Map createCache(final Long n, final Long n2) {
        final CacheBuilder builder = CacheBuilder.newBuilder();
        if (lIIlIlllIlIIIl(n)) {
            builder.expireAfterAccess((long)n, TimeUnit.MILLISECONDS);
        }
        if (lIIlIlllIlIIIl(n2)) {
            builder.expireAfterWrite((long)n2, TimeUnit.MILLISECONDS);
        }
        return builder.build().asMap();
    }
    
    @Override
    public boolean isGliding(final Player player) {
        return ((CraftPlayer)player).isGliding();
    }
    
    static {
        lIIlIlllIIlIll();
        lIIlIlllIIlIIl();
        effects = SafeReflection.access(EntityLiving.class, NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[22]]);
    }
    
    private static void lIIlIlllIIlIIl() {
        (lIIlIlIIIIlll = new String[NMSManager.lIIlIlIIIlIIl[23]])[NMSManager.lIIlIlIIIlIIl[1]] = lIIlIlllIIIIIl("laONzsR/EIOs+UmOCwXg8Q==", "qvapH");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[0]] = lIIlIlllIIIIlI("Xc+kWo08b+DxWdY9vZFOIG41LDk1WE+B", "fmMMq");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[7]] = lIIlIlllIIIIlI("IqHvSTXGp6ycqnA4hP1++A==", "sSJMF");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[8]] = lIIlIlllIIIIlI("Pq/sOWjjZ2SoPtZYC+XdQg==", "zjcJG");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[9]] = lIIlIlllIIIIIl("Zf7ySX83+ltJO+kdKbCsXg==", "NqZXd");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[3]] = lIIlIlllIIIIll("Hw4eJy4ABhY2MmMYaT1f", "RGPbm");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[10]] = lIIlIlllIIIIll("OAQcABsnDBQRB0QSaxps", "uMREX");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[11]] = lIIlIlllIIIIlI("yOPsceNCTe25FYCOOt6eYA==", "wHZgt");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[12]] = lIIlIlllIIIIll("HA8pIwQDByEyGGAZVlc=", "QFgfG");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[13]] = lIIlIlllIIIIIl("z8BAwY5AUdPHluqKc8n26a8ILN85/wK4", "ioxiF");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[14]] = lIIlIlllIIIIll("ITwGFBM+NA4FDyogHAQCKQ==", "luHQP");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[15]] = lIIlIlllIIIIll("JhwVPB4FHRUrOggMCCgeAhoS", "ghaNw");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[16]] = lIIlIlllIIIIll("NwY1EyIUBzUEBRcfJA==", "vrAaK");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[17]] = lIIlIlllIIIIlI("uM2UfPG1ebY6af8QWwYxlhNeQlDM4Gjg", "NbWmg");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[18]] = lIIlIlllIIIIIl("HGheqFMKWrA+LAdn45o9YQ==", "SQtdI");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[19]] = lIIlIlllIIIIIl("+rJcYpKRjLM=", "srAvL");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[20]] = lIIlIlllIIIIlI("wsDLAU/UgQ3FE3q37oaS2g==", "hXGoC");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[21]] = lIIlIlllIIIIIl("CclMhM82YWls+smDBzpXug==", "HFWFp");
        NMSManager.lIIlIlIIIIlll[NMSManager.lIIlIlIIIlIIl[22]] = lIIlIlllIIIIlI("ijVV3NtgWHs=", "BvNGZ");
    }
    
    private static String lIIlIlllIIIIlI(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), NMSManager.lIIlIlIIIlIIl[12]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(NMSManager.lIIlIlIIIlIIl[7], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIlllIIIIIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(NMSManager.lIIlIlIIIlIIl[7], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIlllIIIIll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = NMSManager.lIIlIlIIIlIIl[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = NMSManager.lIIlIlIIIlIIl[1];
        while (lIIlIlllIlIIlI(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (4 != 4) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static void lIIlIlllIIlIll() {
        (lIIlIlIIIlIIl = new int[24])[0] = 1;
        NMSManager.lIIlIlIIIlIIl[1] = 0;
        NMSManager.lIIlIlIIIlIIl[2] = -1;
        NMSManager.lIIlIlIIIlIIl[3] = 5;
        NMSManager.lIIlIlIIIlIIl[4] = 47;
        NMSManager.lIIlIlIIIlIIl[5] = 315;
        NMSManager.lIIlIlIIIlIIl[6] = 340;
        NMSManager.lIIlIlIIIlIIl[7] = 2;
        NMSManager.lIIlIlIIIlIIl[8] = 3;
        NMSManager.lIIlIlIIIlIIl[9] = 4;
        NMSManager.lIIlIlIIIlIIl[10] = 6;
        NMSManager.lIIlIlIIIlIIl[11] = 7;
        NMSManager.lIIlIlIIIlIIl[12] = 8;
        NMSManager.lIIlIlIIIlIIl[13] = 9;
        NMSManager.lIIlIlIIIlIIl[14] = 10;
        NMSManager.lIIlIlIIIlIIl[15] = 11;
        NMSManager.lIIlIlIIIlIIl[16] = 12;
        NMSManager.lIIlIlIIIlIIl[17] = 13;
        NMSManager.lIIlIlIIIlIIl[18] = 14;
        NMSManager.lIIlIlIIIlIIl[19] = 15;
        NMSManager.lIIlIlIIIlIIl[20] = 16;
        NMSManager.lIIlIlIIIlIIl[21] = 17;
        NMSManager.lIIlIlIIIlIIl[22] = 18;
        NMSManager.lIIlIlIIIlIIl[23] = 19;
    }
    
    private static boolean lIIlIlllIlIIlI(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean lIIlIlllIIllIl(final int n, final int n2) {
        return n <= n2;
    }
    
    private static boolean lIIlIlllIlIIII(final int n, final int n2) {
        return n > n2;
    }
    
    private static boolean lIIlIlllIlIlII(final Object o, final Object o2) {
        return o != o2;
    }
    
    private static boolean lIIlIlllIlIIIl(final Object o) {
        return o != null;
    }
    
    private static boolean lIIlIlllIIllll(final Object o) {
        return o == null;
    }
    
    private static boolean lIIlIlllIIllII(final int n) {
        return n != 0;
    }
    
    private static boolean lIIlIlllIlIIll(final int n) {
        return n == 0;
    }
    
    private static boolean lIIlIlllIIlllI(final int n, final int n2) {
        return n != n2;
    }
}
