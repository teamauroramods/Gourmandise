package com.teamaurora.gourmandise.common.block.trees;

import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class GrapeTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getConfiguredFeature(Random random, boolean largeHive) {
        if (random.nextInt(10) == 0) {
            return largeHive ? TreeFeatures.FANCY_OAK_BEES_005 : TreeFeatures.FANCY_OAK;
        } else {
            return largeHive ? TreeFeatures.OAK_BEES_005 : TreeFeatures.OAK;
        }
    }
}