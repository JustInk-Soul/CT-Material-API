package crafttech.api.material;

import java.util.Vector;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;

/**
 * <h1>材质集类</h1>
 * <p>
 * 负责记录所有的材质所对应的物品的集合
 * </p>
 */
public class MaterialSet {
	public final String name;
	public final Identifier key;
	public final String assetPath;
	/**
	 * 这个列表是专门放材料物品的，BlockItem请放在{@code blockParts}
	 */
	public Vector<Item> parts;
	/**
	 * 这个列表是专门放材料方块物品的，Item请放在{@code parts}
	 */
	public Vector<BlockItem> blockParts;

	public MaterialSet(String name, Identifier key, String assetPath) {
		this.name = name;
		this.key = key;
		this.assetPath = assetPath;
	}

	/**
	 * <p>
	 * 调用这个方法来添加材质物品到材质集
	 * </p>
	 * 
	 * @param part
	 */
	public void addPart(Item part) {
		parts.add(part);
		ModInit.LOGGER.debug("MaterialSet-" + name + "::addPart(" + part.toString() + ")");
	}

	/**
	 * <p>
	 * 调用这个方法来获取当前材质集的资源路径（WIP）
	 * </p>
	 * <--【格雷就是这样子调用资源的】-->
	 * 
	 * @return 资源路径
	 */
	public String getAssetPath() {
		// TODO 修复Asset
		return "";
	}

	/**
	 * <p>
	 * 所有材质物品({@link MaterialItem})都会从这里获取物品设置
	 * </p>
	 * <p>
	 * *覆写这个方法来修改物品设置
	 * </p>
	 * 
	 * @return Settings
	 */
	public Settings getItemSetting() {
		return new FabricItemSettings().maxCount(64);
	}
}
