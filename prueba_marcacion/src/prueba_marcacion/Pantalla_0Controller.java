/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_marcacion;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author amarin
 */
public class Pantalla_0Controller implements Initializable {

    @FXML
    private Button boton_md;
    @FXML
    private Button boton_rau;
    @FXML
    private Button boton_tr;
    @FXML
    private Button boton_ras;
    
    private Prueba_marcacion ProgramaPrincipal;

    /**
     * Initializes the controller class.
     * @throws java.io.IOException
     */
    @FXML
    public void boton_md() throws IOException {
      
    }  
    
    private void boton_md(ActionEvent event) {
        //llamado desde el botón que existe en la vista.
        ProgramaPrincipal.mostrarVentanaSecundaria();
    }
    
    public void setProgramaPrincipal(Prueba_marcacion ProgramaPrincipal) {
        this.ProgramaPrincipal = ProgramaPrincipal;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setStagePrincipal(Stage ventana) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
