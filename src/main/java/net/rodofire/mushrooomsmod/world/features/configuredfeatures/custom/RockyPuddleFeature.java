package net.rodofire.mushrooomsmod.world.features.configuredfeatures.custom;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class RockyPuddleFeature extends Feature<DefaultFeatureConfig> {
    public RockyPuddleFeature(Codec<DefaultFeatureConfig> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        StructureWorldAccess world = context.getWorld();
        BlockPos pos = context.getOrigin();

        return true;
    }

    private void tinyPuddle(StructureWorldAccess world, BlockPos pos) {

    }

    private void mediumPuddle(StructureWorldAccess world, BlockPos pos) {

    }

    private void HugePuddle(StructureWorldAccess world, BlockPos pos) {

    }
}
