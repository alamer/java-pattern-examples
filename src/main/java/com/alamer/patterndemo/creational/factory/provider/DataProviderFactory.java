package com.alamer.patterndemo.creational.factory.provider;

public class DataProviderFactory {

    public static final String FTP="FTP";
    public static final String FS="FILESYSTEM";


    public DataProvider getDataProvider(String dataProviderName) {
        if (dataProviderName.equals(FTP)) {
            return new DataProviderFtpImpl();
        }
        else if (dataProviderName.equals(FS)) {
            return new DataProviderFilesystemImpl();
        } else {
            return null;
        }
    }
}
