package com.teammetallurgy.crafttcg;

import com.google.common.collect.Maps;

import java.util.HashMap;

public enum CardTexture {
    NONE(0, "NONE", "none"),
    AIR(1, "AIR", "common"),
    ALLIUM(2, "ALLIUM", "common"),
    ANDESITE(3, "ANDESITE", "common"),
    AZURE_BLUET(4, "AZURE_BLUET", "common"),
    BAT(5, "BAT", "common"),
    BLOCK_OF_COAL(6, "BLOCK_OF_COAL", "common"),
    BLUE_ORCHID(7, "BLUE_ORCHID", "common"),
    CAMPFIRE(8, "CAMPFIRE", "common"),
    CHEST(9, "CHEST", "common"),
    CHICKEN(10, "CHICKEN", "common"),
    CHISELED_STONE_BRICK(11, "CHISELED_STONE_BRICK", "common"),
    COAL_ORE(12, "COAL_ORE", "common"),
    COARSE_DIRT(13, "COARSE_DIRT", "common"),
    COBBLESTONE(14, "COBBLESTONE", "common"),
    CORNFLOWER(15, "CORNFLOWER", "common"),
    COW(16, "COW", "common"),
    CRACKED_STONE_BRICKS(17, "CRACKED_STONE_BRICKS", "common"),
    CRAFTING_TABLE(18, "CRAFTING_TABLE", "common"),
    CREEPER(19, "CREEPER", "common"),
    DANDELION(20, "DANDELION", "common"),
    DIORITE(21, "DIORITE", "common"),
    DIRT(22, "DIRT", "common"),
    DOOR_A(23, "DOOR_A", "common"),
    DOOR_B(24, "DOOR_B", "common"),
    ENDERMAN(25, "ENDERMAN", "common"),
    FENCE_A(26, "FENCE_A", "common"),
    FENCE_B(27, "FENCE_B", "common"),
    FLOWER_POT(28, "FLOWER_POT", "common"),
    FURNACE(29, "FURNACE", "common"),
    GLASS_A(30, "GLASS_A", "common"),
    GLASS_B(31, "GLASS_B", "common"),
    GLASS_C(32, "GLASS_C", "common"),
    GLASS_D(33, "GLASS_D", "common"),
    GLASS_E(34, "GLASS_E", "common"),
    GLASS_F(35, "GLASS_F", "common"),
    GLASS_G(36, "GLASS_G", "common"),
    GLASS_H(37, "GLASS_H", "common"),
    GLASS_I(38, "GLASS_I", "common"),
    GLASS_J(39, "GLASS_J", "common"),
    GLASS_K(40, "GLASS_K", "common"),
    GLASS_L(41, "GLASS_L", "common"),
    GLASS_M(42, "GLASS_M", "common"),
    GLASS_N(43, "GLASS_N", "common"),
    GLASS_O(44, "GLASS_O", "common"),
    GLASS_P(45, "GLASS_P", "common"),
    GRANITE(46, "GRANITE", "common"),
    GRASS(47, "GRASS", "common"),
    GRAVEL(48, "GRAVEL", "common"),
    JACK_O_LANTERN(49, "JACK_O_LANTERN", "common"),
    LEAVES_A(50, "LEAVES_A", "common"),
    LEAVES_B(51, "LEAVES_B", "common"),
    LILAC(52, "LILAC", "common"),
    LILY_OF_THE_VALLEY(53, "LILY_OF_THE_VALLEY", "common"),
    LOG_A(54, "LOG_A", "common"),
    LOG_B(55, "LOG_B", "common"),
    MOSSY_COBBLESTONE(56, "MOSSY_COBBLESTONE", "common"),
    OXYEYE_DAISY(57, "OXYEYE_DAISY", "common"),
    PEONY(58, "PEONY", "common"),
    PIG(59, "PIG", "common"),
    PLANKS_A(60, "PLANKS_A", "common"),
    PLANKS_B(61, "PLANKS_B", "common"),
    POLISHED_ANDESITE(62, "POLISHED_ANDESITE", "common"),
    POLISHED_DIORITE(63, "POLISHED_DIORITE", "common"),
    POLISHED_GRANITE(64, "POLISHED_GRANITE", "common"),
    POPPY(65, "POPPY", "common"),
    RAIL(66, "RAIL", "common"),
    ROSE_BUSH(67, "ROSE_BUSH", "common"),
    SAND(68, "SAND", "common"),
    SAPLING_A(69, "SAPLING_A", "common"),
    SAPLING_B(70, "SAPLING_B", "common"),
    SHEEP(71, "SHEEP", "common"),
    SKELETON(72, "SKELETON", "common"),
    SKELETON_HORSE(73, "SKELETON_HORSE", "common"),
    SMOOTH_STONE(74, "SMOOTH_STONE", "common"),
    SNOW(75, "SNOW", "common"),
    SPIDER(76, "SPIDER", "common"),
    STEVE(77, "STEVE", "common"),
    STONE(78, "STONE", "common"),
    STONE_BRICKS(79, "STONE_BRICKS", "common"),
    STRIPPED_WOOD_A(80, "STRIPPED_WOOD_A", "common"),
    STRIPPED_WOOD_B(81, "STRIPPED_WOOD_B", "common"),
    SUGAR_CANE(82, "SUGAR_CANE", "common"),
    TRAPDOOR_A(83, "TRAPDOOR_A", "common"),
    TRAPDOOR_B(84, "TRAPDOOR_B", "common"),
    TULIPS(85, "TULIPS", "common"),
    WATER(86, "WATER", "common"),
    WOOL_A(87, "WOOL_A", "common"),
    WOOL_B(88, "WOOL_B", "common"),
    WOOL_C(89, "WOOL_C", "common"),
    WOOL_D(90, "WOOL_D", "common"),
    WOOL_E(91, "WOOL_E", "common"),
    WOOL_F(92, "WOOL_F", "common"),
    WOOL_G(93, "WOOL_G", "common"),
    WOOL_H(94, "WOOL_H", "common"),
    WOOL_I(95, "WOOL_I", "common"),
    WOOL_J(96, "WOOL_J", "common"),
    WOOL_K(97, "WOOL_K", "common"),
    WOOL_L(98, "WOOL_L", "common"),
    WOOL_M(99, "WOOL_M", "common"),
    WOOL_N(100, "WOOL_N", "common"),
    WOOL_O(101, "WOOL_O", "common"),
    WOOL_P(102, "WOOL_P", "common"),
    ZOMBIE(103, "ZOMBIE", "common"),
    ACTIVATOR_RAIL(104, "ACTIVATOR_RAIL", "rare"),
    BEE_HIVE(105, "BEE_HIVE", "rare"),
    BLOCK_OF_GOLD(106, "BLOCK_OF_GOLD", "rare"),
    BLOCK_OF_REDSTONE(107, "BLOCK_OF_REDSTONE", "rare"),
    DETECTOR_RAIL(108, "DETECTOR_RAIL", "rare"),
    DIAMOND_ORE(109, "DIAMOND_ORE", "rare"),
    ENCHANTING_TABLE(110, "ENCHANTING_TABLE", "rare"),
    JUKEBOX(111, "JUKEBOX", "rare"),
    LAPIS_LAZULI_BLOCK(112, "LAPIS_LAZULI_BLOCK", "rare"),
    NOTE_BLOCK(113, "NOTE_BLOCK", "rare"),
    REDSTONE_REPEATER(114, "REDSTONE_REPEATER", "rare"),
    SPIDER_JOCKEY(115, "SPIDER_JOCKEY", "rare"),
    COMMAND_BLOCK(116, "COMMAND_BLOCK", "secretrare"),
    STRUCTURE_BLOCK(117, "STRUCTURE_BLOCK", "secretrare"),
    BLOCK_OF_DIAMOND(118, "BLOCK_OF_DIAMOND", "superrare"),
    CAKE(119, "CAKE", "superrare"),
    OBSIDIAN(120, "OBSIDIAN", "superrare"),
    BEDROCK(121, "BEDROCK", "ultrarare"),
    MONSTER_SPAWNER(122, "MONSTER_SPAWNER", "ultrarare"),
    ANVIL(123, "ANVIL", "uncommon"),
    BEE(124, "BEE", "uncommon"),
    BLOCK_OF_IRON(125, "BLOCK_OF_IRON", "uncommon"),
    BOOKSHELF(126, "BOOKSHELF", "uncommon"),
    BRICKS(127, "BRICKS", "uncommon"),
    CAULDRON(128, "CAULDRON", "uncommon"),
    CLAY(129, "CLAY", "uncommon"),
    DISPENSER(130, "DISPENSER", "uncommon"),
    DROPPER(131, "DROPPER", "uncommon"),
    GOLD_ORE(132, "GOLD_ORE", "uncommon"),
    HOPPER(133, "HOPPER", "uncommon"),
    ICE(134, "ICE", "uncommon"),
    IRON_ORE(135, "IRON_ORE", "uncommon"),
    LAPIS_LAZLI_ORE(136, "LAPIS_LAZLI_ORE", "uncommon"),
    LAVA(137, "LAVA", "uncommon"),
    MELON(138, "MELON", "uncommon"),
    MOOSHROOM(139, "MOOSHROOM", "uncommon"),
    MOSSY_STONE_BRICKS(140, "MOSSY_STONE_BRICKS", "uncommon"),
    MULE(141, "MULE", "uncommon"),
    OBSERVER(142, "OBSERVER", "uncommon"),
    OCELOT(143, "OCELOT", "uncommon"),
    PHANTOM(144, "PHANTOM", "uncommon"),
    PISTON(145, "PISTON", "uncommon"),
    POWERED_RAIL(146, "POWERED_RAIL", "uncommon"),
    PUMPKIN(147, "PUMPKIN", "uncommon"),
    REDSTONE_ORE(148, "REDSTONE_ORE", "uncommon"),
    SILVERFISH(149, "SILVERFISH", "uncommon"),
    SLIME(150, "SLIME", "uncommon"),
    SLIME_BLOCK(151, "SLIME_BLOCK", "uncommon"),
    STICKY_PISTON(152, "STICKY_PISTON", "uncommon"),
    SUNFLOWER(153, "SUNFLOWER", "uncommon"),
    TNT(154, "TNT", "uncommon");

    static HashMap<String, Integer> ID_BY_NAME;
    private final int id;
    private final String textureName;
    private final String rarity;

    CardTexture(int id, String textureName, String rarity) {
        this.id = id;
        this.textureName = textureName;
        this.rarity = rarity;
    }

    public int getId() {
        return this.id;
    }

    public String getTextureName() {
        return this.textureName;
    }

    public String getRarity() {
        return this.rarity;
    }

    public static int getCardID(String textureName) {
        if (ID_BY_NAME == null) {
            ID_BY_NAME = Maps.newHashMap();
            for (CardTexture cardTexture : CardTexture.values()) {
                ID_BY_NAME.put(cardTexture.getTextureName().toLowerCase(), cardTexture.getId());
            }
        }
        System.out.println("getting " + textureName + " gives you " + ID_BY_NAME.get(textureName.toLowerCase()));
        return ID_BY_NAME.containsKey(textureName.toLowerCase()) ? ID_BY_NAME.get(textureName.toLowerCase()) : 0;
    }
}


