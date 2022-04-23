package com.teamaurora.gourmandise.core.forge;

import com.teamaurora.gourmandise.core.Gourmandise;
import net.minecraftforge.fml.common.Mod;

@Mod(Gourmandise.MOD_ID)
public class GourmandiseForge {
    public GourmandiseForge() {
        Gourmandise.PLATFORM.setup();
    }
}
