package com.mineexperts.api.inventories;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/*
Created by Dimasik. 21.04.2019
*/
@FunctionalInterface
public interface ClickAction {
    void runClickAction(Menu menu, Player clickedPlayer, int clickedSlot, ItemStack clickedItem);
}
