/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocycla.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Khaled
 */
public class SignInController implements Initializable {

    @FXML
    private TextField fxemail;
    @FXML
    private TextField fxpassword;
    @FXML
    private Button btnconnexion;
    @FXML
    private Label fxreset;
    @FXML
    private Label fxinscrit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login(ActionEvent event) {
    }

    @FXML
    private void ResetPassword(MouseEvent event) {
    }

    @FXML
    private void Inscription(MouseEvent event) {
    }
    
}
