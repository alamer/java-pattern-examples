package com.alamer.patterndemo.structural.composite;

public class InternalMenuItemImpl implements MenuItem {

    private String name;
    private String link;

    public InternalMenuItemImpl(String name, String link) {
        this.name = name;
        this.link = link;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLink() {
        return link;
    }

    @Override
    public String getItemType() {
        return "Internal link";
    }
}
