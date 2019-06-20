package com.alamer.patterndemo.creational.abstractfactory.provider;

import com.alamer.patterndemo.creational.abstractfactory.AbstractFactory;
import com.alamer.patterndemo.creational.abstractfactory.mutator.DataMutator;

public class DataProviderFactory extends AbstractFactory {

    public static final String FTP="FTP";
    public static final String FS="FILESYSTEM";


    public DataMutator getDataMutator(String name) {
        return null;
    }

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
