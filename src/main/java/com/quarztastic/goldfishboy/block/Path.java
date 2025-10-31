package com.quarztastic.goldfishboy.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Path extends Block {

    private static final VoxelShape SHAPE = Block.column(16.0, 0.0, 1.0);

    public Path(Properties properties) {
        super(properties);
    }

    @SuppressWarnings("null")
    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
    
}
