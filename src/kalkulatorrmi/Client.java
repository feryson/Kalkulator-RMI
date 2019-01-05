package kalkulatorrmi;

import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import java.util.Scanner;

/**
 *
 * @author ferywi
 */
public class Client {
    public static void main(String[] args)throws NotBoundException,MalformedURLException,RemoteException{
        Scanner sc = new Scanner(System.in);
        
        try {
            KalkulatorInterface c = (KalkulatorInterface)Naming.lookup("rmi://localhost:1197/Calculator");
            System.out.println("Client terkoneksi dengan server");
            System.out.println("Silahkan pilih perintah yang akan anda pilih \n" 
                    +"1. Tambah\n"
                    +"2. Kurang\n"
                    +"3. Kali\n"
                    +"4. Bagi");
            System.out.println("\nMasukan pilihan : ");
            int choice = sc.nextInt();
        int x,y;
        switch (choice)
        {
            case 1:
            {
                System.out.println("masukan nilai pertama");
                x=sc.nextInt();
                System.out.println("masukan nilai ke kedua");
                y=sc.nextInt();
                System.out.println(c.add(x, y));
                break;
            }
            case 2:
            {
                System.out.println("masukan nilai pertama");
                x=sc.nextInt();
                System.out.println("masukan nilai ke kedua");
                y=sc.nextInt();
                System.out.println(c.sub(x, y));
                break;
            }
            case 3:
            {
                System.out.println("masukan nilai pertama");
                x=sc.nextInt();
                System.out.println("masukan nilai ke kedua");
                y=sc.nextInt();
                System.out.println(c.mul(x, y));
                break;
            }
            case 4:
            {
                System.out.println("masukan nilai pertama");
                x=sc.nextInt();
                System.out.println("masukan nilai ke kedua");
                y=sc.nextInt();
                System.out.println(c.add(x, y));
                break;
            }
            
        }
            
        } catch (Exception e) {
        }
        
    }
}
