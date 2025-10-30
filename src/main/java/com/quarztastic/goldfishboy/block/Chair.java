package com.quarztastic.goldfishboy.block;

import java.util.Map;

import javax.annotation.Nullable;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.quarztastic.goldfishboy.Quartztastic;
import com.quarztastic.goldfishboy.entity.ChairEntity;
import com.quarztastic.goldfishboy.registry.EntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
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

public class Chair extends HorizontalDirectionalBlock {

    public static final MapCodec<Chair> CODEC = RecordCodecBuilder.mapCodec(instance ->
        instance.group(
            Codec.STRING.fieldOf("chair_shape").forGetter(chair -> chair.chairShape),
            propertiesCodec()
        ).apply(instance, Chair::new)
    );

    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    private final String chairShape;


    public Chair(String chairShape, Properties properties) {
        super(properties);
        this.chairShape = chairShape;
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    public static final Map<Direction, VoxelShape> DINER_SHAPE = Shapes.rotateHorizontal(
        Shapes.or(Block.box(6, 0, 6, 10, 2, 10),
        Block.box(6.799999999999999, 2, 6.8, 9.2, 6, 9.2),
        Block.box(6, 6, 6, 10, 7, 10),
        Block.box(13, 7, 3, 14, 9, 9),
        Block.box(12, 7, 2, 13, 9, 11),
        Block.box(4, 7, 2, 12, 9, 13),
        Block.box(5, 7, 13, 11, 9, 14),
        Block.box(3, 7, 2, 4, 9, 11),
        Block.box(2, 7, 3, 3, 9, 9),
        Block.box(3.5, 9, 2.5, 4.5, 18, 4),
        Block.box(5.5, 9, 2.5, 7, 14, 4),
        Block.box(9, 9, 2.5, 10.5, 14, 4),
        Block.box(5.5, 14, 2.5, 10.5, 16, 4),
        Block.box(5.5, 16, 2.5, 7, 18, 4),
        Block.box(9, 16, 2.5, 10.5, 18, 4),
        Block.box(11.5, 9, 2.5, 12.5, 18, 4),
        Block.box(2.5, 18, 2.25, 13.5, 21, 4.25),
        Block.box(2.5, 9, 5, 3.5, 12, 6),
        Block.box(2.5, 9, 7.5, 3.5, 12, 8.5),
        Block.box(12.5, 9, 7.5, 13.5, 12, 8.5),
        Block.box(12.5, 9, 5, 13.5, 12, 6),
        Block.box(2, 12, 4, 4, 13, 10.5),
        Block.box(12, 12, 4, 14, 13, 10.5)
        )
    );

    public static final Map<Direction, VoxelShape> ROYAL_SHAPE = Shapes.rotateHorizontal(
        Shapes.or(Block.box(3, 0, 4, 4, 6, 5),
        Block.box(4, 0, 3, 5, 6, 6),
        Block.box(5, 0, 4, 6, 6, 5),
        Block.box(3, 0, 10, 4, 6, 11),
        Block.box(4, 0, 9, 5, 6, 12),
        Block.box(5, 0, 10, 6, 6, 11),
        Block.box(10, 0, 4, 11, 6, 5),
        Block.box(11, 0, 3, 12, 6, 6),
        Block.box(12, 0, 4, 13, 6, 5),
        Block.box(10, 0, 10, 11, 6, 11),
        Block.box(11, 0, 9, 12, 6, 12),
        Block.box(12, 0, 10, 13, 6, 11),
        Block.box(2, 6, 3, 3, 9, 11),
        Block.box(3, 6, 2, 13, 9, 13),
        Block.box(4, 6, 13, 12, 9, 14),
        Block.box(13, 6, 3, 14, 9, 11),
        Block.box(3, 9, 2, 13, 17, 3),
        Block.box(2, 9, 3, 14, 17, 4),
        Block.box(3, 17, 2, 13, 18, 4),
        Block.box(4, 18, 2, 12, 19, 4),
        Block.box(5, 19, 2, 11, 20, 4),
        Block.box(7, 20, 2, 9, 21, 4),
        Block.box(2, 10, 7, 4, 11, 8),
        Block.box(2, 9, 8, 4, 11, 9),
        Block.box(2, 11, 4, 4, 13, 9),
        Block.box(2, 9, 9, 4, 12, 10),
        Block.box(12, 9, 9, 14, 12, 10),
        Block.box(12, 9, 8, 14, 11, 9),
        Block.box(12, 10, 7, 14, 11, 8),
        Block.box(12, 11, 4, 14, 13, 9)
        )
    );


    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        if(!level.isClientSide()) {
            
            if (player.isPassenger()) {
                return InteractionResult.PASS;
            }
            
            try {
                ChairEntity entity = new ChairEntity(EntityRegistry.CHAIR_ENTITY.get(), level);
                
                double x = pos.getX() + 0.5;
                double y = pos.getY() + 0.3;
                double z = pos.getZ() + 0.5;
                
                entity.setPos(x, y, z);
                level.addFreshEntity(entity);
                
                level.getServer().execute(() -> {
                    try {
                        java.lang.reflect.Method addPassengerMethod = Entity.class.getDeclaredMethod("addPassenger", Entity.class);
                        addPassengerMethod.setAccessible(true);
                        addPassengerMethod.invoke(entity, player);
                        Quartztastic.LOGGER.info("Reflection ride success: " + player.isPassenger());
                    } catch (Exception e) {
                        Quartztastic.LOGGER.error("Reflection failed: " + e.getMessage());
                    }
                    
                    boolean rideSuccess = player.startRiding(entity);
                });
                
            } catch (Exception e) {
                Quartztastic.LOGGER.error("Exception: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        
        switch (this.chairShape) {
            case "diner":
               return DINER_SHAPE.get(state.getValue(FACING).getOpposite());
            case "royal":
                return ROYAL_SHAPE.get(state.getValue(FACING).getOpposite());
            default:
                return DINER_SHAPE.get(state.getValue(FACING).getOpposite());
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
    
}
