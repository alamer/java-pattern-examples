package com.alamer.patterndemo.creational.singletone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SingletoneTest {

    @Test
    public void getInstance() {
        LazySingletone singletone=LazySingletone.getInstance();
        assertNotNull(singletone);
    }

    @Test
    public void hello() {
        LazySingletone singletone=LazySingletone.getInstance();
        assertEquals(singletone.hello(),"Lazy hello");
    }


    @Test
    public void getInstanceEarly() {
        EarlySingletone singletone=EarlySingletone.getInstance();
        assertNotNull(singletone);
    }

    @Test
    public void helloEarly() {
        EarlySingletone singletone=EarlySingletone.getInstance();
        assertEquals(singletone.hello(),"Early hello");
    }
}