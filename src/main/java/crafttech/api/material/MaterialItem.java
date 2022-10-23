package crafttech.api.material;

import net.minecraft.item.Item;

public class MaterialItem extends Item {
	public static int partNum = 6;
	/**
	 * 为材质集添加材料时，请务必按照这个数组的顺序来添加！
	 */
	public static String[] partName = {
			"Ingot",
			"Nugget",
			"Raw",
			"Gear",
			"Plate",
			"Rod",
			"Gem",
	};
	public static String[] partBlockName = {
			"Block",
			"Ingot Block",
			"Machine"
	};
	public String part;
	public MaterialSet material;

	public MaterialItem(MaterialSet material, String part) {
		super(material.getItemSetting());
		this.material = material;
		this.part = part;
	}
}
