package com.alamer.patterndemo.creational.abstractfactory.mutator;

public class DataMutatorUppercaseImpl implements DataMutator {
    public String mutate(String data) {
        return data.toUpperCase();
    }
}
