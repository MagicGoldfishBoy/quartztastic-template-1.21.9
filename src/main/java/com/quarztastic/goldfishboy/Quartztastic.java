package com.quarztastic.goldfishboy;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import com.quarztastic.goldfishboy.datagen.Datagen;
import com.quarztastic.goldfishboy.registry.BlockSetTypes;
import com.quarztastic.goldfishboy.registry.BlueQuartzRegistry;
import com.quarztastic.goldfishboy.registry.CitrineList;
import com.quarztastic.goldfishboy.registry.CitrineRegistry;
import com.quarztastic.goldfishboy.registry.EntityRegistry;
import com.quarztastic.goldfishboy.registry.PrasioliteQuartzRegistry;
import com.quarztastic.goldfishboy.registry.RoseQuartzList;
import com.quarztastic.goldfishboy.registry.RoseQuartzRegistry;
import com.quarztastic.goldfishboy.registry.SmokyQuartzList;
import com.quarztastic.goldfishboy.registry.SmokyQuartzRegistry;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
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
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
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

        modEventBus.addListener(this::onClientSetup);

        modEventBus.addListener(this::onRegisterRenderers);

        BlockSetTypes.init();
        
        BLOCKS.register(modEventBus);

        ITEMS.register(modEventBus);

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

        LOGGER.info("HELLO FROM COMMON SETUP");

    }


    @SuppressWarnings("deprecation")
    public void onClientSetup(FMLClientSetupEvent event)
    {
        LOGGER.info("Setting Render Layers");
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BUTTON.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_PRESSURE_PLATE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_FENCE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_WALL.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_GATE.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BRICKS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BRICKS_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.CHISELED_SMOKY_QUARTZ_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_TILES.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_TILES_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_TILES_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BOOKSHELF.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_FURNACE_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_OVEN_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_PILLAR.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_DOOR.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_TRAPDOOR.get(), ChunkSectionLayer.TRANSLUCENT);
        
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_CHAIR.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_TABLE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_SHELF.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_LANTERN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_SOUL_LANTERN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_CHAIN.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_TORCH.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_SOUL_TORCH.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_LADDER.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BARREL.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND.get(), ChunkSectionLayer.TRANSLUCENT);
        
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_SINK.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BARS_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BARS.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_PATH.get(), ChunkSectionLayer.TRANSLUCENT);


        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_DOOR.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_LANTERN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_SOUL_LANTERN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_CHAIN.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_BARS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_BARS_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);


        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_BUTTON.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_PRESSURE_PLATE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_FENCE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_WALL.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_GATE.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_BRICKS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_BRICK_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_BRICK_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_BRICK_WALL.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(CitrineList.CHISELED_CITRINE_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_TILES.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_TILE_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_TILE_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_PILLAR.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_BARS_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_BARS.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_BOOKSHELF.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_FURNACE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_OVEN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_BLAST_FURNACE.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_DOOR.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_TRAPDOOR.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_CHAIR.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_TABLE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_SHELF.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_LANTERN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_SOUL_LANTERN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_CHAIN.get(), ChunkSectionLayer.TRANSLUCENT);
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    public void gatherData(GatherDataEvent.Client event) {
        Datagen datagen = new Datagen();
        datagen.gatherData(event);
    }

    public void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityRegistry.CHAIR_ENTITY.get(), NoopRenderer::new);
    }

}
