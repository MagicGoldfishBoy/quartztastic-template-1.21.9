package com.quarztastic.goldfishboy.registry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BlockSetTypes {

    public static final BlockSetType QUARTZ = BlockSetType.register(
        new BlockSetType(
            "quartztastic:quartz",
            true,
            true,
            true,
            BlockSetType.PressurePlateSensitivity.EVERYTHING,
            SoundType.AMETHYST,
            SoundEvents.AMETHYST_BLOCK_HIT,         // door close sound
            SoundEvents.AMETHYST_BLOCK_HIT,            // door open sound
            SoundEvents.AMETHYST_CLUSTER_HIT,       // trapdoor close sound
            SoundEvents.AMETHYST_CLUSTER_HIT,        // trapdoor open sound
            SoundEvents.AMETHYST_BLOCK_RESONATE,  // pressure plate off
            SoundEvents.AMETHYST_BLOCK_RESONATE,   // pressure plate on
            SoundEvents.AMETHYST_CLUSTER_PLACE,     // button off
            SoundEvents.AMETHYST_CLUSTER_PLACE       // button on
        )
    );

    public static void init() {

    }
    
}
