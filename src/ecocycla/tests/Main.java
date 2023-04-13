/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocycla.tests;

import ecocycla.entities.User;
import ecocycla.services.UserCrud;
import ecocycla.utils.MyConnection;
import java.sql.Date;

/**
 *
 * @author KHALED
 */
public class Main {
     public static void main (String[] args )
    {
        MyConnection mc = MyConnection.getInstance(); 
        MyConnection mc2 = MyConnection.getInstance() ; 
        System.out.println(mc.hashCode()+"-"+mc2.hashCode());
        UserCrud pcd = new UserCrud () ;
        // User u2= new User("khaled@gmail.com", "kha", "led", "kk123", 1, "aaa", Date.valueOf("09-06-1999"), "user", "aaa", "bbb", "aqwxc");
       // pcd.ajouterUtilisateur2(u2);
        /// pcd.modifierUtilisateur(u2);
         //pcd.supprimerUtilisateur(u2);
         // User u3 = new User(65,"loul@gmail.com", "loulo", "edii",22222, "hjbbfb", 0, "hdfjhj") ; 

        //pcd.modifierUtilisateur(u3);


        System.out.println(pcd.afficherUtilisateurs());
        
    }
    
}
