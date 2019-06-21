package com.alamer.patterndemo.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class MenuNode implements MenuItem {

    private String name;

    private List<MenuItem> childItems = new ArrayList<>();

    public MenuNode(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getLink() {
        return null;
    }

    @Override
    public String getItemType() {
        return "Menu node";
    }


    public void add(MenuItem menuItem) {
        childItems.add(menuItem);
    }

    public void remove(MenuItem menuItem) {
        childItems.remove(menuItem);
    }

    public List<MenuItem> getChildItems() {
        return childItems;
    }

}
