import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;


public class VoidIsLava extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChunkDeletion(), this);
    }

    @Override
    public void onDisable(){
        getLogger().info("Disabled");
        HandlerList.unregisterAll(this);
    }

}
