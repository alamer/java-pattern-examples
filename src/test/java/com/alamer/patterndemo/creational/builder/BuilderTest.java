package com.alamer.patterndemo.creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuilderTest {


    @Test
    public void testBuilder(){
        String username="username";
        FtpConfig config=new FtpConfig.FtpConfigBuilder().username("username").build();
        assertEquals(config.getUsername(),username);
    }

}