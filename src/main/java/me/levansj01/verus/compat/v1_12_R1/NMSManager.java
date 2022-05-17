package me.levansj01.verus.compat.v1_12_R1;

import java.lang.reflect.*;
import org.bukkit.craftbukkit.v1_12_R1.*;
import org.bukkit.entity.*;
import me.levansj01.verus.util.*;
import org.bukkit.craftbukkit.v1_12_R1.entity.*;
import org.bukkit.inventory.*;
import org.bukkit.plugin.*;
import com.google.common.cache.*;
import org.bukkit.craftbukkit.v1_12_R1.util.*;
import org.bukkit.craftbukkit.v1_12_R1.inventory.*;
import me.levansj01.verus.data.*;
import org.bukkit.*;
import me.levansj01.verus.data.version.*;
import us.myles.ViaVersion.api.*;
import protocolsupport.api.*;
import me.levansj01.verus.util.java.*;
import java.util.concurrent.*;
import org.bukkit.block.*;
import org.bukkit.material.*;
import net.minecraft.server.v1_12_R1.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class NMSManager extends me.levansj01.verus.compat.NMSManager
{
    private final boolean viaversionplugin;
    private final BlockPosition.MutableBlockPosition blockPosition;
    private static final Field effects;
    private final boolean protocolsupportplugin;
    private static final String[] lIlIIIIllIllI;
    private static final int[] lIlIIIIlllIII;
    
    @Override
    public boolean setOnGround(final Player player, final boolean onGround) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        final boolean onGround2 = handle.onGround;
        handle.onGround = onGround;
        return onGround2;
    }
    
    @Override
    public boolean isGliding(final Player player) {
        return ((CraftPlayer)player).isGliding();
    }
    
    @Override
    public boolean isLoaded(final World world, final int n, final int n2) {
        return ((CraftWorld)world).getHandle().getChunkProviderServer().isLoaded(n >> NMSManager.lIlIIIIlllIII[0], n2 >> NMSManager.lIlIIIIlllIII[0]);
    }
    
    @Override
    public float getDamage(final Player player, final World world, final me.levansj01.verus.compat.BlockPosition blockPosition) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(blockPosition.getX(), blockPosition.getY(), blockPosition.getZ());
        if (lIlIIlIlIIIIll(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            return handle.getType((BlockPosition)this.blockPosition).a((EntityHuman)((CraftPlayer)player).getHandle(), (net.minecraft.server.v1_12_R1.World)handle, (BlockPosition)this.blockPosition);
        }
        return 0.0f;
    }
    
    @Override
    public boolean rayTrace(final World world, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final boolean b, final boolean b2, final boolean b3) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        final MovingObjectPosition rayTrace = handle.rayTrace(new Vec3D(n, n2, n3), new Vec3D(n4, n5, n6), b, b2, b3);
        if (lIlIIlIlIIIlII(rayTrace)) {
            return NMSManager.lIlIIIIlllIII[1] != 0;
        }
        int n7;
        if (lIlIIlIlIIIlIl(handle.getType(rayTrace.a()).getBlock(), Blocks.END_PORTAL)) {
            n7 = NMSManager.lIlIIIIlllIII[2];
            if (5 == 0) {
                return false;
            }
        }
        else {
            n7 = NMSManager.lIlIIIIlllIII[1];
        }
        return n7 != 0;
    }
    
    @Override
    public boolean setInWater(final Player player, final boolean b) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        return handle.inWater = handle.inWater;
    }
    
    @Override
    public boolean isEmpty(final World world, final Entity entity, final Cuboid cuboid, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lIlIIlIlIIIIll(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            final AxisAlignedBB axisAlignedBB = new AxisAlignedBB(cuboid.getX1(), cuboid.getY1(), cuboid.getZ1(), cuboid.getX2(), cuboid.getY2(), cuboid.getZ2());
            final ArrayList list = new ArrayList(NMSManager.lIlIIIIlllIII[2]);
            type.getBlock().a(type, (net.minecraft.server.v1_12_R1.World)handle, (BlockPosition)this.blockPosition, axisAlignedBB, (List)list, ((CraftEntity)entity).getHandle(), (boolean)(NMSManager.lIlIIIIlllIII[1] != 0));
            return list.isEmpty();
        }
        return NMSManager.lIlIIIIlllIII[2] != 0;
    }
    
    @Override
    public ItemStack getOffHand(final Player player) {
        return ((CraftInventoryPlayer)player.getInventory()).getItemInOffHand();
    }
    
    @Override
    public double getMovementSpeed(final Player player) {
        return ((CraftPlayer)player).getHandle().getAttributeInstance(GenericAttributes.MOVEMENT_SPEED).getValue();
    }
    
    public NMSManager() {
        this.blockPosition = new BlockPosition.MutableBlockPosition();
        final PluginManager pluginManager = Bukkit.getPluginManager();
        this.protocolsupportplugin = pluginManager.isPluginEnabled(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[1]]);
        this.viaversionplugin = pluginManager.isPluginEnabled(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[2]]);
    }
    
    @Override
    public float getFrictionFactor(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lIlIIlIlIIIIll(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            return handle.getType((BlockPosition)this.blockPosition).getBlock().frictionFactor;
        }
        return Blocks.AIR.frictionFactor;
    }
    
    @Override
    public Map createCache(final Long n, final Long n2) {
        final CacheBuilder builder = CacheBuilder.newBuilder();
        if (lIlIIlIlIIIllI(n)) {
            builder.expireAfterAccess((long)n, TimeUnit.MILLISECONDS);
        }
        if (lIlIIlIlIIIllI(n2)) {
            builder.expireAfterWrite((long)n2, TimeUnit.MILLISECONDS);
        }
        return builder.build().asMap();
    }
    
    @Override
    public Material getType(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lIlIIlIlIIIIll(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            return CraftMagicNumbers.getMaterial(handle.getType((BlockPosition)this.blockPosition).getBlock());
        }
        return Material.AIR;
    }
    
    @Override
    public void sendTransaction(final Player player, final short n) {
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)new PacketPlayOutTransaction(NMSManager.lIlIIIIlllIII[1], n, (boolean)(NMSManager.lIlIIIIlllIII[1] != 0)));
    }
    
    @Override
    public double getItemModifier(final ItemStack itemStack) {
        final net.minecraft.server.v1_12_R1.ItemStack nmsCopy = CraftItemStack.asNMSCopy(itemStack);
        if (lIlIIlIlIIIllI(nmsCopy) && lIlIIlIlIIIIll(nmsCopy.hasTag() ? 1 : 0)) {
            final NBTBase value = nmsCopy.getTag().get(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[3]]);
            if (lIlIIlIlIIIIll((value instanceof NBTTagList) ? 1 : 0)) {
                final NBTTagList list = (NBTTagList)value;
                double n = 0.0;
                final int size = list.size();
                int n2 = NMSManager.lIlIIIIlllIII[1];
                while (lIlIIlIlIIIlll(n2, size)) {
                    final NBTTagCompound value2 = list.get(n2);
                    if (lIlIIlIlIIIIll(value2.getString(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[4]]).equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[0]]) ? 1 : 0) && lIlIIlIlIIlIII(value2.getInt(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[5]]))) {
                        n += value2.getDouble(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[6]]);
                    }
                    ++n2;
                    if (!true) {
                        return 0.0;
                    }
                }
                return n;
            }
        }
        return 0.0;
    }
    
    @Override
    public int getCurrentTick() {
        return MinecraftServer.currentTick;
    }
    
    @Override
    public int sendFakeEntity(final PlayerData playerData, final PlayerData playerData2) {
        return NMSManager.lIlIIIIlllIII[7];
    }
    
    @Override
    public void sendBlockUpdate(final Player player, final Location location) {
        final WorldServer worldServer = (WorldServer)location.getWorld();
        this.blockPosition.c(location.getBlockX(), location.getBlockY(), location.getBlockZ());
        if (lIlIIlIlIIIIll(worldServer.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)new PacketPlayOutBlockChange((net.minecraft.server.v1_12_R1.World)worldServer, (BlockPosition)this.blockPosition));
        }
    }
    
    @Override
    public ClientVersion getVersion(final Player player) {
        if (lIlIIlIlIIIIll(this.viaversionplugin ? 1 : 0)) {
            final int playerVersion = Via.getAPI().getPlayerVersion(player.getUniqueId());
            if (lIlIIlIlIIlIIl(playerVersion, NMSManager.lIlIIIIlllIII[5])) {
                return ClientVersion.VERSION1_7;
            }
            if (lIlIIlIlIIlIIl(playerVersion, NMSManager.lIlIIIIlllIII[8])) {
                return ClientVersion.VERSION1_8;
            }
            if (!lIlIIlIlIIIIll(this.protocolsupportplugin ? 1 : 0) || lIlIIlIlIIlIlI(playerVersion, NMSManager.lIlIIIIlllIII[9])) {
                if (lIlIIlIlIIlIIl(playerVersion, NMSManager.lIlIIIIlllIII[9])) {
                    return ClientVersion.VERSION1_9;
                }
                return ClientVersion.VERSION1_13;
            }
        }
        if (!lIlIIlIlIIIIll(this.protocolsupportplugin ? 1 : 0)) {
            return ClientVersion.VERSION1_9;
        }
        final ProtocolVersion protocolVersion = ProtocolSupportAPI.getProtocolVersion(player);
        if (lIlIIlIlIIIlII(protocolVersion)) {
            return ClientVersion.VERSION_UNSUPPORTED;
        }
        final String name = protocolVersion.name();
        int n = NMSManager.lIlIIIIlllIII[7];
        switch (name.hashCode()) {
            case 1927600109: {
                if (!lIlIIlIlIIIIll(name.equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[10]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIlIIIIlllIII[1];
                if (2 < 0) {
                    return null;
                }
                break;
            }
            case -373938841: {
                if (!lIlIIlIlIIIIll(name.equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[11]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIlIIIIlllIII[2];
                if (0 <= -1) {
                    return null;
                }
                break;
            }
            case 591949304: {
                if (!lIlIIlIlIIIIll(name.equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[12]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIlIIIIlllIII[3];
                if (3 == -1) {
                    return null;
                }
                break;
            }
            case 591949305: {
                if (!lIlIIlIlIIIIll(name.equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[13]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIlIIIIlllIII[4];
                if (3 != 3) {
                    return null;
                }
                break;
            }
            case 1927602027: {
                if (!lIlIIlIlIIIIll(name.equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[14]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIlIIIIlllIII[0];
                if (null != null) {
                    return null;
                }
                break;
            }
            case 1927602028: {
                if (!lIlIIlIlIIIIll(name.equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[15]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIlIIIIlllIII[5];
                if (3 != 3) {
                    return null;
                }
                break;
            }
            case 1927602030: {
                if (!lIlIIlIlIIIIll(name.equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[16]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIlIIIIlllIII[6];
                if (false) {
                    return null;
                }
                break;
            }
            case 1170559071: {
                if (!lIlIIlIlIIIIll(name.equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[17]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIlIIIIlllIII[10];
                if (4 != 4) {
                    return null;
                }
                break;
            }
            case 1170559072: {
                if (!lIlIIlIlIIIIll(name.equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[18]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIlIIIIlllIII[11];
                if (3 == -1) {
                    return null;
                }
                break;
            }
            case -374160366: {
                if (!lIlIIlIlIIIIll(name.equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[19]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIlIIIIlllIII[12];
                if (2 <= 1) {
                    return null;
                }
                break;
            }
            case 1170559073: {
                if (!lIlIIlIlIIIIll(name.equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[20]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIlIIIIlllIII[13];
                if (false == true) {
                    return null;
                }
                break;
            }
            case -374159405: {
                if (!lIlIIlIlIIIIll(name.equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[21]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIlIIIIlllIII[14];
                if (null != null) {
                    return null;
                }
                break;
            }
            case -374159404: {
                if (!lIlIIlIlIIIIll(name.equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[22]]) ? 1 : 0)) {
                    break;
                }
                n = NMSManager.lIlIIIIlllIII[15];
                if (null != null) {
                    return null;
                }
                break;
            }
            case 218893493: {
                if (lIlIIlIlIIIIll(name.equals(NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[23]]) ? 1 : 0)) {
                    n = NMSManager.lIlIIIIlllIII[16];
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
            case 13: {
                return ClientVersion.VERSION1_13;
            }
            default: {
                final int id = protocolVersion.getId();
                if (!lIlIIlIlIIlIll(id, NMSManager.lIlIIIIlllIII[8])) {
                    return ClientVersion.VERSION_UNSUPPORTED;
                }
                if (lIlIIlIlIIlIIl(id, NMSManager.lIlIIIIlllIII[9])) {
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
    
    static {
        lIlIIlIlIIIIlI();
        lIlIIlIIlllIll();
        effects = SafeReflection.access(EntityLiving.class, NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[24]]);
    }
    
    @Override
    public void setAsyncPotionEffects(final Player player) {
        final EntityPlayer handle = ((CraftPlayer)player).getHandle();
        final Map effects = handle.effects;
        if (lIlIIlIlIIIIll((effects instanceof HashMap) ? 1 : 0)) {
            SafeReflection.set(NMSManager.effects, handle, new ConcurrentHashMap(effects));
        }
    }
    
    @Override
    public float getFrictionFactor(final Block block) {
        return CraftMagicNumbers.getBlock(block).frictionFactor;
    }
    
    @Override
    public MaterialData getTypeAndData(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lIlIIlIlIIIIll(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            final net.minecraft.server.v1_12_R1.Block block = type.getBlock();
            return CraftMagicNumbers.getMaterial(block).getNewData((byte)block.toLegacyData(type));
        }
        return new MaterialData(NMSManager.lIlIIIIlllIII[1]);
    }
    
    @Override
    public Cuboid getBoundingBox(final Player player, final World world, final MutableBlockLocation mutableBlockLocation) {
        final WorldServer handle = ((CraftWorld)world).getHandle();
        this.blockPosition.c(mutableBlockLocation.getX(), mutableBlockLocation.getY(), mutableBlockLocation.getZ());
        if (lIlIIlIlIIIIll(handle.isLoaded((BlockPosition)this.blockPosition) ? 1 : 0)) {
            final IBlockData type = handle.getType((BlockPosition)this.blockPosition);
            final AxisAlignedBB b = type.getBlock().b(type, (IBlockAccess)handle, (BlockPosition)this.blockPosition);
            return new Cuboid(b.a, b.d, b.b, b.e, b.c, b.f);
        }
        return new Cuboid(mutableBlockLocation).add(new Cuboid(1.0, 1.0, 1.0));
    }
    
    private static void lIlIIlIIlllIll() {
        (lIlIIIIllIllI = new String[NMSManager.lIlIIIIlllIII[25]])[NMSManager.lIlIIIIlllIII[1]] = lIlIIlIIllIlll("FzcdPyckKh4YPTc1HTk8", "GErKH");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[2]] = lIlIIlIIlllIII("gol+UUmhmxlrdiEUwW/S1A==", "MgWWD");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[3]] = lIlIIlIIllIlll("DycZNgwsJhkhKCE3BCIMKyEe", "NSmDe");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[4]] = lIlIIlIIlllIIl("DW8bL+WMFcefJefq1MTkpg==", "NOLUE");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[0]] = lIlIIlIIlllIII("mH8wcbCQ1zRbLX8uiP++GLvnpzEkLmgu", "iACLy");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[5]] = lIlIIlIIllIlll("HDIqExMnKyAP", "SBOar");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[6]] = lIlIIlIIlllIIl("ZQi0w3fD+qw=", "XnLUz");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[10]] = lIlIIlIIllIlll("Oxk2IzEkET4yLUcPTzlH", "vPxfr");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[11]] = lIlIIlIIlllIIl("8/yVmcii9lK9PXLPWVJw+j/Lx/PuK6L2", "UwkQd");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[12]] = lIlIIlIIllIlll("Hz4rKDEANiM5LWMoXQ==", "Rwemr");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[13]] = lIlIIlIIlllIIl("wTmSGml84nWgqtFi/x2FgQ==", "tFkvH");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[14]] = lIlIIlIIlllIII("5ALrskwe7sWFb99qZNt8QA==", "orHcC");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[15]] = lIlIIlIIllIlll("Ky8LFxQ0JwMGCFc5fA1l", "ffERW");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[16]] = lIlIIlIIllIlll("Gz8eIy4ENxYyMmcpaTlZ", "VvPfm");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[17]] = lIlIIlIIllIlll("Ajw6JjodNDI3Jn4qRVM=", "Outcy");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[18]] = lIlIIlIIllIlll("BgwMNgIZBAQnHnoac0I=", "KEBsA");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[19]] = lIlIIlIIlllIIl("ciWrH+Qir27QLaiZFlPxEVjYHr0XMdCw", "qeuEf");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[20]] = lIlIIlIIllIlll("PwAGFC0gCA4FMUMWeWM=", "rIHQn");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[21]] = lIlIIlIIlllIII("LqcooWTvsIx3xq2xl/zl937bmwzaPOk0", "suaBj");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[22]] = lIlIIlIIllIlll("KCcINBU3LwAlCVQxd0MJVw==", "enFqV");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[23]] = lIlIIlIIlllIIl("zExVbPfrwA9u2mKmUZHL2YzlShLWkHAo", "jIiHM");
        NMSManager.lIlIIIIllIllI[NMSManager.lIlIIIIlllIII[24]] = lIlIIlIIlllIII("Rt9ZZufh5QQ=", "OAOKG");
    }
    
    private static String lIlIIlIIllIlll(String s, final String s2) {
        s = new String(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder sb = new StringBuilder();
        final char[] charArray = s2.toCharArray();
        int n = NMSManager.lIlIIIIlllIII[1];
        final char[] charArray2 = s.toCharArray();
        final int length = charArray2.length;
        int n2 = NMSManager.lIlIIIIlllIII[1];
        while (lIlIIlIlIIIlll(n2, length)) {
            sb.append((char)(charArray2[n2] ^ charArray[n % charArray.length]));
            ++n;
            ++n2;
            if (3 < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
    
    private static String lIlIIlIIlllIIl(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher instance = Cipher.getInstance("Blowfish");
            instance.init(NMSManager.lIlIIIIlllIII[3], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIlIIlllIII(final String s, final String s2) {
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(s2.getBytes(StandardCharsets.UTF_8)), NMSManager.lIlIIIIlllIII[11]), "DES");
            final Cipher instance = Cipher.getInstance("DES");
            instance.init(NMSManager.lIlIIIIlllIII[3], secretKeySpec);
            return new String(instance.doFinal(Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIlIlIIIIlI() {
        (lIlIIIIlllIII = new int[26])[0] = 4;
        NMSManager.lIlIIIIlllIII[1] = 0;
        NMSManager.lIlIIIIlllIII[2] = 1;
        NMSManager.lIlIIIIlllIII[3] = 2;
        NMSManager.lIlIIIIlllIII[4] = 3;
        NMSManager.lIlIIIIlllIII[5] = 5;
        NMSManager.lIlIIIIlllIII[6] = 6;
        NMSManager.lIlIIIIlllIII[7] = -1;
        NMSManager.lIlIIIIlllIII[8] = 47;
        NMSManager.lIlIIIIlllIII[9] = 340;
        NMSManager.lIlIIIIlllIII[10] = 7;
        NMSManager.lIlIIIIlllIII[11] = 8;
        NMSManager.lIlIIIIlllIII[12] = 9;
        NMSManager.lIlIIIIlllIII[13] = 10;
        NMSManager.lIlIIIIlllIII[14] = 11;
        NMSManager.lIlIIIIlllIII[15] = 12;
        NMSManager.lIlIIIIlllIII[16] = 13;
        NMSManager.lIlIIIIlllIII[17] = 14;
        NMSManager.lIlIIIIlllIII[18] = 15;
        NMSManager.lIlIIIIlllIII[19] = 16;
        NMSManager.lIlIIIIlllIII[20] = 17;
        NMSManager.lIlIIIIlllIII[21] = 18;
        NMSManager.lIlIIIIlllIII[22] = 19;
        NMSManager.lIlIIIIlllIII[23] = 20;
        NMSManager.lIlIIIIlllIII[24] = 21;
        NMSManager.lIlIIIIlllIII[25] = 22;
    }
    
    private static boolean lIlIIlIlIIIlll(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean lIlIIlIlIIlIIl(final int n, final int n2) {
        return n <= n2;
    }
    
    private static boolean lIlIIlIlIIlIll(final int n, final int n2) {
        return n > n2;
    }
    
    private static boolean lIlIIlIlIIIlIl(final Object o, final Object o2) {
        return o != o2;
    }
    
    private static boolean lIlIIlIlIIIllI(final Object o) {
        return o != null;
    }
    
    private static boolean lIlIIlIlIIIlII(final Object o) {
        return o == null;
    }
    
    private static boolean lIlIIlIlIIIIll(final int n) {
        return n != 0;
    }
    
    private static boolean lIlIIlIlIIlIII(final int n) {
        return n == 0;
    }
    
    private static boolean lIlIIlIlIIlIlI(final int n, final int n2) {
        return n != n2;
    }
}
