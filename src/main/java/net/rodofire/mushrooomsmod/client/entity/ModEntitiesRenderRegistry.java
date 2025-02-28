package net.rodofire.mushrooomsmod.client.entity;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.rodofire.mushrooomsmod.entity.ModEntities;
import net.rodofire.mushrooomsmod.entity.client.renderer.*;

public class ModEntitiesRenderRegistry {
    public static void registerEntities() {
        registerMonsters();
        registerAnimals();
        registerGolems();
        registerMisc();
    }

    public static void registerMonsters() {
        EntityRendererRegistry.register(ModEntities.CRYSTAL_CREEPER, CrystalCreeperRenderer::new);
    }

    public static void registerAnimals() {
        EntityRendererRegistry.register(ModEntities.GROKI, GrokiRenderer::new);
        EntityRendererRegistry.register(ModEntities.BOLETE_COW, BoleteCowRenderer::new);
        EntityRendererRegistry.register(ModEntities.PLOTI, PlotiRenderer::new);
        EntityRendererRegistry.register(ModEntities.SCHROOM_STICK, SchroomStickRenderer::new);
        EntityRendererRegistry.register(ModEntities.SQUIRREL, SquirrelRenderer::new);
    }

    public static void registerMisc(){
        EntityRendererRegistry.register(ModEntities.INVENTORY_ARMOR_STAND_ENTITY, InventoryArmorStandRenderer::new);
        EntityRendererRegistry.register(ModEntities.LOCKED_INVENTORY_ARMOR_STAND, InventoryArmorStandRenderer::new);
    }

    public static void registerGolems(){
        EntityRendererRegistry.register(ModEntities.CRYSTAL_GOLEM, CrystalGolemRenderer::new);
    }

}
