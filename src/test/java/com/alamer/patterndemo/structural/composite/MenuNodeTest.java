package com.alamer.patterndemo.structural.composite;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class MenuNodeTest {

    @Test
    public void testComposite() {
        List<MenuItem> menu = new ArrayList<>();
        menu.add(prepareMenuNode1());
        menu.add(prepareMenuNode2());
        menu.add(new ExternalMenuItemImpl("Name5", "Link5"));
        menu.stream().forEach(this::printMenuItemName);

    }


    private void printMenuItemName(MenuItem itm) {
        if(itm.getItemType()!="Menu node"){
            System.out.println(itm.getName());
        } else {
            ((MenuNode) itm).getChildItems().stream().forEach(this::printMenuItemName);
        }
    }



    private MenuItem prepareMenuNode1() {
        MenuItem i1 = new ExternalMenuItemImpl("Name1", "Link1");
        MenuItem i2 = new ExternalMenuItemImpl("Name2", "Link2");
        MenuNode node = new MenuNode("Node1");
        node.add(i1);
        node.add(i2);
        return node;
    }

    private MenuItem prepareMenuNode2() {
        MenuItem i1 = new ExternalMenuItemImpl("Name3", "Link3");
        MenuItem i2 = new ExternalMenuItemImpl("Name4", "Link4");
        MenuNode node = new MenuNode("Node2");
        MenuNode internalNode=new MenuNode("Node2 submenu");
        MenuItem i3 = new ExternalMenuItemImpl("Name6", "Link7");
        MenuItem i4 = new ExternalMenuItemImpl("Name8", "Link8");
        internalNode.add(i3);
        internalNode.add(i4);
        node.add(internalNode);
        node.add(i1);
        node.add(i2);

        return node;
    }

}