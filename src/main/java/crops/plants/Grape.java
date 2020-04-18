package crops.plants;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DefaultedList;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

import static crops.items.Grape.grapeSeeds;

public class Grape extends CropBlock {

    protected Grape(Settings settings) {
        super(settings);
    }

    public static final Block grapeCrop = new Grape(
            FabricBlockSettings.copy(Blocks.WHEAT)
                    .build()
    );

    @Override
    protected ItemConvertible getSeedsItem() {
        return grapeSeeds;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hitResult) {
        if(!world.isClient && isMature(state)){
            List<ItemStack> dropList = getDroppedStacks(state, (ServerWorld)world, pos, null, player, player.getStackInHand(hand));
            DefaultedList<ItemStack> drops = DefaultedList.of();
            for(ItemStack stack : dropList){
                drops.add(stack);
            }

            for(ItemStack stack : drops){
                if(stack.getItem() == grapeSeeds){
                    ItemStack seedStack = stack.copy();
                    drops.remove(stack);
                    seedStack.decrement(1);
                    drops.add(seedStack);
                    break;
                }
            }

            world.setBlockState(pos, state.with(AGE, 0));
            ItemScatterer.spawn(world, pos, drops);
        }
        return super.onUse(state, world, pos, player, hand, hitResult);
    }
}

