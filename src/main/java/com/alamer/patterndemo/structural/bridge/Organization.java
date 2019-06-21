package com.alamer.patterndemo.structural.bridge;

public abstract class Organization {

    User user;

    public Organization(User user) {
        this.user = user;
    }

    abstract String organizationType();
}
