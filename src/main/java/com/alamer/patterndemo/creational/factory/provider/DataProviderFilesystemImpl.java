package com.alamer.patterndemo.creational.factory.provider;

public class DataProviderFilesystemImpl implements DataProvider {
    public String provide() {
        System.out.println("Filesystem PROVIDER");
        return "FILESYSTEM";
    }
}
