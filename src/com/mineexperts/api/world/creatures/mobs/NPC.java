package com.mineexperts.api.world.creatures.mobs;

import org.bukkit.entity.Player;

import java.util.UUID;

/*
Created by Dimasik. 28.04.2019
*/
public interface NPC {
    NPC setSkin(UUID uuid);

    void send(Player... players);
}
