package me.levansj01.verus.compat.v1_8_R3;

import java.lang.reflect.*;
import me.levansj01.verus.util.java.*;
import org.bukkit.entity.*;
import org.bukkit.craftbukkit.v1_8_R3.*;
import me.levansj01.verus.data.version.*;
import us.myles.ViaVersion.api.*;
import org.vspigot.protocolsupport.api.*;
import com.google.common.cache.*;
import org.bukkit.block.*;
import org.bukkit.craftbukkit.v1_8_R3.util.*;
import me.levansj01.verus.util.*;
import org.bukkit.material.*;
import java.util.concurrent.*;
import me.levansj01.verus.data.*;
import org.bukkit.inventory.*;
import org.bukkit.craftbukkit.v1_8_R3.inventory.*;
import net.minecraft.server.v1_8_R3.*;
import org.vspigot.*;
import org.bukkit.*;
import org.bukkit.plugin.*;
import org.bukkit.craftbukkit.v1_8_R3.entity.*;
import java.util.*;

public class NMSManager extends me.levansj01.verus.compat.NMSManager
{
    private final BlockPosition.MutableBlockPosition blockPosition;
    private final boolean protocolsupportplugin;
    private final boolean viaversionplugin;
    private boolean multiblock;
    private static final Field effects;
    private boolean vspigot;
    private boolean vspigotprotocolsupport;
    
    static {
        effects = SafeReflection.access(EntityLiving.class, "effects");
    }
    
    @Override
    public float getDamage(final Player player, final World world, final me.levansj01.verus.compat.BlockPosition blockPosition) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(blockPosition.getX(), blockPosition.getY(), blockPosition.getZ());
        if (handle.isLoaded((BlockPosition)this.blockPosition)) {
            return ((this.vspigot && this.multiblock) ? handle.getType((Entity)((CraftPlayer)player).getHandle(), (BlockPosition)this.blockPosition) : handle.getType((BlockPosition)this.blockPosition)).getBlock().getDamage((EntityHuman)((CraftPlayer)player).getHandle(), (net.minecraft.server.v1_8_R3.World)handle, (BlockPosition)this.blockPosition);
        }
        return 0.0f;
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
            if (playerVersion <= 340) {
                return ClientVersion.VERSION1_9;
            }
            return ClientVersion.VERSION1_13;
        }
        else if (this.vspigotprotocolsupport) {
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
                case 218893493: {
                    if (name.equals("MINECRAFT_FUTURE")) {
                        break;
                    }
                    break;
                }
            }
            switch (3) {
                case 0:
                case 1: {
                    return ClientVersion.VERSION1_7;
                }
                case 2: {
                    return ClientVersion.VERSION1_8;
                }
                case 3: {
                    return ClientVersion.VERSION1_9;
                }
                default: {
                    return ClientVersion.VERSION_UNSUPPORTED;
                }
            }
        }
        else {
            if (!this.protocolsupportplugin) {
                return ClientVersion.VERSION1_8;
            }
            final protocolsupport.api.ProtocolVersion protocolVersion2 = protocolsupport.api.ProtocolSupportAPI.getProtocolVersion(player);
            if (protocolVersion2 == null) {
                return ClientVersion.VERSION_UNSUPPORTED;
            }
            final String name2 = protocolVersion2.name();
            switch (name2.hashCode()) {
                case 1927600109: {
                    if (name2.equals("MINECRAFT_1_7_5")) {
                        break;
                    }
                    break;
                }
                case -373938841: {
                    if (name2.equals("MINECRAFT_1_7_10")) {
                        break;
                    }
                    break;
                }
                case 591949304: {
                    if (name2.equals("MINECRAFT_1_8")) {
                        break;
                    }
                    break;
                }
                case 218893493: {
                    if (name2.equals("MINECRAFT_FUTURE")) {
                        break;
                    }
                    break;
                }
            }
            switch (3) {
                case 0:
                case 1: {
                    return ClientVersion.VERSION1_7;
                }
                case 2: {
                    return ClientVersion.VERSION1_8;
                }
                case 3: {
                    return ClientVersion.VERSION1_9;
                }
                default: {
                    return ClientVersion.VERSION_UNSUPPORTED;
                }
            }
        }
    }
    
    @Override
    public boolean isLoaded(final World world, final int n, final int n2) {
        return ((CraftWorld)world).getHandle().chunkProviderServer.isChunkLoaded(n >> 4, n2 >> 4);
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
    
    @Override
    public void setPing(final Player player, final int ping) {
        ((CraftPlayer)player).getHandle().ping = ping;
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
    public float getFrictionFactor(final Block block) {
        return CraftMagicNumbers.getBlock(block).frictionFactor;
    }
    
    @Override
    public Cuboid getBoundingBox(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (!handle.isLoaded((BlockPosition)this.blockPosition)) {
            return null;
        }
        IBlockData blockData;
        if (this.vspigot && this.multiblock) {
            blockData = handle.getType((Entity)((CraftPlayer)player).getHandle(), (BlockPosition)this.blockPosition);
        }
        else {
            blockData = handle.getType((BlockPosition)this.blockPosition);
        }
        final AxisAlignedBB a = blockData.getBlock().a((net.minecraft.server.v1_8_R3.World)handle, (BlockPosition)this.blockPosition, blockData);
        if (a == null) {
            return null;
        }
        return new Cuboid(a.a, a.d, a.b, a.e, a.c, a.f);
    }
    
    @Override
    public Material getType(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (handle.isLoaded((BlockPosition)this.blockPosition)) {
            if (this.vspigot && this.multiblock) {
                final MaterialData materialData = (MaterialData)((CraftPlayer)player).getHandle().getFakeBlocks().get(this.blockPosition);
                if (materialData != null) {
                    return materialData.getItemType();
                }
            }
            return CraftMagicNumbers.getMaterial(handle.getType((BlockPosition)this.blockPosition).getBlock());
        }
        return Material.AIR;
    }
    
    @Override
    public void setAsyncPotionEffects(final Player player) {
        if (this.vspigot) {
            return;
        }
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
    public int getCurrentTick() {
        return MinecraftServer.currentTick;
    }
    
    @Override
    public MaterialData getTypeAndData(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (handle.isLoaded((BlockPosition)this.blockPosition)) {
            if (this.vspigot && this.multiblock) {
                final MaterialData materialData = (MaterialData)((CraftPlayer)player).getHandle().getFakeBlocks().get(this.blockPosition);
                if (materialData != null) {
                    return materialData;
                }
            }
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            final net.minecraft.server.v1_8_R3.Block block = type.getBlock();
            return CraftMagicNumbers.getMaterial(block).getNewData((byte)block.toLegacyData(type));
        }
        return new MaterialData(0);
    }
    
    @Override
    public void sendBlockUpdate(final Player player, final Location location) {
        final WorldServer worldServer = (WorldServer)location.getWorld();
        this.blockPosition.c(location.getBlockX(), location.getBlockY(), location.getBlockZ());
        if (worldServer.isLoaded((BlockPosition)this.blockPosition)) {
            IBlockData blockData;
            if (this.vspigot && this.multiblock) {
                blockData = worldServer.getType((Entity)((CraftPlayer)player).getHandle(), (BlockPosition)this.blockPosition);
            }
            else {
                blockData = worldServer.getType((BlockPosition)this.blockPosition);
            }
            ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)new PacketPlayOutBlockChange((BlockPosition)this.blockPosition, blockData));
        }
    }
    
    @Override
    public boolean rayTrace(final World world, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final boolean b, final boolean b2, final boolean b3) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        final MovingObjectPosition rayTrace = handle.rayTrace(new Vec3D(n, n2, n3), new Vec3D(n4, n5, n6), b, b2, b3);
        return rayTrace != null && handle.getType(rayTrace.a()).getBlock() != Blocks.END_PORTAL;
    }
    
    @Override
    public int sendFakeEntity(final PlayerData playerData, final PlayerData playerData2) {
        return -1;
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
        final net.minecraft.server.v1_8_R3.ItemStack nmsCopy = CraftItemStack.asNMSCopy(itemStack);
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
                        final NBTTagCompound value2 = list.get(n2);
                        if (value2 != null && value2.getString("AttributeName").equals("generic.movementSpeed") && value2.getInt("Operation") == 0) {
                            n += value2.getDouble("Amount");
                        }
                        ++n2;
                    }
                    return n;
                }
            }
        }
        return 0.0;
    }
    
    public NMSManager() {
        this.blockPosition = new BlockPosition.MutableBlockPosition();
        try {
            Class.forName("org.vspigot.vSpigotConfig");
            this.vspigot = true;
            this.multiblock = (vSpigotConfig.tracking.advancedHiddenBlocks || Bukkit.getPluginManager().isPluginEnabled("vHCF"));
            this.vspigotprotocolsupport = vSpigotConfig.options.protocolSupport;
        }
        catch (Throwable t) {
            this.vspigot = false;
            this.multiblock = false;
        }
        final PluginManager pluginManager = Bukkit.getPluginManager();
        this.protocolsupportplugin = pluginManager.isPluginEnabled("ProtocolSupport");
        this.viaversionplugin = pluginManager.isPluginEnabled("ViaVersion");
    }
    
    @Override
    public boolean isEmpty(final World world, final org.bukkit.entity.Entity entity, final Cuboid cuboid, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (handle.isLoaded((BlockPosition)this.blockPosition)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            final AxisAlignedBB axisAlignedBB = new AxisAlignedBB(cuboid.getX1(), cuboid.getY1(), cuboid.getZ1(), cuboid.getX2(), cuboid.getY2(), cuboid.getZ2());
            final ArrayList list = new ArrayList(1);
            type.getBlock().a((net.minecraft.server.v1_8_R3.World)handle, (BlockPosition)this.blockPosition, type, axisAlignedBB, (List)list, ((CraftEntity)entity).getHandle());
            return list.isEmpty();
        }
        return true;
    }
    
    @Override
    public float getFrictionFactor(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (!handle.isLoaded((BlockPosition)this.blockPosition)) {
            return Blocks.AIR.frictionFactor;
        }
        if (this.vspigot && this.multiblock) {
            return handle.getType((Entity)((CraftPlayer)player).getHandle(), (BlockPosition)this.blockPosition).getBlock().frictionFactor;
        }
        return handle.getType((BlockPosition)this.blockPosition).getBlock().frictionFactor;
    }
}
