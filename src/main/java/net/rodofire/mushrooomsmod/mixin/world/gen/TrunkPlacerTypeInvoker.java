package net.rodofire.mushrooomsmod.mixin.world.gen;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(TrunkPlacerType.class)
public interface TrunkPlacerTypeInvoker {
    @Invoker
    static <P extends TrunkPlacer> TrunkPlacerType<P> callRegister(String id, MapCodec<P> codec) {
        throw new IllegalStateException();
    }
}
