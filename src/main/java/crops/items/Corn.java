package crops.items;

import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static crops.Initializer.CROPS;
import static crops.plants.Corn.cornCrop;

public class Corn {
    public static final Item cornSeeds = new AliasedBlockItem(cornCrop, new Item.Settings().group(CROPS));
    public static final Item corn = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.15f).snack().build()).group(ItemGroup.FOOD));
    public static final Item corn_roasted = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).snack().build()).group(ItemGroup.FOOD));
}
