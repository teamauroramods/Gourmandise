package com.teamaurora.gourmandise.core.registry;

import com.teamaurora.gourmandise.core.Gourmandise;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

public class GourmandiseItems {
    public static final PollinatedRegistry<Item> ITEMS = PollinatedRegistry.create(Registry.ITEM, Gourmandise.MOD_ID);
}