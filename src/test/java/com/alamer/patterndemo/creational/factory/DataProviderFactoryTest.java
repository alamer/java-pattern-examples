package com.alamer.patterndemo.creational.factory;

import com.alamer.patterndemo.creational.factory.provider.DataProvider;
import com.alamer.patterndemo.creational.factory.provider.DataProviderFactory;

import static org.junit.Assert.assertEquals;

public class DataProviderFactoryTest {

    @org.junit.Test
    public void getDataProvider() {
        DataProviderFactory factory=new DataProviderFactory();
        DataProvider ftpProvider=factory.getDataProvider(DataProviderFactory.FTP);
        ftpProvider.provide();
        DataProvider fsProvider=factory.getDataProvider(DataProviderFactory.FS);
        assertEquals(ftpProvider.provide(),"FTP");
        assertEquals(fsProvider.provide(),"FILESYSTEM");
    }
}