package com.quarztastic.goldfishboy;

import org.slf4j.Logger;

import java.time.LocalTime;
import com.mojang.logging.LogUtils;

import net.minecraft.world.level.block.Blocks;
import com.quarztastic.goldfishboy.datagen.Datagen;
import com.quarztastic.goldfishboy.registry.BlockSetTypes;
import com.quarztastic.goldfishboy.registry.BlueQuartzList;
import com.quarztastic.goldfishboy.registry.BlueQuartzRegistry;
import com.quarztastic.goldfishboy.registry.CitrineList;
import com.quarztastic.goldfishboy.registry.CitrineRegistry;
import com.quarztastic.goldfishboy.registry.EntityRegistry;
import com.quarztastic.goldfishboy.registry.PrasioliteQuartzList;
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
import net.minecraft.world.level.block.FlowerPotBlock;
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

        modEventBus.addListener(this::onClientSetup);

        modEventBus.addListener(this::onRegisterRenderers);

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
        event.enqueueWork(() -> {
            FlowerPotBlock prasioliteQuartzPot = PrasioliteQuartzList.PRASIOLITE_QUARTZ_FLOWER_POT.get();
            
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.POPPY), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_POPPY.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.DANDELION), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_DANDELION.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.BLUE_ORCHID), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_BLUE_ORCHID.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ALLIUM), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_ALLIUM.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.AZURE_BLUET), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_AZURE_BLUET.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.RED_TULIP), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_RED_TULIP.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.ORANGE_TULIP), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_ORANGE_TULIP.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WHITE_TULIP), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WHITE_TULIP.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.PINK_TULIP), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_PINK_TULIP.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.OXEYE_DAISY), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_OXEYE_DAISY.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.CORNFLOWER), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CORNFLOWER.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.LILY_OF_THE_VALLEY), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_LILY_OF_THE_VALLEY.get()
            );
            prasioliteQuartzPot.addPlant(
                BuiltInRegistries.BLOCK.getKey(Blocks.WITHER_ROSE), 
                () -> PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WITHER_ROSE.get()
            );
        });
    }


    @SuppressWarnings("deprecation")
    public void onClientSetup(FMLClientSetupEvent event) {

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
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_LADDER.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_BARREL_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_NIGHTSTAND_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_SINK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_PATH.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_SKULL_STATUETTE.get(), ChunkSectionLayer.TRANSLUCENT);



        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_BUTTON.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_PRESSURE_PLATE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_FENCE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_WALL.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_GATE.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_BRICKS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_BRICK_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_BRICK_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_BRICK_WALL.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.CHISELED_BLUE_QUARTZ_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_TILES.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_TILE_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_TILE_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_PILLAR.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_BARS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_BARS_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_BOOKSHELF.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_DOOR.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_TRAPDOOR.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_CHAIR.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_TABLE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_SHELF.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_LANTERN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_SOUL_LANTERN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_CHAIN.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_TORCH.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_SOUL_TORCH.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_LADDER.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_BARREL_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_NIGHTSTAND_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_SINK.get(), ChunkSectionLayer.TRANSLUCENT);
        
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_PATH.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_SKULL_STATUETTE.get(), ChunkSectionLayer.TRANSLUCENT);



        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BUTTON.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_PRESSURE_PLATE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_FENCE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_WALL.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_GATE.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICKS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BRICK_WALL.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.CHISELED_PRASIOLITE_QUARTZ_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILES.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TILE_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_PILLAR.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARS_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BOOKSHELF.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_FURNACE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_OVEN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BLAST_FURNACE.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_DOOR.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TRAPDOOR.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIR.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TABLE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SHELF.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_LIGHT.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_LANTERN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SOUL_LANTERN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_CHAIN.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_TORCH.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SOUL_TORCH.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_LADDER.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_BARREL_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_NIGHTSTAND_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SINK.get(), ChunkSectionLayer.TRANSLUCENT);
        
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_PATH.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_SKULL_STATUETTE.get(), ChunkSectionLayer.TRANSLUCENT);


        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_POPPY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_DANDELION.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_BLUE_ORCHID.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_ALLIUM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_AZURE_BLUET.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_RED_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_ORANGE_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WHITE_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_PINK_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_OXEYE_DAISY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CORNFLOWER.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_LILY_OF_THE_VALLEY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WITHER_ROSE.get(), ChunkSectionLayer.CUTOUT_MIPPED);
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
