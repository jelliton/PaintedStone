package net.owexz.PaintedStone.Obsidian;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class YellowObsidian extends GenericCubeCustomBlock
{
 
    public YellowObsidian(Plugin plugin)
    {
        super(plugin, "Yellow Obsidian", new GenericCubeBlockDesign(plugin, CFTextures.getString("YellowObsidian"), 16));
    }
    public int getBlockId() {
    	return 49;
        }
}