package minecraftbyexample.mbe10_item_simple;

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
  public static ItemSimple itemSimple;  // this holds the unique instance of your block

  public static void preInitCommon()
  {
    itemSimple = (ItemSimple)(new ItemSimple().setUnlocalizedName("mbe10_item_simple_unlocalised_name"));
    itemSimple.setRegistryName("mbe10_item_simple_registry_name");
    ForgeRegistries.ITEMS.register(itemSimple);
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }
}
