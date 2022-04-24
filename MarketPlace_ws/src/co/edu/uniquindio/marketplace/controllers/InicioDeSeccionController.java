
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
import javafx.scene.control.Tab;
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
    private Tab Inicio;
    @FXML
    private Tab Perfil;
    @FXML
    private Tab Mensaje;
    @FXML
    private Tab Sugeridos;
    
    PerfilController
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
    }    

    private void Salir(ActionEvent event) {
        
        //cerrar ventana
         Node source = (Node) event.getSource();
         Stage stage = (Stage) source.getScene().getWindow();
         stage.close();
        
    }

    private void Inicio(MouseEvent event) {
        cargarVentana("/co/edu/uniquindio/marketplace/views/Home");
        
    }

    private void Perfil(MouseEvent event) {
        cargarVentana("/co/edu/uniquindio/marketplace/views/Perfil");
    }

    private void Mensajes(MouseEvent event) {
        cargarVentana("/co/edu/uniquindio/marketplace/views/Mensajes");
    }

    private void Sugeridos(MouseEvent event) {
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
     public void closeWindows() {
       
         
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/marketplace/views/login.fxml"));
                
                Parent root = null;
        try {
            root = loader.load();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                //Controlador de la vista
                LoginController controlador = loader.getController();//poner la clase del controlador 
                Scene scene = new Scene(root);
                Stage stage = new Stage ();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(scene);
                stage.show();
              
                //Stage cerrarPantalla = (Stage) this.But_volver.getScene().getWindow();
                //cerrarPantalla.close();
    }
    
}
