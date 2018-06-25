package com.flowcloud.rpc.javaRMI;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            PersonService personService = new PersonServiceImpl();
            LocateRegistry.createRegistry(6600);
            Context namingContext = new InitialContext();
            namingContext.rebind("rmi://127.0.0.1:6600/PersonService", personService);
            System.out.println("Service Started!");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
