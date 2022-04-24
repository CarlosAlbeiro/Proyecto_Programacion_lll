/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package co.edu.uniquindio.marketplace.controllers;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 31285
 */
public class Pantalla_CargaController implements Initializable {

    @FXML
    private StackPane RootPane;
 @Override
    public void initialize(URL url, ResourceBundle rb) {
        //seteo de la clase y arranque
        new SplashScreen().start();
    }   
    
    class SplashScreen extends  Thread{
    
        public void run(){
        
            try {
                
                Thread.sleep(5000);//Tiempo de la pantalla
                // metodo para correr el nuevo hilo o pantalla
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                      //Abril la nueva ventana
                        Parent root = null;
                        try {
                            root = FXMLLoader.load(getClass().getResource("/co/edu/uniquindio/marketplace/views/login.fxml"));
                        } catch (IOException ex) {
                            Logger.getLogger(Pantalla_CargaController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        // crear el escenario
                        Scene scene = new Scene(root);
                        Stage stage = new Stage();
                        stage.setScene(scene);
                        stage.show();
                        
                       

                        // oculta la ventana de carga 
                        RootPane.getScene().getWindow().hide();
                    }
                });
                
                
               
            } catch (InterruptedException ex) {
                Logger.getLogger(Pantalla_CargaController.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    
}
