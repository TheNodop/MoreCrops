package crops;

import com.sun.org.apache.xml.internal.utils.NameSpace;
import crops.items.Turnip;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.renderer.v1.Renderer;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static crops.items.Turnip.*;
import static crops.items.Corn.*;
import static crops.items.Flax.*;
import static crops.items.Grape.*;
import static crops.plants.Turnip.turnipCrop;
import static crops.plants.Corn.cornCrop;
import static crops.plants.Grape.grapeCrop;
import static crops.plants.Flax.flaxCrop;
import static crops.items.VeggieStew.VEGGIE_STEW;

public class Initializer implements ModInitializer {

	public static final String namespace = "crops";
	public static final ItemGroup CROPS = FabricItemGroupBuilder.build(
			new Identifier("crops", "general"),
			() -> new ItemStack(Turnip.turnip));

	@Override
	public void onInitialize() {
		System.out.println("Loading MORE-CROPS Mod!");


		Registry.register(Registry.ITEM, new Identifier(namespace, "veggie_stew"), VEGGIE_STEW);

		Registry.register(Registry.ITEM, new Identifier(namespace, "turnip_seeds"), turnipSeeds);
		Registry.register(Registry.ITEM, new Identifier(namespace, "corn_seeds"), cornSeeds);
		Registry.register(Registry.ITEM, new Identifier(namespace, "grape_seeds"), grapeSeeds);
		Registry.register(Registry.ITEM, new Identifier(namespace, "flax_seeds"), flaxSeeds);

		Registry.register(Registry.ITEM, new Identifier(namespace, "turnip_salad"), turnipSalad);
		Registry.register(Registry.ITEM, new Identifier(namespace, "popcorn"), corn_roasted);
		Registry.register(Registry.ITEM, new Identifier(namespace, "wine"), wine);
		Registry.register(Registry.ITEM, new Identifier(namespace, "roasted_seeds"), roastedSeeds);

		Registry.register(Registry.BLOCK, new Identifier(namespace, "turnip_crop"), turnipCrop);
		Registry.register(Registry.BLOCK, new Identifier(namespace, "corn_crop"), cornCrop);
		Registry.register(Registry.BLOCK, new Identifier(namespace, "grape_crop"), grapeCrop);
		Registry.register(Registry.BLOCK, new Identifier(namespace, "flax_crop"), flaxCrop);

		Registry.register(Registry.ITEM, new Identifier(namespace, "turnip"), turnip);
		Registry.register(Registry.ITEM, new Identifier(namespace, "corn"), corn);
		Registry.register(Registry.ITEM, new Identifier(namespace, "grape"), grape);

		BlockRenderLayerMap.INSTANCE.putBlock(turnipCrop, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(cornCrop, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(grapeCrop, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(flaxCrop, RenderLayer.getTranslucent());
		System.out.println("Finished loading MORE-CROPS Mod!");
	}
}
