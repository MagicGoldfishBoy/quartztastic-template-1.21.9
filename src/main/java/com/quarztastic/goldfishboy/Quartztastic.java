package com.quarztastic.goldfishboy;

import org.slf4j.Logger;

import java.time.LocalTime;
import com.mojang.logging.LogUtils;

import com.quarztastic.goldfishboy.datagen.Datagen;
import com.quarztastic.goldfishboy.registry.BlockSetTypes;
import com.quarztastic.goldfishboy.registry.BlueQuartzList;
import com.quarztastic.goldfishboy.registry.BlueQuartzRegistry;
import com.quarztastic.goldfishboy.registry.CitrineList;
import com.quarztastic.goldfishboy.registry.CitrineRegistry;
import com.quarztastic.goldfishboy.registry.EntityRegistry;
import com.quarztastic.goldfishboy.registry.RoseQuartzList;
import com.quarztastic.goldfishboy.registry.RoseQuartzRegistry;
import com.quarztastic.goldfishboy.registry.SmokyQuartzList;
import com.quarztastic.goldfishboy.registry.SmokyQuartzRegistry;
import com.quarztastic.goldfishboy.registry.prasiolite_quartz.PrasioliteQuartzList;
import com.quarztastic.goldfishboy.registry.prasiolite_quartz.PrasioliteQuartzRegistry;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.entity.NoopRenderer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(Quartztastic.MODID)
public class Quartztastic {

    public static final String MODID = "quartztastic";

    public static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, MODID);

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    //this only exists because afaik blocks NEED block items to drop ANYTHING and I don't want those clogging up the creative tab
    public static final DeferredRegister.Items UNOBTAINABLE_ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("quartztastic", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.quartztastic"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> SmokyQuartzList.SMOKY_QUARTZ_BLOCK_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.acceptAll(
                ITEMS.getEntries().stream()
                    .map(sup -> sup.get().getDefaultInstance())
                    .filter(itemStack -> itemStack != null && !itemStack.isEmpty())
                    .toList()
            );
            }).build());

    public Quartztastic(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);

        modEventBus.addListener(this::onRegisterRenderers);

        modEventBus.addListener(this::registerBlockColors);

        BlockSetTypes.init();
        
        BLOCKS.register(modEventBus);

        ITEMS.register(modEventBus);

        UNOBTAINABLE_ITEMS.register(modEventBus);

        CREATIVE_MODE_TABS.register(modEventBus);

        BLOCK_ENTITIES.register(modEventBus);


        EntityRegistry.init(modEventBus);


        SmokyQuartzRegistry.registerAll();

        RoseQuartzRegistry.registerAll();

        CitrineRegistry.registerAll();

        BlueQuartzRegistry.registerAll();

        PrasioliteQuartzRegistry.registerAll();


        NeoForge.EVENT_BUS.register(this);


        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);


        modEventBus.addListener(this::gatherData);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

        QuartztasticCommonSetupMethods.setSmokyQuartzPotPlants(event);
        QuartztasticCommonSetupMethods.setRoseQuartzPotPlants(event);
        QuartztasticCommonSetupMethods.setCitrinePotPlants(event);
        QuartztasticCommonSetupMethods.setBlueQuartzPotPlants(event);
        QuartztasticCommonSetupMethods.setPrasioliteQuartzPotPlants(event);
        
    }

    void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        LOGGER.info("Registering block color handlers");
        event.register((state, level, pos, tintIndex) -> {
            // Only apply grass color to 0 because 0 is plant
            if (tintIndex != 0) return -1; // -1 means no tint
            
            return level != null && pos != null 
                ? BiomeColors.getAverageGrassColor(level, pos) 
                : 0x8CBF60;
        }, 
        SmokyQuartzList.SMOKY_QUARTZ_POTTED_FERN.get(),
        RoseQuartzList.ROSE_QUARTZ_POTTED_FERN.get(),
        CitrineList.CITRINE_POTTED_FERN.get(),
        BlueQuartzList.BLUE_QUARTZ_POTTED_FERN.get(),
        PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_FERN.get());
        
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LocalTime currentTime = LocalTime.now();
        LOGGER.info("Server Starting Time: " + currentTime.toString());
        if (currentTime.isAfter(LocalTime.of(23, 0))) {
            LOGGER.info("Hello?");
        }
    }

    public void gatherData(GatherDataEvent.Client event) {
        Datagen datagen = new Datagen();
        datagen.gatherData(event);
    }

    public void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityRegistry.CHAIR_ENTITY.get(), NoopRenderer::new);
    }
    
}
