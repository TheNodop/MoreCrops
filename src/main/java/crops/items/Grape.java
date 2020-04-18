package crops.items;

import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static crops.Initializer.CROPS;
import static crops.plants.Grape.grapeCrop;

public class Grape {
    public static final Item grapeSeeds = new AliasedBlockItem(grapeCrop, new Item.Settings().group(CROPS));
    public static final Item grape = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.15f).snack().build()).group(ItemGroup.FOOD));
    public static final Item wine = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.9f).build()).group(ItemGroup.FOOD));
}
