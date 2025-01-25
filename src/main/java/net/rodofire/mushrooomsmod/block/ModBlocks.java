package net.rodofire.mushrooomsmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.rodofire.mushrooomsmod.MushrooomsMod;
import net.rodofire.mushrooomsmod.block.custom.*;
import net.rodofire.mushrooomsmod.block.custom.PinkLuminescentVines.PinkLuminescentBodyVinesBlock;
import net.rodofire.mushrooomsmod.block.custom.PinkLuminescentVines.PinkLuminescentHeadVinesBlock;
import net.rodofire.mushrooomsmod.block.custom.PinkMushroomBlock.PinkMushroomVinesBodyBlock;
import net.rodofire.mushrooomsmod.block.custom.PinkMushroomBlock.PinkMushroomVinesHeadBlock;
import net.rodofire.mushrooomsmod.block.custom.bigmushroom.*;
import net.rodofire.mushrooomsmod.item.ModItems;
import net.rodofire.mushrooomsmod.particle.ModParticles;
import net.rodofire.mushrooomsmod.sound.ModBlockSoundGroup;
import net.rodofire.mushrooomsmod.world.features.configuredfeatures.ModConfiguredFeatures;
import net.rodofire.mushrooomsmod.world.features.configuredfeatures.custom.tree.ModSaplings;


public class ModBlocks {
    private static void addItemstoNaturalGroup(FabricItemGroupEntries entries) {

    }

    private static void addItemstoFoodGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.BAGUETTE);
    }

    private static void addItemstoFunctionalGroup(FabricItemGroupEntries entries) {
    }

    private static void addItemstoToolsGroup(FabricItemGroupEntries entries) {

    }

    private static void addItemstoSpawnEggsGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.BOLETE_COW_SPAWN_EGG);
        entries.add(ModItems.GROKI_SPAWN_EGG);

    }

    /*--------------------Natural Blocks--------------------*/

    /*-----------Mushroom Block Related-----------*/
    //Mushroom Block
    public static final Block PURPLE_MUSHROOM_BLOCK = registerBlock("mushroom_block_purple", new FermentedMushroomBlock(() -> ModBlocks.PURPLE_ALTERED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block ORANGE_MUSHROOM_BLOCK = registerBlock("mushroom_block_orange", new FermentedMushroomBlock(() -> ModBlocks.ORANGE_ALTERED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block YELLOW_MUSHROOM_BLOCK = registerBlock("mushroom_block_yellow", new FermentedMushroomBlock(() -> ModBlocks.YELLOW_ALTERED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block BLUE_MUSHROOM_BLOCK = registerBlock("mushroom_block_blue", new FermentedMushroomBlock(() -> ModBlocks.BLUE_ALTERED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block GREEN_MUSHROOM_BLOCK = registerBlock("mushroom_block_green", new FermentedMushroomBlock(() -> ModBlocks.GREEN_ALTERED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block BLUE_LUMINESCENT_MUSHROOM_BLOCK = registerBlock("mushroom_block_blue_luminescent", new FermentedTransparentMushroomBlock(() -> ModBlocks.BLUE_LUMINESCENT_ALTERED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block PINK_LUMINESCENT_MUSHROOM_BLOCK = registerBlock("mushroom_block_pink_luminescent", new FermentedTransparentMushroomBlock(() -> ModBlocks.PINK_LUMINESCENT_ALTERED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));

    //Fermented Stage 1
    public static final Block PURPLE_ALTERED_MUSHROOM_BLOCK = registerBlock("mushroom_block_altered_purple", new FermentedMushroomBlock(() -> ModBlocks.PURPLE_DEGRADATED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block ORANGE_ALTERED_MUSHROOM_BLOCK = registerBlock("mushroom_block_altered_orange", new FermentedMushroomBlock(() -> ModBlocks.ORANGE_DEGRADATED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block YELLOW_ALTERED_MUSHROOM_BLOCK = registerBlock("mushroom_block_altered_yellow", new FermentedMushroomBlock(() -> ModBlocks.YELLOW_DEGRADATED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block BLUE_ALTERED_MUSHROOM_BLOCK = registerBlock("mushroom_block_altered_blue", new FermentedMushroomBlock(() -> ModBlocks.BLUE_DEGRADATED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block GREEN_ALTERED_MUSHROOM_BLOCK = registerBlock("mushroom_block_altered_green", new FermentedMushroomBlock(() -> ModBlocks.GREEN_DEGRADATED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block BLUE_LUMINESCENT_ALTERED_MUSHROOM_BLOCK = registerBlock("mushroom_block_altered_blue_luminescent", new FermentedTransparentMushroomBlock(() -> ModBlocks.BLUE_LUMINESCENT_DEGRADATED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK).nonOpaque().luminance(state ->8)));
    public static final Block PINK_LUMINESCENT_ALTERED_MUSHROOM_BLOCK = registerBlock("mushroom_block_altered_pink_luminescent", new FermentedTransparentMushroomBlock(() -> ModBlocks.PINK_LUMINESCENT_DEGRADATED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK).nonOpaque().luminance(state ->8)));
    public static final Block RED_ALTERED_MUSHROOM_BLOCK = registerBlock("mushroom_block_altered_red", new FermentedMushroomBlock(() -> ModBlocks.RED_DEGRADATED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block BROWN_ALTERED_MUSHROOM_BLOCK = registerBlock("mushroom_block_altered_brown", new FermentedMushroomBlock(() -> ModBlocks.BROWN_DEGRADATED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));

    //Fermented Stage 2
    public static final Block PURPLE_DEGRADATED_MUSHROOM_BLOCK = registerBlock("mushroom_block_degradated_purple", new FermentedMushroomBlock(() -> ModBlocks.PURPLE_FERMENTED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block ORANGE_DEGRADATED_MUSHROOM_BLOCK = registerBlock("mushroom_block_degradated_orange", new FermentedMushroomBlock(() -> ModBlocks.ORANGE_FERMENTED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block YELLOW_DEGRADATED_MUSHROOM_BLOCK = registerBlock("mushroom_block_degradated_yellow", new FermentedMushroomBlock(() -> ModBlocks.YELLOW_FERMENTED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block BLUE_DEGRADATED_MUSHROOM_BLOCK = registerBlock("mushroom_block_degradated_blue", new FermentedMushroomBlock(() -> ModBlocks.BLUE_FERMENTED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block GREEN_DEGRADATED_MUSHROOM_BLOCK = registerBlock("mushroom_block_degradated_green", new FermentedMushroomBlock(() -> ModBlocks.GREEN_FERMENTED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block BLUE_LUMINESCENT_DEGRADATED_MUSHROOM_BLOCK = registerBlock("mushroom_block_degradated_blue_luminescent", new FermentedTransparentMushroomBlock(() -> ModBlocks.BLUE_LUMINESCENT_FERMENTED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK).nonOpaque().luminance(state ->8)));
    public static final Block PINK_LUMINESCENT_DEGRADATED_MUSHROOM_BLOCK = registerBlock("mushroom_block_degradated_pink_luminescent", new FermentedTransparentMushroomBlock(() -> ModBlocks.PINK_LUMINESCENT_FERMENTED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK).nonOpaque().luminance(state ->8)));
    public static final Block RED_DEGRADATED_MUSHROOM_BLOCK = registerBlock("mushroom_block_degradated_red", new FermentedMushroomBlock(() -> ModBlocks.RED_FERMENTED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block BROWN_DEGRADATED_MUSHROOM_BLOCK = registerBlock("mushroom_block_degradated_brown", new FermentedMushroomBlock(() -> ModBlocks.BROWN_FERMENTED_MUSHROOM_BLOCK, false, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));

    //Fermented Mushrooms
    public static final Block PURPLE_FERMENTED_MUSHROOM_BLOCK = registerBlock("mushroom_block_fermented_purple", new FermentedMushroomBlock(() -> ModBlocks.PURPLE_MUSHROOM_BLOCK, true, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block ORANGE_FERMENTED_MUSHROOM_BLOCK = registerBlock("mushroom_block_fermented_orange", new FermentedMushroomBlock(() -> ModBlocks.ORANGE_MUSHROOM_BLOCK, true, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block YELLOW_FERMENTED_MUSHROOM_BLOCK = registerBlock("mushroom_block_fermented_yellow", new FermentedMushroomBlock(() -> ModBlocks.YELLOW_MUSHROOM_BLOCK, true, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block BLUE_FERMENTED_MUSHROOM_BLOCK = registerBlock("mushroom_block_fermented_blue", new FermentedMushroomBlock(() -> ModBlocks.BLUE_MUSHROOM_BLOCK, true, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block GREEN_FERMENTED_MUSHROOM_BLOCK = registerBlock("mushroom_block_fermented_green", new FermentedMushroomBlock(() -> ModBlocks.GREEN_MUSHROOM_BLOCK, true, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block BLUE_LUMINESCENT_FERMENTED_MUSHROOM_BLOCK = registerBlock("mushroom_block_fermented_blue_luminescent", new FermentedTransparentMushroomBlock(() -> ModBlocks.BLUE_LUMINESCENT_MUSHROOM_BLOCK, true, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK).nonOpaque().luminance(state ->8)));
    public static final Block PINK_LUMINESCENT_FERMENTED_MUSHROOM_BLOCK = registerBlock("mushroom_block_fermented_pink_luminescent", new FermentedTransparentMushroomBlock(() -> ModBlocks.PINK_LUMINESCENT_MUSHROOM_BLOCK, true, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK).nonOpaque().luminance(state ->8)));
    public static final Block RED_FERMENTED_MUSHROOM_BLOCK = registerBlock("mushroom_block_fermented_red", new FermentedMushroomBlock(() -> Blocks.RED_MUSHROOM_BLOCK, true, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block BROWN_FERMENTED_MUSHROOM_BLOCK = registerBlock("mushroom_block_fermented_brown", new FermentedMushroomBlock(() -> Blocks.BROWN_MUSHROOM_BLOCK, true, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));

    //mushrooms
    public static final Block GREEN_MUSHROOM = registerBlock("mushroom_green", new MushroomPlantBlock(ModConfiguredFeatures.GREEN_MUSHROOM_TREE_KEY, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM)));
    public static final Block PURPLE_MUSHROOM = registerBlock("mushroom_purple", new MushroomPlantBlock(ModConfiguredFeatures.PURPLE_MUSHROOM_TREE_KEY, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM)));
    public static final Block BLUE_MUSHROOM = registerBlock("mushroom_blue", new MushroomPlantBlock(ModConfiguredFeatures.BLUE_MUSHROOM_TREE_KEY_OTH, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM)));
    public static final Block BLUE_LUMINESCENT_MUSHROOM = registerBlock("mushroom_blue_luminescent", new MushroomPlantBlock(ModConfiguredFeatures.BLUE_LUMINESCENT_MUSHROOM_TREE_KEY, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM).luminance(state ->5)));
    public static final Block LUMINESCENT_PINK_MUSHROOM = registerBlock("mushroom_pink_luminescent", new MushroomPlantBlock(ModConfiguredFeatures.PINK_LUMINESCENT_MUSHROOM_TREE_KEY, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM).luminance(state ->5)));
    public static final Block ORANGE_MUSHROOM = registerBlock("mushroom_orange", new MushroomPlantBlock(ModConfiguredFeatures.YELLOW_MUSHROOM_TREE_KEY_OTH, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM)));
    public static final Block YELLOW_MUSHROOM = registerBlock("mushroom_yellow", new MushroomPlantBlock(ModConfiguredFeatures.YELLOW_MUSHROOM_TREE_KEY_OTH, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM).luminance(state ->5)));
    public static final Block FERTILE_RED_MUSHROOM = registerBlock("mushroom_fertile_red", new MushroomPlantBlock(ModConfiguredFeatures.FERTILE_RED_MUSHROOM_KEY, AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM)));

    //Big Mushrooms
    public static final Block BIG_PURPLE_MUSHROOM_PLANT = registerHiddenBlock("mushroom_big_plant_purple", new BigPurpleMushroomPlant(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM), ModBlocks.TINY_PURPLE_MUSHROOM, ModBlocks.LITTLE_PURPLE_MUSHROOM, ModBlocks.MEDIUM_PURPLE_MUSHROOM, ModBlocks.BIG_PURPLE_MUSHROOM));
    public static final Block TINY_PURPLE_MUSHROOM = registerBlock("mushroom_tiny_purple", new TinyPurpleMushroom(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM).noCollision().nonOpaque(), ModConfiguredFeatures.BIG_PURPLE_MUSHROOM_TREE_KEY_OTH));
    public static final Block LITTLE_PURPLE_MUSHROOM = registerBlock("mushroom_little_purple", new LittlePurpleMushroom(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM).nonOpaque(), ModConfiguredFeatures.BIG_PURPLE_MUSHROOM_TREE_KEY_OTH));
    public static final Block MEDIUM_PURPLE_MUSHROOM = registerBlock("mushroom_medium_purple", new MediumPurpleMushroom(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM).nonOpaque(), ModConfiguredFeatures.BIG_PURPLE_MUSHROOM_TREE_KEY_OTH));
    public static final Block BIG_PURPLE_MUSHROOM = registerBlock("mushroom_big_purple", new BigPurpleMushroom(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM).nonOpaque(), ModConfiguredFeatures.BIG_PURPLE_MUSHROOM_TREE_KEY_OTH));
    public static final Block TINY_GREEN_MUSHROOM = registerBlock("mushroom_tiny_green", new TinyGreenMushroom(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM).nonOpaque(), ModConfiguredFeatures.BIG_GREEN_MUSHROOM_TREE_KEY));
    public static final Block LITTLE_GREEN_MUSHROOM = registerBlock("mushroom_little_green", new LittleGreenMushroom(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM).nonOpaque(), ModConfiguredFeatures.BIG_GREEN_MUSHROOM_TREE_KEY));
    public static final Block MEDIUM_GREEN_MUSHROOM = registerBlock("mushroom_medium_green", new MediumGreenMushroom(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM).nonOpaque(), ModConfiguredFeatures.BIG_GREEN_MUSHROOM_TREE_KEY));
    public static final Block BIG_GREEN_MUSHROOM = registerBlock("mushroom_big_green", new BigGreenMushroom(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM).nonOpaque(), ModConfiguredFeatures.BIG_GREEN_MUSHROOM_TREE_KEY));
    public static final Block BIG_GREEN_MUSHROOM_PLANT = registerHiddenBlock("mushroom_big_plant_green", new BigGreenMushroomPlant(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM), ModBlocks.TINY_GREEN_MUSHROOM, ModBlocks.LITTLE_GREEN_MUSHROOM, ModBlocks.MEDIUM_GREEN_MUSHROOM, ModBlocks.BIG_GREEN_MUSHROOM));
    public static final Block RED_LUMERIA = registerBlock("red_lumeria", new BigRedMushroom(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM).nonOpaque().noCollision(), ModConfiguredFeatures.BIG_RED_MUSHROOM_TREE_KEY));

    //Side Mushrooms
    public static final Block SIDE_MUSHROOM_BLUE_LUMINESCENT = registerBlock("mushroom_side_blue_luminescent", new SideMushroom(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM).luminance(state ->11)));
    public static final Block LOG_MUSHROOM_BROWN = registerBlock("mushroom_log_brown", new LogMushroom(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM).nonOpaque()));

    //Flowers Mushroom
    public static final Block STERILE_BLUE_MUSHROOM = registerBlock("mushroom_small_blue", new MushroomFlower(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block MUSHROOM_SMALL_BROWN = registerBlock("mushroom_small_brown", new MushroomFlower(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block MUSHROOM_SMALL_RED = registerBlock("mushroom_small_red", new MushroomFlower(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block MUSHROOM_DEATH_TRUMPET = registerBlock("mushroom_death_trumpet", new MushroomFlower(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block MUSHROOM_BOOSTING = registerHiddenBlock("mushroom_boosting", new BoostingMushroom(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block DANGEROUS_MUSHROOM_BOOSTING = registerHiddenBlock("dangerous_mushroom_boosting", new DangerousBoostingMushroom(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));

    //Mushroom Stem
    public static final Block TRANSPARENT_MUSHROOM_STEM = registerBlock("mushroom_stem_transparent", new TransparentBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK).nonOpaque().luminance(state ->9)));
    public static final Block BLUE_LUMINESCENT_MUSHROOM_STEM = registerBlock("mushroom_stem_blue_luminescent", new TransparentBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK).nonOpaque().luminance(state ->9)));
    public static final Block GREEN_MUSHROOM_STEM = registerBlock("mushroom_stem_green", new TransparentBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK).nonOpaque()));

    //Other Mushrooms Blocks
    public static final Block COMPRESSED_PURPLE_MUSHROOM = registerBlock("mushroom_compressed_purple", new MossBlock(AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));

    //Soft Blocks
    public static final Block COMPRESSED_DIRT = registerBlock("dirt_compressed", new Block(AbstractBlock.Settings.copy(Blocks.DIRT)));
    public static final Block LIGHT_COMPRESSED_DIRT = registerBlock("dirt_compressed_light", new Block(AbstractBlock.Settings.copy(Blocks.DIRT)));

    /*-----------Stone Related-----------*/
    //Hard Blocks
    public static final Block PURPLE_SCHROOM_DEESLATE = registerBlock("deepslate_mushroom_purple", new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).requiresTool().instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block BLUE_LUMINESCENT_SCHROOM_DEEPSLATE = registerBlock("deepslate_mushroom_blue_luminescent", new GrassBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).requiresTool().instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block GREEN_STONY_SCHROOM_DEPOT = registerBlock("stone_mushroom_green", new Block(AbstractBlock.Settings.copy(Blocks.STONE).requiresTool().instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block RHYOLITE = registerBlock("rhyolite", new Block(AbstractBlock.Settings.copy(Blocks.STONE).requiresTool().instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block LAVA_BLACKSTONE = registerBlock("blackstone_lava", new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE).luminance(state ->8)));

    /*-----------Flower Related-----------*/
    //Flowers
    public static final Block OCULAE = registerBlock("oculae", new FlowerBlock(StatusEffects.DARKNESS, 1000, AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).nonOpaque().noCollision()));
    public static final Block CYANUS_RUBENS = registerBlock("cyanus_rubens", new FlowerBlock(StatusEffects.DARKNESS, 1000, AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).nonOpaque().noCollision()));
    public static final Block CYANEA = registerBlock("cyanea", new FlowerBlock(StatusEffects.DARKNESS, 1000, AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).luminance(state ->12).nonOpaque().noCollision()));
    public static final Block SOL_OCCIDENTIS = registerBlock("sol_occidens", new FlowerBlock(StatusEffects.DARKNESS, 1000, AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).nonOpaque().noCollision()));
    public static final Block FUTIALI = registerBlock("futiali", new FlowerBlock(StatusEffects.DARKNESS, 1000, AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).nonOpaque().luminance(state ->11).noCollision()));
    public static final Block MUSHROOM_FLOWERS = registerBlock("mushroom_flowers", new FlowersMushroomBlock(ModConfiguredFeatures.BIG_PURPLE_MUSHROOM_TREE_KEY_OTH, AbstractBlock.Settings.copy(Blocks.TALL_GRASS).nonOpaque().noCollision()));
    public static final Block TURQUOSUM_STILUS = registerBlock("turquosum_stilus", new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).luminance(state ->11).nonOpaque().noCollision()));
    public static final Block NOCTULICA = registerBlock("noctulica", new FlowerBlock(StatusEffects.DARKNESS, 1000, AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).luminance(state ->12).nonOpaque().noCollision()));
    public static final Block SAPHIRA_FLORENS = registerBlock("saphira_florens", new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().luminance(state ->11).noCollision()));
    public static final Block PREHISTORIC_ROSE = registerBlock("prehistoric_rose", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block PREHISTO_PINK_SCHROOM = registerBlock("prehisto_pink_schroom", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block PREHISTURPLE_SCHROOM = registerBlock("prehisturple_schroom", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block PREHISTO_BLUE_SCHROOM = registerBlock("prehisto_blue_schroom", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block PREHISTO_GREEN_SCHROOM = registerBlock("prehisto_green_schroom", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block YELLOW_PERENNIAL = registerBlock("perennial_yellow", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block PINK_PERENNIAL = registerBlock("perennial_pink", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block BLUE_PERENNIAL = registerBlock("perennial_blue", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block GREEN_PERENNIAL = registerBlock("perennial_green", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block LUMINESCENT_PERENNIAL = registerBlock("perennial_luminescent", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block ORANGE_PERENNIAL = registerBlock("perennial_orange", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block PURPLE_PERENNIAL = registerBlock("perennial_purple", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block RED_QUINCE = registerBlock("quince_red", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block YELLOW_QUINCE = registerBlock("quince_yellow", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block TINY_LILAC = registerBlock("tiny_lilac", new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block YELICE = registerBlock("yelice", new FlowerBlock(StatusEffects.GLOWING, 5, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block FLAMESTHYSIA = registerBlock("flamesthysia", new FlowerBlock(StatusEffects.GLOWING, 5, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block APAGANTHE = registerBlock("apaganthe", new FlowerBlock(StatusEffects.GLOWING, 5, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block PINK_HEATER = registerBlock("pink_heater", new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block WYSTERIA = registerBlock("wysteria", new FlowerBlock(StatusEffects.GLOWING, 5, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block BLUEBELL = registerBlock("bluebell", new FlowerBlock(StatusEffects.GLOWING, 5, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block VIPERIN = registerBlock("viperin", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block HIBISCUS = registerBlock("hibiscus", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block PLATUM = registerBlock("platum", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).luminance(state ->10).nonOpaque().noCollision()));
    public static final Block DIANTHUS = registerBlock("dianthus", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block CYCAS = registerBlock("cycas", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block ARUM = registerBlock("arum", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block HYDRANGEA = registerBlock("hydrangea", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block ANEMONE = registerBlock("anemone", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block JACYNTHE = registerBlock("jacynthe", new FlowerBlock(StatusEffects.GLOWING, 10, AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block PERVENCHE = registerBlock("pervenche", new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block ACONIT = registerBlock("aconit", new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision()));
    public static final Block RAPANGE_FLOWERS = registerBlock("rapange_flowers", new RapangeFlowers(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().noCollision().luminance(RapangeFlowers.getLuminanceSupplier())));
    public static final Block FLEUR_BERRIES = registerHiddenBlock("berries_fleur", new FleurBerries(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().luminance(state ->state.get(Properties.AGE_3) * 4)));

    public static final Block PICK_BLUE = registerBlock("pick_blue", new PickBlue(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().luminance(state ->11)));

    /*-----------Potted Blocks-----------*/
    //Potted Mushrooms
    public static final Block POTTED_STERILE_BLUE_MUSHROOM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_sterile_blue_mushroom"), new FlowerPotBlock(STERILE_BLUE_MUSHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_MUSHROOM_SMALL_BROWN = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_mushroom_small_brown"), new FlowerPotBlock(MUSHROOM_SMALL_BROWN, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_MUSHROOM_SMALL_RED = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_mushroom_small_red"), new FlowerPotBlock(MUSHROOM_SMALL_RED, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_MUSHROOM_DEATH_TRUMPET = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_mushroom_death_trumpet"), new FlowerPotBlock(MUSHROOM_DEATH_TRUMPET, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));

    //Potted Flowers
    public static final Block POTTED_GREEN_MUSHROOM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_green_mushroom"), new FlowerPotBlock(GREEN_MUSHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_BLUE_MUSHROOM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_blue_mushroom"), new FlowerPotBlock(BLUE_MUSHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_PURPLE_MUSHROOM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_purple_mushroom"), new FlowerPotBlock(PURPLE_MUSHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_BLUE_LUMINESCENT_MUSHROOM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_blue_luminescent_mushroom"), new FlowerPotBlock(BLUE_LUMINESCENT_MUSHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque().luminance(state ->5)));
    public static final Block POTTED_LUMINESCENT_PINK_MUSHROOM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_luminescent_pink_mushroom"), new FlowerPotBlock(LUMINESCENT_PINK_MUSHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_ORANGE_MUSHROOM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_orange_mushroom"), new FlowerPotBlock(ORANGE_MUSHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_YELLOW_MUSHROOM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_yellow_mushroom"), new FlowerPotBlock(YELLOW_MUSHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_FERTILE_RED_MUSHROOM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_mushroom_fertile_red"), new FlowerPotBlock(FERTILE_RED_MUSHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));

    public static final Block POTTED_OCULAE = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_oculae"), new FlowerPotBlock(OCULAE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_CYANUS_RUBENS = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_cyanus_rubens"), new FlowerPotBlock(CYANUS_RUBENS, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_CYANEA = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_cyanea"), new FlowerPotBlock(CYANEA, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_SOL_OCCIDENTIS = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_sol_occidentis"), new FlowerPotBlock(SOL_OCCIDENTIS, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_FUTIALI = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_futiali"), new FlowerPotBlock(FUTIALI, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_NOCTULICA = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_noctulica"), new FlowerPotBlock(NOCTULICA, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_PREHISTORIC_ROSE = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_prehistoric_rose"), new FlowerPotBlock(PREHISTORIC_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_PREHISTO_BLUE_SCHROOM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_prehisto_blue_schroom"), new FlowerPotBlock(PREHISTO_BLUE_SCHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_PREHISTO_PINK_SCHROOM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_prehisto_pink_schroom"), new FlowerPotBlock(PREHISTO_PINK_SCHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_PREHISTURPLE_SCHROOM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_prehisturple_schroom"), new FlowerPotBlock(PREHISTURPLE_SCHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_PREHISTO_GREEN_SCHROOM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_prehisto_green_schroom"), new FlowerPotBlock(PREHISTO_GREEN_SCHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));

    public static final Block POTTED_YELLOW_PERENNIAL = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_perennial_yellow"), new FlowerPotBlock(YELLOW_PERENNIAL, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_GREEN_PERENNIAL = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_perennial_green"), new FlowerPotBlock(GREEN_PERENNIAL, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_ORANGE_PERENNIAL = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_perennial_orange"), new FlowerPotBlock(ORANGE_PERENNIAL, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_BLUE_PERENNIAL = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_perennial_blue"), new FlowerPotBlock(BLUE_PERENNIAL, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_LUMINESCENT_PERENNIAL = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_perennial_luminescent"), new FlowerPotBlock(LUMINESCENT_PERENNIAL, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_PINK_PERENNIAL = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_perennial_pink"), new FlowerPotBlock(PINK_PERENNIAL, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));

    public static final Block POTTED_PURPLE_PERENNIAL = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_perennial_purple"), new FlowerPotBlock(PURPLE_PERENNIAL, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_RED_QUINCE = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_quince_red"), new FlowerPotBlock(RED_QUINCE, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_YELLOW_QUINCE = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_quince_yellow"), new FlowerPotBlock(YELLOW_QUINCE, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_YELICE = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_yelice"), new FlowerPotBlock(YELICE, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_FLAMESTHYSIA = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_flamesthysia"), new FlowerPotBlock(FLAMESTHYSIA, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_APAGANTHE = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_apaganthe"), new FlowerPotBlock(APAGANTHE, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_WYSTERIA = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_wysteria"), new FlowerPotBlock(WYSTERIA, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_BLUEBELL = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_bluebell"), new FlowerPotBlock(WYSTERIA, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_VIPERIN = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_viperin"), new FlowerPotBlock(VIPERIN, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_HIBISCUS = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_hibiscus"), new FlowerPotBlock(HIBISCUS, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_PLATUM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_platum"), new FlowerPotBlock(PLATUM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_DIANTHUS = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_dianthus"), new FlowerPotBlock(DIANTHUS, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_CYCAS = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_cycas"), new FlowerPotBlock(CYCAS, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_ARUM = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_arum"), new FlowerPotBlock(ARUM, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_HYDRANGEA = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_hydrangea"), new FlowerPotBlock(HYDRANGEA, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_ANEMONE = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_anemone"), new FlowerPotBlock(ANEMONE, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_JACYNTHE = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_jacynthe"), new FlowerPotBlock(JACYNTHE, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_BLUE_LUMINESCENT_SAPPLING = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_blue_luminescent_sappling"), new FlowerPotBlock(ModBlocks.BLUE_LUMINESCENT_SAPPLING, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_COLORFUL_TREE_SAPLING = registerHiddenBlock(("potted_colorful_tree_sapling"), new FlowerPotBlock(ModBlocks.COLORFUL_TREE_SAPLING, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_PELTOGYNE_SAPLING = registerHiddenBlock(("potted_peltogyne_sapling"), new FlowerPotBlock(ModBlocks.PELTOGYNE_SAPLING, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_OAK_BERRIES_SAPLING = Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, "potted_oak_berries_sapling"), new FlowerPotBlock(ModBlocks.OAK_BERRIES_LEAVES, AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));


    //Grass
    public static final Block TINY_GRASS = registerBlock("tiny_grass", new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS)));
    public static final Block BLUE_LUMINESCENT_GRASS = registerBlock("grass_blue_luminescent", new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).luminance(state ->9)));
    public static final Block BLUE_LUMINESCENT_TALL_GRASS = registerBlock("grass_tall_blue_luminescent", new TallPlantBlock(AbstractBlock.Settings.copy(Blocks.TALL_GRASS).luminance(state ->11)));

    //Vines
    public static final Block PINK_MUSHROOM_VINES = registerHiddenBlock("mushroom_vines_pink", new PinkMushroomVinesHeadBlock(AbstractBlock.Settings.create().breakInstantly().sounds(BlockSoundGroup.CAVE_VINES).pistonBehavior(PistonBehavior.DESTROY).noCollision()));
    public static final Block PINK_MUSHROOM_VINES_PLANT = registerHiddenBlock("mushroom_vines_pink_plant", new PinkMushroomVinesBodyBlock(AbstractBlock.Settings.create().breakInstantly().sounds(BlockSoundGroup.CAVE_VINES).pistonBehavior(PistonBehavior.DESTROY).noCollision()));
    public static final Block PINK_LUMINESCENT_BODY_VINES = registerHiddenBlock("mushroom_vines_pink_luminescent_body", new PinkLuminescentBodyVinesBlock(AbstractBlock.Settings.create().nonOpaque().sounds(BlockSoundGroup.HONEY).pistonBehavior(PistonBehavior.DESTROY).breakInstantly().luminance(state -> state.get(PinkLuminescentBodyVinesBlock.MANY_VINES) ? 0 : 15)));
    public static final Block PINK_LUMINESCENT_HEAD_VINES = registerHiddenBlock("mushroom_vines_pink_luminescent_head", new PinkLuminescentHeadVinesBlock(AbstractBlock.Settings.create().nonOpaque().sounds(BlockSoundGroup.HONEY).pistonBehavior(PistonBehavior.DESTROY).breakInstantly().luminance(state ->3)));
    public static final Block CAERULEA_VOLUBILIS = registerHiddenBlock("caerulea_volubilis", new BlueLuminescentVines(AbstractBlock.Settings.copy(Blocks.TWISTING_VINES).luminance(state ->12)));
    public static final Block BLUE_LUMINESCENT_VINES = registerBlock("vines_blue_luminescent", new RoofSimpleVines(AbstractBlock.Settings.copy(Blocks.VINE).nonOpaque().luminance(state ->10)));

    //Leaves
    public static final Block BLUE_LUMINESCENT_LEAVES = registerBlock("leaves_blue_luminescent", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).luminance(state -> 10).nonOpaque()));
    public static final Block RED_COLORFUL_LEAVES = registerBlock("leaves_colorful_red", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block PINK_COLORFUL_LEAVES = registerBlock("leaves_colorful_pink", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block ORANGE_COLORFUL_LEAVES = registerBlock("leaves_colorful_orange", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block YELLOW_COLORFUL_LEAVES = registerBlock("leaves_colorful_yellow", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block GREEN_COLORFUL_LEAVES = registerBlock("leaves_colorful_green", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block BLUE_COLORFUL_LEAVES = registerBlock("leaves_colorful_blue", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block PURPLE_COLORFUL_LEAVES = registerBlock("leaves_colorful_purple", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block OAK_BERRIES_LEAVES = registerBlock("leaves_oak_berries", new BerriesLeaves(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).nonOpaque().mapColor(MapColor.DARK_GREEN).strength(0.2f).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque().allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never).blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(Blocks::never).luminance(BerriesLeaves.getLuminanceSupplier())));
    public static final Block PELTOGYNE_LEAVES = registerBlock("leaves_peltogyne", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).nonOpaque()));


    //Light Blocks
    public static final Block RED_LANTERN = registerBlock("lantern_red", new LanternBlock(AbstractBlock.Settings.copy(Blocks.LANTERN).luminance(state ->15).nonOpaque()));
    public static final Block GREEN_LANTERN = registerBlock("lantern_green", new LanternBlock(AbstractBlock.Settings.copy(Blocks.LANTERN).luminance(state ->13).nonOpaque()));
    public static final Block GREEN_TORCH = registerHiddenBlock("torch_green", new TorchBlock(ModParticles.GREENFIRE_PARTICLE, AbstractBlock.Settings.copy(Blocks.TORCH).luminance(state ->12).nonOpaque()));
    public static final Block WALL_GREEN_TORCH = registerHiddenBlock("torch_wall_green", new WallTorchBlock(ModParticles.GREENFIRE_PARTICLE, AbstractBlock.Settings.copy(Blocks.WALL_TORCH).luminance(state ->12).nonOpaque()));
    public static final Block GREEN_CAMPFIRE = registerBlock("campfire_green", new CampfireBlock(true, 1, AbstractBlock.Settings.copy(Blocks.CAMPFIRE).luminance(state ->13).nonOpaque()));


    //Construction Blocks
    public static final Block LAVA_BLACKSTONE_BRICKS = registerBlock("blackstone_lava_bricks", new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE).luminance(state ->8)));
    public static final Block LAVA_BLACKSTONE_MEDIUM_BRICKS = registerBlock("blackstone_lava_medium_bricks", new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE).luminance(state ->8)));
    public static final Block LAVA_BLACKSTONE_TINY_BRICKS = registerBlock("blackstone_lava_tiny_bricks", new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE).luminance(state ->8)));
    public static final Block RHYOLITE_TILES = registerBlock("rhyolite_tiles", new Block(AbstractBlock.Settings.copy(Blocks.BRICKS).nonOpaque()));

    //Wood
    public static final Block BLUE_LUMINESCENT_LOG = registerBlock("log_blue_luminescent", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block PELTOGYNE_LOG = registerBlock("log_peltogyne", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));

    public static final Block BLUE_LUMINESCENT_WOOD = registerBlock("wood_blue_luminescent", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block PELTOGYNE_WOOD = registerBlock("wood_peltogyne", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

    public static final Block BLUE_LUMINESCENT_STRIPPED_LOG = registerBlock("log_stripped_blue_luminescent", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block PELTOGYNE_STRIPPED_LOG = registerBlock("log_stripped_peltogyne", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final Block BLUE_LUMINESCENT_STRIPPED_WOOD = registerBlock("wood_stripped_blue_luminescent", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block PELTOGYNE_STRIPPED_WOOD = registerBlock("wood_stripped_peltogyne", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block BLUE_LUMINESCENT_PLANKS = registerBlock("planks_blue_luminescent", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block PELTOGYNE_PLANKS = registerBlock("planks_peltogyne", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    public static final Block BLUE_LUMINESCENT_TRAPDOOR = registerBlock("trapdoor_blue_luminescent", new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));
    public static final Block PELTOGYNE_TRAPDOOR = registerBlock("trapdoor_peltogyne", new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));

    public static final Block BLUE_LUMINESCENT_DOOR = registerBlock("door_blue_luminescent", new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR)));
    public static final Block PELTOGYNE_DOOR = registerBlock("door_peltogyne", new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR)));

    public static final Block BLUE_LUMINESCENT_BUTTON = registerBlock("button_blue_luminescent", new ButtonBlock(BlockSetType.OAK, 20, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));
    public static final Block PELTOGYNE_BUTTON = registerBlock("button_peltogyne", new ButtonBlock(BlockSetType.OAK, 20, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));

    public static final Block BLUE_LUMINESCENT_PRESSURE_PLATE = registerBlock("pressure_plate_blue_luminescent", new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block PELTOGYNE_PRESSURE_PLATE = registerBlock("pressure_plate_peltogyne", new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));

    public static final Block BLUE_LUMINESCENT_FENCE = registerBlock("fence_blue_luminescent", new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Block PELTOGYNE_FENCE = registerBlock("fence_peltogyne", new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));

    public static final Block BLUE_LUMINESCENT_STAIRS = registerBlock("stairs_blue_luminescent", new StairsBlock(BLUE_LUMINESCENT_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).luminance(state->8)));
    public static final Block PELTOGYNE_STAIRS = registerBlock("stairs_peltogyne", new StairsBlock(PELTOGYNE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).luminance(state->8)));

    public static final Block BLUE_LUMINESCENT_SLAB = registerBlock("slab_blue_luminescent", new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Block PELTOGYNE_SLAB = registerBlock("slab_peltogyne", new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));

    public static final Block BLUE_LUMINESCENT_FENCE_GATE = registerBlock("fence_gate_blue_luminescent", new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));
    public static final Block PELTOGYNE_FENCE_GATE = registerBlock("fence_gate_peltogyne", new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));

    public static final Block COLORFUL_TREE_SAPLING = registerBlock("sapling_colorful_tree", new SaplingBlock(ModSaplings.COLORFUL_TREE_SAPLING_GENERATOR, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block BLUE_LUMINESCENT_SAPPLING = registerBlock("sappling_blue_luminescent", new SaplingBlock(ModSaplings.BLUE_LUMINESCENT_SAPLING, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block OAK_BERRIES_SAPLING = registerBlock("sapling_oak_berries", new SaplingBlock(ModSaplings.OAK_BERRIES_SAPLING_GENERATOR, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).luminance(state->9)));
    public static final Block PELTOGYNE_SAPLING = registerBlock("sapling_peltogyne", new SaplingBlock(ModSaplings.PELTOGYNE_SAPLING_GENERATOR, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    //Crystal Blocks
    public static final Block PINK_CRYSTAL = registerHiddenBlock("crystal_pink", new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER)));
    public static final Block BLUE_CRYSTAL = registerHiddenBlock("crystal_blue", new StraightCrystal(AbstractBlock.Settings.create().solid().nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).pistonBehavior(PistonBehavior.DESTROY).luminance(state ->8)));
    public static final Block RED_CRYSTAL = registerHiddenBlock("crystal_red", new StraightCrystal(AbstractBlock.Settings.create().solid().nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).pistonBehavior(PistonBehavior.DESTROY).luminance(state ->8)));
    public static final Block RED_CRYSTAL_BLOCK = registerBlock("crystal_block_red", new TransparentBlock(AbstractBlock.Settings.create().solid().nonOpaque().sounds(ModBlockSoundGroup.PINK_CRYSTAL).luminance(state ->12).strength(2.8f)));
    public static final Block BLUE_CRYSTAL_BLOCK = registerBlock("crystal_block_blue", new TransparentBlock(AbstractBlock.Settings.copy(ModBlocks.RED_CRYSTAL_BLOCK).luminance(state ->12)));
    public static final Block PINK_CRYSTAL_BLOCK = registerBlock("crystal_block_pink", new AmethystBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).sounds(ModBlockSoundGroup.PINK_CRYSTAL)));
    public static final Block WHITE_CRYSTAL = registerBlock("crystal_white", new SimpleCystal(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER)));
    public static final Block WHITE_CRYSTAL_BLOCK = registerBlock("crystal_block_white", new TransparentBlock(AbstractBlock.Settings.copy(ModBlocks.RED_CRYSTAL_BLOCK).luminance(state ->12)));

    public static final Block BLUE_CRYSTAL_CLUSTER = registerBlock("crystal_blue_1", new TallBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER).luminance(state ->11)));

    public static final Block RAW_AMBER_BLOCK = registerBlock("amber_block_raw", new Block(AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final Block AMBER_MINERAL = registerBlock("amber_block_mineral", new TransparentBlock(AbstractBlock.Settings.create().luminance(state ->9).nonOpaque().strength(2.0f)));
    public static final Block AMBER_BLOCK = registerBlock("amber_block", new AmbreBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
    public static final Block AMBER_BLOCK_SANDIFIED = registerBlock("amber_block_sandified", new SandifiedAmbreBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE), ModBlocks.AMBER_BLOCK));
    public static final Block AMBER_ORE = registerBlock("amber_ore", new Block(AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));

    //Util Blocks
    public static final Block FORGE_BLOCK = registerBlock("forge_block", new ForgeBlock(AbstractBlock.Settings.copy(Blocks.ANVIL).nonOpaque()));

    //Idk
    public static final Block CLOUD_BLOCK = registerBlock("cloud_block", new Block(AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK).strength(0.6f)));

    //dev
    public static final Block FEATURE_TESTER = registerBlock("feature_block", new FeatureTester(AbstractBlock.Settings.create(), ModConfiguredFeatures.FEATURE_TESTER_KEY));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(MushrooomsMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    private static Block registerHiddenBlock(String id, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(MushrooomsMod.MOD_ID, id), block);
    }

    public static void registerModBlocks() {
        MushrooomsMod.LOGGER.info("|\t-Registering Blocks.");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addItemstoNaturalGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModBlocks::addItemstoFoodGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModBlocks::addItemstoFunctionalGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModBlocks::addItemstoToolsGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModBlocks::addItemstoSpawnEggsGroup);
    }
}
