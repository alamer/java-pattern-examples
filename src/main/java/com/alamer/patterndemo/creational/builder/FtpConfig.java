package com.alamer.patterndemo.creational.builder;

class FtpConfig {

    private String username;
    private String password;
    private String url;
    private int port;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    public int getPort() {
        return port;
    }

    public FtpConfig(FtpConfigBuilder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.url = builder.url;
        this.port = builder.port;
    }

    public static class FtpConfigBuilder {
        private String username;
        private String password;
        private String url;
        private int port;

       public FtpConfigBuilder username(String username) {
            this.username = username;
            return this;
        }

        public FtpConfigBuilder password(String password) {
            this.password = password;
            return this;
        }

        public FtpConfigBuilder url(String url) {
            this.url = url;
            return this;
        }

        public FtpConfigBuilder port(int port) {
            this.port = port;
            return this;
        }

        public FtpConfig build() {
            FtpConfig config = new FtpConfig(this);
            return config;
        }
    }
}
