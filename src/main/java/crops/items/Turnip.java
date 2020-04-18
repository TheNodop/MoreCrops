package crops.items;

import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static crops.plants.Turnip.turnipCrop;

public class Turnip {
    public static final Item turnipSeeds = new AliasedBlockItem(turnipCrop, new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item turnip = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.15f).snack().build()).group(ItemGroup.FOOD));
    public static final Item turnipSalad = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build()).group(ItemGroup.FOOD));
}
