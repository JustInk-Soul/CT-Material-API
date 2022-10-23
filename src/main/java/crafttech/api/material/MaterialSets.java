package crafttech.api.material;

import java.util.Vector;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class MaterialSets {
	/**
	 * 这个Vector是用于存放所有材质的，
	 * 目前仅用于注册材料。
	 */
	public static Vector<MaterialSet> materials;

	public static MaterialSet build(String name, Identifier key, String assetPath) {
		return MaterialBuilder.build(name, key, assetPath);
	}

	public static MaterialSet buildR(String name, Identifier key, String assetPath) {
		return MaterialBuilder.buildR(name, key, assetPath);
	}

	public static MaterialSet build(String name, Identifier key, String assetPath, Item... parts) {
		return MaterialBuilder.build(name, key, assetPath, parts);
	}

	public static MaterialSet buildR(String name, Identifier key, String assetPath, Item... parts) {
		return MaterialBuilder.buildR(name, key, assetPath, parts);
	}

	public static final MaterialSet IRON = build("Iron", new Identifier("crafttech", "iron"), null, Items.IRON_INGOT,
			Items.IRON_NUGGET),
			GOLD = build("Gold", new Identifier("crafttech", "gold"), null, Items.GOLD_INGOT, Items.GOLD_NUGGET),
			IDK = build("Idk", new Identifier("crafttech", "idk"), null);

	public static void registryMaterial() {
		IRON.addPart(Items.IRON_INGOT);
		IRON.addPart(Items.IRON_NUGGET);
		MaterialBuilder.R(IRON);
	}
}
