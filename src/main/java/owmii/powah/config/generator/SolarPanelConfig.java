package owmii.powah.config.generator;

import net.minecraftforge.common.ForgeConfigSpec;

public class SolarPanelConfig extends GeneratorConfig {
    public SolarPanelConfig(ForgeConfigSpec.Builder builder) {
        super(builder,
                new long[]{5000L, 25000L, 100000L, 500000L, 1000000L, 2500000L, 8000000L},
                new long[]{50L, 150L, 300L, 700L, 1000L, 2000L, 4000L},
                new long[]{5L, 12L, 40L, 90L, 220L, 500L, 1200L}
        );
    }
}