package com.alamer.patterndemo.structural.proxy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProxyTest {

    @Test
    public void testBillingServiceProxy() {
        BillingService billingService=new BillingServiceProxy();
        assertEquals(billingService.getTotalSum(),Long.valueOf(100));
    }

}