import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;


public class SkyChunk extends JavaPlugin{


    @Override
    public void onEnable() {
        getLogger().info("Me tornei aquilo q eu mais temia");
        getLogger().info("um criador de plugins de minecraft");

        getServer().getPluginManager().registerEvents(new ChunkDeletion(), this);

    }

    @Override
    public void onDisable(){
        getLogger().info("Disabled");
        HandlerList.unregisterAll(this);
    }


}
