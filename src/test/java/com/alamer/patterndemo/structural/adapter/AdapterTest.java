package com.alamer.patterndemo.structural.adapter;

import org.junit.Test;

import java.nio.file.Path;

import static org.junit.Assert.assertEquals;

public class AdapterTest {

    @Test
    public void getData() {
        String p = "temp";
        LegacyFtpGateway legacyFtpGateway = new LegacyFtpGatewayImpl();
        LegacyFtpData legacyFtpData = legacyFtpGateway.getData(p);
        FtpGateway ftpGateway = new FtpGatewayImpl(legacyFtpGateway);
        FtpData temp = ftpGateway.getData(Path.of(p));
        assertEquals(temp.filename, legacyFtpData.filename);
    }
}