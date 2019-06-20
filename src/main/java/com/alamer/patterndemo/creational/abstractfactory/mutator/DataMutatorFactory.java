package com.alamer.patterndemo.creational.abstractfactory.mutator;


import com.alamer.patterndemo.creational.abstractfactory.AbstractFactory;
import com.alamer.patterndemo.creational.abstractfactory.provider.DataProvider;

public class DataMutatorFactory extends AbstractFactory {

    public static final String LOWER = "LOWER";
    public static final String UPPER = "UPPER";

    @Override
    public DataMutator getDataMutator(String mutator) {
        if (LOWER.equals(mutator)) {
            return new DataMutatorLowercaseImpl();
        }
        else if (UPPER.equals(mutator)) {
            return new DataMutatorUppercaseImpl();
        } else return null;
    }

    public DataProvider getDataProvider(String name) {
        return null;
    }
}