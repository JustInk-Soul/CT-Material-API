package crafttech.api.material;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crafttech.api.common.RegistryUtilities;

public class ModInit implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("ctacmi");

	@Override
	public void onInitialize() {
		for (var i : MaterialSets.materials) {
			var io = 0;
			for (var ii : i.parts) {
				Registry.register(Registry.ITEM, new Identifier("crafttech",
						RegistryUtilities.getRegistryName(MaterialItem.partName[io] + i.name)), ii);
				io++;
			}
		}
	}
}
