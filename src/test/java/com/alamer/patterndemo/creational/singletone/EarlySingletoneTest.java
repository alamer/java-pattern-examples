package com.alamer.patterndemo.creational.singletone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EarlySingletoneTest {

    @Test
    public void getInstance() {
        EarlySingletone singletone=EarlySingletone.getInstance();
        assertNotNull(singletone);
    }

    @Test
    public void hello() {
        EarlySingletone singletone=EarlySingletone.getInstance();
        assertEquals(singletone.hello(),"Early hello");
    }
}