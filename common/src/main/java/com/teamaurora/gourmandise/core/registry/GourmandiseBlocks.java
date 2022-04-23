package com.teamaurora.gourmandise.core.registry;

import com.teamaurora.gourmandise.core.Gourmandise;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public class GourmandiseBlocks {
    public static final PollinatedRegistry<Block> BLOCKS = PollinatedRegistry.create(Registry.BLOCK, Gourmandise.MOD_ID);
}