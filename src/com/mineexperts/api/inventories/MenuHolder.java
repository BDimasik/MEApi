package com.mineexperts.api.inventories;

import org.bukkit.inventory.InventoryHolder;

/*
Created by Dimasik. 21.04.2019
*/
public interface MenuHolder extends InventoryHolder {
    MenuHolder setMenu(Menu menu);

    Menu getMenu();
}
