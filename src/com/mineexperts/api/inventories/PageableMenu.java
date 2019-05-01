package com.mineexperts.api.inventories;

/*
Created by Dimasik. 30.04.2019
*/
public interface PageableMenu extends Menu<PageableMenu> {
    Page getPage(int index);

    PageableMenu addPage(Page page);
}
