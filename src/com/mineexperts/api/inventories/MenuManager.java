package com.mineexperts.api.inventories;

/*
Created by Dimasik. 20.04.2019
*/
public interface MenuManager {
    Menu createMenu();

    Button createButton(int slot);

    MenuHolder createHolder();
}
