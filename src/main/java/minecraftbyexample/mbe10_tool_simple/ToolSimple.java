package minecraftbyexample.mbe10_tool_simple;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.creativetab.CreativeTabs;

public class ToolSimple extends ItemPickaxe {

  public ToolSimple(ToolMaterial material) {
    super(material);
    this.setCreativeTab(CreativeTabs.MISC);   // the item will appear on the Miscellaneous tab in creative

    // final ToolMaterial SIMPLE_TOOL_MATERIAL = EnumHelper.addToolMaterial("SIMPLE_TOOL_MATERIAL", 3, 2048, 13f, 4.0f, 30);
    final int STACK_SIZE = 1;
    this.setMaxStackSize(STACK_SIZE);
    this.setCreativeTab(CreativeTabs.MISC); // the item will appear on the Miscellaneous tab in creative
  }
  
}