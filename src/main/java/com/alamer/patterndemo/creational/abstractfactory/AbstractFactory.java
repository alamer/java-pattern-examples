package com.alamer.patterndemo.creational.abstractfactory;


import com.alamer.patterndemo.creational.abstractfactory.mutator.DataMutator;
import com.alamer.patterndemo.creational.abstractfactory.provider.DataProvider;

public abstract class AbstractFactory  {

    public abstract DataMutator getDataMutator(String name);
    public abstract DataProvider getDataProvider(String name);

}
