package com.flowcloud.rpc.javaRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PersonService extends Remote {
    public Person getPersonInfo(int id) throws RemoteException;
}
