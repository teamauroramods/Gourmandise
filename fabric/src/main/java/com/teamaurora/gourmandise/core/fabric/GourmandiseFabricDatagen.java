package com.teamaurora.gourmandise.core.fabric;

import com.teamaurora.gourmandise.core.Gourmandise;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class GourmandiseFabricDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
        Gourmandise.PLATFORM.dataSetup(dataGenerator);
    }
}
