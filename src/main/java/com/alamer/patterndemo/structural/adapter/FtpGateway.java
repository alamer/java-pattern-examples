package com.alamer.patterndemo.structural.adapter;

import java.nio.file.Path;

public interface FtpGateway {

    FtpData getData(Path path);
}
