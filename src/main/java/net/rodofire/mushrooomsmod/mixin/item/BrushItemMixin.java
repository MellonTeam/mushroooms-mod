package net.rodofire.mushrooomsmod.mixin.item;


import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.BrushItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.rodofire.mushrooomsmod.block.custom.BlockBrushableBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(BrushItem.class)
public abstract class BrushItemMixin extends Item {
    private HitResult getHitResult(PlayerEntity user) {
        return ProjectileUtil.getCollision((Entity)user, entity -> !entity.isSpectator() && entity.canHit(), user.getBlockInteractionRange());
    }

    @Inject(method = "usageTick", at = @At("TAIL"))
    public void amberBlock(World world, LivingEntity user, ItemStack stack, int remainingUseTicks, CallbackInfo ci) {
        int i = this.getMaxUseTime(stack, user) - remainingUseTicks + 1;
        boolean bl = i % 10 == 5;
        if (bl) {
            PlayerEntity playerEntity = (PlayerEntity) user;
            HitResult hitResult = this.getHitResult(playerEntity);
            BlockHitResult blockHitResult = (BlockHitResult) hitResult;
            BlockPos blockPos = blockHitResult.getBlockPos();
            BlockState blockState = world.getBlockState(blockPos);
            Object object = blockState.getBlock();

            if (!world.isClient && object instanceof BlockBrushableBlock && ((BlockBrushableBlock) object).brush(world.getTime(), playerEntity, blockPos, i)) {
                EquipmentSlot equipmentSlot = stack.equals(playerEntity.getEquippedStack(EquipmentSlot.OFFHAND)) ? EquipmentSlot.OFFHAND : EquipmentSlot.MAINHAND;
                stack.damage(1, user, equipmentSlot);
            }
        }
    }

    public BrushItemMixin(Settings settings) {
        super(settings);
    }
}
