/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.presentation.main.fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author V3nAnT
 */
public class MainWindowController implements Initializable , ControlledScreen{
    @FXML
    private TitledPane x1;

    private XERPV01 application;
    private Stage stage;
    ScreensController myController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void pruebaClick(ActionEvent event) {
        myController.setScreen(XERPV01.tabla);
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        this.myController=screenPage;
    }
//    @Override
//         public void handle(ActionEvent t) {
//             if(nodes[0]==null){
//             try {
//                 FXMLLoader v=new FXMLLoader(getClass().getResource("/ABC/Analisis_ABC.fxml"));
//                      Parent root=(Parent)v.load();
//                      
//                      contenedor.getChildren().add((nodes[0]=root));
//             } catch (IOException ex) {
//                 Logger.getLogger(FrameControler.class.getName()).log(Level.SEVERE, null, ex);
//             }
//             }else{
//                 Analisis_ABCController.retornar();
//             }
//         } 
    
//    public static void remover(Node an){
//     contenedor.getChildren().remove(contenedor.getChildren().indexOf(an));
//     nodes[0]=null;
//     contenedor.setVisible(false);
//    }
}
