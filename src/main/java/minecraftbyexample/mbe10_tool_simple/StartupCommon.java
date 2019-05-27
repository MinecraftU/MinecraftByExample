package minecraftbyexample.mbe10_tool_simple;

import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

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
  public static ToolSimple toolSimple;  // this holds the unique instance of your block

  public static void preInitCommon()
  {
    // each instance of your item should have two names:
    // 1) a registry name that is used to uniquely identify this item.  Should be unique within your mod.  use lower case.
    // 2) an 'unlocalised name' that is used to retrieve the text name of your item in the player's language.  For example-
    //    the unlocalised name might be "water", which is printed on the user's screen as "Wasser" in German or
    //    "aqua" in Italian.
    //
    //    Multiple items can have the same unlocalised name - for example
    //  +----RegistryName-------+----UnlocalisedName----+
    //  |  burning_candle       +       candle          |
    //  |  extinguished_candle  +       candle          |
    //  +-----------------------+-----------------------+
    //
    final Item.ToolMaterial TOOL_MATERIAL = Item.ToolMaterial.STONE;  // affects durability and digging speed
                                                                                                  //   in addition to the ToolClass criteria
    toolSimple = (ToolSimple)(new ToolSimple(TOOL_MATERIAL).setUnlocalizedName("mbe10_tool_simple_unlocalised_name"));
    toolSimple.setRegistryName("mbe10_tool_simple_registry_name");
    ForgeRegistries.ITEMS.register(toolSimple);
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }
}
