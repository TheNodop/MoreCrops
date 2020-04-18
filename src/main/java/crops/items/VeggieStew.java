package crops.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

import static crops.Initializer.CROPS;

public class VeggieStew extends Item {

    public static final VeggieStew VEGGIE_STEW = new VeggieStew(new Item.Settings().food(new FoodComponent.Builder().hunger(8).saturationModifier(6f).build()).group(CROPS).maxCount(1));

    public VeggieStew(Settings settings)
    {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack,World world, LivingEntity playerEntity)
    {
        playerEntity.playSound(SoundEvents.ENTITY_PLAYER_BURP, 1.0F, 1.0F);
        playerEntity.eatFood(world, stack);
        return new ItemStack(Items.BOWL);
    }
}
