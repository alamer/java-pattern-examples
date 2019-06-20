package com.alamer.patterndemo.creational.factory.provider;

public class DataProviderFtpImpl implements DataProvider {
    public String provide() {
        System.out.println("Ftp PROVIDER");
        return "FTP";
    }
}
