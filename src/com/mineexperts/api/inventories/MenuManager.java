package com.mineexperts.api.inventories;

/*
Created by Dimasik. 20.04.2019
*/
public interface MenuManager {
    Menu createMenu();

    PageableMenu createPageableMenu();

    Button createButton();

    MenuHolder createHolder();

    Page createPage(int slots, MenuHolder customHolder, String name);
}
