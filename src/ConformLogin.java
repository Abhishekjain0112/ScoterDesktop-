
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek
 */
public class ConformLogin extends UnicastRemoteObject implements Securitylogin  {

    ConformLogin() throws RemoteException
    {
    
    }
    
    @Override
    public boolean checkLogin(String id, String password) throws RemoteException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(id.equals("abhi") && password.equals("abhi"))
       {
         return true;
       }
       else
           return false;
   
    //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
    
      
    
}
