package net.rodofire.mushrooomsmod.block;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rodofire.mushrooomsmod.MushrooomsMod;
import net.rodofire.mushrooomsmod.block.entity.BoostingMushroomBlockEntity;
import net.rodofire.mushrooomsmod.block.entity.DangerousBoostingMushroomBlockEntity;
import net.rodofire.mushrooomsmod.block.entity.ForgeBlockEntity;
import net.rodofire.mushrooomsmod.block.entity.RapangeFlowersBlockEntity;

public class ModBlockEntities {
    public static void registerBlockEntities() {
        MushrooomsMod.LOGGER.info("|\t-Registering Block Entities");
    }    public static final BlockEntityType<ForgeBlockEntity> FORGE_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(MushrooomsMod.MOD_ID, "forge_be")
            , BlockEntityType.Builder.create(ForgeBlockEntity::new, ModBlocks.FORGE_BLOCK).build());

    public static final BlockEntityType<BoostingMushroomBlockEntity> BOOSTING_MUSHROOM_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(MushrooomsMod.MOD_ID, "boosting_mushroom_be")
            , BlockEntityType.Builder.create(BoostingMushroomBlockEntity::new, ModBlocks.MUSHROOM_BOOSTING).build());

    public static final BlockEntityType<DangerousBoostingMushroomBlockEntity> DANGEROUS_BOOSTING_MUSHROOM_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(MushrooomsMod.MOD_ID, "dangerous_boosting_mushroom_be")
            , BlockEntityType.Builder.create(DangerousBoostingMushroomBlockEntity::new, ModBlocks.DANGEROUS_MUSHROOM_BOOSTING).build());

    public static final BlockEntityType<RapangeFlowersBlockEntity> RAPANGE_FLOWERS_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(MushrooomsMod.MOD_ID, "rapange_flowers_be")
            , BlockEntityType.Builder.create(RapangeFlowersBlockEntity::new, ModBlocks.RAPANGE_FLOWERS).build());


}
