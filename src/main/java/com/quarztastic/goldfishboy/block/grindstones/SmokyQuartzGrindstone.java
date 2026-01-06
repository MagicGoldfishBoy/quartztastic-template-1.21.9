package com.quarztastic.goldfishboy.block.grindstones;

import com.mojang.math.OctahedralGroup;
import com.mojang.serialization.MapCodec;
import com.quarztastic.goldfishboy.container.grindstones.SmokyQuartzGrindstoneMenu;

import java.util.Map;
import java.util.function.Function;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SmokyQuartzGrindstone extends FaceAttachedHorizontalDirectionalBlock {
    public static final MapCodec<SmokyQuartzGrindstone> CODEC = simpleCodec(SmokyQuartzGrindstone::new);
    private static final Component CONTAINER_TITLE = Component.translatable("container.smoky_quartz_grindstone_title");
    private final Function<BlockState, VoxelShape> shapes;

    @Override
    public MapCodec<SmokyQuartzGrindstone> codec() {
        return CODEC;
    }

    public SmokyQuartzGrindstone(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL));
        this.shapes = this.makeShapes();
    }

    private Function<BlockState, VoxelShape> makeShapes() {
        VoxelShape voxelshape = Shapes.or(Block.box(2.0, 6.0, 7.0, 4.0, 10.0, 16.0), Block.box(2.0, 5.0, 3.0, 4.0, 11.0, 9.0));
        VoxelShape voxelshape1 = Shapes.rotate(voxelshape, OctahedralGroup.INVERT_X);
        VoxelShape voxelshape2 = Shapes.or(Block.boxZ(8.0, 2.0, 14.0, 0.0, 12.0), voxelshape, voxelshape1);
        Map<AttachFace, Map<Direction, VoxelShape>> map = Shapes.rotateAttachFace(voxelshape2);
        return this.getShapeForEachState(p_393363_ -> map.get(p_393363_.getValue(FACE)).get(p_393363_.getValue(FACING)));
    }

    private VoxelShape getVoxelShape(BlockState state) {
        return this.shapes.apply(state);
    }

    @SuppressWarnings("null")
    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return this.getVoxelShape(state);
    }

    @SuppressWarnings("null")
    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return this.getVoxelShape(state);
    }

    @SuppressWarnings("null")
    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        return true;
    }

    @SuppressWarnings("null")
    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!level.isClientSide()) {
            player.openMenu(state.getMenuProvider(level, pos));
            player.awardStat(Stats.INTERACT_WITH_GRINDSTONE);
        }

        return InteractionResult.SUCCESS;
    }

    @SuppressWarnings("null")
    @Override
    protected MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        return new SimpleMenuProvider(
            (p_53812_, p_53813_, p_53814_) -> new SmokyQuartzGrindstoneMenu(p_53812_, p_53813_, ContainerLevelAccess.create(level, pos)), CONTAINER_TITLE
        );
    }

    @SuppressWarnings("null")
    @Override
    protected BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @SuppressWarnings({ "null", "deprecation" })
    @Override
    protected BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @SuppressWarnings("null")
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, FACE);
    }

    @SuppressWarnings("null")
    @Override
    protected boolean isPathfindable(BlockState state, PathComputationType pathComputationType) {
        return false;
    }
}
