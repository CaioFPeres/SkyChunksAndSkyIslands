import org.bukkit.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import static org.bukkit.Bukkit.getServer;
import static org.bukkit.Material.*;

import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class ChunkDeletion implements Listener {

    private Plugin plugin;

    public ChunkDeletion(Plugin plugin){

        this.plugin = plugin;

    }


    //          getServer().getConsoleSender().sendMessage("X: " + chunk.getX() + "z: " + chunk.getZ());
    //          Bukkit.broadcastMessage("X: " + chunk.getX() + "z: " + chunk.getZ());



    @EventHandler
    public void onChunkLoad(ChunkLoadEvent event){

        if (event.isNewChunk()) {

            double chanceThread = Math.random();

            if(chanceThread >= 0.5) {

                BukkitRunnable runnable = new BukkitRunnable() {
                    @Override
                    public void run() {

                        Chunk chunk = event.getChunk();
                        double randomDouble = Math.random();


                        if (chunk.getWorld().getName().equals("world_the_end"))
                            return;


                        if (randomDouble < 0.99) {

                            for (int h = 0; h < 128; h++) {
                                for (int i = 0; i < 16; i++) {
                                    for (int j = 0; j < 16; j++) {
                                        chunk.getWorld().getBlockAt((chunk.getX() * 15) + i, h, (chunk.getZ() * 15) + j).setType(AIR);
                                    }

                                }

                            }

                        }

                    }
                };


                runnable.runTask(plugin);

            }
            else {

                BukkitRunnable runnable2 = new BukkitRunnable() {
                    @Override
                    public void run() {


                        Chunk chunk = event.getChunk();
                        double randomDouble = Math.random();


                        if (chunk.getWorld().getName().equals("world_the_end"))
                            return;


                        if (randomDouble < 0.99) {

                            for (int h = 0; h < 128; h++) {
                                for (int i = 0; i < 16; i++) {
                                    for (int j = 0; j < 16; j++) {
                                        chunk.getWorld().getBlockAt((chunk.getX() * 15) + i, h, (chunk.getZ() * 15) + j).setType(AIR);
                                    }

                                }

                            }

                        }

                    }
                };

                runnable2.runTask(plugin);

            }

        }



    }

}