package co.edu.uniquindio.marketplace.controllers;

import co.edu.uniquindio.marketplace.model.MarketPlace;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ruben Garrido
 */
public class RegistroController implements Initializable {

	@FXML
	private TextField Tex_cedula;
	@FXML
	private TextField Tex_nombre;
	@FXML
	private Label Tex_Nombre;
	@FXML
	private TextField Tex_apellidos;
	@FXML
	private TextField Tex_correo;
	@FXML
	private TextField Tex_telefono;
	@FXML
	private TextField Tex_contrase;
	@FXML
	private TextField Tex_confirmarContra;
	@FXML
	private Button But_volver;
	@FXML
	private Button But_regis;

	SingletonMarket singleton;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

	@FXML
	private void eventoVolver(ActionEvent event) {

		// -------------metodo me permite dejar una solo ventana abierta a la hora de
		// ejecutar el programa---------------

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/marketplace/views/login.fxml"));

		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException ex) {
			Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
		}

		// Controlador de la vista
		LoginController controlador = loader.getController();// poner la clase del controlador
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setScene(scene);
		stage.show();
		// abre y cierra las diferentes ventanas

		Stage cerrarPantalla = (Stage) this.But_volver.getScene().getWindow();
		cerrarPantalla.close();
	}

	@FXML
	private void eventoRegistrar(ActionEvent event) {

		// capturar datos
		String nombre = this.Tex_nombre.getText();
		String apellido = this.Tex_apellidos.getText();
		String telefono = this.Tex_telefono.getText();
		String cedula = this.Tex_cedula.getText();
		String correo = this.Tex_correo.getText();
		String clave = this.Tex_contrase.getText();
		String confirClave = this.Tex_confirmarContra.getText();
		String msj;

		singleton = singleton.getInstance();
		if (clave.contentEquals(confirClave)) {
			try {
				singleton.registrarVendedores(nombre, apellido, telefono, cedula, correo, clave);
				msj = "Registro correcto";
				mostrarAlertInfo(msj);
				// Abrir pantalla de in inicio
				FXMLLoader loader = new FXMLLoader(
						getClass().getResource("/co/edu/uniquindio/marketplace/views/login.fxml"));
				Parent root = null;
				try {
					root = loader.load();
				} catch (IOException ex) {
					Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
				}
				// Controlador de la vista
				LoginController controlador = loader.getController();// poner la clase del controlador
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.setScene(scene);
				stage.show();
//				// abre y cierra las diferentes ventanas
//				stage.setOnCloseRequest(e -> controlador.closeWindows());
//				Stage cerrarPantalla = (Stage) this.But_regis.getScene().getWindow();
//				cerrarPantalla.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				msj = "El sistema se esta actualizando";
				mostrarAlertError(msj);
				// JOptionPane.showMessageDialog(null, "El sistema se esta actualizando");
			}
		} else {
			msj = "Claves incorrectas";
			mostrarAlertError(msj);

		}

	}

	/**
	 * Este metodo permite abrir y cerras las ventanas. Para que solo aparezca una
	 * ventana en pantalla
	 */
	public void closeWindows() {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/marketplace/views/login.fxml"));

		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException ex) {
			Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
		}

		// Controlador de la vista
		LoginController controlador = loader.getController();// poner la clase del controlador
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setScene(scene);
		stage.show();

		// Stage cerrarPantalla = (Stage) this.But_volver.getScene().getWindow();
		// cerrarPantalla.close();
	}

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
