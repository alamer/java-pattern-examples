package com.alamer.patterndemo.creational.prototype;

class FtpConfig implements Cloneable {


    protected String username;
    protected String password;
    protected String url;
    protected int port;


    public FtpConfig() {
    }

    public FtpConfig(FtpConfig target) {
        if (target != null) {
            this.username = target.username;
            this.password = target.password;
            this.url = target.url;
            this.port = target.port;
        }
    }

    @Override
    public FtpConfig clone() {
        return new FtpConfig(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof FtpConfig)) return false;
        FtpConfig ftpconfig2 = (FtpConfig) object2;
        return ftpconfig2.username == this.username &&
                ftpconfig2.password == this.password &&
                ftpconfig2.url == this.url &&
                ftpconfig2.port == this.port;
    }
}
