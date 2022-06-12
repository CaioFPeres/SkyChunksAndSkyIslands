import org.bukkit.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

import static org.bukkit.Material.*;
import static org.bukkit.Material.AIR;

public class ChunkDeletion implements Listener {



    public ChunkDeletion(){

    }



    @EventHandler
    public void onChunkLoad(ChunkLoadEvent event){

        if (event.isNewChunk()) {

            Chunk chunk = event.getChunk();
            double randomDouble = Math.random();


            if (chunk.getWorld().getName().equals("world_the_end"))
                return;


//          getServer().getConsoleSender().sendMessage("X: " + chunk.getX() + "z: " + chunk.getZ());
//          Bukkit.broadcastMessage("X: " + chunk.getX() + "z: " + chunk.getZ());


            if (randomDouble < 0.99) {

                for (int h = 0; h < 128; h++) {
                    for (int i = 0; i < 16; i++) {
                        for (int j = 0; j < 16; j++) {
                            chunk.getWorld().getBlockAt((chunk.getX() * 15) + i, h, (chunk.getZ() * 15) + j).setType(AIR);
                        }

                    }

                }

            }
            else{

                for (int h = 0; h < 58; h++) {
                    for (int i = 0; i < 16; i++) {
                        for (int j = 0; j < 16; j++) {
                            chunk.getWorld().getBlockAt((chunk.getX() * 15) + i, h, (chunk.getZ() * 15) + j).setType(AIR);
                        }

                    }

                }


                for (int h = 76; h < 128; h++) {
                    for (int i = 0; i < 16; i++) {
                        for (int j = 0; j < 16; j++) {
                            chunk.getWorld().getBlockAt((chunk.getX() * 15) + i, h, (chunk.getZ() * 15) + j).setType(AIR);
                        }

                    }

                }

            }



        }

    }

}

/*
    @Override
    public ChunkData generateChunkData(World world, Random random, int chunkX, int chunkZ, BiomeGrid biome) {

        ChunkData chunk = createChunkData(world);

            chunk.setRegion(0,0,0,16,256,16, AIR);
            return chunk;

    }
*/