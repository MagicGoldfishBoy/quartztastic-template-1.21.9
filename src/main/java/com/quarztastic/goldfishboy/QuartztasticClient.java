package com.quarztastic.goldfishboy;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import com.quarztastic.goldfishboy.registry.BlueQuartzList;
import com.quarztastic.goldfishboy.registry.CitrineList;
import com.quarztastic.goldfishboy.registry.RoseQuartzList;
import com.quarztastic.goldfishboy.registry.prasiolite_quartz.PrasioliteQuartzList;
import com.quarztastic.goldfishboy.registry.smoky_quartz.SmokyQuartzList;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = Quartztastic.MODID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = Quartztastic.MODID, value = Dist.CLIENT)
public class QuartztasticClient {
    public QuartztasticClient(ModContainer container) {
        // Allows NeoForge to create a config screen for this mod's configs.
        // The config screen is accessed by going to the Mods screen > clicking on your mod > clicking on config.
        // Do not forget to add translations for your config options to the en_us.json file.
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }
    
    public static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {

        LOGGER.info("Setting Render Layers");


        setSmokyQuartzRenderLayers();

        setRoseQuartzRenderLayers();

        setCitrineRenderLayers();

        setBlueQuartzRenderLayers();

        setPrasioliteQuartzRenderLayers(event);

    }

    @SuppressWarnings("deprecation")
    static void setSmokyQuartzRenderLayers() {

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BUTTON.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_PRESSURE_PLATE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_FENCE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_WALL.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_GATE.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BRICKS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BRICK_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BRICK_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.CHISELED_SMOKY_QUARTZ_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_TILES.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_TILE_SLAB.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_TILE_STAIRS.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BOOKSHELF.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_FURNACE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_OVEN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BLAST_FURNACE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_CRAFTING_TABLE.get(), ChunkSectionLayer.TRANSLUCENT);

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

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BARREL_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_NIGHTSTAND_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_SINK.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BARS_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_BARS.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_PATH.get(), ChunkSectionLayer.TRANSLUCENT);


        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_POPPY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_DANDELION.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_BLUE_ORCHID.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_ALLIUM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_AZURE_BLUET.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_RED_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_ORANGE_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_WHITE_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_PINK_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_OXEYE_DAISY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_CORNFLOWER.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_LILY_OF_THE_VALLEY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_WITHER_ROSE.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_TORCHFLOWER.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_CLOSED_EYEBLOSSOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_OPEN_EYEBLOSSOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_SPRUCE_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_BIRCH_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_JUNGLE_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_ACACIA_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_DARK_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_AZALEA.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_FLOWERING_AZALEA.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_MANGROVE_PROPAGULE.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_CHERRY_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_PALE_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_RED_MUSHROOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_BROWN_MUSHROOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_CRIMSON_FUNGUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_WARPED_FUNGUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_CRIMSON_ROOTS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_WARPED_ROOTS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_FERN.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_DEAD_BUSH.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_CACTUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(SmokyQuartzList.SMOKY_QUARTZ_POTTED_BAMBOO.get(), ChunkSectionLayer.CUTOUT_MIPPED);

    }

    @SuppressWarnings("deprecation")
    static void setRoseQuartzRenderLayers() {

        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_DOOR.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_LANTERN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_SOUL_LANTERN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_CHAIN.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_BARS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_BARS_BLOCK.get(), ChunkSectionLayer.TRANSLUCENT);


        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_POPPY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_DANDELION.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_BLUE_ORCHID.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_ALLIUM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_AZURE_BLUET.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_RED_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_ORANGE_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_WHITE_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_PINK_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_OXEYE_DAISY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_CORNFLOWER.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_LILY_OF_THE_VALLEY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_WITHER_ROSE.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_TORCHFLOWER.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_OPEN_EYEBLOSSOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_SPRUCE_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_BIRCH_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_JUNGLE_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_ACACIA_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_DARK_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_AZALEA.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_FLOWERING_AZALEA.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_MANGROVE_PROPAGULE.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_CHERRY_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_PALE_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_RED_MUSHROOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_BROWN_MUSHROOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_CRIMSON_FUNGUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_WARPED_FUNGUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_CRIMSON_ROOTS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_WARPED_ROOTS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_FERN.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_DEAD_BUSH.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_CACTUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(RoseQuartzList.ROSE_QUARTZ_POTTED_BAMBOO.get(), ChunkSectionLayer.CUTOUT_MIPPED);       
    }

    @SuppressWarnings("deprecation")
    static void setCitrineRenderLayers() {
        
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
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_CRAFTING_TABLE.get(), ChunkSectionLayer.TRANSLUCENT);

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


        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_POPPY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_DANDELION.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_BLUE_ORCHID.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_ALLIUM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_AZURE_BLUET.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_RED_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_ORANGE_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_WHITE_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_PINK_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_OXEYE_DAISY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_CORNFLOWER.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_LILY_OF_THE_VALLEY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_WITHER_ROSE.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_TORCHFLOWER.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_CLOSED_EYEBLOSSOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_OPEN_EYEBLOSSOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_SPRUCE_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_BIRCH_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_JUNGLE_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_ACACIA_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_DARK_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_AZALEA.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_FLOWERING_AZALEA.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_MANGROVE_PROPAGULE.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_CHERRY_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_PALE_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_RED_MUSHROOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_BROWN_MUSHROOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_CRIMSON_FUNGUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_WARPED_FUNGUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_CRIMSON_ROOTS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_WARPED_ROOTS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_FERN.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_DEAD_BUSH.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_CACTUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(CitrineList.CITRINE_POTTED_BAMBOO.get(), ChunkSectionLayer.CUTOUT_MIPPED);
          
    }

    @SuppressWarnings("deprecation")
    static void setBlueQuartzRenderLayers() {
        
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

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_FURNACE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_OVEN.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_BLAST_FURNACE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_CRAFTING_TABLE.get(), ChunkSectionLayer.TRANSLUCENT);

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


        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_POPPY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_DANDELION.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_BLUE_ORCHID.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_ALLIUM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_AZURE_BLUET.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_RED_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_ORANGE_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_WHITE_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_PINK_TULIP.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_OXEYE_DAISY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_CORNFLOWER.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_LILY_OF_THE_VALLEY.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_WITHER_ROSE.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_TORCHFLOWER.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_OPEN_EYEBLOSSOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_SPRUCE_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_BIRCH_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_JUNGLE_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_ACACIA_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_DARK_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_AZALEA.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_FLOWERING_AZALEA.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_MANGROVE_PROPAGULE.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_CHERRY_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_PALE_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_RED_MUSHROOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_BROWN_MUSHROOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_CRIMSON_FUNGUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_WARPED_FUNGUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_CRIMSON_ROOTS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_WARPED_ROOTS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_FERN.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_DEAD_BUSH.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_CACTUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(BlueQuartzList.BLUE_QUARTZ_POTTED_BAMBOO.get(), ChunkSectionLayer.CUTOUT_MIPPED);

    }

    @SuppressWarnings("deprecation")
    static void setPrasioliteQuartzRenderLayers(FMLClientSetupEvent event) {

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
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_TORCHFLOWER.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_OPEN_EYEBLOSSOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_SPRUCE_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_BIRCH_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_JUNGLE_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_ACACIA_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_DARK_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_AZALEA.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_FLOWERING_AZALEA.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_MANGROVE_PROPAGULE.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CHERRY_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_PALE_OAK_SAPLING.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_RED_MUSHROOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_BROWN_MUSHROOM.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CRIMSON_FUNGUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WARPED_FUNGUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CRIMSON_ROOTS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_WARPED_ROOTS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_FERN.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_DEAD_BUSH.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_CACTUS.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        ItemBlockRenderTypes.setRenderLayer(PrasioliteQuartzList.PRASIOLITE_QUARTZ_POTTED_BAMBOO.get(), ChunkSectionLayer.CUTOUT_MIPPED);
        
    }
}
