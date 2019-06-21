package com.alamer.patterndemo.structural.bridge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BridgeTest {

    @Test
    public void organizationType() {
        User u1=new TestUserImpl();
        Organization intOrgWithTestUser=new InternalOrganization(u1);
        assertEquals(intOrgWithTestUser.organizationType(),"Internal");
        assertEquals(intOrgWithTestUser.user.userType(),"Test user");


    }
}