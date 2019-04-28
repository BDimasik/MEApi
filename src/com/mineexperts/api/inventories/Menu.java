package com.mineexperts.api.inventories;

import org.bukkit.inventory.Inventory;

/*
Created by Dimasik. 21.04.2019
*/
public interface Menu {
    Menu addButtons(Button... buttons);

    Button getButtonOrDefault(int slot);

    Inventory build(int slots, MenuHolder holder, String name);
}
