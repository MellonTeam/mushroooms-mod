package net.rodofire.mushrooomsmod.world.features.configuredfeatures.custom;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;
import net.rodofire.mushrooomsmod.world.features.config.ModSimpleBlockFeatureConfig;
import net.rodofire.mushrooomsmod.worldgenutil.GenCircles;
import net.rodofire.mushrooomsmod.worldgenutil.GenSpheres;

public class DevFeature extends Feature<ModSimpleBlockFeatureConfig> {
    public DevFeature(Codec<ModSimpleBlockFeatureConfig> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean generate(FeatureContext<ModSimpleBlockFeatureConfig> context) {
        System.out.println("ok");
        StructureWorldAccess world = context.getWorld();
        Random random = context.getRandom();
        BlockPos pos = context.getOrigin();
        BlockState state = context.getConfig().blockprovider.get(random, pos);
        long startTimeCartesian = System.nanoTime();
        GenSpheres.generateFullSphere(world, random, 50, 50,50,pos, state,false);
        //GenSpheres.generateSphere(world, random, 50,pos, state,false);
        long endTimeCartesian = System.nanoTime();
        long durationCartesian = (endTimeCartesian - startTimeCartesian) / 1000000;;
        System.out.println("duretion : " + durationCartesian + " ms");
        return true;
    }
}
