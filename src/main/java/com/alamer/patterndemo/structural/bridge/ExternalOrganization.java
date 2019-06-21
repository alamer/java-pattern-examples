package com.alamer.patterndemo.structural.bridge;

public class ExternalOrganization extends Organization {

    public ExternalOrganization(User user) {
        super(user);
    }

    @Override
    public String organizationType() {
        return "External";
    }
}
