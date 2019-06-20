package com.alamer.patterndemo.creational.factory.mutator;

public class DataMutatorFactory {

    public static final String LOWER = "LOWER";
    public static final String UPPER = "UPPER";

    public DataMutator getDataMutator(String mutator) {
        if (LOWER.equals(mutator)) {
            return new DataMutatorLowercaseImpl();
        }
        else if (UPPER.equals(mutator)) {
            return new DataMutatorUppercaseImpl();
        } else return null;
    }
}