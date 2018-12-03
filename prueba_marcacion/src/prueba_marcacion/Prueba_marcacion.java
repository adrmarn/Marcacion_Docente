/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_marcacion;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author amarin
 */
public class Prueba_marcacion extends Application {
    
    private Stage stagePrincipal;
    private AnchorPane rootPane; 
    
    @Override
    public void start(Stage stagePrincipal) throws Exception {
        this.stagePrincipal = stagePrincipal;
        mostrarPantalla_0();
        
    }
    
    /*
     * cargamos la ventana principal
     */
    public void mostrarVentanaPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader(Prueba_marcacion.class.getResource("Pantalla_0.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Ventana Principal");
            stagePrincipal.setScene(scene);
            Pantalla_0Controller controller = loader.getController();
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();
        } catch (IOException e) {
            //tratar la excepción.
        }
   }

 
    public void mostrarVentanaSecundaria() {
        try {
            FXMLLoader loader = new FXMLLoader(Prueba_marcacion.class.getResource("Pantalla_1.fxml"));
            AnchorPane ventanaDos = (AnchorPane) loader.load();
            Stage ventana = new Stage();
            ventana.setTitle("Venta Dos");
            ventana.initOwner(stagePrincipal);
            Scene scene = new Scene(ventanaDos);
            ventana.setScene(scene);
            Pantalla_0Controller controller = loader.getController();
            controller.setStagePrincipal(ventana);
            ventana.show();
 
        } catch (IOException e) {
            //tratar la excepción
        }
    }

    private void mostrarPantalla_0() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
