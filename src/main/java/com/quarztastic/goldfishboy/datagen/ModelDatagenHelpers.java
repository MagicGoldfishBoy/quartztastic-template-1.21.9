package com.quarztastic.goldfishboy.datagen;

import com.quarztastic.goldfishboy.Quartztastic;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiPartGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.renderer.block.model.Variant;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.data.PackOutput;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class ModelDatagenHelpers extends ModelProvider {

    public ModelDatagenHelpers(PackOutput output) {
        super(output, Quartztastic.MODID);
    }

    public static void createPillarModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels, Block block, 
        Variant up_variant, Variant middle_variant, Variant down_variant, Variant single_variant) {
        MultiVariant up_multivariant = new MultiVariant(WeightedList.of(up_variant));
        MultiVariant middle_multivariant = new MultiVariant(WeightedList.of(middle_variant));
        MultiVariant down_multivariant = new MultiVariant(WeightedList.of(down_variant));
        MultiVariant single_multivariant = new MultiVariant(WeightedList.of(single_variant));
        
        blockModels.blockStateOutput.accept(
            MultiPartGenerator.multiPart(block)

                .with(
                    BlockModelGenerators.condition()
                        .term(BlockStateProperties.UP, true)
                        .term(BlockStateProperties.DOWN, false)
                        .term(BlockStateProperties.AXIS, Axis.Y),
                    down_multivariant
                ).with(
                    BlockModelGenerators.condition()
                        .term(BlockStateProperties.UP, false)
                        .term(BlockStateProperties.DOWN, false)
                        .term(BlockStateProperties.AXIS, Axis.Y),
                    single_multivariant
                ).with(
                    BlockModelGenerators.condition()
                        .term(BlockStateProperties.UP, true)
                        .term(BlockStateProperties.DOWN, true)
                        .term(BlockStateProperties.AXIS, Axis.Y),
                    middle_multivariant
                ).with(
                    BlockModelGenerators.condition()
                        .term(BlockStateProperties.UP, false)
                        .term(BlockStateProperties.DOWN, true)
                        .term(BlockStateProperties.AXIS, Axis.Y),
                    up_multivariant
                )
                .with(
                    BlockModelGenerators.condition()
                        .term(BlockStateProperties.EAST, true)
                        .term(BlockStateProperties.WEST, false)
                        .term(BlockStateProperties.AXIS, Axis.X),
                    down_multivariant.with(BlockModelGenerators.X_ROT_90).with(BlockModelGenerators.Y_ROT_90)
                ).with(
                    BlockModelGenerators.condition()
                        .term(BlockStateProperties.EAST, false)
                        .term(BlockStateProperties.WEST, false)
                        .term(BlockStateProperties.AXIS, Axis.X),
                    single_multivariant.with(BlockModelGenerators.X_ROT_90).with(BlockModelGenerators.Y_ROT_90)
                ).with(
                    BlockModelGenerators.condition()
                        .term(BlockStateProperties.EAST, true)
                        .term(BlockStateProperties.WEST, true)
                        .term(BlockStateProperties.AXIS, Axis.X),
                    middle_multivariant.with(BlockModelGenerators.X_ROT_90).with(BlockModelGenerators.Y_ROT_90)
                ).with(
                    BlockModelGenerators.condition()
                        .term(BlockStateProperties.EAST, false)
                        .term(BlockStateProperties.WEST, true)
                        .term(BlockStateProperties.AXIS, Axis.X),
                    up_multivariant.with(BlockModelGenerators.X_ROT_90).with(BlockModelGenerators.Y_ROT_90)
                )
                .with(
                    BlockModelGenerators.condition()
                        .term(BlockStateProperties.NORTH, true)
                        .term(BlockStateProperties.SOUTH, false)
                        .term(BlockStateProperties.AXIS, Axis.Z),
                    down_multivariant.with(BlockModelGenerators.X_ROT_90)
                ).with(
                    BlockModelGenerators.condition()
                        .term(BlockStateProperties.NORTH, false)
                        .term(BlockStateProperties.SOUTH, false)
                        .term(BlockStateProperties.AXIS, Axis.Z),
                    single_multivariant.with(BlockModelGenerators.X_ROT_90)
                ).with(
                    BlockModelGenerators.condition()
                        .term(BlockStateProperties.NORTH, true)
                        .term(BlockStateProperties.SOUTH, true)
                        .term(BlockStateProperties.AXIS, Axis.Z),
                    middle_multivariant.with(BlockModelGenerators.X_ROT_90)
                ).with(
                    BlockModelGenerators.condition()
                        .term(BlockStateProperties.NORTH, false)
                        .term(BlockStateProperties.SOUTH, true)
                        .term(BlockStateProperties.AXIS, Axis.Z),
                    up_multivariant.with(BlockModelGenerators.X_ROT_90)
                )
        );
    }

    public static void createHorizontalRotationModel(BlockModelGenerators blockModels, ItemModelGenerators itemModels, HorizontalDirectionalBlock block, Variant variant) {
        blockModels.blockStateOutput.accept(
            MultiVariantGenerator.dispatch(
                block,
                BlockModelGenerators.variant(variant)
            ).with(
                PropertyDispatch.modify(BlockStateProperties.HORIZONTAL_FACING)
                    .select(Direction.SOUTH, BlockModelGenerators.NOP)
                    .select(Direction.NORTH, BlockModelGenerators.Y_ROT_180)
                    .select(Direction.WEST, BlockModelGenerators.Y_ROT_90)
                    .select(Direction.EAST, BlockModelGenerators.Y_ROT_270)
            )
        );
    }
    
}
