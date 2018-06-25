package com.flowcloud.rpc.javaRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Client {
    public static void main(String[] args) {
        try {
            PersonService personService = (PersonService) Naming.lookup("rmi://127.0.0.1:6600/PersonService");
            Person person = personService.getPersonInfo(5);
            System.out.println(person);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
