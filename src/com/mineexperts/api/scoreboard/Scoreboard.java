package com.mineexperts.api.scoreboard;

import org.bukkit.entity.Player;

/*
Created by Dimasik. 24.04.2019
*/
public interface Scoreboard {
    Scoreboard addScore(String name, int score);

    Scoreboard addLineRefresher(String line, int score, int period, boolean set);

    Scoreboard send(Player... players);
}
