import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Creating Remote interface for our application 
public interface Hello extends Remote {  
   Bean printMsg() throws RemoteException;  
}