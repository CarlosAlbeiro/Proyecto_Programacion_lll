
package co.edu.uniquindio.marketplace.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 31285
 */
public class InicioDeSeccionController implements Initializable {

    @FXML
    private BorderPane BorderPane;
    @FXML
    private Button Butt_Salir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
    }    

    @FXML
    private void Salir(ActionEvent event) {
        
        //cerrar ventana
         Node source = (Node) event.getSource();
         Stage stage = (Stage) source.getScene().getWindow();
         stage.close();
        
    }

    @FXML
    private void Home(MouseEvent event) {
        cargarVentana("/co/edu/uniquindio/marketplace/views/Home");
        
    }

    @FXML
    private void Perfil(MouseEvent event) {
        cargarVentana("/co/edu/uniquindio/marketplace/views/Perfil");
    }

    @FXML
    private void Mensajes(MouseEvent event) {
        cargarVentana("/co/edu/uniquindio/marketplace/views/Mensajes");
    }

    @FXML
    private void Ajustes(MouseEvent event) {
        cargarVentana("/co/edu/uniquindio/marketplace/views/Ajustes");
        
    }
    
    //metodo que me permite reutilizar las mismas lineas de codigo en diferentes sitios
    // lo que me permite ahorra lineas de codigo
    //captura en una variable la ruta de la ventana
     private void cargarVentana(String Ven){
    
        Parent root = null;
        try {
           root = FXMLLoader.load(getClass().getResource(Ven+".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(InicioDeSeccionController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BorderPane.setCenter(root);
    
    }
    
}
