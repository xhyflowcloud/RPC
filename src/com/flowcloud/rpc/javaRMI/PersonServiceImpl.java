package com.flowcloud.rpc.javaRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PersonServiceImpl extends UnicastRemoteObject implements PersonService{
    private static final long serialVersionUID = 1L;

    protected PersonServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public Person getPersonInfo(int id) throws RemoteException {
        System.out.println("get Person: " + id);
        Person person = new Person();
        person.setId(id);
        return person;
    }
}
