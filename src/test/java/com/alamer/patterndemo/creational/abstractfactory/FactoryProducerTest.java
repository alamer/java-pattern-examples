package com.alamer.patterndemo.creational.abstractfactory;

import com.alamer.patterndemo.creational.abstractfactory.mutator.DataMutatorFactory;
import com.alamer.patterndemo.creational.abstractfactory.provider.DataProviderFactory;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class FactoryProducerTest {

    @Test
    public void getFactory() {
        FactoryProducer factoryProducer=new FactoryProducer();
        AbstractFactory mutatorFactory = factoryProducer.getFactory(FactoryProducer.MUTATOR);
        AbstractFactory providerFactory = factoryProducer.getFactory(FactoryProducer.PROVIDER);
        assertThat(mutatorFactory, instanceOf(DataMutatorFactory.class));
        assertThat(providerFactory, instanceOf(DataProviderFactory.class));
    }
}