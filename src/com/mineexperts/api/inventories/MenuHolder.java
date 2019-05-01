package com.mineexperts.api.inventories;

import org.bukkit.inventory.InventoryHolder;

/*
Created by Dimasik. 21.04.2019
*/
public interface MenuHolder<T extends Menu> extends InventoryHolder {
    MenuHolder setMenu(T menu);

    T getMenu();
}
