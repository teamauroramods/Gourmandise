package com.teamaurora.gourmandise.core.registry;

import com.teamaurora.gourmandise.common.item.DrinkItem;
import com.teamaurora.gourmandise.common.item.FoodOnStickItem;
import com.teamaurora.gourmandise.core.Gourmandise;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class GourmandiseItems {
    public static final PollinatedRegistry<Item> ITEMS = PollinatedRegistry.create(Registry.ITEM, Gourmandise.MOD_ID);

    public static final Supplier<Item> GRAPE_BUNCH = ITEMS.register("grape_bunch", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))); // TODO: make it so this can be made into grapes
    public static final Supplier<Item> GRAPES = ITEMS.register("grapes", ()-> new Item(new Item.Properties().food(Foods.GRAPES).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> DRIED_GRAPES = ITEMS.register("dried_grapes", ()-> new Item(new Item.Properties().food(Foods.DRIED_GRAPES).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> GRAPE_JUICE = ITEMS.register("grape_juice", ()-> new DrinkItem(new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).food(Foods.GRAPE_JUICE).stacksTo(16).tab(CreativeModeTab.TAB_FOOD)));

    public static final Supplier<Item> CHEESE = ITEMS.register("cheese", ()-> new Item(new Item.Properties().food(Foods.CHEESE).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> CHEESE_SAUCE = ITEMS.register("cheese_sauce", ()-> new BowlFoodItem(new Item.Properties().food(Foods.CHEESE_SAUCE).craftRemainder(Items.BOWL).stacksTo(1).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> CHEESE_BREAD = ITEMS.register("cheese_bread", ()-> new Item(new Item.Properties().food(Foods.CHEESE_BREAD).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> CHEESE_WHEEL = ITEMS.register("cheese_wheel", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final Supplier<Item> BLUE_CHEESE = ITEMS.register("blue_cheese", ()-> new Item(new Item.Properties().food(Foods.BLUE_CHEESE).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> BLUE_CHEESE_WHEEL = ITEMS.register("blue_cheese_wheel", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final Supplier<Item> SOFT_CHEESE = ITEMS.register("soft_cheese", ()-> new Item(new Item.Properties().food(Foods.SOFT_CHEESE).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> SOFT_CHEESE_WHEEL = ITEMS.register("soft_cheese_wheel", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final Supplier<Item> MELTED_CHEESE = ITEMS.register("melted_cheese", ()-> new Item(new Item.Properties().food(Foods.MELTED_CHEESE).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> MELTED_CHEESE_BUCKET = ITEMS.register("melted_cheese_bucket", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> GRILLED_CHEESE = ITEMS.register("grilled_cheese", ()-> new Item(new Item.Properties().food(Foods.GRILLED_CHEESE).tab(CreativeModeTab.TAB_FOOD)));

    public static final Supplier<Item> PINEAPPLE_LEAVES = ITEMS.register("pineapple_leaves", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final Supplier<Item> PINEAPPLE = ITEMS.register("pineapple", ()-> new ItemNameBlockItem(GourmandiseBlocks.PINEAPPLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final Supplier<Item> PINEAPPLE_SLICES = ITEMS.register("pineapple_slices", ()-> new Item(new Item.Properties().food(Foods.PINEAPPLE_SLICES).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> PINEAPPLE_PUNCH = ITEMS.register("pineapple_punch", ()-> new DrinkItem(new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).food(Foods.PINEAPPLE_PUNCH).stacksTo(16).tab(CreativeModeTab.TAB_FOOD)));

    public static final Supplier<Item> SAUSAGE = ITEMS.register("sausage", ()-> new Item(new Item.Properties().food(Foods.SAUSAGE).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> COOKED_SAUSAGE = ITEMS.register("cooked_sausage", ()-> new Item(new Item.Properties().food(Foods.COOKED_SAUSAGE).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> CHEESE_SAUSAGE = ITEMS.register("cheese_sausage", ()-> new Item(new Item.Properties().food(Foods.CHEESE_SAUSAGE).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> HOT_DOG = ITEMS.register("hot_dog", ()-> new Item(new Item.Properties().food(Foods.HOT_DOG).tab(CreativeModeTab.TAB_FOOD)));

    public static final Supplier<Item> SHRIMP = ITEMS.register("shrimp", ()-> new Item(new Item.Properties().food(Foods.SHRIMP).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> COOKED_SHRIMP = ITEMS.register("cooked_shrimp", ()-> new Item(new Item.Properties().food(Foods.COOKED_SHRIMP).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> SHRIMP_ON_A_STICK = ITEMS.register("shrimp_on_a_stick", ()-> new FoodOnStickItem(new Item.Properties().food(Foods.SHRIMP_ON_A_STICK).tab(CreativeModeTab.TAB_FOOD).craftRemainder(Items.STICK)));

    public static final Supplier<Item> GOURMAND_SALAD = ITEMS.register("gourmand_salad", ()-> new BowlFoodItem(new Item.Properties().food(Foods.FRUIT_SALAD).stacksTo(1).craftRemainder(Items.BOWL).tab(CreativeModeTab.TAB_FOOD)));

    public static final Supplier<Item> POTATO_CHIPS = ITEMS.register("potato_chips", ()-> new Item(new Item.Properties().food(Foods.POTATO_CHIPS).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> SPICY_CHIPS = ITEMS.register("spicy_chips", ()-> new Item(new Item.Properties().food(Foods.SPICY_CHIPS).tab(CreativeModeTab.TAB_FOOD)));

    public static final Supplier<Item> GOLDEN_WHEAT = ITEMS.register("golden_wheat", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final Supplier<Item> GOLDEN_BREAD = ITEMS.register("golden_bread", ()-> new Item(new Item.Properties().food(Foods.GOLDEN_BREAD).tab(CreativeModeTab.TAB_FOOD)));

    public static final Supplier<Item> SLICED_BREAD = ITEMS.register("sliced_bread", ()-> new Item(new Item.Properties().food(Foods.SLICED_BREAD).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> PIZZA = ITEMS.register("pizza", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> PIZZA_SLICE = ITEMS.register("pizza_slice", ()-> new Item(new Item.Properties().food(Foods.PIZZA_SLICE).tab(CreativeModeTab.TAB_FOOD)));

    public static final Supplier<Item> PEPPER_SEEDS = ITEMS.register("pepper_seeds", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final Supplier<Item> PEPPER_VINE = ITEMS.register("pepper_vine", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final Supplier<Item> PEPPER_BUNCH = ITEMS.register("pepper_bunch", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final Supplier<Item> PEPPER = ITEMS.register("pepper", ()-> new Item(new Item.Properties().food(Foods.PEPPER).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> PAPRIKA = ITEMS.register("paprika", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final Supplier<Item> SPICY_CHICKEN = ITEMS.register("spicy_chicken", ()-> new Item(new Item.Properties().food(Foods.SPICY_CHICKEN).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> SPICY_FISH = ITEMS.register("spicy_fish", ()-> new Item(new Item.Properties().food(Foods.SPICY_FISH).tab(CreativeModeTab.TAB_FOOD)));
    public static final Supplier<Item> SPICY_FISH_SOUP = ITEMS.register("spicy_fish_soup", ()-> new BowlFoodItem(new Item.Properties().food(Foods.SPICY_FISH_SOUP).tab(CreativeModeTab.TAB_FOOD).craftRemainder(Items.BOWL).stacksTo(1)));

    public static class Foods {
        // mostly temp values until all recipes are in
        public static final FoodProperties GRAPES = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).build();
        public static final FoodProperties DRIED_GRAPES = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).build(); // TODO: make distinct from regular grapes
        public static final FoodProperties GRAPE_JUICE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).build();

        public static final FoodProperties CHEESE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.15F).build();
        public static final FoodProperties CHEESE_SAUCE = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).build();
        public static final FoodProperties CHEESE_BREAD = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.7F).build();

        // TODO: make distinct from other cheeses
        public static final FoodProperties BLUE_CHEESE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.15F).build();
        public static final FoodProperties SOFT_CHEESE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.15F).build();
        public static final FoodProperties MELTED_CHEESE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.15F).build();

        public static final FoodProperties GRILLED_CHEESE = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.7F).build(); // TODO: make distinct from cheese bread

        // pineapple stuff is literally just a copy of grape stuff for now lmao
        public static final FoodProperties PINEAPPLE_SLICES = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).build();
        public static final FoodProperties PINEAPPLE_PUNCH = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).build();

        public static final FoodProperties SAUSAGE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).meat().build();
        public static final FoodProperties COOKED_SAUSAGE = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.3F).meat().build();
        public static final FoodProperties HOT_DOG = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.3F).meat().build(); // TODO: make distinct from cooked sausage

        public static final FoodProperties SHRIMP = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).build();
        public static final FoodProperties COOKED_SHRIMP = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).build();

        // these are *especially* temporary
        public static final FoodProperties SHRIMP_ON_A_STICK = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.4F).build();
        public static final FoodProperties CHEESE_SAUSAGE = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.4F).build();
        public static final FoodProperties FRUIT_SALAD = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.4F).build();

        public static final FoodProperties POTATO_CHIPS = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.4F).build();
        public static final FoodProperties SPICY_CHIPS = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.4F).build(); // TODO: add spice

        public static final FoodProperties SLICED_BREAD = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).build();
        public static final FoodProperties PIZZA_SLICE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).build(); // TODO: make different from sliced bread lmao

        public static final FoodProperties GOLDEN_BREAD = (new FoodProperties.Builder()).nutrition(8).saturationMod(1.2F).build();

        // TODO: make not clones of vanilla foods (currently carrot, cooked chicken, cooked cod, rabbit stew)
        public static final FoodProperties PEPPER = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.6F).build();
        public static final FoodProperties SPICY_CHICKEN = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).meat().build();
        public static final FoodProperties SPICY_FISH = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();
        public static final FoodProperties SPICY_FISH_SOUP = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.6F).build();
    }
}