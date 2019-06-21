package com.alamer.patterndemo.structural.adapter;

import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FtpGatewayImpl implements FtpGateway {

    LegacyFtpGateway legacyFtpGateway;

    public FtpGatewayImpl(LegacyFtpGateway legacyFtpGateway) {
        this.legacyFtpGateway = legacyFtpGateway;
    }

    @Override
    public FtpData getData(Path path) {
        LegacyFtpData legacyFtpData = legacyFtpGateway.getData(path.toString());
        FtpData res = new FtpData(legacyFtpData.getFilename(),
                LocalDateTime.ofInstant(Instant.ofEpochMilli(legacyFtpData.getTimestamp()), ZoneId.systemDefault()));
        return res;
    }
}
