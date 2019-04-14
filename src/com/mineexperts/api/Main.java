package com.mineexperts.api;

import com.mineexperts.api.messages.MessageApi;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static MessageApi messageApi;
    private static Main instance;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
    }

    public static MessageApi getMessageApi() {
        return messageApi;
    }
}
