package com.mineexperts.api.inventories;

import org.bukkit.inventory.ItemStack;

/*
Created by Dimasik. 21.04.2019
*/
public interface Button {
    ClickAction getAction();

    Button setAction(ClickAction action);

    Button setSlot(int slot);

    int getSlot();

    Button setItem(ItemStack item);

    ItemStack getItem();
}
