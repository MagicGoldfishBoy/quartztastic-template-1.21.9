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


    private final StatuetteShape statuetteShape;

    public static final MapCodec<Statuette> CODEC = RecordCodecBuilder.mapCodec(instance ->
        instance.group(
            StatuetteShape.CODEC.fieldOf("statuette_shape").forGetter(statuette -> statuette.statuetteShape),
            propertiesCodec()
        ).apply(instance, (statuetteShape, properties) -> new Statuette(statuetteShape, properties))
    );

    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public enum StatuetteShape {
        SKULL_SHAPE("skull_shape"),
        GOLDFISH_SHAPE("goldfish_shape"),
        CHICKEN_SHAPE("chicken_shape"),
        BEE_SHAPE("bee_shape");

        private final String shapeName;
        
        public static final Codec<StatuetteShape> CODEC = Codec.STRING.xmap(
            shape -> StatuetteShape.valueOf(shape.toUpperCase()),
            StatuetteShape::getShapeName
        );
        
        StatuetteShape(String string) {
            this.shapeName = string;
        }

        public String getShapeName() {
            return this.shapeName;
        }
    }

    public Statuette(StatuetteShape statuetteShape, Properties properties) {
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

    public static final Map<Direction, VoxelShape> GOLDFISH_SHAPE = Shapes.rotateHorizontal(
        Shapes.or(Block.box(6, 0, 8, 10, 1, 10),
            Block.box(6, 1, 8, 10, 3, 11), Block.box(6, 1, 7, 10, 2, 8),
            Block.box(6, 3, 9, 10, 4, 10.5), Block.box(13, 5, 8, 15, 6, 12),
            Block.box(14, 6, 8, 16, 8, 12), Block.box(13, 6, 8, 14, 8, 12),
            Block.box(12, 6, 8, 13, 8, 12), Block.box(12.5, 8, 8, 14, 9, 12),
            Block.box(0, 6, 8, 4, 7, 12), Block.box(3.5, 7, 8, 4, 8, 12),
            Block.box(2, 7, 8, 3.5, 8, 12), Block.box(0, 7, 8, 2, 8, 12),
            Block.box(1, 5, 8, 3, 6, 12), Block.box(2, 8, 8, 3.5, 9, 12),
            Block.box(4, 6, 15, 12, 10, 16), Block.box(4, 5, 14, 12, 6, 15),
            Block.box(4, 6, 14, 12, 10, 15), Block.box(4, 10, 14, 12, 11, 15),
            Block.box(4, 4, 13, 12, 5, 14), Block.box(4, 5, 13, 12, 9, 14),
            Block.box(12, 9, 13, 12.25, 10, 14), Block.box(3.75, 9, 13, 4, 10, 14),
            Block.box(4, 4, 6, 12, 10, 13), Block.box(4, 10, 6, 12, 11, 14),
            Block.box(5, 11, 6, 11, 12, 14), Block.box(5, 4, 5, 11, 12, 6),
            Block.box(6, 12, 6, 10, 13, 13), Block.box(6, 13, 6, 10, 14, 12),
            Block.box(6, 13, 5, 10, 14, 6), Block.box(6, 14, 8, 10, 15, 11),
            Block.box(6, 5, 4, 10, 11, 5), Block.box(6, 3, 3, 10, 7, 4),
            Block.box(6, 7, 3, 10, 9, 4), Block.box(6, 9, 3, 10, 13, 4),
            Block.box(6, 2, 2, 10, 3, 3), Block.box(6, 3, 2, 10, 7, 3),
            Block.box(6, 9, 2, 10, 13, 3), Block.box(6, 13, 2, 10, 14, 3),
            Block.box(6, 1, 1, 10, 2, 2), Block.box(6, 2, 1, 10, 4, 2),
            Block.box(6, 4, 1, 10, 5, 2), Block.box(6, 1, 0, 10, 4, 1),
            Block.box(6, 1, -1, 10, 2, 0), Block.box(6, 11, 1, 10, 12, 2),
            Block.box(6, 12, 1, 10, 14, 2), Block.box(6, 14, 1, 10, 15, 2),
            Block.box(6, 12, 0, 10, 15, 1), Block.box(6, 14, -1, 10, 15, 0)
        )
    );

    public static final Map<Direction, VoxelShape> CHICKEN_SHAPE = Shapes.rotateHorizontal(
        Shapes.or(Block.box(5, 4, 3, 11, 11, 13),
            Block.box(8.5, 0, 8.25, 10.5, 0.5, 10.5),
            Block.box(8.5, 0.5, 8.25, 10.5, 4, 8.75),
            Block.box(5.5, 0, 8.25, 7.5, 0.5, 10.5),
            Block.box(5.5, 0.5, 8.25, 7.5, 4, 8.75),
            Block.box(11, 6, 4, 12, 11, 12),
            Block.box(4, 6, 4, 5, 11, 12),
            Block.box(6, 9, 13, 10, 15, 15),
            Block.box(6, 11, 12, 10, 15, 13),
            Block.box(6, 11, 15, 10, 13, 17),
            Block.box(7, 9.75, 15.25, 9, 11, 16.25)
        )
    );

    public static final Map<Direction, VoxelShape> BEE_SHAPE = Shapes.rotateHorizontal(
        Shapes.or(Block.box(5, 2, 3, 12, 9, 12),
            Block.box(5, 2, 12, 12, 3, 13),
            Block.box(5, 3, 12, 7, 6, 13),
            Block.box(7, 3, 12, 10, 6, 13),
            Block.box(10, 3, 12, 12, 6, 13),
            Block.box(5, 6, 12, 12, 9, 13)
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

    @SuppressWarnings("null")
    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (this.statuetteShape) {
            case SKULL_SHAPE:
               return SKULL_SHAPE.get(state.getValue(FACING).getOpposite());
            case GOLDFISH_SHAPE:
                return GOLDFISH_SHAPE.get(state.getValue(FACING).getOpposite());
            case CHICKEN_SHAPE:
                return CHICKEN_SHAPE.get(state.getValue(FACING).getOpposite());
            case BEE_SHAPE:
                return BEE_SHAPE.get(state.getValue(FACING).getOpposite());
            default:
                return SKULL_SHAPE.get(state.getValue(FACING).getOpposite());
        }
    }
}
