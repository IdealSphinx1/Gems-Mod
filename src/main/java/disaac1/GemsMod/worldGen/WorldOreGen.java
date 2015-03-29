package disaac1.GemsMod.worldGen;

import java.util.Random;

import disaac1.GemsMod.init.GemsBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldOreGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimensionId()){
		
		case -1:
			GenerateNeather(world, chunkX * 16, chunkZ *16, random);
			break;
		case 0:
			GenerateOverworld(world, chunkX * 16, chunkZ *16, random);
			break;
		case 1:
			GenerateEnd(world, chunkX * 16, chunkZ *16, random);
			break;
		}

	}
	
	private void addOre(Block block, Block blockSpawn,Random random, World world, int posX, int posZ, int minY, int maxY, int minVein, int maxVein, int spawnChance){
		for(int i = 0; i < spawnChance; i++){
			int defaultChunkSize = 16;
			
			int Xpos = posX + random.nextInt(defaultChunkSize);
			int Ypos = minY + random.nextInt(maxY - minY);
			int Zpos = posZ + random.nextInt(defaultChunkSize);
			
			IBlockState state = block.getDefaultState();
			BlockPos blockPos = new BlockPos(Xpos, Ypos, Zpos); 
			
			new WorldGenMinable(state, maxVein).generate(world, random, blockPos);
		}
	}
	
	private void GenerateEnd(World world, int i, int j, Random random) {
		
		
	}

	private void GenerateOverworld(World world, int i, int j, Random random) {
		addOre(GemsBlocks.ruby_Ore,Blocks.stone, random, world, i, j,  10, 75, 2, 4, 10);
		addOre(GemsBlocks.sapphire_Ore, Blocks.stone, random, world, i, j, 10, 75, 2, 4, 10);
		addOre(GemsBlocks.amethyst_Ore, Blocks.stone, random, world, i, j, 10, 75, 2, 4, 10);
		addOre(GemsBlocks.topaz_Ore, Blocks.stone, random, world, i, j, 10, 75, 1, 3, 5);

	}

	

	private void GenerateNeather(World world, int i, int j, Random random) {

		
	}

}