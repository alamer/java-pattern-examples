package com.alamer.patterndemo.creational.prototype;

class ExtendedFtpConfig extends FtpConfig {

    String mode;

    public ExtendedFtpConfig() {
        super();
    }

    public ExtendedFtpConfig(ExtendedFtpConfig target) {
        super(target);
        if (target != null) {
            this.mode = target.mode;
        }
    }

    @Override
    public ExtendedFtpConfig clone() {
        return new ExtendedFtpConfig(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof ExtendedFtpConfig) || !super.equals(object2)) return false;
        ExtendedFtpConfig ftpconfig2 = (ExtendedFtpConfig) object2;
        return ftpconfig2.mode == this.mode;
    }
}
