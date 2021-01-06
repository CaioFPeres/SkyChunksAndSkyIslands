import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;


public class SkyChunk extends JavaPlugin{


    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChunkDeletion(this), this);
    }

    @Override
    public void onDisable(){
        getLogger().info("Disabled");
        HandlerList.unregisterAll(this);
    }


}
