/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocycla.services;

import ecocycla.entities.User;
import ecocycla.utils.MyConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KHALED
 */
public class UserCrud { Connection cnx2;
    List<User> mylist= new ArrayList<>();

    public UserCrud() {
        cnx2 = MyConnection.getInstance().getCnx(); 
                
    }
     public void supprimerUtilisateur(User user) {
        try {
            String requete="delete from user where id=?";
            PreparedStatement pst = cnx2.prepareStatement(requete);
            pst.setInt(1,user.getId());
            pst.executeUpdate();
           
            System.out.println("Utlisateur est supprimée");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
    }}
    
    public void ajouterUtilisateur ()//insertion des objets d'une maniere statique 
    {
        try {
            //creation requette 
        String requete="INSERT INTO User (email , roles, password , nom , prenom, photo , datenaissance, cin, region, ville, adresse)"+" VALUES ('khaled@gmail.com','user','kk123','kha','led','09/06/1999','12345678','aaa','bbb','ccc') " ; 
    //ramener la requette 
        Statement st=  cnx2.createStatement() ; //j'ai obtenu l'objet connexion par cerre ligne 
        st.executeUpdate(requete) ; //change la base de donnes 
            System.out.println("Utilisateur ajouté avec succes ");
        }
        catch (SQLException ex )
        {
            System.err.println(ex.getMessage());
        }
        
    }
    
  
    public void ajouterUtilisateur2(User u ) //ajout dynamiqque 
    {
        try //ajout dynamiqque
        {
            String requete2="INSERT INTO user (`email` , `roles`, `password` , `nom` , `prenom`, `photo` , `datenaissance`, `cin`,`region`,` ville`, `adresse`)"+" VALUES (?,?,?,?,?,?,?,?,?,?,?) " ;
            PreparedStatement  pst= cnx2.prepareStatement(requete2) ; //objet dedie pour les objet dynamique //statement est long  //PreparedStatemt : envoie une requête sans
                                                                       //paramètres à la base de données
            
            pst.setString(1,u.getEmail());
            pst.setString(2, u.getRoles());
            pst.setString(3, u.getPassword());
            pst.setString(4,u.getNom()); 
            pst.setString(5,u.getPrenom());
            pst.setString(6,u.getPhoto());
            pst.setDate(7,u.getDatenaissance());
            pst.setInt(8,u.getCin());
            pst.setString(9,u.getRegion()); 
            pst.setString(10,u.getVille()); 
            pst.setString(11,u.getAdresse()); 
           
           
      
            pst.executeUpdate(); 
            System.out.println("Votre utilisateur est ajouté ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
    }
    public List<User> afficherUtilisateurs()
    {
        
            List<User> mylist= new ArrayList<>();

        try {
            String requete3="SELECT * FROM user" ;
            Statement st = cnx2.createStatement(); //L'interface Statement possède les méthodes
                                                     //nécessaires pour réaliser les requêtes sur la base
            ResultSet rs = st.executeQuery(requete3);
            while (rs.next())
            {
                User u = new User(); 
                u.setId(rs.getInt("id"));
                u.setEmail(rs.getString("email"));
                u.setNom(rs.getString("nom"));
                u.setPrenom(rs.getString("prenom")); 
                u.setPassword(rs.getString("password"));
                u.setCin(rs.getInt("cin"));
                u.setDatenaissance(rs.getDate("datenaissance"));
                u.setRoles(rs.getString("roles"));
                u.setAdresse(rs.getString("adresse"));
                u.setVille(rs.getString("ville"));
                u.setRegion(rs.getString("region"));
                u.setPhoto(rs.getString("photo"));
                 mylist.add(u);     
                
            }
            
           
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return mylist ;  
        
    }
   

   
     
   
      public void SupprimerUtilisateurid(int id) {
			try
    { 
        Statement st= cnx2.createStatement() ; //j'ai obtenu l'objet connexion par cerre ligne 
      String req = "DELETE FROM user WHERE id = "+id+"";
                st.executeUpdate(req);      
      System.out.println("L'utilisateur  avec l'id = "+id+" a été supprimer avec succès...");
    } catch (SQLException ex) {
                System.out.println(ex.getMessage());        
              }
    }
    
      
      
   public void modifierUtilisateur(User u) {
        try {
            String requete5="UPDATE  user SET  email=?,roles=?,password=?,nom=?,prenom=?,phote=?,datenaissance=?,cin=?,region=?,ville=?,adresse=? WHERE id=? ; ";
            PreparedStatement  pst= cnx2.prepareStatement(requete5) ; //objet dedie pour les objet dynamique //statement est long 
               pst.setString(1,u.getEmail());
            pst.setString(2, u.getRoles());
            pst.setString(3, u.getPassword());
            pst.setString(4,u.getNom()); 
            pst.setString(5,u.getPrenom());
            pst.setString(6,u.getPhoto());
            pst.setDate(7,u.getDatenaissance());
            pst.setInt(8,u.getCin());
            pst.setString(9,u.getRegion()); 
            pst.setString(10,u.getVille()); 
            pst.setString(11,u.getAdresse()); 
           
           
            pst.setInt(12,u.getId());
            pst.executeUpdate();
           
            System.out.println("Utlisateur est modifié");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
    }}
    
    
}
