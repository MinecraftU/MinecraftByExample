package minecraftbyexample.mbe01_block_simple;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**
 * User: The Grey Ghost
 * Date: 24/12/2014
 *
 * The Startup classes for this example are called during startup, in the following order:
 *  preInitCommon
 *  preInitClientOnly
 *  initCommon
 *  initClientOnly
 *  postInitCommon
 *  postInitClientOnly
 *  See MinecraftByExample class for more information
 */
public class StartupCommon
{
  public static BlockSimple blockSimple;  // this holds the unique instance of your block
  public static ItemBlock itemBlockSimple;  // this holds the unique instance of the ItemBlock corresponding to your block

  public static void preInitCommon()
  {
    blockSimple = (BlockSimple)(new BlockSimple().setUnlocalizedName("mbe01_block_simple_unlocalised_name"));
    blockSimple.setRegistryName("mbe01_block_simple_registry_name");
    ForgeRegistries.BLOCKS.register(blockSimple);

    // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
    itemBlockSimple = new ItemBlock(blockSimple);
    itemBlockSimple.setRegistryName(blockSimple.getRegistryName());
    ForgeRegistries.ITEMS.register(itemBlockSimple);
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
