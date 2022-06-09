package com.teamaurora.gourmandise.core;

import com.teamaurora.gourmandise.common.block.MilkCauldronBlock;
import com.teamaurora.gourmandise.core.registry.GourmandiseBlocks;
import com.teamaurora.gourmandise.core.registry.GourmandiseItems;
import gg.moonflower.pollen.api.platform.Platform;
import gg.moonflower.pollen.api.registry.client.ColorRegistry;
import gg.moonflower.pollen.api.registry.client.RenderTypeRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.LayeredCauldronBlock;

public class Gourmandise {
    public static final String MOD_ID = "gourmandise";
    public static final Platform PLATFORM = Platform.builder(MOD_ID)
            .clientInit(Gourmandise::onClientInit)
            .clientPostInit(Gourmandise::onClientPostInit)
            .commonInit(Gourmandise::onCommonInit)
            .commonPostInit(Gourmandise::onCommonPostInit)
            .dataInit(Gourmandise::onDataInit)
            .build();

    public static void onClientInit() {
        ColorRegistry.register((x, world, pos, u) -> 0xFFEA35,
                GourmandiseBlocks.GRAPE_LEAVES,
                GourmandiseBlocks.BRANCHY_GRAPE_LEAVES,
                GourmandiseBlocks.GRAPE_LEAF_CARPET
        );
        ColorRegistry.register((color, items) -> 0xFFEA35,
                GourmandiseBlocks.GRAPE_LEAVES,
                GourmandiseBlocks.BRANCHY_GRAPE_LEAVES,
                GourmandiseBlocks.GRAPE_LEAF_CARPET
        );
    }

    public static void onClientPostInit(Platform.ModSetupContext ctx) {
        ctx.enqueueWork(() -> {
            RenderTypeRegistry.register(GourmandiseBlocks.GRAPE_SAPLING.get(), RenderType.cutout());
            RenderTypeRegistry.register(GourmandiseBlocks.POTTED_GRAPE_SAPLING.get(), RenderType.cutout());
            RenderTypeRegistry.register(GourmandiseBlocks.GRAPE_LEAF_CARPET.get(), RenderType.cutoutMipped());
            RenderTypeRegistry.register(GourmandiseBlocks.GRAPE_DOOR.get(), RenderType.cutout());
            RenderTypeRegistry.register(GourmandiseBlocks.GRAPE_TRAPDOOR.get(), RenderType.cutout());

            RenderTypeRegistry.register(GourmandiseBlocks.GRAPE_BRANCH.get(), RenderType.cutout());

            RenderTypeRegistry.register(GourmandiseBlocks.PINEAPPLE.get(), RenderType.cutout());
        });
    }

    public static void onCommonInit() {
        GourmandiseItems.ITEMS.register(Gourmandise.PLATFORM);
        GourmandiseBlocks.BLOCKS.register(Gourmandise.PLATFORM);
    }

    public static void onCommonPostInit(Platform.ModSetupContext ctx) {
        ctx.enqueueWork(() -> {
            /* Compostables */
            ComposterBlock.add(0.3F, GourmandiseBlocks.GRAPE_LEAVES.get());
            ComposterBlock.add(0.3F, GourmandiseBlocks.BRANCHY_GRAPE_LEAVES.get());
            ComposterBlock.add(0.3F, GourmandiseBlocks.GRAPE_SAPLING.get());
            ComposterBlock.add(0.3F, GourmandiseBlocks.GRAPE_LEAF_CARPET.get());

            ComposterBlock.add(0.65F, GourmandiseItems.GRAPES.get());

            /* Flammables */
            FireBlock fireBlock = (FireBlock) Blocks.FIRE;

            fireBlock.setFlammable(GourmandiseBlocks.GRAPE_LEAVES.get(), 30, 60);
            fireBlock.setFlammable(GourmandiseBlocks.BRANCHY_GRAPE_LEAVES.get(), 30, 60);
            fireBlock.setFlammable(GourmandiseBlocks.GRAPE_LOG.get(), 5, 5);
            fireBlock.setFlammable(GourmandiseBlocks.GRAPE_WOOD.get(), 5, 5);
            fireBlock.setFlammable(GourmandiseBlocks.STRIPPED_GRAPE_LOG.get(), 5, 5);
            fireBlock.setFlammable(GourmandiseBlocks.STRIPPED_GRAPE_WOOD.get(), 5, 5);
            fireBlock.setFlammable(GourmandiseBlocks.GRAPE_PLANKS.get(), 5, 20);
            fireBlock.setFlammable(GourmandiseBlocks.GRAPE_SLAB.get(), 5, 20);
            fireBlock.setFlammable(GourmandiseBlocks.GRAPE_STAIRS.get(), 5, 20);
            fireBlock.setFlammable(GourmandiseBlocks.GRAPE_FENCE.get(), 5, 20);
            fireBlock.setFlammable(GourmandiseBlocks.GRAPE_FENCE_GATE.get(), 5, 20);
            fireBlock.setFlammable(GourmandiseBlocks.GRAPE_LEAF_CARPET.get(), 30, 60);

            /* Cauldron Interactions */
            CauldronInteraction.addDefaultInteractions(MilkCauldronBlock.MILK);
            MilkCauldronBlock.MILK.put(Items.MILK_BUCKET, MilkCauldronBlock.FILL_MILK);
            MilkCauldronBlock.MILK.put(Items.BUCKET, (blockState, level, blockPos, player, interactionHand, itemStack) ->
                    CauldronInteraction.fillBucket(blockState, level, blockPos, player, interactionHand, itemStack, new ItemStack(Items.MILK_BUCKET),
                            (blockStatex) -> blockStatex.getValue(LayeredCauldronBlock.LEVEL) == 3, SoundEvents.BUCKET_FILL));
        });
    }

    public static void onDataInit(Platform.DataSetupContext ctx) {
    }
}
