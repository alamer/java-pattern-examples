package com.alamer.patterndemo.creational.prototype;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExtendedFtpConfigTest {

    @Test
    public void clone1() {
        ExtendedFtpConfig extendedFtpConfig=new ExtendedFtpConfig();
        extendedFtpConfig.username="username";
        extendedFtpConfig.password="password";
        extendedFtpConfig.port=21;
        extendedFtpConfig.url="127.0.0.1";
        extendedFtpConfig.mode="mode";

        ExtendedFtpConfig clonedConfig=extendedFtpConfig.clone();
        assertTrue(clonedConfig.equals( extendedFtpConfig));
    }
}