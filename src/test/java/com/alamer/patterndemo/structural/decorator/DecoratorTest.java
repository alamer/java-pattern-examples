package com.alamer.patterndemo.structural.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {


    @Test
    public void decoratorTest(){
        UserAccount account=new UserAccountImpl("user","password");
        UserAccount advancedAccount=new AdvancedUserDecoratorImpl(account);
        assertEquals(account.getUserinfo()+" "+"IP",advancedAccount.getUserinfo());

    }

}