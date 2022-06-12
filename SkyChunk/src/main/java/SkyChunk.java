import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.logging.Level;


public class SkyChunk extends JavaPlugin{

    @Override
    public void onEnable() {
        //getServer().getPluginManager().registerEvents(new CustomChunkGenerator(this), this);
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        getLogger().log(Level.WARNING, "CustomChunkGenerator is used!");
        return new CustomChunkGenerator();
    }

    @Override
    public void onDisable(){
        getLogger().info("Disabled");
    }


}
