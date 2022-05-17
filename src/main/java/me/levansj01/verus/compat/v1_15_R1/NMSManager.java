package me.levansj01.verus.compat.v1_15_R1;

import java.lang.reflect.*;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.*;
import org.bukkit.entity.*;
import org.bukkit.craftbukkit.v1_15_R1.entity.*;
import com.google.common.cache.*;
import me.levansj01.verus.util.java.*;
import org.bukkit.plugin.*;
import java.util.*;
import java.util.concurrent.*;
import org.bukkit.craftbukkit.v1_15_R1.*;
import org.bukkit.*;
import org.bukkit.craftbukkit.v1_15_R1.util.*;
import me.levansj01.verus.util.item.*;
import org.bukkit.inventory.*;
import me.levansj01.verus.data.*;
import me.levansj01.verus.util.*;
import org.bukkit.craftbukkit.v1_15_R1.inventory.*;
import net.minecraft.server.v1_15_R1.*;
import me.levansj01.verus.data.version.*;
import us.myles.ViaVersion.api.*;
import protocolsupport.api.*;

public class NMSManager extends me.levansj01.verus.compat.NMSManager
{
    private final boolean protocolsupportplugin;
    private final boolean viaversionplugin;
    private final BlockPosition.MutableBlockPosition blockPosition;
    private final String[] CLASSES;
    private static final Field effects;
    private final Map<IBlockData, MaterialData> dataToMaterial;
    private final Map<Block, MaterialData> blockToMaterial;
    
    @Override
    public boolean isRiptiding(final Player player) {
        return ((CraftPlayer)player).isRiptiding();
    }
    
    @Override
    public void sendBlockUpdate(final Player player, final Location location) {
        final WorldServer worldServer = (WorldServer)location.getWorld();
        this.blockPosition.d(location.getBlockX(), location.getBlockY(), location.getBlockZ());
        if (worldServer.isLoaded((BlockPosition)this.blockPosition)) {
            ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)new PacketPlayOutBlockChange((IBlockAccess)worldServer, (BlockPosition)this.blockPosition));
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
    public Map createCache(final Long n, final Long n2) {
        final CacheBuilder builder = CacheBuilder.newBuilder();
        if (n != null) {
            builder.expireAfterAccess((long)n, TimeUnit.MILLISECONDS);
        }
        if (n2 != null) {
            builder.expireAfterWrite((long)n2, TimeUnit.MILLISECONDS);
        }
        return builder.build().asMap();
    }
    
    public NMSManager() {
        this.CLASSES = new String[] { "org.bukkit.craftbukkit.v1_15_R1.util.CraftLegacy", "org.bukkit.craftbukkit.v1_15_R1.legacy.CraftLegacy" };
        this.dataToMaterial = (Map<IBlockData, MaterialData>)SafeReflection.getLocalField(this.CLASSES, null, "dataToMaterial");
        this.blockToMaterial = (Map<Block, MaterialData>)SafeReflection.getLocalField(this.CLASSES, null, "blockToMaterial");
        this.blockPosition = new BlockPosition.MutableBlockPosition();
        final PluginManager pluginManager = Bukkit.getPluginManager();
        this.protocolsupportplugin = pluginManager.isPluginEnabled("ProtocolSupport");
        this.viaversionplugin = pluginManager.isPluginEnabled("ViaVersion");
    }
    
    @Override
    public int getCurrentTick() {
        return MinecraftServer.currentTick;
    }
    
    @Override
    public void setAsyncPotionEffects(final Player player) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        final Map effects = handle.effects;
        if (effects instanceof HashMap) {
            SafeReflection.set(NMSManager.effects, handle, new ConcurrentHashMap(effects));
        }
    }
    
    @Override
    public void sendTransaction(final Player player, final short n) {
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)new PacketPlayOutTransaction(0, n, false));
    }
    
    @Override
    public boolean isLoaded(final World world, final int n, final int n2) {
        return ((CraftWorld)world).getHandle().getChunkProvider().isLoaded(n >> 4, n2 >> 4);
    }
    
    @Override
    public Material getType(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.d(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (handle.isLoaded((BlockPosition)this.blockPosition)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            MaterialData materialData = this.dataToMaterial.get(type);
            if (materialData == null) {
                materialData = this.blockToMaterial.get(type.getBlock());
                if (materialData == null) {
                    Material material = CraftMagicNumbers.getMaterial(type.getBlock());
                    if (material == Material.AIR) {
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
    public float getFrictionFactor(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.d(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (handle.isLoaded((BlockPosition)this.blockPosition)) {
            return handle.getType((BlockPosition)this.blockPosition).getBlock().m();
        }
        return Blocks.AIR.m();
    }
    
    @Override
    public boolean setInWater(final Player player, final boolean b) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        return handle.inWater = handle.inWater;
    }
    
    @Override
    public MaterialData getTypeAndData(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.d(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (handle.isLoaded((BlockPosition)this.blockPosition)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            MaterialData materialData = this.dataToMaterial.get(type);
            if (materialData == null) {
                materialData = this.blockToMaterial.get(type.getBlock());
                if (materialData == null) {
                    Material material = CraftMagicNumbers.getMaterial(type.getBlock());
                    if (material == Material.AIR) {
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
        if (handle.isLoaded((BlockPosition)this.blockPosition)) {
            return handle.getType((BlockPosition)this.blockPosition).getDamage((EntityHuman)((CraftPlayer)player).getHandle(), (IBlockAccess)handle, (BlockPosition)this.blockPosition);
        }
        return 0.0f;
    }
    
    static {
        effects = SafeReflection.access(EntityLiving.class, "effects");
    }
    
    @Override
    public double getMovementSpeed(final Player player) {
        return ((CraftPlayer)player).getHandle().getAttributeInstance(GenericAttributes.MOVEMENT_SPEED).getValue();
    }
    
    @Override
    public void setPing(final Player player, final int ping) {
        ((CraftPlayer)player).getHandle().ping = ping;
    }
    
    @Override
    public float getFrictionFactor(final org.bukkit.block.Block block) {
        return CraftMagicNumbers.getBlock(block.getType()).m();
    }
    
    @Override
    public ItemStack getOffHand(final Player player) {
        return ((CraftInventoryPlayer)player.getInventory()).getItemInOffHand();
    }
    
    @Override
    public int sendFakeEntity(final PlayerData playerData, final PlayerData playerData2) {
        return -1;
    }
    
    @Override
    public Cuboid getBoundingBox(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.d(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (handle.isLoaded((BlockPosition)this.blockPosition)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            final AxisAlignedBB boundingBox = type.getBlock().b(type, (IBlockAccess)handle, (BlockPosition)this.blockPosition, VoxelShapeCollision.a()).getBoundingBox();
            return new Cuboid(boundingBox.minX, boundingBox.maxX, boundingBox.minY, boundingBox.maxY, boundingBox.minZ, boundingBox.maxZ);
        }
        return new Cuboid(mutableBlockLocation).add(0.0, 1.0, 0.0, 1.0, 0.0, 1.0);
    }
    
    @Override
    public double getItemModifier(final ItemStack itemStack) {
        final net.minecraft.server.v1_15_R1.ItemStack nmsCopy = CraftItemStack.asNMSCopy(itemStack);
        if (nmsCopy != null && nmsCopy.hasTag()) {
            final NBTTagCompound tag = nmsCopy.getTag();
            if (tag != null) {
                final NBTBase value = tag.get("AttributeModifiers");
                if (value instanceof NBTTagList) {
                    final NBTTagList list = (NBTTagList)value;
                    double n = 0.0;
                    final int size = list.size();
                    int n2 = 0;
                    while (0 < size) {
                        final NBTTagCompound compound = list.getCompound(n2);
                        if (compound != null && compound.getString("AttributeName").equals("generic.movementSpeed") && compound.getInt("Operation") == 0) {
                            n += compound.getDouble("Amount");
                        }
                        ++n2;
                    }
                    return n;
                }
            }
        }
        return 0.0;
    }
    
    @Override
    public ClientVersion getVersion(final Player player) {
        if (this.viaversionplugin) {
            final int playerVersion = Via.getAPI().getPlayerVersion(player.getUniqueId());
            if (playerVersion <= 5) {
                return ClientVersion.VERSION1_7;
            }
            if (playerVersion <= 47) {
                return ClientVersion.VERSION1_8;
            }
            if (!this.protocolsupportplugin || playerVersion != 578) {
                if (playerVersion <= 340) {
                    return ClientVersion.VERSION1_9;
                }
                return ClientVersion.VERSION1_13;
            }
        }
        if (!this.protocolsupportplugin) {
            return ClientVersion.VERSION1_13;
        }
        final ProtocolVersion protocolVersion = ProtocolSupportAPI.getProtocolVersion(player);
        if (protocolVersion == null) {
            return ClientVersion.VERSION_UNSUPPORTED;
        }
        final String name = protocolVersion.name();
        switch (name.hashCode()) {
            case 1927600109: {
                if (name.equals("MINECRAFT_1_7_5")) {
                    break;
                }
                break;
            }
            case -373938841: {
                if (name.equals("MINECRAFT_1_7_10")) {
                    break;
                }
                break;
            }
            case 591949304: {
                if (name.equals("MINECRAFT_1_8")) {
                    break;
                }
                break;
            }
            case 591949305: {
                if (name.equals("MINECRAFT_1_9")) {
                    break;
                }
                break;
            }
            case 1927602027: {
                if (name.equals("MINECRAFT_1_9_1")) {
                    break;
                }
                break;
            }
            case 1927602028: {
                if (name.equals("MINECRAFT_1_9_2")) {
                    break;
                }
                break;
            }
            case 1927602030: {
                if (name.equals("MINECRAFT_1_9_4")) {
                    break;
                }
                break;
            }
            case 1170559071: {
                if (name.equals("MINECRAFT_1_10")) {
                    break;
                }
                break;
            }
            case 1170559072: {
                if (name.equals("MINECRAFT_1_11")) {
                    break;
                }
                break;
            }
            case -374160366: {
                if (name.equals("MINECRAFT_1_11_1")) {
                    break;
                }
                break;
            }
            case 1170559073: {
                if (name.equals("MINECRAFT_1_12")) {
                    break;
                }
                break;
            }
            case -374159405: {
                if (name.equals("MINECRAFT_1_12_1")) {
                    break;
                }
                break;
            }
            case -374159404: {
                if (name.equals("MINECRAFT_1_12_2")) {
                    break;
                }
                break;
            }
            case 1170559074: {
                if (name.equals("MINECRAFT_1_13")) {
                    break;
                }
                break;
            }
            case -374158444: {
                if (name.equals("MINECRAFT_1_13_1")) {
                    break;
                }
                break;
            }
            case -374158443: {
                if (name.equals("MINECRAFT_1_13_2")) {
                    break;
                }
                break;
            }
            case 1170559075: {
                if (name.equals("MINECRAFT_1_14")) {
                    break;
                }
                break;
            }
            case -374157483: {
                if (name.equals("MINECRAFT_1_14_1")) {
                    break;
                }
                break;
            }
            case -374157482: {
                if (name.equals("MINECRAFT_1_14_2")) {
                    break;
                }
                break;
            }
            case -374157481: {
                if (name.equals("MINECRAFT_1_14_3")) {
                    break;
                }
                break;
            }
            case -374157480: {
                if (name.equals("MINECRAFT_1_14_4")) {
                    break;
                }
                break;
            }
            case 1170559076: {
                if (name.equals("MINECRAFT_1_15")) {
                    break;
                }
                break;
            }
            case -374156522: {
                if (name.equals("MINECRAFT_1_15_1")) {
                    break;
                }
                break;
            }
            case -374156521: {
                if (name.equals("MINECRAFT_1_15_2")) {
                    break;
                }
                break;
            }
            case 218893493: {
                if (name.equals("MINECRAFT_FUTURE")) {
                    break;
                }
                break;
            }
        }
        switch (24) {
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
            case 24: {
                return ClientVersion.VERSION1_13;
            }
            default: {
                final int id = protocolVersion.getId();
                if (id <= 47) {
                    return ClientVersion.VERSION_UNSUPPORTED;
                }
                if (id <= 340) {
                    return ClientVersion.VERSION1_9;
                }
                return ClientVersion.VERSION1_13;
            }
        }
    }
    
    @Override
    public boolean isGliding(final Player player) {
        return ((CraftPlayer)player).isGliding();
    }
}
