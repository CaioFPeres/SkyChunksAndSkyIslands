import org.bukkit.*;
import org.bukkit.block.data.Waterlogged;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import static org.bukkit.Bukkit.getServer;
import static org.bukkit.Material.*;

import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.world.ChunkLoadEvent;

public class ChunkDeletion implements Listener {



    public ChunkDeletion(){

    }


    @EventHandler
    public void onObsidianForm(BlockFormEvent event) {
        if(event.getBlock().getY() < 3) {
            if (event.getNewState().getType().equals(Material.OBSIDIAN) || event.getNewState().getType().equals(COBBLESTONE))
                event.setCancelled(true);

        }
    }


    @EventHandler
    public void onBlockFromTo(BlockFromToEvent e) {
        if(e.getBlock().getY() < 3) {
            if (e.getBlock().getType().equals(WATER)) {
                e.setCancelled(true);

                if (e.getBlock().getY() < 2){
                    e.getBlock().setType(LAVA);
                }
            }

        }

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
                            if(h < 2)
                                chunk.getWorld().getBlockAt((chunk.getX() * 15) + i, h, (chunk.getZ() * 15) + j).setType(LAVA);
                            else
                                chunk.getWorld().getBlockAt((chunk.getX() * 15) + i, h, (chunk.getZ() * 15) + j).setType(AIR);
                        }

                    }

                }

            }




        }

    }

}