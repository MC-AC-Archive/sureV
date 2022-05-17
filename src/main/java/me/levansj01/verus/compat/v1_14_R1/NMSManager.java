package me.levansj01.verus.compat.v1_14_R1;

import java.lang.reflect.*;
import me.levansj01.verus.util.java.*;
import org.bukkit.entity.*;
import org.bukkit.craftbukkit.v1_14_R1.entity.*;
import org.bukkit.craftbukkit.v1_14_R1.*;
import me.levansj01.verus.data.*;
import org.bukkit.block.*;
import org.bukkit.craftbukkit.v1_14_R1.util.*;
import org.bukkit.inventory.*;
import org.bukkit.material.*;
import me.levansj01.verus.util.item.*;
import me.levansj01.verus.util.*;
import org.bukkit.*;
import org.bukkit.plugin.*;
import org.bukkit.craftbukkit.v1_14_R1.inventory.*;
import me.levansj01.verus.data.version.*;
import us.myles.ViaVersion.api.*;
import protocolsupport.api.*;
import com.google.common.cache.*;
import java.util.concurrent.*;
import net.minecraft.server.v1_14_R1.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class NMSManager extends me.levansj01.verus.compat.NMSManager
{
    private final Map blockToMaterial;
    private static final Field effects;
    private final Map dataToMaterial;
    private final boolean viaversionplugin;
    private final String[] CLASSES;
    private final boolean protocolsupportplugin;
    private final BlockPosition.MutableBlockPosition blockPosition;
    private static final String[] llllIIlIIIll;
    private static final int[] lllllIlIIlII;
    
    static {
        lIIIIIIIIIIlIl();
        llllIlllIlllI();
        effects = SafeReflection.access(EntityLiving.class, NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[0]]);
    }
    
    @Override
    public boolean setOnGround(final Player player, final boolean onGround) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        final boolean onGround2 = handle.onGround;
        handle.onGround = onGround;
        return onGround2;
    }
    
    @Override
    public float getFrictionFactor(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.d(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lIIIIIIIIIIllI(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            return handle.getType((BlockPosition)this.blockPosition).getBlock().m();
        }
        return Blocks.AIR.m();
    }
    
    @Override
    public float getDamage(final Player player, final World world, final me.levansj01.verus.compat.BlockPosition blockPosition) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.d(blockPosition.getX(), blockPosition.getY(), blockPosition.getZ());
        if (lIIIIIIIIIIllI(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            return handle.getType((BlockPosition)this.blockPosition).getDamage((EntityHuman)((CraftPlayer)player).getHandle(), (IBlockAccess)handle, (BlockPosition)this.blockPosition);
        }
        return 0.0f;
    }
    
    @Override
    public int sendFakeEntity(final PlayerData playerData, final PlayerData playerData2) {
        return NMSManager.lllllIlIIlII[1];
    }
    
    @Override
    public float getFrictionFactor(final Block block) {
        return CraftMagicNumbers.getBlock(block.getType()).m();
    }
    
    @Override
    public double getItemModifier(final ItemStack itemStack) {
        final net.minecraft.server.v1_14_R1.ItemStack nmsCopy = CraftItemStack.asNMSCopy(itemStack);
        if (lIIIIIIIIIIlll(nmsCopy) && lIIIIIIIIIIllI(nmsCopy.hasTag() ? 1 : 0)) {
            final NBTBase value = nmsCopy.getTag().get(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[2]]);
            if (lIIIIIIIIIIllI((value instanceof NBTTagList) ? 1 : 0)) {
                final NBTTagList list = (NBTTagList)value;
                double n = 0.0;
                final int size = list.size();
                int n2 = NMSManager.lllllIlIIlII[0];
                while (lIIIIIIIIIlIII(n2, size)) {
                    final NBTTagCompound compound = list.getCompound(n2);
                    if (lIIIIIIIIIIllI(compound.getString(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[3]]).equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[4]]) ? 1 : 0) && lIIIIIIIIIlIIl(compound.getInt(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[5]]))) {
                        n += compound.getDouble(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[6]]);
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
    public MaterialData getTypeAndData(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.d(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lIIIIIIIIIIllI(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            MaterialData materialData = this.dataToMaterial.get(type);
            if (lIIIIIIIIIlIlI(materialData)) {
                materialData = this.blockToMaterial.get(type.getBlock());
                if (lIIIIIIIIIlIlI(materialData)) {
                    Material material = CraftMagicNumbers.getMaterial(type.getBlock());
                    if (lIIIIIIIIIlIll(material, Material.AIR)) {
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
    public Cuboid getBoundingBox(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.d(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lIIIIIIIIIIllI(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            final AxisAlignedBB boundingBox = type.getBlock().b(type, (IBlockAccess)handle, (BlockPosition)this.blockPosition, VoxelShapeCollision.a()).getBoundingBox();
            return new Cuboid(boundingBox.minX, boundingBox.maxX, boundingBox.minY, boundingBox.maxY, boundingBox.minZ, boundingBox.maxZ);
        }
        return new Cuboid(mutableBlockLocation).add(0.0, 1.0, 0.0, 1.0, 0.0, 1.0);
    }
    
    @Override
    public void sendBlockUpdate(final Player player, final Location location) {
        final WorldServer worldServer = (WorldServer)location.getWorld();
        this.blockPosition.d(location.getBlockX(), location.getBlockY(), location.getBlockZ());
        if (lIIIIIIIIIIllI(worldServer.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)new PacketPlayOutBlockChange((IBlockAccess)worldServer, (BlockPosition)this.blockPosition));
        }
    }
    
    public NMSManager() {
        final String[] classes = new String[NMSManager.lllllIlIIlII[3]];
        classes[NMSManager.lllllIlIIlII[0]] = NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[7]];
        classes[NMSManager.lllllIlIIlII[2]] = NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[8]];
        this.CLASSES = classes;
        this.dataToMaterial = (Map)SafeReflection.getLocalField(this.CLASSES, null, NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[9]]);
        this.blockToMaterial = (Map)SafeReflection.getLocalField(this.CLASSES, null, NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[10]]);
        this.blockPosition = new BlockPosition.MutableBlockPosition();
        final PluginManager pluginManager = Bukkit.getPluginManager();
        this.protocolsupportplugin = pluginManager.isPluginEnabled(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[11]]);
        this.viaversionplugin = pluginManager.isPluginEnabled(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[12]]);
    }
    
    @Override
    public int getCurrentTick() {
        return MinecraftServer.currentTick;
    }
    
    @Override
    public boolean isLoaded(final World world, final int n, final int n2) {
        return ((CraftWorld)world).getHandle().getChunkProvider().isLoaded(n >> NMSManager.lllllIlIIlII[5], n2 >> NMSManager.lllllIlIIlII[5]);
    }
    
    @Override
    public void setAsyncPotionEffects(final Player player) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        final Map effects = handle.effects;
        if (lIIIIIIIIIIllI((effects instanceof HashMap) ? 1 : 0)) {
            SafeReflection.set(NMSManager.effects, handle, new ConcurrentHashMap(effects));
        }
    }
    
    @Override
    public boolean setInWater(final Player player, final boolean b) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        return handle.inWater = handle.inWater;
    }
    
    @Override
    public Material getType(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.d(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lIIIIIIIIIIllI(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            MaterialData materialData = this.dataToMaterial.get(type);
            if (lIIIIIIIIIlIlI(materialData)) {
                materialData = this.blockToMaterial.get(type.getBlock());
                if (lIIIIIIIIIlIlI(materialData)) {
                    Material material = CraftMagicNumbers.getMaterial(type.getBlock());
                    if (lIIIIIIIIIlIll(material, Material.AIR)) {
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
    public ItemStack getOffHand(final Player player) {
        return ((CraftInventoryPlayer)player.getInventory()).getItemInOffHand();
    }
    
    @Override
    public ClientVersion getVersion(final Player player) {
        if (lIIIIIIIIIIllI(this.viaversionplugin ? 1 : 0)) {
            final int playerVersion = Via.getAPI().getPlayerVersion(player.getUniqueId());
            if (lIIIIIIIIIllIl(playerVersion, NMSManager.lllllIlIIlII[6])) {
                return ClientVersion.VERSION1_7;
            }
            if (lIIIIIIIIIllIl(playerVersion, NMSManager.lllllIlIIlII[13])) {
                return ClientVersion.VERSION1_8;
            }
            if (!lIIIIIIIIIIllI(this.protocolsupportplugin ? 1 : 0) || lIIIIIIIIIlllI(playerVersion, NMSManager.lllllIlIIlII[14])) {
                if (lIIIIIIIIIllIl(playerVersion, NMSManager.lllllIlIIlII[15])) {
                    return ClientVersion.VERSION1_9;
                }
                return ClientVersion.VERSION1_13;
            }
        }
        if (!lIIIIIIIIIIllI(this.protocolsupportplugin ? 1 : 0)) {
            return ClientVersion.VERSION1_13;
        }
        final ProtocolVersion protocolVersion = ProtocolSupportAPI.getProtocolVersion(player);
        if (lIIIIIIIIIlIlI(protocolVersion)) {
            return ClientVersion.VERSION_UNSUPPORTED;
        }
        final String name = protocolVersion.name();
        int n = NMSManager.lllllIlIIlII[1];
        switch (name.hashCode()) {
            case 1927600109: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[16]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[0];
                if (4 != 4) {
                    return null;
                }
                break;
            }
            case -373938841: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[17]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[2];
                if (3 >= 4) {
                    return null;
                }
                break;
            }
            case 591949304: {
                if (lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[18]]) ? 1 : 0)) {
                    final int n2 = NMSManager.lllllIlIIlII[3];
                    return null;
                }
                break;
            }
            case 591949305: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[19]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[4];
                if (3 < 1) {
                    return null;
                }
                break;
            }
            case 1927602027: {
                if (lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[20]]) ? 1 : 0)) {
                    final int n3 = NMSManager.lllllIlIIlII[5];
                    return null;
                }
                break;
            }
            case 1927602028: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[21]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[6];
                if (null != null) {
                    return null;
                }
                break;
            }
            case 1927602030: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[22]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[7];
                if (2 != 2) {
                    return null;
                }
                break;
            }
            case 1170559071: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[23]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[8];
                if (4 == 1) {
                    return null;
                }
                break;
            }
            case 1170559072: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[24]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[9];
                if (2 < 2) {
                    return null;
                }
                break;
            }
            case -374160366: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[25]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[10];
                if (2 > 3) {
                    return null;
                }
                break;
            }
            case 1170559073: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[26]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[11];
                if (-1 > -1) {
                    return null;
                }
                break;
            }
            case -374159405: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[27]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[12];
                if (1 <= -1) {
                    return null;
                }
                break;
            }
            case -374159404: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[28]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[16];
                if (2 >= 3) {
                    return null;
                }
                break;
            }
            case 1170559074: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[29]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[17];
                if (4 <= 0) {
                    return null;
                }
                break;
            }
            case -374158444: {
                if (lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[30]]) ? 1 : 0)) {
                    final int n4 = NMSManager.lllllIlIIlII[18];
                    return null;
                }
                break;
            }
            case -374158443: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[31]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[19];
                if (4 > 4) {
                    return null;
                }
                break;
            }
            case 1170559075: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[32]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[20];
                if (1 < 0) {
                    return null;
                }
                break;
            }
            case -374157483: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[33]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[21];
                if (3 <= 0) {
                    return null;
                }
                break;
            }
            case -374157482: {
                if (lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[34]]) ? 1 : 0)) {
                    final int n5 = NMSManager.lllllIlIIlII[22];
                    return null;
                }
                break;
            }
            case -374157481: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[35]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[23];
                if (4 < 1) {
                    return null;
                }
                break;
            }
            case -374157480: {
                if (!lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[36]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lllllIlIIlII[24];
                if (0 > 0) {
                    return null;
                }
                break;
            }
            case 218893493: {
                if (lIIIIIIIIIIllI(name.equals(NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[37]]) ? 1 : 0)) {
                    n = NMSManager.lllllIlIIlII[25];
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
            case 21: {
                return ClientVersion.VERSION1_13;
            }
            default: {
                final int id = protocolVersion.getId();
                if (!lIIIIIIIIlIlII(id, NMSManager.lllllIlIIlII[13])) {
                    return ClientVersion.VERSION_UNSUPPORTED;
                }
                if (lIIIIIIIIIllIl(id, NMSManager.lllllIlIIlII[15])) {
                    return ClientVersion.VERSION1_9;
                }
                return ClientVersion.VERSION1_13;
            }
        }
    }
    
    @Override
    public void setPing(final Player player, final int ping) {
        ((CraftPlayer)player).getHandle().ping = ping;
    }
    
    @Override
    public Map createCache(final Long n, final Long n2) {
        final CacheBuilder builder = CacheBuilder.newBuilder();
        if (lIIIIIIIIIIlll(n)) {
            builder.expireAfterAccess((long)n, TimeUnit.MILLISECONDS);
        }
        if (lIIIIIIIIIIlll(n2)) {
            builder.expireAfterWrite((long)n2, TimeUnit.MILLISECONDS);
        }
        return builder.build().asMap();
    }
    
    @Override
    public double getMovementSpeed(final Player player) {
        return ((CraftPlayer)player).getHandle().getAttributeInstance(GenericAttributes.MOVEMENT_SPEED).getValue();
    }
    
    @Override
    public void sendTransaction(final Player player, final short n) {
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)new PacketPlayOutTransaction(NMSManager.lllllIlIIlII[0], n, (boolean)(NMSManager.lllllIlIIlII[0] != 0)));
    }
    
    @Override
    public boolean isGliding(final Player player) {
        return ((CraftPlayer)player).isGliding();
    }
    
    @Override
    public boolean isRiptiding(final Player player) {
        return ((CraftPlayer)player).isRiptiding();
    }
    
    private static void llllIlllIlllI() {
        (llllIIlIIIll = new String[NMSManager.lllllIlIIlII[38]])[NMSManager.lllllIlIIlII[0]] = llllIlllIIlll("KCUACjk5MA==", "MCfoZ");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[2]] = llllIlllIlIII("RhufF9QRi3i8SDOcx9abTfy49VVHboMe", "zpXFg");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[3]] = llllIlllIlIIl("6O4SfAjzEfMNw7b9FLdNOw==", "jyddz");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[4]] = llllIlllIlIIl("YQgpsLbf6kxMObhkoTu+c/dyGvCD1yWv", "CVFJN");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[5]] = llllIlllIlIII("IPHwV7QNPhzI3JeSFMArOQ==", "XnkFw");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[6]] = llllIlllIlIII("KhATIKC8z6s=", "LNoWV");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[7]] = llllIlllIIlll("OyEoZyQhOCQgMnowPSggIDE6Ii09J2E/dwtiexYUZX06PS84fQw7JzInAywhNTA2", "TSOIF");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[8]] = llllIlllIlIIl("/5OMTqfcExRz3qddWjuI0ufa6b4eHVVWnyxmBL41j/ol6bRWXgBBc7TXnTaMEInXvJKmFtT4uJg=", "AIpOv");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[9]] = llllIlllIIlll("DwIfNAEELgohMBkKCjk=", "kckUU");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[10]] = llllIlllIlIIl("XI3xX9Inckfjyr4CJpBUVQ==", "AFSYO");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[11]] = llllIlllIlIIl("81p6UhBh5UBlOkoSS77w+w==", "UoVRp");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[12]] = llllIlllIIlll("EC0XOA80Nx8BBA==", "FDvnj");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[16]] = llllIlllIlIII("uQiunsIoa4s0N43HdIbgMg==", "BpMzz");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[17]] = llllIlllIlIII("qTAwPNIuNkxdadeCEofIG65ycDIzijXS", "lJvzn");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[18]] = llllIlllIlIII("glYE9K6SSmrFR6vkwDVOSQ==", "PDnkL");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[19]] = llllIlllIlIII("QHFKY2hwx/ax6ULKo4oe6g==", "wpkze");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[20]] = llllIlllIlIII("WRRRAyCON+bI9SGNH6aMZw==", "zTehP");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[21]] = llllIlllIlIII("6pDfRrXrlF+8Ey91b6BdJg==", "KaJON");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[22]] = llllIlllIIlll("Jz0GHTQ4NQ4MKFsrcQdD", "jtHXw");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[23]] = llllIlllIIlll("Kj4/My81NjciM1YoQEY=", "gwqvl");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[24]] = llllIlllIlIII("sWqDJaZSAsOz68wkaXCSXQ==", "crBsm");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[25]] = llllIlllIlIIl("VPa4mkGUEnZydybkp5LSyTyqKcGu6Ux3", "HyMLO");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[26]] = llllIlllIIlll("OSIaPwomKhIuFkU0ZUg=", "tkTzI");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[27]] = llllIlllIIlll("CBM3PwwXGz8uEHQFSEgQdA==", "EZyzO");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[28]] = llllIlllIlIIl("xkD9UhvTM5vuvWq6GbX43O2BB6cXY+go", "aRPvg");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[29]] = llllIlllIIlll("ISIFLzY+Kg0+Kl00elk=", "lkKju");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[30]] = llllIlllIIlll("GC4XMhUHJh8jCWQ4aEQJZA==", "UgYwV");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[31]] = llllIlllIlIIl("FSiilnIZUcCAIJAo7krKEJtLFTTYU+uS", "HgRHi");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[32]] = llllIlllIlIIl("5L/LZ0wPlnJjFSnx8g4duQ==", "ubrFj");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[33]] = llllIlllIlIII("lhDk06+rV8voamuQ0hzczYHB2bE4TcSk", "oWOog");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[34]] = llllIlllIlIII("/b1lEZ5FyMRbzjM88VTQq5FfAzUYgZJs", "EXORb");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[35]] = llllIlllIlIIl("ZRZzWmvVRDSYbaP4Y5ErjvEZK4qK1aml", "HnTaC");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[36]] = llllIlllIlIIl("ZI4FchF8ZMjIaHibtgVil/uFxyjHY0zn", "NGjgh");
        NMSManager.llllIIlIIIll[NMSManager.lllllIlIIlII[37]] = llllIlllIlIII("4IjDTsO5segOysqHQKRVsLTc34JRPNNF", "yKVEK");
    }
    
    private static String llllIlllIlIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(NMSManager.lllllIlIIlII[3], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String llllIlllIIlll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = NMSManager.lllllIlIIlII[0];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = NMSManager.lllllIlIIlII[0];
        while (lIIIIIIIIIlIII(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (-4 >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String llllIlllIlIIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), NMSManager.lllllIlIIlII[9]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(NMSManager.lllllIlIIlII[3], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIIIIIIlIl() {
        (lllllIlIIlII = new int[39])[0] = 0;
        NMSManager.lllllIlIIlII[1] = -1;
        NMSManager.lllllIlIIlII[2] = 1;
        NMSManager.lllllIlIIlII[3] = 2;
        NMSManager.lllllIlIIlII[4] = 3;
        NMSManager.lllllIlIIlII[5] = 4;
        NMSManager.lllllIlIIlII[6] = 5;
        NMSManager.lllllIlIIlII[7] = 6;
        NMSManager.lllllIlIIlII[8] = 7;
        NMSManager.lllllIlIIlII[9] = 8;
        NMSManager.lllllIlIIlII[10] = 9;
        NMSManager.lllllIlIIlII[11] = 10;
        NMSManager.lllllIlIIlII[12] = 11;
        NMSManager.lllllIlIIlII[13] = 47;
        NMSManager.lllllIlIIlII[14] = 498;
        NMSManager.lllllIlIIlII[15] = 340;
        NMSManager.lllllIlIIlII[16] = 12;
        NMSManager.lllllIlIIlII[17] = 13;
        NMSManager.lllllIlIIlII[18] = 14;
        NMSManager.lllllIlIIlII[19] = 15;
        NMSManager.lllllIlIIlII[20] = 16;
        NMSManager.lllllIlIIlII[21] = 17;
        NMSManager.lllllIlIIlII[22] = 18;
        NMSManager.lllllIlIIlII[23] = 19;
        NMSManager.lllllIlIIlII[24] = 20;
        NMSManager.lllllIlIIlII[25] = 21;
        NMSManager.lllllIlIIlII[26] = 22;
        NMSManager.lllllIlIIlII[27] = 23;
        NMSManager.lllllIlIIlII[28] = 24;
        NMSManager.lllllIlIIlII[29] = 25;
        NMSManager.lllllIlIIlII[30] = 26;
        NMSManager.lllllIlIIlII[31] = 27;
        NMSManager.lllllIlIIlII[32] = 28;
        NMSManager.lllllIlIIlII[33] = 29;
        NMSManager.lllllIlIIlII[34] = 30;
        NMSManager.lllllIlIIlII[35] = 31;
        NMSManager.lllllIlIIlII[36] = 32;
        NMSManager.lllllIlIIlII[37] = 33;
        NMSManager.lllllIlIIlII[38] = 34;
    }
    
    private static boolean lIIIIIIIIIlIII(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean lIIIIIIIIIllIl(final int n, final int n2) {
        return n <= n2;
    }
    
    private static boolean lIIIIIIIIlIlII(final int n, final int n2) {
        return n > n2;
    }
    
    private static boolean lIIIIIIIIIIlll(final Object o) {
        return o != null;
    }
    
    private static boolean lIIIIIIIIIlIll(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean lIIIIIIIIIlIlI(final Object o) {
        return o == null;
    }
    
    private static boolean lIIIIIIIIIIllI(final int n) {
        return n != 0;
    }
    
    private static boolean lIIIIIIIIIlIIl(final int n) {
        return n == 0;
    }
    
    private static boolean lIIIIIIIIIlllI(final int n, final int n2) {
        return n != n2;
    }
}
