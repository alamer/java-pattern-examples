package com.alamer.patterndemo.structural.adapter;

import java.time.LocalDateTime;

public class FtpData {

    String filename;
    LocalDateTime lastModified;

    public FtpData(String filename, LocalDateTime lastModified) {
        this.filename = filename;
        this.lastModified = lastModified;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }
}
