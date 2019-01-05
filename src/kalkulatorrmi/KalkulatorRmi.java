
package kalkulatorrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ferywi
 */
public class KalkulatorRmi extends UnicastRemoteObject implements KalkulatorInterface{
    public KalkulatorRmi() throws RemoteException 
    {
        int a,b;
    }
    public int add(int a , int b)throws RemoteException
    {
        return a+b;
    }
    public int sub(int a , int b)throws RemoteException
    {
        return a-b;
    }
    public int mul(int a , int b)throws RemoteException
    { 
        return a*b;
    }
    public int div(int a , int b)throws RemoteException
    {
        return a/b;
    }
}
