package com.teamaurora.gourmandise.common.block;

import com.teamaurora.gourmandise.core.registry.GourmandiseBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class BranchyGrapeLeavesBlock extends LeavesBlock implements BonemealableBlock {
    public BranchyGrapeLeavesBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidBonemealTarget(BlockGetter level, BlockPos pos, BlockState state, boolean isClient) {
        return level.getBlockState(pos.below()).isAir();
    }

    @Override
    public boolean isBonemealSuccess(Level level, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel level, Random random, BlockPos pos, BlockState state) {
        level.setBlockAndUpdate(pos.below(), GourmandiseBlocks.GRAPE_BRANCH.get().defaultBlockState());
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    @Override
    @SuppressWarnings("deprecation")
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, Random random) {
        if (level.random.nextInt(14) == 0 && level.hasChunksAt(pos, BlockPos.of(4))) { // Forge: check area to prevent loading unloaded chunks
            if (level.isEmptyBlock(pos.below())) {
                level.setBlockAndUpdate(pos.below(), GourmandiseBlocks.GRAPE_BRANCH.get().defaultBlockState());
            }
        }
    }
}