package minigame;

import org.bukkit.plugin.java.JavaPlugin;

public class MiniGame extends JavaPlugin {

    public static MiniGame instance = null;

    public void onEnable() {

        instance = this;

    }

    public void onDisable() {

    }

    public static MiniGame getInstance() {
        return instance;
    }
}
