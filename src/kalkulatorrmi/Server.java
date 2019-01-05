
package kalkulatorrmi;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
/**
 *
 * @author ferywi
 */
public class Server {
    public static void main(String[] args) throws RemoteException,NotBoundException{

        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1197);
            r.rebind("Calculator", new KalkulatorRmi());
            System.out.println("Server is Running");
        
    }
}
