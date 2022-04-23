package com.teamaurora.gourmandise.core.fabric;

import com.teamaurora.gourmandise.core.Gourmandise;
import net.fabricmc.api.ModInitializer;

public class GourmandiseFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Gourmandise.PLATFORM.setup();
    }
}
