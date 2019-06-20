package com.alamer.patterndemo.creational.singletone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LazySingletoneTest {

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
}