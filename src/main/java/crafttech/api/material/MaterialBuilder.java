package crafttech.api.material;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class MaterialBuilder {
	/**
	 * <p>
	 * 用于生成一个材质集({@link MaterialSet})
	 * </p>
	 * 
	 * @param name
	 *                  材质集名称
	 * @param key
	 *                  材质集翻译键名
	 * @param assetPath
	 *                  材质集资源目录(W.I.P)
	 * @param parts
	 *                  需要包含的材料
	 * @return
	 *         生成的材质集
	 */
	public static MaterialSet build(String name, Identifier key, String assetPath, Item... parts) {
		var tmp = new MaterialSet(name, key, assetPath);
		for (var i : parts) {
			tmp.addPart(i);
		}
		return tmp;
	}

	/**
	 * <p>
	 * 用于生成一个纯净的材质集({@link MaterialSet})
	 * </p>
	 * 
	 * @param name
	 *                  材质集名称
	 * @param key
	 *                  材质集翻译键名
	 * @param assetPath
	 *                  材质集资源目录(W.I.P)
	 * @return
	 *         生成的材质集
	 */
	public static MaterialSet build(String name, Identifier key, String assetPath) {
		var tmp = new MaterialSet(name, key, assetPath);
		return tmp;
	}

	/**
	 * <p>
	 * 用于生成一个材质集({@link MaterialSet})，并添加未包含的材料
	 * </p>
	 * 
	 * @param name
	 *                  材质集名称
	 * @param key
	 *                  材质集翻译键名
	 * @param assetPath
	 *                  材质集资源目录(W.I.P)
	 * @param parts
	 *                  需要包含的材料
	 * @return
	 *         生成的材质集
	 */
	public static MaterialSet buildR(String name, Identifier key, String assetPath, Item... parts) {
		var tmp = new MaterialSet(name, key, assetPath);
		for (var i : parts) {
			tmp.addPart(i);
		}
		for (var i = tmp.parts.size() + 1; i < tmp.parts.size() + MaterialItem.partNum; i++) {
			tmp.addPart(new MaterialItem(tmp, MaterialItem.partName[i]));
		}
		return tmp;
	}

	/**
	 * <p>
	 * 用于生成一个材质集({@link MaterialSet})，并添加所有材料
	 * </p>
	 * 
	 * @param name
	 *                  材质集名称
	 * @param key
	 *                  材质集翻译键名
	 * @param assetPath
	 *                  材质集资源目录(W.I.P)
	 * @return
	 *         生成的材质集
	 */
	public static MaterialSet buildR(String name, Identifier key, String assetPath) {
		var tmp = new MaterialSet(name, key, assetPath);
		for (var i = tmp.parts.size() + 1; i < tmp.parts.size() + MaterialItem.partNum; i++) {
			tmp.addPart(new MaterialItem(tmp, MaterialItem.partName[i]));
		}
		return tmp;
	}

	/**
	 * <p>
	 * 用于补全材质集({@link MaterialSet})未包含的材料
	 * </p>
	 * 
	 * @param tmp
	 *              材质集名称
	 * @param parts
	 *              需要包含的材料
	 * @return
	 *         生成的材质集
	 */
	public static MaterialSet R(MaterialSet tmp) {
		for (var i = tmp.parts.size() + 1; i < tmp.parts.size() + MaterialItem.partNum; i++) {
			tmp.addPart(new MaterialItem(tmp, MaterialItem.partName[i]));
		}
		return tmp;
	}
}
