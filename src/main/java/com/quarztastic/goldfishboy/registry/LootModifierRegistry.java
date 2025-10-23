package com.quarztastic.goldfishboy.registry;

import java.util.function.Supplier;

import com.mojang.serialization.MapCodec;
import com.quarztastic.goldfishboy.Quartztastic;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.loot.AddTableLootModifier;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class LootModifierRegistry {
    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIERS =
            DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Quartztastic.MODID);

    public static final Supplier<MapCodec<AddTableLootModifier>> ADD_TABLE =
            LOOT_MODIFIERS.register("add_table", () -> AddTableLootModifier.CODEC);

    public static void register(IEventBus bus) {
        LOOT_MODIFIERS.register(bus);
    }
}
