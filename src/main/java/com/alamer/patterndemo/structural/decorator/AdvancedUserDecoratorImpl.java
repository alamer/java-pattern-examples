package com.alamer.patterndemo.structural.decorator;

public class AdvancedUserDecoratorImpl implements AdvancedUserDecorator {

    UserAccount userAccount;

    public AdvancedUserDecoratorImpl(UserAccount userAccount) {
        this.userAccount = userAccount;
    }



    @Override
    public String getIp() {
        return "IP";
    }

    @Override
    public String getUsername() {
        return userAccount.getUsername();
    }

    @Override
    public String getPassword() {
        return userAccount.getPassword();
    }

    @Override
    public String getUserinfo() {
        return userAccount.getUserinfo() + " " + getIp();
    }
}
