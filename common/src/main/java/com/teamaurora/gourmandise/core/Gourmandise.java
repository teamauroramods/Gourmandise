package com.teamaurora.gourmandise.core;

import com.teamaurora.gourmandise.core.registry.GourmandiseBlocks;
import com.teamaurora.gourmandise.core.registry.GourmandiseItems;
import gg.moonflower.pollen.api.platform.Platform;

public class Gourmandise {
    public static final String MOD_ID = "starter";
    public static final Platform PLATFORM = Platform.builder(MOD_ID)
            .clientInit(Gourmandise::onClientInit)
            .clientPostInit(Gourmandise::onClientPostInit)
            .commonInit(Gourmandise::onCommonInit)
            .commonPostInit(Gourmandise::onCommonPostInit)
            .dataInit(Gourmandise::onDataInit)
            .build();

    public static void onClientInit() {
    }

    public static void onClientPostInit(Platform.ModSetupContext ctx) {
    }

    public static void onCommonInit() {
        GourmandiseBlocks.BLOCKS.register(Gourmandise.PLATFORM);
        GourmandiseItems.ITEMS.register(Gourmandise.PLATFORM);
    }

    public static void onCommonPostInit(Platform.ModSetupContext ctx) {
    }

    public static void onDataInit(Platform.DataSetupContext ctx) {
    }
}
