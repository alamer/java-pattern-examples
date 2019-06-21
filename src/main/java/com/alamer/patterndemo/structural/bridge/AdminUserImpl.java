package com.alamer.patterndemo.structural.bridge;

public class AdminUserImpl implements User {
    @Override
    public String userType() {
        return "admin";
    }
}
