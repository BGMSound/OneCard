package kr.bgmsound.onecard;

import kr.bgmsound.onecard.game.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class OneCard extends JavaPlugin {
    private static OneCard instance;
    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("원카드").setExecutor(new CommandManager());
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static OneCard getInstance() {
        return instance;
    }
}
