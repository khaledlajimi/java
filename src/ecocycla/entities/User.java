/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocycla.entities;

import java.sql.Date;

/**
 *
 * @author KHALED
 */
public class User {
    
    private int id;
    private String email ; 
    private String nom ; 
    private String prenom ; 
    private String password ; 
    private int cin ; 
    private String adresse ; 

   
    private Date datenaissance;
    private String roles ; 
    private String ville;
    private String region;
    private String photo;
    
    
    
    
     public User(String email, String nom, String prenom, String password, int cin, String adresse, Date datenaissance, String roles, String ville, String region, String photo) {
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.cin = cin;
        this.adresse = adresse;
        this.datenaissance = datenaissance;
        this.roles = roles;
        this.ville = ville;
        this.region = region;
        this.photo = photo;
    }

    public User(String email, String nom, String prenom, String password, int cin, String adresse, String roles) {
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.cin = cin;
        this.adresse = adresse;
        this.roles = roles;
    }

    public User() {
    }

    public User(int id, String email, String nom, String prenom, String password, int cin, String adresse, Date datenaissance, String roles, String ville, String region, String photo) {
        this.id = id;
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.cin = cin;
        this.adresse = adresse;
        this.datenaissance = datenaissance;
        this.roles = roles;
        this.ville = ville;
        this.region = region;
        this.photo = photo;
    }

    public User(int aInt, String string, String string0, String string1, int aInt0, String string2, int aInt1, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email + ", nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", cin=" + cin + ", adresse=" + adresse + ", datenaissance=" + datenaissance + ", roles=" + roles + ", ville=" + ville + ", region=" + region + ", photo=" + photo + '}';
    }
    
}
