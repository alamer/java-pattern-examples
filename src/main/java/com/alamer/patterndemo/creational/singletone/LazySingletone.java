package com.alamer.patterndemo.creational.singletone;

public class LazySingletone {

    private static LazySingletone instance;

    public LazySingletone() {
    }

    public static LazySingletone getInstance() {
        if (instance == null) {
            synchronized (LazySingletone.class) {
                if (instance == null) {
                    return new LazySingletone();
                }
            }
        }
        return instance;
    }

    public String hello()
    {
        return "Lazy hello";
    }
}
