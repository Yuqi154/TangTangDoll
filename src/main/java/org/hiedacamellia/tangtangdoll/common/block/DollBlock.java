package org.hiedacamellia.tangtangdoll.common.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.SkullBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public class DollBlock extends Block {
    public static final MapCodec<DollBlock> CODEC = simpleCodec(DollBlock::new);
    public static final EnumProperty<NoteBlockInstrument> INSTRUMENT = BlockStateProperties.NOTEBLOCK_INSTRUMENT;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

    public DollBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(
                this.stateDefinition
                        .any()
                        .setValue(INSTRUMENT, NoteBlockInstrument.HARP)
                        .setValue(POWERED, Boolean.valueOf(false))
                        .setValue(HorizontalDirectionalBlock.FACING, Direction.EAST)

        );
    }

    private BlockState setInstrument(LevelAccessor level, BlockPos pos, BlockState state, Direction direction) {
        NoteBlockInstrument noteblockinstrument = level.getBlockState(pos.above()).instrument();
        if (noteblockinstrument.worksAboveNoteBlock()) {
            return state.setValue(INSTRUMENT, noteblockinstrument).setValue(HorizontalDirectionalBlock.FACING, direction.getOpposite());
        } else {
            NoteBlockInstrument noteblockinstrument1 = level.getBlockState(pos.below()).instrument();
            NoteBlockInstrument noteblockinstrument2 = noteblockinstrument1.worksAboveNoteBlock() ? NoteBlockInstrument.HARP : noteblockinstrument1;
            return state.setValue(INSTRUMENT, noteblockinstrument2).setValue(HorizontalDirectionalBlock.FACING, direction.getOpposite());
        }
    }

    @Override
    protected void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        boolean flag = level.hasNeighborSignal(pos);
        if (flag != state.getValue(POWERED)) {
            if (flag) {
                this.playNote(null, state, level, pos);
            }

            level.setBlock(pos, state.setValue(POWERED, Boolean.valueOf(flag)), 3);
        }
    }
    @Override
    public MapCodec<DollBlock> codec() {
        return CODEC;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            this.playNote(player, state, level, pos);
            return InteractionResult.CONSUME;
        }
    }

    private void playNote(@Nullable Entity entity, BlockState state, Level level, BlockPos pos) {
        if (state.getValue(INSTRUMENT).worksAboveNoteBlock() || level.getBlockState(pos.above()).isAir()) {
            level.blockEvent(pos, this, 0, 0);
            level.gameEvent(entity, GameEvent.NOTE_BLOCK_PLAY, pos);
        }
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.join(box(4, 0, 4, 12, 12.5, 12), box(0, 0, 0, 0, 0, 0), BooleanOp.ONLY_FIRST);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.setInstrument(context.getLevel(), context.getClickedPos(), this.defaultBlockState(),context.getHorizontalDirection());
    }

    public static float getPitchFromNote(int note) {
        return (float)Math.pow(2.0, (double)(note - 12) / 12.0);
    }
    @Override
    protected boolean triggerEvent(BlockState state, Level level, BlockPos pos, int id, int param) {
        net.neoforged.neoforge.event.level.NoteBlockEvent.Play e = new net.neoforged.neoforge.event.level.NoteBlockEvent.Play(level, pos, state, 5, state.getValue(INSTRUMENT));
        if (net.neoforged.neoforge.common.NeoForge.EVENT_BUS.post(e).isCanceled()) return false;
        state = state.setValue(INSTRUMENT, e.getInstrument());
        NoteBlockInstrument noteblockinstrument = state.getValue(INSTRUMENT);
        float f;
        if (noteblockinstrument.isTunable()) {
            int i = 5;
            f = getPitchFromNote(i);
            level.addParticle(
                    ParticleTypes.NOTE, (double)pos.getX() + 0.5, (double)pos.getY() + 1.2, (double)pos.getZ() + 0.5, (double)i / 24.0, 0.0, 0.0
            );
        } else {
            f = 1.0F;
        }

        Holder<SoundEvent> holder;
        if (noteblockinstrument.hasCustomSound()) {
            ResourceLocation resourcelocation = this.getCustomSoundId(level, pos);
            if (resourcelocation == null) {
                return false;
            }

            holder = Holder.direct(SoundEvent.createVariableRangeEvent(resourcelocation));
        } else {
            holder = noteblockinstrument.getSoundEvent();
        }

        level.playSeededSound(
                null,
                (double)pos.getX() + 0.5,
                (double)pos.getY() + 0.5,
                (double)pos.getZ() + 0.5,
                holder,
                SoundSource.RECORDS,
                3.0F,
                f,
                level.random.nextLong()
        );
        return true;
    }

    @Nullable
    private ResourceLocation getCustomSoundId(Level level, BlockPos pos) {
        return level.getBlockEntity(pos.above()) instanceof SkullBlockEntity skullblockentity ? skullblockentity.getNoteBlockSound() : null;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(INSTRUMENT, POWERED, HorizontalDirectionalBlock.FACING);
    }
}
