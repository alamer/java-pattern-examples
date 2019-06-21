package com.alamer.patterndemo.structural.decorator;

public class UserAccountImpl implements UserAccount {
    private String username;
    private String password;

    public UserAccountImpl(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUserinfo() {
        return username+" "+password;
    }


    public void setPassword(String password) {
        this.password = password;
    }
}
