package com.alamer.patterndemo.structural.facade;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FacadeTest {

    @Test
    public void countAllObjects() {
        UserDAO userDAO=new UserDAOImpl();
        OrganizationDAO organizationDAO=new OrganizationDAOImpl();
        DaoFacade facade=new DaoFacadeImpl(userDAO, organizationDAO);
        assertEquals(facade.countAllObjects(),userDAO.countAllUsers()+organizationDAO.countAllOrgs());
    }
}