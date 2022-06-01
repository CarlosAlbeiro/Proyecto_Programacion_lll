
package co.edu.uniquindio.marketplace.controllers;

import co.edu.uniquindio.marketplace.exceptions.VendodoresException;
import co.edu.uniquindio.marketplace.model.MarketPlace;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 31285
 */
public class LoginController implements Initializable {

	private static final KeyCode ENTER = null;
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

	SingletonMarket singleton = new SingletonMarket();

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

		// iniciar la pantalla del lobbie
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("/co/edu/uniquindio/marketplace/views/registro.fxml"));

		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException ex) {
			Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
		}

		// Controlador de la vista
		RegistroController controlador = loader.getController();// poner la clase del controlador
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setScene(scene);
		stage.show();
		// abre y cierra las diferentes ventanas
		stage.setOnCloseRequest(e -> controlador.closeWindows());
		Stage cerrarPantalla = (Stage) this.bbt_registro.getScene().getWindow();
		cerrarPantalla.close();

	}

	@FXML
	private void Iniciar_Sesion(ActionEvent event) {
		String clave = this.pass_contr.getText();
		String correo = this.texf_usuario.getText();
		String msj;

		if (clave.equals(" ") || correo.equals(" ")) {
			msj = "Porfavor diligencie todo los campos";
			mostrarAlertError(msj);
		} else {
			try {
				if (singleton.validarUsuario(correo, clave)) {// ya sirve, falta cuadrar la excepcion
					msj = "Ingreso exitoso";
					mostrarAlertInfo(msj);

					// Abrir pantalla de in inicio
					FXMLLoader loader = new FXMLLoader(
							getClass().getResource("/co/edu/uniquindio/marketplace/views/inicioDeseccion.fxml"));
					Parent root = null;
					try {
						root = loader.load();
					} catch (IOException ex) {
						Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
					}
					// Controlador de la vista
					RegistroController controlador = loader.getController();// poner la clase del controlador
					Scene scene = new Scene(root);
					Stage stage = new Stage();
					stage.initModality(Modality.APPLICATION_MODAL);
					stage.setScene(scene);
					stage.show();
					// abre y cierra las diferentes ventanas
					stage.setOnCloseRequest(e -> controlador.closeWindows());
					Stage cerrarPantalla = (Stage) this.bbt_iniciarSesion.getScene().getWindow();
					cerrarPantalla.close();
				} else {
					msj = "no esta entrando";
					mostrarAlertError(msj);
				}
			} catch (IOException | VendodoresException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@FXML
	void iniciar_seccion(KeyEvent event) {
		KeyEvent keyEvent = null;
		LoginController login = new LoginController();
		if (keyEvent.getCode() == ENTER) {
			// some action here

			login.Iniciar_Sesion(null);
		}

	}// Esta en prueba

	// __________________________ALertas para
	// mensajes____________________________________________

	@FXML
	private void mostrarAlertError(String msj) {
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setHeaderText(null);
		alert.setTitle("Error");
		alert.setContentText(msj);
		alert.showAndWait();
	}

	@FXML
	private void mostrarAlertInfo(String msj) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setTitle("Info");
		alert.setContentText(msj);
		alert.showAndWait();
	}

	@FXML
	private void mostrarAlertWarning() {
		Alert alert = new Alert(Alert.AlertType.WARNING);
		alert.setHeaderText(null);
		alert.setTitle("Info");
		alert.setContentText("Campos vacios");
		alert.showAndWait();
	}

}
