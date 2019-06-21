package com.alamer.patterndemo.structural.adapter;

public class LegacyFtpGatewayImpl implements LegacyFtpGateway {
    @Override
    public LegacyFtpData getData(String path) {
        LegacyFtpData res = new LegacyFtpData();
        res.setFilename("filename");
        res.setTimestamp(System.currentTimeMillis());
        return res;
    }
}
