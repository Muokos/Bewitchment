package com.bewitchment.common.world.gen;

import com.bewitchment.Bewitchment;
import com.bewitchment.ModConfig;
import com.bewitchment.common.world.gen.structures.WorldGenMenhir;
import com.bewitchment.common.world.gen.structures.WorldGenStonecircle;
import com.bewitchment.common.world.gen.structures.WorldGenWickerman;
import com.bewitchment.common.world.gen.tree.WorldGenCypressTree;
import com.bewitchment.common.world.gen.tree.WorldGenElderTree;
import com.bewitchment.common.world.gen.tree.WorldGenJuniperTree;
import com.bewitchment.registry.ModObjects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;

public class ModWorldGen implements IWorldGenerator {
	//Trees
	private final WorldGenerator cypressTree = new WorldGenCypressTree(true);
	private final WorldGenerator elderTree = new WorldGenElderTree(true);
	private final WorldGenerator juniperTree = new WorldGenJuniperTree(true);
	
	//Ores
	private final WorldGenerator silverOre = new WorldGenMinable(ModObjects.silver_ore.getDefaultState(), ModConfig.worldGen.oreGen.silverSize);
	private final WorldGenerator saltOre = new WorldGenMinable(ModObjects.salt_ore.getDefaultState(), ModConfig.worldGen.oreGen.saltSize);
	private final WorldGenerator amethystOre = new WorldGenMinable(ModObjects.amethyst_ore.getDefaultState(), ModConfig.worldGen.oreGen.amethystSize);
	private final WorldGenerator garnetOre = new WorldGenMinable(ModObjects.garnet_ore.getDefaultState(), ModConfig.worldGen.oreGen.garnetSize);
	private final WorldGenerator opalOre = new WorldGenMinable(ModObjects.opal_ore.getDefaultState(), ModConfig.worldGen.oreGen.opalSize);
	
	//Structures
	private final WorldGenerator wickerman = new WorldGenWickerman(false);
	private final WorldGenerator burnedWickerman = new WorldGenWickerman(true);
	private final WorldGenerator stonecircle1 = new WorldGenStonecircle(1);
	private final WorldGenerator stonecircle2 = new WorldGenStonecircle(2);
	private final WorldGenerator menhir1 = new WorldGenMenhir(1);
	private final WorldGenerator menhir2 = new WorldGenMenhir(2);
	private final WorldGenerator menhirtaiga = new WorldGenMenhir(3);
	private final WorldGenerator menhirmegataiga = new WorldGenMenhir(4);
	private final WorldGenerator menhircoldtaiga = new WorldGenMenhir(5);
	
	public ModWorldGen() {
		MinecraftForge.addGrassSeed(new ItemStack(ModObjects.aconitum_seeds), 3);
		MinecraftForge.addGrassSeed(new ItemStack(ModObjects.belladonna_seeds), 3);
		MinecraftForge.addGrassSeed(new ItemStack(ModObjects.hellebore_seeds), 3);
		MinecraftForge.addGrassSeed(new ItemStack(ModObjects.mandrake_seeds), 3);
		MinecraftForge.addGrassSeed(new ItemStack(ModObjects.wormwood_seeds), 3);
		
		LootTableList.register(new ResourceLocation(Bewitchment.MODID, "chests/nether_materials"));
		LootTableList.register(new ResourceLocation(Bewitchment.MODID, "chests/materials"));
	}
	
	private static int getGround(World world, int x, int z) {
		int y = world.getHeight(x, z);
		boolean foundGround = false;
		while (!foundGround && y-- >= 31) {
			Block blockAt = world.getBlockState(new BlockPos(x, y, z)).getBlock();
			foundGround = blockAt == Blocks.GRASS || blockAt == Blocks.SAND || blockAt == Blocks.SNOW || blockAt == Blocks.SNOW_LAYER || blockAt == Blocks.GLASS || blockAt == Blocks.MYCELIUM;
			if (blockAt == Blocks.FLOWING_WATER || blockAt == Blocks.WATER) {        //Prevent spawning in lakes/rivers
				y = -1;
				break;
			}
		}
		return y;
	}
	
	public static boolean canSpawnHere(Template template, World world, BlockPos posAboveGround) {
		int zwidth = template.getSize().getZ();
		int xwidth = template.getSize().getX();
		// check all the corners to see which ones are replaceable
		boolean corner1 = isCornerValid(world, posAboveGround);
		boolean corner2 = isCornerValid(world, posAboveGround.add(xwidth, 0, zwidth));
		// if Y > 31 and all corners pass the test, it's okay to spawn the structure
		return posAboveGround.getY() > 31 && corner1 && corner2;
	}
	
	private static boolean isCornerValid(World world, BlockPos pos) {
		int highestBlock = getGround(world, pos.getX(), pos.getZ());
		return highestBlock > pos.getY() - 1 && highestBlock < pos.getY() + 3;
	}
	
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator generator, IChunkProvider provider) {
		if (Arrays.asList(ModConfig.worldGen.worldGenWhitelist).contains(world.provider.getDimension())) {
			generateCoquina(world, rand, chunkX, chunkZ);
			generateOre(world, rand, silverOre, chunkX, chunkZ, ModConfig.worldGen.oreGen.silverChance, ModConfig.worldGen.oreGen.silverMin, ModConfig.worldGen.oreGen.silverMax);
			generateOre(world, rand, saltOre, chunkX, chunkZ, ModConfig.worldGen.oreGen.saltChance, ModConfig.worldGen.oreGen.saltMin, ModConfig.worldGen.oreGen.saltMax);
			generateOre(world, rand, amethystOre, chunkX, chunkZ, ModConfig.worldGen.oreGen.amethystChance, ModConfig.worldGen.oreGen.amethystMin, ModConfig.worldGen.oreGen.amethystMax);
			generateOre(world, rand, garnetOre, chunkX, chunkZ, ModConfig.worldGen.oreGen.garnetChance, ModConfig.worldGen.oreGen.garnetMin, ModConfig.worldGen.oreGen.garnetMax);
			generateOre(world, rand, opalOre, chunkX, chunkZ, ModConfig.worldGen.oreGen.opalChance, ModConfig.worldGen.oreGen.opalMin, ModConfig.worldGen.oreGen.opalMax);
			generateTree(world, rand, cypressTree, ModObjects.cypress_sapling, chunkX, chunkZ, ModConfig.worldGen.treeGen.cypressChance, b -> BiomeDictionary.hasType(b, BiomeDictionary.Type.FOREST) && (BiomeDictionary.hasType(b, BiomeDictionary.Type.COLD) || BiomeDictionary.hasType(b, BiomeDictionary.Type.SPOOKY)));
			generateTree(world, rand, elderTree, ModObjects.elder_sapling, chunkX, chunkZ, ModConfig.worldGen.treeGen.elderChance, b -> BiomeDictionary.hasType(b, BiomeDictionary.Type.FOREST) && !BiomeDictionary.hasType(b, BiomeDictionary.Type.COLD));
			generateTree(world, rand, juniperTree, ModObjects.juniper_sapling, chunkX, chunkZ, ModConfig.worldGen.treeGen.juniperChance, b -> BiomeDictionary.hasType(b, BiomeDictionary.Type.SAVANNA) || BiomeDictionary.hasType(b, BiomeDictionary.Type.MAGICAL));
			generateMoss(world, rand, chunkX, chunkZ, b -> BiomeDictionary.hasType(b, BiomeDictionary.Type.SWAMP));
		}
		
		if (world.provider.getDimension() == 0) {    //Overworld Gen
			generateStructure(wickerman, world, rand, 0.002, chunkX, chunkZ, 2, 4, b -> BiomeDictionary.hasType(b, BiomeDictionary.Type.PLAINS) || BiomeDictionary.hasType(b, BiomeDictionary.Type.FOREST) || BiomeDictionary.hasType(b, BiomeDictionary.Type.BEACH));
			generateStructure(burnedWickerman, world, rand, 0.002, chunkX, chunkZ, 1, 1, b -> BiomeDictionary.hasType(b, BiomeDictionary.Type.PLAINS) || BiomeDictionary.hasType(b, BiomeDictionary.Type.FOREST) || BiomeDictionary.hasType(b, BiomeDictionary.Type.BEACH));
			generateStructure(stonecircle1, world, rand, 0.002, chunkX, chunkZ, 0, 0, b -> BiomeDictionary.hasType(b, BiomeDictionary.Type.PLAINS) || BiomeDictionary.hasType(b, BiomeDictionary.Type.FOREST));
			generateStructure(stonecircle2, world, rand, 0.002, chunkX, chunkZ, 0, 0, b -> BiomeDictionary.hasType(b, BiomeDictionary.Type.PLAINS) || BiomeDictionary.hasType(b, BiomeDictionary.Type.FOREST));
			generateStructure(menhir1, world, rand, 0.002, chunkX, chunkZ, 0, 0, b -> (BiomeDictionary.hasType(b, BiomeDictionary.Type.PLAINS) || BiomeDictionary.hasType(b, BiomeDictionary.Type.FOREST) || BiomeDictionary.hasType(b, BiomeDictionary.Type.MOUNTAIN)) && b != Biomes.TAIGA && b != Biomes.TAIGA_HILLS && b != Biomes.COLD_TAIGA && b != Biomes.COLD_TAIGA_HILLS && b != Biomes.REDWOOD_TAIGA && b != Biomes.REDWOOD_TAIGA_HILLS);
			generateStructure(menhir2, world, rand, 0.002, chunkX, chunkZ, 0, 0, b -> (BiomeDictionary.hasType(b, BiomeDictionary.Type.PLAINS) || BiomeDictionary.hasType(b, BiomeDictionary.Type.FOREST) || BiomeDictionary.hasType(b, BiomeDictionary.Type.MOUNTAIN)) && b != Biomes.TAIGA && b != Biomes.TAIGA_HILLS && b != Biomes.COLD_TAIGA && b != Biomes.COLD_TAIGA_HILLS && b != Biomes.REDWOOD_TAIGA && b != Biomes.REDWOOD_TAIGA_HILLS);
			generateStructure(menhirtaiga, world, rand, 0.01, chunkX, chunkZ, 0, 0, b -> b == Biomes.TAIGA || BiomeDictionary.hasType(b, BiomeDictionary.Type.CONIFEROUS));
			generateStructure(menhirmegataiga, world, rand, 0.01, chunkX, chunkZ, 0, 0, b -> b == Biomes.REDWOOD_TAIGA || b == Biomes.REDWOOD_TAIGA_HILLS);
			generateStructure(menhircoldtaiga, world, rand, 0.01, chunkX, chunkZ, 0, 0, b -> b == Biomes.COLD_TAIGA || b == Biomes.COLD_TAIGA_HILLS);
		}
	}
	
	private void generateCoquina(World world, Random rand, int chunkX, int chunkZ) {
		if (rand.nextInt(6) == 0) {
			BlockPos pos = world.getHeight(new BlockPos(chunkX * 16 + rand.nextInt(16), 0, chunkZ * 16 + rand.nextInt(16)));
			if (BiomeDictionary.getBiomes(BiomeDictionary.Type.BEACH).contains(world.getBiome(pos)) || BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).contains(world.getBiome(pos))) {
				while (world.getBlockState(pos.down()).getBlock() == Blocks.SAND) {
					for (int i = 0; i < 3; i++) {
						int x = rand.nextInt(2);
						int y = rand.nextInt(2);
						int z = rand.nextInt(2);
						for (BlockPos blockpos : BlockPos.getAllInBoxMutable(pos.add(-x, -y, -z), pos.add(x, y, z)))
							if (blockpos.distanceSq(pos) <= Math.pow((x + y + z) * .333f + 0.5f, 2)) world.setBlockState(blockpos, ModObjects.coquina[0].getDefaultState(), 2);
						pos = pos.add(rand.nextInt(2) - 1, -rand.nextInt(2), rand.nextInt(2) - 1);
					}
					pos = pos.down();
				}
			}
		}
	}
	
	private void generateOre(World world, Random rand, WorldGenerator gen, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		for (int i = 0; i < chance; i++)
			gen.generate(world, rand, new BlockPos(chunkX * 16, rand.nextInt(maxHeight - minHeight) + minHeight, chunkZ * 16));
	}
	
	private void generateTree(World world, Random rand, WorldGenerator gen, Block block, int chunkX, int chunkZ, int chance, Predicate<Biome> predicate) {
		if (chance != 0 && rand.nextInt(chance) == 0) {
			int x = chunkX * 16 + 8;
			int z = chunkZ * 16 + 8;
			BlockPos pos = new BlockPos(x, world.getHeight(x, z), z);
			Biome biome = world.getBiome(pos);
			if (predicate.test(biome) && block.canPlaceBlockAt(world, pos)) gen.generate(world, rand, pos);
		}
	}
	
	private void generateMoss(World world, Random rand, int chunkX, int chunkZ, Predicate<Biome> predicate) {
		BlockPos position = new BlockPos(chunkX * 16 + 8, 64, chunkZ * 16 + 8);
		Biome biome = world.getBiome(position);
		if (!predicate.test(biome)) return;
		for (; position.getY() < 128; position = position.up()) {
			if (world.isAirBlock(position) && world.isAirBlock(position.down(1))) {
				for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL.facings()) {
					if (ModObjects.spanish_moss.canPlaceBlockOnSide(world, position, enumfacing)) {
						IBlockState iblockstate = ModObjects.spanish_moss.getDefaultState().withProperty(BlockVine.SOUTH, enumfacing == EnumFacing.NORTH).withProperty(BlockVine.WEST, enumfacing == EnumFacing.EAST).withProperty(BlockVine.NORTH, enumfacing == EnumFacing.SOUTH).withProperty(BlockVine.EAST, enumfacing == EnumFacing.WEST);
						world.setBlockState(position, iblockstate, 2);
						break;
					}
				}
			}
			else {
				position = position.add(rand.nextInt(4) - rand.nextInt(4), 0, rand.nextInt(4) - rand.nextInt(4));
			}
		}
	}
	
	private void generateStructure(WorldGenerator structure, World world, Random rand, double chance, int chunkX, int chunkz, int xOffset, int zOffset, Predicate<Biome> biomes) {
		BlockPos pos = new BlockPos(chunkX * 16 + xOffset, getGround(world, chunkX * 16 + xOffset, chunkz * 16 + zOffset), chunkz * 16 + zOffset);
		if (rand.nextDouble() < chance && biomes.test(world.getBiome(pos)) && biomes.test(world.getBiome(pos.add(7, 0, 7)))) {
			structure.generate(world, rand, pos);
		}
	}
}