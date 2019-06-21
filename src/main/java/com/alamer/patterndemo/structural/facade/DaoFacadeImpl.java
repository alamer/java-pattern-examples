package com.alamer.patterndemo.structural.facade;

public class DaoFacadeImpl implements DaoFacade {

    UserDAO userDAO;
    OrganizationDAO organizationDAO;

    public DaoFacadeImpl(UserDAO userDAO, OrganizationDAO organizationDAO) {
        this.userDAO = userDAO;
        this.organizationDAO = organizationDAO;
    }

    @Override
    public int countAllObjects() {
        return userDAO.countAllUsers()+organizationDAO.countAllOrgs();
    }
}
