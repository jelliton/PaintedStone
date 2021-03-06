package net.owexz.PaintedStone.Glass;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LightBlueGlass extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 20;
        }
    public LightBlueGlass(Plugin plugin)
    {
        super(plugin, "Light Blue Glass", new GenericCubeBlockDesign(plugin, CFTextures.getString("LightBlueGlass"), 16));
        setOpaque(false);
    }
}