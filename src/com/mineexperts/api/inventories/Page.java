package com.mineexperts.api.inventories;

import org.bukkit.inventory.Inventory;

/*
Created by Dimasik. 30.04.2019
*/
public interface Page extends Menu<Menu> {
    Inventory getInventory();
}
