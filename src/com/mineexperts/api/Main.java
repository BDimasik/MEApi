package com.mineexperts.api;

import com.mineexperts.api.messages.MessageApi;
import com.mineexperts.api.world.creatures.CreatureManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static MessageApi messageApi;
    private static CreatureManager creatureManager;
    private static Main instance;

    public static Main getInstance() {
        return instance;
    }

    public static CreatureManager getCreatureManager() {
        return creatureManager;
    }

    @Override
    public void onEnable() {
        instance = this;
    }


    public static MessageApi getMessageApi() {
        return messageApi;
    }
}
