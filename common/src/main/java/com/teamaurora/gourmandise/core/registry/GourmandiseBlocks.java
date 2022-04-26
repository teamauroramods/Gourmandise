package com.teamaurora.gourmandise.core.registry;

import com.teamaurora.gourmandise.common.block.BranchyGrapeLeavesBlock;
import com.teamaurora.gourmandise.common.block.GrapesBlock;
import com.teamaurora.gourmandise.common.block.LeafCarpetBlock;
import com.teamaurora.gourmandise.common.block.PineappleBlock;
import com.teamaurora.gourmandise.common.block.trees.GrapeTreeGrower;
import com.teamaurora.gourmandise.common.item.FollowItemLike;
import com.teamaurora.gourmandise.core.Gourmandise;
import com.teamaurora.gourmandise.core.registry.util.Woodset;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.Objects;
import java.util.function.Supplier;

@SuppressWarnings("unused")
public class GourmandiseBlocks {
    public static final PollinatedRegistry<Block> BLOCKS = PollinatedRegistry.create(Registry.BLOCK, Gourmandise.MOD_ID);

    /* Grape Woodset */

    private static final Woodset GRAPE = new Woodset(MaterialColor.COLOR_BROWN, MaterialColor.TERRACOTTA_PURPLE);

    public static final Supplier<Block> STRIPPED_GRAPE_LOG = registerWoodsetBlock("stripped_grape_log", GRAPE::stripped_log, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.STRIPPED_OAK_LOG);
    public static final Supplier<Block> STRIPPED_GRAPE_WOOD = registerWoodsetBlock("stripped_grape_wood", GRAPE::stripped_wood, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.STRIPPED_OAK_WOOD);
    public static final Supplier<Block> GRAPE_LOG= registerWoodsetBlock("grape_log", GRAPE::log, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.OAK_LOG);
    public static final Supplier<Block> GRAPE_WOOD = registerWoodsetBlock("grape_wood", GRAPE::stripped_log, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.STRIPPED_OAK_LOG);
    public static final Supplier<Block> GRAPE_PLANKS = registerWoodsetBlock("grape_planks", GRAPE::planks, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.OAK_PLANKS);
    public static final Supplier<Block> GRAPE_SLAB = registerWoodsetBlock("grape_slab", GRAPE::slab, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.OAK_SLAB);
    public static final Supplier<Block> GRAPE_STAIRS = registerWoodsetBlock("grape_stairs", ()-> GRAPE.stairs(GRAPE_PLANKS), CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.OAK_STAIRS);
    public static final Supplier<Block> GRAPE_PRESSURE_PLATE = registerWoodsetBlock("grape_pressure_plate", GRAPE::pressurePlate, CreativeModeTab.TAB_REDSTONE, Blocks.OAK_PRESSURE_PLATE);
    public static final Supplier<Block> GRAPE_FENCE = registerWoodsetBlock("grape_fence", GRAPE::fence, CreativeModeTab.TAB_DECORATIONS, Blocks.OAK_FENCE);
    public static final Supplier<Block> GRAPE_FENCE_GATE = registerWoodsetBlock("grape_fence_gate", GRAPE::fenceGate, CreativeModeTab.TAB_REDSTONE, Blocks.OAK_FENCE_GATE);
    public static final Supplier<Block> GRAPE_BUTTON = registerWoodsetBlock("grape_button", GRAPE::button, CreativeModeTab.TAB_REDSTONE, Blocks.OAK_BUTTON);
    public static final Supplier<Block> GRAPE_DOOR = registerWoodsetBlock("grape_door", GRAPE::door, CreativeModeTab.TAB_REDSTONE, Blocks.OAK_DOOR);
    public static final Supplier<Block> GRAPE_TRAPDOOR = registerWoodsetBlock("grape_trapdoor", GRAPE::trapdoor, CreativeModeTab.TAB_REDSTONE, Blocks.OAK_TRAPDOOR);

    public static final Supplier<Block> GRAPE_BRANCH = registerBlock("grape_branch", ()-> new GrapesBlock(Properties.GRAPE_BRANCH), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> BRANCHY_GRAPE_LEAVES = registerBlock("branchy_grape_leaves", ()-> new BranchyGrapeLeavesBlock(Properties.GRAPE_LEAVES), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> GRAPE_LEAVES = registerBlock("grape_leaves", ()-> new LeavesBlock(Properties.GRAPE_LEAVES), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> GRAPE_LEAF_CARPET = registerBlock("grape_leaf_carpet", ()-> new LeafCarpetBlock(Properties.GRAPE_LEAVES), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> GRAPE_SAPLING = registerBlock("grape_sapling", ()-> new SaplingBlock(new GrapeTreeGrower(), Properties.SAPLING), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> POTTED_GRAPE_SAPLING = registerPotted("potted_grape_sapling", GRAPE_SAPLING);

    /* Cheese */

    public static final Supplier<Block> CHEESE_BLOCK = registerBlock("cheese_block", ()-> new Block(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CHEESE_STAIRS = registerBlock("cheese_stairs", ()-> new StairBlock(CHEESE_BLOCK.get().defaultBlockState(), Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CHEESE_SLAB = registerBlock("cheese_slab", ()-> new SlabBlock(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CHISELED_CHEESE_BLOCK = registerBlock("chiseled_cheese_block", ()-> new Block(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CHEESE_TILES = registerBlock("cheese_tiles", ()-> new Block(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CHEESE_TILE_STAIRS = registerBlock("cheese_tile_stairs", ()-> new StairBlock(CHEESE_TILES.get().defaultBlockState(), Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CHEESE_TILE_SLAB = registerBlock("cheese_tile_slab", ()-> new SlabBlock(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> BLUE_CHEESE_BLOCK = registerBlock("blue_cheese_block", ()-> new Block(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> BLUE_CHEESE_STAIRS = registerBlock("blue_cheese_stairs", ()-> new StairBlock(BLUE_CHEESE_BLOCK.get().defaultBlockState(), Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> BLUE_CHEESE_SLAB = registerBlock("blue_cheese_slab", ()-> new SlabBlock(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CHISELED_BLUE_CHEESE_BLOCK = registerBlock("chiseled_blue_cheese_block", ()-> new Block(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> BLUE_CHEESE_TILES = registerBlock("blue_cheese_tiles", ()-> new Block(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> BLUE_CHEESE_TILE_STAIRS = registerBlock("blue_cheese_tile_stairs", ()-> new StairBlock(BLUE_CHEESE_TILES.get().defaultBlockState(), Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> BLUE_CHEESE_TILE_SLAB = registerBlock("blue_cheese_tile_slab", ()-> new SlabBlock(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> SOFT_CHEESE_BLOCK = registerBlock("soft_cheese_block", ()-> new Block(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> SOFT_CHEESE_STAIRS = registerBlock("soft_cheese_stairs", ()-> new StairBlock(SOFT_CHEESE_BLOCK.get().defaultBlockState(), Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> SOFT_CHEESE_SLAB = registerBlock("soft_cheese_slab", ()-> new SlabBlock(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CHISELED_SOFT_CHEESE_BLOCK = registerBlock("chiseled_soft_cheese_block", ()-> new Block(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> SOFT_CHEESE_TILES = registerBlock("soft_cheese_tiles", ()-> new Block(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> SOFT_CHEESE_TILE_STAIRS = registerBlock("soft_cheese_tile_stairs", ()-> new StairBlock(SOFT_CHEESE_TILES.get().defaultBlockState(), Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> SOFT_CHEESE_TILE_SLAB = registerBlock("soft_cheese_tile_slab", ()-> new SlabBlock(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> MELTED_CHEESE_BLOCK = registerBlock("melted_cheese_block", ()-> new Block(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> MELTED_CHEESE_STAIRS = registerBlock("melted_cheese_stairs", ()-> new StairBlock(MELTED_CHEESE_BLOCK.get().defaultBlockState(), Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> MELTED_CHEESE_SLAB = registerBlock("melted_cheese_slab", ()-> new SlabBlock(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CHISELED_MELTED_CHEESE_BLOCK = registerBlock("chiseled_melted_cheese_block", ()-> new Block(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> MELTED_CHEESE_TILES = registerBlock("melted_cheese_tiles", ()-> new Block(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> MELTED_CHEESE_TILE_STAIRS = registerBlock("melted_cheese_tile_stairs", ()-> new StairBlock(MELTED_CHEESE_TILES.get().defaultBlockState(), Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> MELTED_CHEESE_TILE_SLAB = registerBlock("melted_cheese_tile_slab", ()-> new SlabBlock(Properties.CHEESE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> MILK_CAULDRON = registerBlock("milk_cauldron", ()-> new LayeredCauldronBlock(Properties.CAULDRON, Objects::isNull, CauldronInteraction.WATER), new Item.Properties().tab(CreativeModeTab.TAB_BREWING));
    public static final Supplier<Block> CHEESE_CAULDRON = registerBlock("cheese_cauldron", ()-> new Block(Properties.CAULDRON), new Item.Properties().tab(CreativeModeTab.TAB_BREWING));
    /* Golden Wheat */

    public static final Supplier<Block> GOLDEN_HAY_BLOCK = registerBlock("golden_hay_block", ()-> new HayBlock(Properties.HAY), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    /* Pineapple */
    //todo: (latter two need better block properties in the future)

    public static final Supplier<Block> PINEAPPLE_LEAVES_BLOCK = registerBlock("pineapple_leaves_block", ()-> new Block(Properties.DRIED_KELP), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> PINEAPPLE_BLOCK = registerBlock("pineapple_block", ()-> new Block(Properties.DRIED_KELP), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> PINEAPPLE_TILES = registerBlock("pineapple_tiles", ()-> new Block(Properties.DRIED_KELP), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> PINEAPPLE = BLOCKS.register("pineapple", ()-> new PineappleBlock(Properties.PINEAPPLE));

    private static Supplier<Block> registerBlock(String id, Supplier<Block> block, Item.Properties properties) {
        Supplier<Block> register = BLOCKS.register(id, block);
        GourmandiseItems.ITEMS.register(id, () -> new BlockItem(register.get(), properties));
        return register;
    }

    private static Supplier<Block> registerWoodsetBlock(String id, Supplier<Block> block, CreativeModeTab tab, Block followBlock) {
        Supplier<Block> register = BLOCKS.register(id, block);
        GourmandiseItems.ITEMS.register(id, () -> new FollowItemLike(register.get(), new Item.Properties(), tab, followBlock));
        return register;
    }

    private static Supplier<Block> registerPotted(String id, Supplier<Block> block) {
        Supplier<Block> register = BLOCKS.register(id, () -> new FlowerPotBlock(block.get(), Properties.POTTED_PLANT));
        return register;
    }

    static class Properties {
        public static final Block.Properties CHEESE = Block.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW).strength(2.0F, 3.0F).sound(SoundType.WOOD);
        public static final BlockBehaviour.Properties GRAPE_LEAVES = BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).color(MaterialColor.TERRACOTTA_PURPLE);
        public static final BlockBehaviour.Properties GRAPE_BRANCH = BlockBehaviour.Properties.of(Material.PLANT).randomTicks().sound(SoundType.CROP);
        public static final BlockBehaviour.Properties SAPLING = BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING);
        public static final BlockBehaviour.Properties POTTED_PLANT = BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM);
        public static final BlockBehaviour.Properties HAY = BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK);
        public static final BlockBehaviour.Properties DRIED_KELP = BlockBehaviour.Properties.copy(Blocks.DRIED_KELP_BLOCK);
        public static final BlockBehaviour.Properties PINEAPPLE = BlockBehaviour.Properties.of(Material.PLANT).noOcclusion().randomTicks().instabreak().sound(SoundType.WOOD);
        public static final BlockBehaviour.Properties CAULDRON = BlockBehaviour.Properties.copy(Blocks.CAULDRON);
    }
}