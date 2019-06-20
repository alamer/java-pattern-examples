package com.alamer.patterndemo.creational.singletone;

public class EarlySingletone {

    private static EarlySingletone instance;

    static {
        synchronized (EarlySingletone.class) {
            if (instance == null) {
                instance = new EarlySingletone();
            }
        }
    }

    public static EarlySingletone getInstance() {
        return instance;
    }

    public String hello()
    {
        return "Early hello";
    }
}
