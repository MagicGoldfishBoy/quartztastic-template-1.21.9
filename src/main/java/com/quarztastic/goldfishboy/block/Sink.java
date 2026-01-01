package com.quarztastic.goldfishboy.block;

import java.util.Map;

import javax.annotation.Nullable;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Sink extends HorizontalDirectionalBlock {

    private final SinkShape sinkShape;

    public static final MapCodec<Sink> CODEC = RecordCodecBuilder.mapCodec(instance ->
        instance.group(
            SinkShape.CODEC.fieldOf("sink_shape").forGetter(sink -> sink.sinkShape),
            propertiesCodec()
        ).apply(instance, (sinkShape, properties) -> new Sink(sinkShape, properties))
    );

    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public enum SinkShape {
        BATHROOM("bathroom"),
        BASIN_WITH_SHELVES("basin_with_shelves"),
        BASIN("basin"),
        BASIN_WITH_LEGS("basin_with_legs");

        private final String shapeName;
        
        public static final Codec<SinkShape> CODEC = Codec.STRING.xmap(
            shape -> SinkShape.valueOf(shape.toUpperCase()),
            SinkShape::getShapeName
        );
        
        SinkShape(String string) {
            this.shapeName = string;
        }

        public String getShapeName() {
            return this.shapeName;
        }
    }


    public Sink(SinkShape sinkShape, Properties properties) {
        super(properties);
        this.sinkShape = sinkShape;
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    public static final Map<Direction, VoxelShape> BATHROOM_SHAPE = Shapes.rotateHorizontal(
        Shapes.or(Block.box(4, 0, 5, 5, 2, 11),
            Block.box(5, 0, 4, 11, 2, 12),
            Block.box(11, 0, 5, 12, 2, 11),
            Block.box(6, 2, 7, 7, 11, 9),
            Block.box(7, 2, 6, 9, 11, 10),
            Block.box(9, 2, 7, 10, 11, 9),
            Block.box(3, 11, 5, 4, 12, 12),
            Block.box(4, 11, 4, 12, 12, 13),
            Block.box(12, 11, 5, 13, 12, 12),
            Block.box(3, 12, 5, 4, 15, 12),
            Block.box(4, 12, 4, 5, 15, 7),
            Block.box(4, 12, 11, 5, 15, 13),
            Block.box(5, 12, 4, 11, 15, 6),
            Block.box(5, 12, 12, 11, 15, 13),
            Block.box(11, 12, 4, 12, 15, 7),
            Block.box(11, 12, 11, 12, 15, 13),
            Block.box(12, 12, 5, 13, 15, 12),
            Block.box(7.25, 15, 4.5, 8.75, 17, 5),
            Block.box(7.25, 15, 5, 8.75, 17.5, 6),
            Block.box(5.25, 15, 4.5, 6.25, 15.75, 5.5),
            Block.box(9.75, 15, 4.5, 10.75, 15.75, 5.5),
            Block.box(7.25, 16.25, 6, 8.75, 17.5, 8)
        )
    );

    public static final Map<Direction, VoxelShape> BASIN_WITH_SHELVES_SHAPE = Shapes.rotateHorizontal(
        Shapes.or(Block.box(0, 2, 0, 3, 3, 1),
        Block.box(13, 2, 0, 16, 3, 1),
        Block.box(0, 3, 0, 3, 4, 2),
        Block.box(6.5, 3, 0, 9.5, 4, 2),
        Block.box(6.5, 2, 0, 9.5, 3, 1),
        Block.box(13, 3, 0, 16, 4, 2),
        Block.box(0, 4, 0, 16, 6, 13),
        Block.box(0, 10, 0, 16, 12, 16),
        Block.box(0, 12, 0, 2, 15, 16),
        Block.box(2, 12, 0, 14, 15, 4),
        Block.box(7, 15, 2, 9, 16, 6),
        Block.box(3, 15, 1, 5, 16, 3),
        Block.box(11, 15, 1, 13, 16, 3),
        Block.box(2, 12, 14, 14, 15, 16),
        Block.box(14, 12, 0, 16, 15, 16)
        )
    );

    public static final Map<Direction, VoxelShape> BASIN_SHAPE = Shapes.rotateHorizontal(
        Shapes.or(Block.box(0, 3, 0, 16, 5, 2),
        Block.box(0, 5, 0, 16, 6, 4),
        Block.box(0, 6, 0, 2, 14, 16),
        Block.box(2, 6, 0, 14, 14, 4),
        Block.box(2, 6, 4, 14, 8, 13),
        Block.box(2, 6, 13, 14, 14, 16),
        Block.box(14, 6, 0, 16, 14, 16),
        Block.box(3.25, 14, 1.5, 5.25, 15.25, 3.5),
        Block.box(10.75, 14, 1.5, 12.75, 15.25, 3.5),
        Block.box(6.75, 14, 2, 9.25, 16.5, 3),
        Block.box(6.75, 14, 1.5, 9.25, 16, 2),
        Block.box(6.75, 15.25, 3, 9.25, 16.5, 5)
        )
    );

    public static final Map<Direction, VoxelShape> BASIN_WITH_LEGS_SHAPE = Shapes.rotateHorizontal(
        Shapes.or(Block.box(0, 6, 0, 2, 14, 16),
        Block.box(2, 6, 0, 14, 14, 4),
        Block.box(2, 6, 4, 14, 8, 13),
        Block.box(2, 6, 13, 14, 14, 16),
        Block.box(14, 6, 0, 16, 14, 16),
        Block.box(3.25, 14, 1.5, 5.25, 15.25, 3.5),
        Block.box(10.75, 14, 1.5, 12.75, 15.25, 3.5),
        Block.box(6.75, 14, 2, 9.25, 16.5, 3),
        Block.box(6.75, 14, 1.5, 9.25, 16, 2),
        Block.box(6.75, 15.25, 3, 9.25, 16.5, 5),
        Block.box(0, 0, 0, 3, 6, 3),
        Block.box(0, 0, 13, 3, 6, 16),
        Block.box(13, 0, 13, 16, 6, 16),
        Block.box(13, 0, 0, 16, 6, 3),
        Block.box(0, 5, 3, 1, 6, 13),
        Block.box(15, 5, 3, 16, 6, 13),
        Block.box(3, 5, 0, 13, 6, 1),
        Block.box(3, 5, 15, 13, 6, 16)
        )
    );

    @SuppressWarnings("null")
    @Override
    protected InteractionResult useItemOn(
        ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult
    ) {
        if (stack.getItem() == Items.BUCKET) {
            if (level.isClientSide()) {
                return InteractionResult.SUCCESS;
            }
            
            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
            }
            
            ItemStack waterBucket = new ItemStack(Items.WATER_BUCKET);
            if (!player.addItem(waterBucket)) {
                player.drop(waterBucket, false);
            }
            
            level.playSound(null, pos, SoundEvents.BUCKET_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.CONSUME;
        }
        else if (stack.getItem() == Items.GLASS_BOTTLE) {
            if (level.isClientSide()) {
                return InteractionResult.SUCCESS;
            }

            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
            }

            ItemStack waterBucket = new ItemStack(Items.WATER_BUCKET);

            if (!player.addItem(waterBucket)) {
                player.drop(waterBucket, false);
            }
            level.playSound(null, pos, SoundEvents.BUCKET_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.CONSUME;   
        }

        return InteractionResult.PASS;
    }


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
        return switch (this.sinkShape) {

            case BATHROOM -> BATHROOM_SHAPE.get(state.getValue(FACING).getOpposite());

            case BASIN_WITH_SHELVES -> BASIN_WITH_SHELVES_SHAPE.get(state.getValue(FACING).getOpposite());

            case BASIN -> BASIN_SHAPE.get(state.getValue(FACING).getOpposite());

            case BASIN_WITH_LEGS -> BASIN_WITH_LEGS_SHAPE.get(state.getValue(FACING).getOpposite());
        };
    }
}
