package io.github.ads.ads;

import io.github.ads.ads.entity.dragon.AbstractDragon;
import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    static final ForgeConfigSpec COMMON;

    private static final ForgeConfigSpec.BooleanValue ALLOW_EGG_OVERRIDE;
    public static boolean allowEggOverride()
    {
        return ALLOW_EGG_OVERRIDE.get();
    }

    static final ForgeConfigSpec SERVER;

    private static final ForgeConfigSpec.BooleanValue REPLENISH_EGGS;
    public static boolean replenishEggs()
    {
        return REPLENISH_EGGS.get();
    }

    private static final ForgeConfigSpec.BooleanValue USE_LOOT_TABLES;
    public static boolean useLootTables()
    {
        return USE_LOOT_TABLES.get();
    }

    private static final ForgeConfigSpec.BooleanValue UPDATE_HABITATS;
    public static boolean updateHabitats()
    {
        return UPDATE_HABITATS.get();
    }


//    static final ForgeConfigSpec CLIENT;

    public static boolean cameraFlight;
    public static boolean cameraFlight()
    {
        return cameraFlight;
    }

    static // common
    {
        var configurator = new ForgeConfigSpec.Builder();

        ALLOW_EGG_OVERRIDE = configurator.comment("Allow the vanilla ender egg to be interacted with? (Hatchable)",
                        "Useful to help with mod compatability")
                .define("allow_egg_override", true);

        COMMON = configurator.build();
    }

    static // server
    {
        var configurator = new ForgeConfigSpec.Builder();

        REPLENISH_EGGS = configurator.comment("Should Ender Dragon Eggs replenish on the exit portal after a respawned dragon is deafeated?",
                        "Useful for multiplayer scenarios.")
                .define("replenish_eggs", true);
        USE_LOOT_TABLES = configurator.comment("Should dragon eggs generate in treasure chest loot tables?",
                        "Useful for multiplayer scenarios and offering alternative ways to obtain eggs.",
                        "Different types of egg breeds can be found in different chests (if configured.)")
                .define("use_loot_tables", false);
        UPDATE_HABITATS = configurator.comment("Should Dragon Eggs adapt to their environments and change breeds?")
                .define("update_habitats", true);

        SERVER = configurator.build();
    }
}
