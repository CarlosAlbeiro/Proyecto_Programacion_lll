
package co.edu.uniquindio.marketplace.controllers;

import co.edu.uniquindio.marketplace.model.MarketPlace;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.input.KeyEvent;
import static javafx.scene.input.KeyCode.ENTER;



/**
 * FXML Controller class
 *
 * @author 31285
 */
public class LoginController implements Initializable {

    @FXML
    private Button btt_salir;
    @FXML
    private Button bbt_registro;
    @FXML
    private Button bbt_iniciarSesion;
    @FXML
    private PasswordField pass_contr;
    @FXML
    private TextField texf_usuario;
    MarketPlace market = new MarketPlace();
    private double x,y;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Salir(ActionEvent event) {
        
        System.exit(0);
    }

    @FXML
    private void HacerRegistro(ActionEvent event) {
        
         //iniciar la pantalla del lobbie
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/marketplace/views/registro.fxml"));
                
                Parent root = null;
        try {
            root = loader.load();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                //Controlador de la vista
                RegistroController controlador = loader.getController();//poner la clase del controlador 
                Scene scene = new Scene(root);
                Stage stage = new Stage ();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(scene);
                stage.show();
                //abre y cierra las diferentes ventanas
                stage.setOnCloseRequest(e -> controlador.closeWindows());
                Stage cerrarPantalla = (Stage) this.bbt_registro.getScene().getWindow();
                cerrarPantalla.close();
        
     }

    @FXML
    private void Iniciar_Sesion(ActionEvent event) {
        String clave = this.pass_contr.getText();
        String correo = this.texf_usuario.getText();
        if(pass_contr.getText().isEmpty()||texf_usuario.getText().isEmpty()){
             // la alerta de guardado
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Por favor diligencie todo los campos");
            alert.showAndWait();
        }else{
            boolean confi= market.loginVendedor(clave, correo);
            if(confi==true){
                 //iniciar la pantalla del lobbie
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFORMACION");
                alert.setContentText("Bienvenido");
                alert.showAndWait();
                
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/marketplace/views/inicioDeSeccion.fxml"));
                
                Parent root = null;
                try {
                    root = loader.load();
                } catch (IOException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
        
                //Controlador de la vista
                InicioDeSeccionController controladorr = loader.getController();//poner la clase del controlador 
                Scene scene = new Scene(root);
                Stage stage = new Stage ();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(scene);
                stage.show();
                //abre y cierra las diferentes ventanas
//                stage.setOnCloseRequest(e -> controladorr.closeWindows());
//                Stage cerrarPantalla = (Stage) this.bbt_iniciarSesion.getScene().getWindow();
//                cerrarPantalla.close();
                
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText("Los datos no coinciden");
                alert.showAndWait();
            }
        }
    }
//    @FXML
//    void iniciar_seccion(KeyEvent event) {
//    	KeyEvent keyEvent = null;
//    	LoginController login = new LoginController();
//		if(keyEvent.getCode() == ENTER) {
//            // some action here
//        
//			login.Iniciar_Sesion(null);
//		}
//
//    }Esta en prueba

    
    
}
