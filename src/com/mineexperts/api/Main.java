package com.mineexperts.api;

import com.mineexperts.api.messages.MessageApi;
import com.mineexperts.api.mobs.MobApi;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static MessageApi messageApi;
    private static MobApi mobApi;
    private static Main instance;

    public static Main getInstance() {
        return instance;
    }

    public static MobApi getMobApi() {
        return mobApi;
    }

    @Override
    public void onEnable() {
        instance = this;
    }


    public static MessageApi getMessageApi() {
        return messageApi;
    }
}
