/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocycla.gui;

import ecocycla.entities.User;
import ecocycla.services.UserCrud;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author KHALED
 */


  public class AjoutController implements Initializable {

    @FXML
    private TextField fxprenom;
    @FXML
    private TextField fxnom;
    @FXML
    private TextField fxemail;
    @FXML
    private TextField fxcin;
    @FXML
    private TextField fxnum;
    @FXML
    private TextField fxadresse;
    @FXML
    private TextField fxroles;
    @FXML
    private Button btnaj;
    @FXML
    private PasswordField fxpassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouter(ActionEvent event) {
        
           if (fxnom.getText().isEmpty() || fxprenom.getText().isEmpty()||fxemail.getText().isEmpty() || fxcin.getText().isEmpty()|| fxnum.getText().isEmpty() || fxadresse.getText().isEmpty()||fxroles.getText().isEmpty() ) {
            Alert a = new Alert(Alert.AlertType.ERROR, "Champs invalides ! ", ButtonType.OK);
            a.showAndWait();
           
        } else if (fxpassword.getText().length()<8)
        {
             Alert a = new Alert(Alert.AlertType.ERROR, "Mot de passe doit etre >8 caractéres !)", ButtonType.OK);
              a.showAndWait();
        }
          else {
             
                  UserCrud us = new UserCrud();
                  User p = new User(fxemail.getText(), fxnom.getText(), fxprenom.getText(), fxpassword.getText(), 0, fxadresse.getText(), fxroles.getText());
                  Alert a = new Alert(Alert.AlertType.INFORMATION, "Utilisateur ajouté(e) avec succes !", ButtonType.OK);
                  a.showAndWait();
                  
                 
        }
    }

    @FXML
    private void close(MouseEvent event) {
         Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }


    }
   
   
