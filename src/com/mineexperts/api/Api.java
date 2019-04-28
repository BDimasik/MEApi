package com.mineexperts.api;

import com.mineexperts.api.inventories.MenuManager;
import com.mineexperts.api.messages.MessageApi;
import com.mineexperts.api.scoreboard.ScoreboardManager;
import com.mineexperts.api.world.creatures.CreatureManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Api extends JavaPlugin {
    private static MessageApi messageApi;
    private static CreatureManager creatureManager;
    private static MenuManager menuManager;
    private static ScoreboardManager scoreboardManager;
    private static Api instance;

    public static Api getInstance() {
        return instance;
    }

    public static CreatureManager getCreatureManager() {
        return creatureManager;
    }

    public static ScoreboardManager getScoreboardManager() {
        return scoreboardManager;
    }

    public static MenuManager getMenuManager() {
        return menuManager;
    }

    @Override
    public void onEnable() {
        instance = this;
    }


    public static MessageApi getMessageApi() {
        return messageApi;
    }
}
