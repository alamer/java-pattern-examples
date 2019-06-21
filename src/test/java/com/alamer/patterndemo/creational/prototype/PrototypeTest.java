package com.alamer.patterndemo.creational.prototype;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PrototypeTest {

    @Test
    public void clone1() {
        FtpConfig ftpConfig = new FtpConfig();
        ftpConfig.username = "username";
        ftpConfig.password = "password";
        ftpConfig.port = 21;
        ftpConfig.url = "127.0.0.1";
        FtpConfig ftpConfig2 = ftpConfig.clone();
        assertTrue(ftpConfig.equals( ftpConfig2));

    }

    @Test
    public void clone2() {
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