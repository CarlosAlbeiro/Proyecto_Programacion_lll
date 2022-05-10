package co.edu.uniquindio.marketplace;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Carlos Galeano
 * @author Ruben Garrido
 */
public class Marketplace extends Application {
      
  
    @Override
    public void start(Stage stage) throws Exception {
        // abrir la vista pantalla de carga 
        Parent root = FXMLLoader.load(getClass().getResource("/co/edu/uniquindio/marketplace/views/pantalla_Carga.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}