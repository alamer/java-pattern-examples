package com.alamer.patterndemo.creational.abstractfactory;

import com.alamer.patterndemo.creational.abstractfactory.mutator.DataMutatorFactory;
import com.alamer.patterndemo.creational.abstractfactory.provider.DataProviderFactory;

public class FactoryProducer {

    public static final String MUTATOR = "MUTATOR";
    public static final String PROVIDER = "PROVIDER";

    public AbstractFactory getFactory(String factoryName) {
        if (MUTATOR.equalsIgnoreCase(factoryName)) {
            return new DataMutatorFactory();
        } else if (PROVIDER.equalsIgnoreCase(factoryName)) {
            return new DataProviderFactory();
        } else {
            return null;
        }
    }
}
