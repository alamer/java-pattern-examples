package com.alamer.patterndemo.structural.proxy;

public class BillingServiceProxy implements BillingService {
    BillingService billingService;
    @Override
    public Long getTotalSum() {
        if (billingService==null) {
            billingService=new BillingServiceImpl();
        }
        return billingService.getTotalSum();
    }
}
