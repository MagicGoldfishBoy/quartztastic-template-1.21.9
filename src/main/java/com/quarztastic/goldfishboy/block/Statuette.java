package com.quarztastic.goldfishboy.block;

import java.util.Map;

import javax.annotation.Nullable;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Statuette extends HorizontalDirectionalBlock {

    public static final MapCodec<Statuette> CODEC = RecordCodecBuilder.mapCodec(instance ->
        instance.group(
            Codec.STRING.fieldOf("statuette_shape").forGetter(statuette -> statuette.statuetteShape),
            propertiesCodec()
        ).apply(instance, Statuette::new)
    );

    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    private final String statuetteShape;


    public Statuette(String statuetteShape, Properties properties) {
        super(properties);
        this.statuetteShape = statuetteShape;
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    public static final Map<Direction, VoxelShape> SKULL_SHAPE = Shapes.rotateHorizontal(
        Shapes.or(Block.box(5, 0, 5, 11, 1, 11),
            Block.box(5, 1, 5, 6, 2, 11),
            Block.box(10, 1, 5, 11, 2, 11),
            Block.box(5, 2, 5, 11, 3, 11),
            Block.box(7.5, 3, 5, 8.5, 4, 11),
            Block.box(5, 3, 5, 5.5, 4, 11),
            Block.box(10.5, 3, 5, 11, 4, 11),
            Block.box(5, 4, 5, 11, 6, 11)
        )
    );
    
    @SuppressWarnings("null")
    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @SuppressWarnings("null")
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (this.statuetteShape) {
            case "bathroom":
               return SKULL_SHAPE.get(state.getValue(FACING).getOpposite());
            // case "basin_with_shelves":
            //     return BASIN_WITH_SHELVES_SHAPE.get(state.getValue(FACING).getOpposite());
            default:
                return SKULL_SHAPE.get(state.getValue(FACING).getOpposite());
        }
    }
}
