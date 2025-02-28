package net.rodofire.mushrooomsmod.mixin.world.gen;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(TreeDecoratorType.class)
public interface TreeDecoratorTypeInvoker <P extends TreeDecorator> {
    @Invoker
    static <P extends TreeDecorator> TreeDecoratorType<P> callRegister(String id, MapCodec<P> codec) {
        throw new IllegalStateException();
    }
}