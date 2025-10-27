package com.quarztastic.goldfishboy.block;

import java.util.Map;

import javax.annotation.Nullable;

import com.mojang.serialization.MapCodec;

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

    public static final MapCodec<Sink> CODEC = simpleCodec(Sink::new);
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public Sink(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    public static final Map<Direction, VoxelShape> SHAPES = Shapes.rotateHorizontal(
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

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPES.get(state.getValue(FACING).getOpposite());
    }
    
}
