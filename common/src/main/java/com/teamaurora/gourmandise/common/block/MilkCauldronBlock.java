package com.teamaurora.gourmandise.common.block;

import com.teamaurora.gourmandise.core.registry.GourmandiseBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Map;
import java.util.function.Predicate;

public class MilkCauldronBlock extends LayeredCauldronBlock {
    public static final Map<Item, CauldronInteraction> MILK = CauldronInteraction.newInteractionMap();
    public static final Predicate<Biome.Precipitation> NO_PRECIPITATION = (biomePrecipitation) -> false;
    public static final CauldronInteraction FILL_MILK = (blockState, level, blockPos, player, interactionHand, itemStack) -> CauldronInteraction.emptyBucket(level, blockPos, player, interactionHand, itemStack, GourmandiseBlocks.MILK_CAULDRON.get().defaultBlockState().setValue(LayeredCauldronBlock.LEVEL, 3), SoundEvents.BUCKET_EMPTY);

    public MilkCauldronBlock(Properties properties) {
        super(properties, NO_PRECIPITATION, MILK);
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter level, BlockPos pos, BlockState state) {
        return new ItemStack(Blocks.CAULDRON);
    }
}