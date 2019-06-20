package com.alamer.patterndemo.creational.abstractfactory.mutator;

public class DataMutatorLowercaseImpl implements DataMutator {
    public String mutate(String data) {

        return data.toLowerCase();
    }
}
