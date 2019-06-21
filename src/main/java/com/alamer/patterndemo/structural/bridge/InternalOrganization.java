package com.alamer.patterndemo.structural.bridge;

public class InternalOrganization extends Organization {
    public InternalOrganization(User user) {
        super(user);
    }

    @Override
    public String organizationType() {
        return "Internal";
    }
}
