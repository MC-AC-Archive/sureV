package me.levansj01.verus.compat.v1_16_R1;

import java.lang.reflect.*;
import org.bukkit.entity.*;
import org.bukkit.inventory.*;
import me.levansj01.verus.util.java.*;
import org.bukkit.plugin.*;
import me.levansj01.verus.data.*;
import org.bukkit.craftbukkit.v1_16_R1.entity.*;
import org.bukkit.craftbukkit.v1_16_R1.*;
import org.bukkit.material.*;
import org.bukkit.craftbukkit.v1_16_R1.util.*;
import me.levansj01.verus.util.item.*;
import org.bukkit.craftbukkit.v1_16_R1.inventory.*;
import org.bukkit.*;
import org.bukkit.block.*;
import me.levansj01.verus.data.version.*;
import us.myles.ViaVersion.api.*;
import protocolsupport.api.*;
import com.google.common.cache.*;
import java.util.concurrent.*;
import me.levansj01.verus.util.*;
import net.minecraft.server.v1_16_R1.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class NMSManager extends me.levansj01.verus.compat.NMSManager
{
    private final BlockPosition.MutableBlockPosition blockPosition;
    private static final Field effects;
    private static final Field ground_field;
    private final boolean viaversionplugin;
    private final String[] CLASSES;
    private final Map dataToMaterial;
    private final boolean protocolsupportplugin;
    private final Map blockToMaterial;
    private static final String[] llllIlIllllI;
    private static final int[] llllIllIIIll;
    
    @Override
    public ItemStack getOffHand(final Player player) {
        return ((CraftInventoryPlayer)player.getInventory()).getItemInOffHand();
    }
    
    public NMSManager() {
        final String[] classes = new String[NMSManager.llllIllIIIll[0]];
        classes[NMSManager.llllIllIIIll[1]] = NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[1]];
        classes[NMSManager.llllIllIIIll[2]] = NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[2]];
        this.CLASSES = classes;
        this.dataToMaterial = (Map)SafeReflection.getLocalField(this.CLASSES, null, NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[0]]);
        this.blockToMaterial = (Map)SafeReflection.getLocalField(this.CLASSES, null, NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[3]]);
        this.blockPosition = new BlockPosition.MutableBlockPosition();
        final PluginManager pluginManager = Bukkit.getPluginManager();
        this.protocolsupportplugin = pluginManager.isPluginEnabled(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[4]]);
        this.viaversionplugin = pluginManager.isPluginEnabled(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[5]]);
    }
    
    @Override
    public int sendFakeEntity(final PlayerData playerData, final PlayerData playerData2) {
        return NMSManager.llllIllIIIll[6];
    }
    
    @Override
    public boolean isRiptiding(final Player player) {
        return ((CraftPlayer)player).isRiptiding();
    }
    
    @Override
    public Material getType(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.d(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lllllIlIlllll(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            MaterialData materialData = this.dataToMaterial.get(type);
            if (lllllIllIIIII(materialData)) {
                materialData = this.blockToMaterial.get(type.getBlock());
                if (lllllIllIIIII(materialData)) {
                    Material material = CraftMagicNumbers.getMaterial(type.getBlock());
                    if (lllllIllIIIIl(material, Material.AIR)) {
                        material = MaterialList.AIR;
                    }
                    return material;
                }
            }
            return materialData.getItemType();
        }
        return MaterialList.AIR;
    }
    
    @Override
    public double getMovementSpeed(final Player player) {
        return ((CraftPlayer)player).getHandle().getAttributeInstance(GenericAttributes.MOVEMENT_SPEED).getValue();
    }
    
    @Override
    public boolean setOnGround(final Player player, final boolean b) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        final boolean onGround = handle.isOnGround();
        SafeReflection.set(NMSManager.ground_field, handle, onGround);
        return onGround;
    }
    
    @Override
    public boolean setInWater(final Player player, final boolean b) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        return handle.inWater = handle.inWater;
    }
    
    @Override
    public int getCurrentTick() {
        return MinecraftServer.currentTick;
    }
    
    @Override
    public MaterialData getTypeAndData(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.d(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lllllIlIlllll(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            MaterialData materialData = this.dataToMaterial.get(type);
            if (lllllIllIIIII(materialData)) {
                materialData = this.blockToMaterial.get(type.getBlock());
                if (lllllIllIIIII(materialData)) {
                    Material material = CraftMagicNumbers.getMaterial(type.getBlock());
                    if (lllllIllIIIIl(material, Material.AIR)) {
                        material = MaterialList.AIR;
                    }
                    materialData = new MaterialData(material);
                }
            }
            return materialData;
        }
        return MaterialList.AIR_DATA;
    }
    
    @Override
    public float getDamage(final Player player, final World world, final me.levansj01.verus.compat.BlockPosition blockPosition) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.d(blockPosition.getX(), blockPosition.getY(), blockPosition.getZ());
        if (lllllIlIlllll(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            return handle.getType((BlockPosition)this.blockPosition).getDamage((EntityHuman)((CraftPlayer)player).getHandle(), (IBlockAccess)handle, (BlockPosition)this.blockPosition);
        }
        return 0.0f;
    }
    
    @Override
    public boolean isGliding(final Player player) {
        return ((CraftPlayer)player).isGliding();
    }
    
    @Override
    public double getItemModifier(final ItemStack itemStack) {
        final net.minecraft.server.v1_16_R1.ItemStack nmsCopy = CraftItemStack.asNMSCopy(itemStack);
        if (lllllIllIIIlI(nmsCopy) && lllllIlIlllll(nmsCopy.hasTag() ? 1 : 0)) {
            final NBTBase value = nmsCopy.getTag().get(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[7]]);
            if (lllllIlIlllll((value instanceof NBTTagList) ? 1 : 0)) {
                final NBTTagList list = (NBTTagList)value;
                double n = 0.0;
                final int size = list.size();
                int n2 = NMSManager.llllIllIIIll[1];
                while (lllllIllIIIll(n2, size)) {
                    final NBTTagCompound compound = list.getCompound(n2);
                    if (lllllIlIlllll(compound.getString(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[8]]).equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[9]]) ? 1 : 0) && lllllIllIIlII(compound.getInt(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[10]]))) {
                        n += compound.getDouble(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[11]]);
                    }
                    ++n2;
                    if (4 != 4) {
                        return 0.0;
                    }
                }
                return n;
            }
        }
        return 0.0;
    }
    
    @Override
    public void setPing(final Player player, final int ping) {
        ((CraftPlayer)player).getHandle().ping = ping;
    }
    
    static {
        lllllIlIllllI();
        lllllIlIlllII();
        ground_field = SafeReflection.access(Entity.class, NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[12]]);
        effects = SafeReflection.access(EntityLiving.class, NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[13]]);
    }
    
    @Override
    public void setAsyncPotionEffects(final Player player) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        final Map effects = handle.effects;
        if (lllllIlIlllll((effects instanceof HashMap) ? 1 : 0)) {
            SafeReflection.set(NMSManager.effects, handle, new ConcurrentHashMap(effects));
        }
    }
    
    @Override
    public void sendTransaction(final Player player, final short n) {
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)new PacketPlayOutTransaction(NMSManager.llllIllIIIll[1], n, (boolean)(NMSManager.llllIllIIIll[1] != 0)));
    }
    
    @Override
    public void sendBlockUpdate(final Player player, final Location location) {
        final WorldServer worldServer = (WorldServer)location.getWorld();
        this.blockPosition.d(location.getBlockX(), location.getBlockY(), location.getBlockZ());
        if (lllllIlIlllll(worldServer.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)new PacketPlayOutBlockChange((IBlockAccess)worldServer, (BlockPosition)this.blockPosition));
        }
    }
    
    @Override
    public float getFrictionFactor(final Block block) {
        return CraftMagicNumbers.getBlock(block.getType()).getFrictionFactor();
    }
    
    @Override
    public float getFrictionFactor(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.d(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lllllIlIlllll(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            return handle.getType((BlockPosition)this.blockPosition).getBlock().getFrictionFactor();
        }
        return Blocks.AIR.getFrictionFactor();
    }
    
    @Override
    public boolean isLoaded(final World world, final int n, final int n2) {
        return ((CraftWorld)world).getHandle().getChunkProvider().isLoaded(n >> NMSManager.llllIllIIIll[4], n2 >> NMSManager.llllIllIIIll[4]);
    }
    
    @Override
    public ClientVersion getVersion(final Player player) {
        if (lllllIlIlllll(this.viaversionplugin ? 1 : 0)) {
            final int playerVersion = Via.getAPI().getPlayerVersion(player.getUniqueId());
            if (lllllIllIIlIl(playerVersion, NMSManager.llllIllIIIll[5])) {
                return ClientVersion.VERSION1_7;
            }
            if (lllllIllIIlIl(playerVersion, NMSManager.llllIllIIIll[14])) {
                return ClientVersion.VERSION1_8;
            }
            if (!lllllIlIlllll(this.protocolsupportplugin ? 1 : 0) || lllllIllIIllI(playerVersion, NMSManager.llllIllIIIll[15])) {
                if (lllllIllIIlIl(playerVersion, NMSManager.llllIllIIIll[16])) {
                    return ClientVersion.VERSION1_9;
                }
                return ClientVersion.VERSION1_13;
            }
        }
        if (!lllllIlIlllll(this.protocolsupportplugin ? 1 : 0)) {
            return ClientVersion.VERSION1_13;
        }
        final ProtocolVersion protocolVersion = ProtocolSupportAPI.getProtocolVersion(player);
        if (lllllIllIIIII(protocolVersion)) {
            return ClientVersion.VERSION_UNSUPPORTED;
        }
        final String name = protocolVersion.name();
        int n = NMSManager.llllIllIIIll[6];
        switch (name.hashCode()) {
            case 1927600109: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[17]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[1];
                if (null != null) {
                    return null;
                }
                break;
            }
            case -373938841: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[18]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[2];
                if (4 < 0) {
                    return null;
                }
                break;
            }
            case 591949304: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[19]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[0];
                if (1 < 0) {
                    return null;
                }
                break;
            }
            case 591949305: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[20]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[3];
                if (-4 > 0) {
                    return null;
                }
                break;
            }
            case 1927602027: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[21]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[4];
                if (-4 > 0) {
                    return null;
                }
                break;
            }
            case 1927602028: {
                if (lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[22]]) ? 1 : 0)) {
                    final int n2 = NMSManager.llllIllIIIll[5];
                    return null;
                }
                break;
            }
            case 1927602030: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[23]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[7];
                if (0 <= -1) {
                    return null;
                }
                break;
            }
            case 1170559071: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[24]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[8];
                if (-4 >= 0) {
                    return null;
                }
                break;
            }
            case 1170559072: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[25]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[9];
                if (0 < 0) {
                    return null;
                }
                break;
            }
            case -374160366: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[26]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[10];
                if (3 == 0) {
                    return null;
                }
                break;
            }
            case 1170559073: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[27]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[11];
                if (false == true) {
                    return null;
                }
                break;
            }
            case -374159405: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[28]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[12];
                if (3 < 0) {
                    return null;
                }
                break;
            }
            case -374159404: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[29]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[13];
                if (0 > 0) {
                    return null;
                }
                break;
            }
            case 1170559074: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[30]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[17];
                if (3 > 3) {
                    return null;
                }
                break;
            }
            case -374158444: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[31]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[18];
                if (null != null) {
                    return null;
                }
                break;
            }
            case -374158443: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[32]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[19];
                if (4 < 4) {
                    return null;
                }
                break;
            }
            case 1170559075: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[33]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[20];
                if (null != null) {
                    return null;
                }
                break;
            }
            case -374157483: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[34]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[21];
                if (0 < 0) {
                    return null;
                }
                break;
            }
            case -374157482: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[35]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[22];
                if (-3 > 0) {
                    return null;
                }
                break;
            }
            case -374157481: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[36]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[23];
                if (0 > 0) {
                    return null;
                }
                break;
            }
            case -374157480: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[37]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[24];
                if (2 > 4) {
                    return null;
                }
                break;
            }
            case 1170559076: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[38]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[25];
                if (-5 >= 0) {
                    return null;
                }
                break;
            }
            case -374156522: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[39]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[26];
                if (true != true) {
                    return null;
                }
                break;
            }
            case -374156521: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[40]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[27];
                if (0 < 0) {
                    return null;
                }
                break;
            }
            case 1170559077: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[41]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[28];
                if (3 <= 1) {
                    return null;
                }
                break;
            }
            case -374155561: {
                if (!lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[42]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.llllIllIIIll[29];
                if (null != null) {
                    return null;
                }
                break;
            }
            case 218893493: {
                if (lllllIlIlllll(name.equals(NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[43]]) ? 1 : 0)) {
                    n = NMSManager.llllIllIIIll[30];
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
            case 10:
            case 11:
            case 12: {
                return ClientVersion.VERSION1_9;
            }
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26: {
                return ClientVersion.VERSION1_13;
            }
            default: {
                final int id = protocolVersion.getId();
                if (!lllllIllIlIII(id, NMSManager.llllIllIIIll[14])) {
                    return ClientVersion.VERSION_UNSUPPORTED;
                }
                if (lllllIllIIlIl(id, NMSManager.llllIllIIIll[16])) {
                    return ClientVersion.VERSION1_9;
                }
                return ClientVersion.VERSION1_13;
            }
        }
    }
    
    @Override
    public Map createCache(final Long n, final Long n2) {
        final CacheBuilder builder = CacheBuilder.newBuilder();
        if (lllllIllIIIlI(n)) {
            builder.expireAfterAccess((long)n, TimeUnit.MILLISECONDS);
        }
        if (lllllIllIIIlI(n2)) {
            builder.expireAfterWrite((long)n2, TimeUnit.MILLISECONDS);
        }
        return builder.build().asMap();
    }
    
    @Override
    public Cuboid getBoundingBox(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.d(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lllllIlIlllll(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            final AxisAlignedBB boundingBox = type.getBlock().b(type, (IBlockAccess)handle, (BlockPosition)this.blockPosition, VoxelShapeCollision.a()).getBoundingBox();
            return new Cuboid(boundingBox.minX, boundingBox.maxX, boundingBox.minY, boundingBox.maxY, boundingBox.minZ, boundingBox.maxZ);
        }
        return new Cuboid(mutableBlockLocation).add(0.0, 1.0, 0.0, 1.0, 0.0, 1.0);
    }
    
    private static void lllllIlIlllII() {
        (llllIlIllllI = new String[NMSManager.llllIllIIIll[44]])[NMSManager.llllIllIIIll[1]] = lllllIlIlIllI("LQcDQQs3Hg8GHWwWFg4PNhcRBAIrAUoZWB1EUjA7c1sRGwAuWycdCCQBKAoOIxYd", "Budoi");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[2]] = lllllIlIlIlll("jdm9cBVozZUljAIO0eJ0hBVoZpAP8QyRfDxEFOMx590UeqVL85KXUe9trUU90nqnWU2ChcOSaYE=", "YBuxN");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[0]] = lllllIlIlIlll("XQH6pYX7VE4A5bOfeR/sPA==", "omnuN");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[3]] = lllllIlIlIllI("CggaOik8Czg4Ng0WHDgu", "hduYB");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[4]] = lllllIlIllIII("AS7z0S4w2WMF64hVJMQetA==", "YxdLv");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[5]] = lllllIlIlIllI("PAguMAYYEiYJDQ==", "jaOfc");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[7]] = lllllIlIlIllI("NDMsJycXMiwwAxojMTMnEDUr", "uGXUN");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[8]] = lllllIlIlIlll("VwqVdK1Ww/UBJBJYr56LzQ==", "GuTfL");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[9]] = lllllIlIlIllI("ICIoNxsuJGg/BjEiKzcHMxQ2Nwwj", "GGFRi");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[10]] = lllllIlIlIlll("zjH1/qW0uJv13dD4cOEVrg==", "sOwvR");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[11]] = lllllIlIlIllI("Jx0HGjYS", "fphoX");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[12]] = lllllIlIlIllI("HxcMJQ0FFy8=", "pyKWb");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[13]] = lllllIlIlIlll("PHJffaBaVBU=", "xDRCK");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[17]] = lllllIlIlIlll("Gh81OawXP/q7/SGrNd0nyw==", "ZWRJD");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[18]] = lllllIlIlIllI("Hwo5PzAAAjEuLGMcQCVCYg==", "RCwzs");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[19]] = lllllIlIlIlll("gcP5eH8Mci95QTMKfROaCw==", "ehRQC");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[20]] = lllllIlIllIII("U2AL7/pSSAxccMEGbFjwGA==", "ilWTH");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[21]] = lllllIlIllIII("GMZY+C2wOzk+rDAUUfliYQ==", "fuzwF");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[22]] = lllllIlIllIII("z2KPwQzyDdrujH9zZbJnHg==", "PPjzB");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[23]] = lllllIlIlIllI("HQ4iIQUCBiowGWEYVTty", "PGldF");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[24]] = lllllIlIlIllI("FScACSsKLwgYN2kxf3w=", "XnNLh");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[25]] = lllllIlIllIII("J4vvnxSXDRdz4LD+VduX5w==", "Hbcbk");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[26]] = lllllIlIlIllI("Aw40LzIcBjw+Ln8YS1sufw==", "NGzjq");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[27]] = lllllIlIllIII("dipR61d28uDzecoImWJjhQ==", "pYBAY");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[28]] = lllllIlIlIllI("PhEBJjMhGQk3L0IHflEvQg==", "sXOcp");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[29]] = lllllIlIllIII("4J2z4tSHSRk5Qq0/ANu5tSZMwUYTyKlQ", "RMtmr");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[30]] = lllllIlIllIII("LxiNlmp1u6bKzs/b2lLKpQ==", "NKbzR");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[31]] = lllllIlIlIllI("Aj8cHzcdNxQOK34pY2krfg==", "OvRZt");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[32]] = lllllIlIllIII("pzyTSjdxtyV0CqZRoZ1BjaTaCrVs1jyQ", "jhocP");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[33]] = lllllIlIlIlll("f5CPomJ/0JLNe5vj7jmedA==", "NcUTj");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[34]] = lllllIlIlIllI("LwUqIA4wDSIxElMTVVESUw==", "bLdeM");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[35]] = lllllIlIlIllI("FwEBDxsICQkeB2sXfn4HaA==", "ZHOJX");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[36]] = lllllIlIlIllI("DwEdPSQQCRUsOHMXYkw4cQ==", "BHSxg");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[37]] = lllllIlIlIllI("Gi46JjoFJjI3JmY4RVcmYw==", "Wgtcy");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[38]] = lllllIlIlIllI("GCA5KRoHKDE4BmQ2Rlk=", "UiwlY");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[39]] = lllllIlIlIllI("GSUHAysGLQ8SN2UzeHM3ZQ==", "TlIFh");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[40]] = lllllIlIllIII("yGUloPVpLp6F89dOFZtL0+u6Wskse+uM", "SfKXf");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[41]] = lllllIlIlIlll("jufQdAdfb+mAILXhWFBPqg==", "KhUgg");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[42]] = lllllIlIlIlll("5F1AqsoHPl+gA0ROqJlXH5unhq8hnfxS", "oIqps");
        NMSManager.llllIlIllllI[NMSManager.llllIllIIIll[43]] = lllllIlIllIII("yAPeA20dWRUnv86hrhIkNURhsEUV+JO+", "oxjGY");
    }
    
    private static String lllllIlIlIlll(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(NMSManager.llllIllIIIll[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lllllIlIlIllI(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = NMSManager.llllIllIIIll[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = NMSManager.llllIllIIIll[1];
        while (lllllIllIIIll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (-3 > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lllllIlIllIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), NMSManager.llllIllIIIll[9]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(NMSManager.llllIllIIIll[0], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lllllIlIllllI() {
        (llllIllIIIll = new int[45])[0] = 2;
        NMSManager.llllIllIIIll[1] = 0;
        NMSManager.llllIllIIIll[2] = 1;
        NMSManager.llllIllIIIll[3] = 3;
        NMSManager.llllIllIIIll[4] = 4;
        NMSManager.llllIllIIIll[5] = 5;
        NMSManager.llllIllIIIll[6] = -1;
        NMSManager.llllIllIIIll[7] = 6;
        NMSManager.llllIllIIIll[8] = 7;
        NMSManager.llllIllIIIll[9] = 8;
        NMSManager.llllIllIIIll[10] = 9;
        NMSManager.llllIllIIIll[11] = 10;
        NMSManager.llllIllIIIll[12] = 11;
        NMSManager.llllIllIIIll[13] = 12;
        NMSManager.llllIllIIIll[14] = 47;
        NMSManager.llllIllIIIll[15] = 736;
        NMSManager.llllIllIIIll[16] = 340;
        NMSManager.llllIllIIIll[17] = 13;
        NMSManager.llllIllIIIll[18] = 14;
        NMSManager.llllIllIIIll[19] = 15;
        NMSManager.llllIllIIIll[20] = 16;
        NMSManager.llllIllIIIll[21] = 17;
        NMSManager.llllIllIIIll[22] = 18;
        NMSManager.llllIllIIIll[23] = 19;
        NMSManager.llllIllIIIll[24] = 20;
        NMSManager.llllIllIIIll[25] = 21;
        NMSManager.llllIllIIIll[26] = 22;
        NMSManager.llllIllIIIll[27] = 23;
        NMSManager.llllIllIIIll[28] = 24;
        NMSManager.llllIllIIIll[29] = 25;
        NMSManager.llllIllIIIll[30] = 26;
        NMSManager.llllIllIIIll[31] = 27;
        NMSManager.llllIllIIIll[32] = 28;
        NMSManager.llllIllIIIll[33] = 29;
        NMSManager.llllIllIIIll[34] = 30;
        NMSManager.llllIllIIIll[35] = 31;
        NMSManager.llllIllIIIll[36] = 32;
        NMSManager.llllIllIIIll[37] = 33;
        NMSManager.llllIllIIIll[38] = 34;
        NMSManager.llllIllIIIll[39] = 35;
        NMSManager.llllIllIIIll[40] = 36;
        NMSManager.llllIllIIIll[41] = 37;
        NMSManager.llllIllIIIll[42] = 38;
        NMSManager.llllIllIIIll[43] = 39;
        NMSManager.llllIllIIIll[44] = 40;
    }
    
    private static boolean lllllIllIIIll(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean lllllIllIIlIl(final int n, final int n2) {
        return n <= n2;
    }
    
    private static boolean lllllIllIlIII(final int n, final int n2) {
        return n > n2;
    }
    
    private static boolean lllllIllIIIIl(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean lllllIllIIIlI(final Object o) {
        return o != null;
    }
    
    private static boolean lllllIllIIIII(final Object o) {
        return o == null;
    }
    
    private static boolean lllllIlIlllll(final int n) {
        return n != 0;
    }
    
    private static boolean lllllIllIIlII(final int n) {
        return n == 0;
    }
    
    private static boolean lllllIllIIllI(final int n, final int n2) {
        return n != n2;
    }
}
