package crops.items;

import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static crops.Initializer.CROPS;
import static crops.plants.Flax.flaxCrop;

public class Flax {
    public static final Item flaxSeeds = new AliasedBlockItem(flaxCrop, new Item.Settings().group(CROPS));
    public static final Item roastedSeeds = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.45f).snack().build()).group(ItemGroup.FOOD));
}
