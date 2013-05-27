/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.presentation.main;

import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
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
        myController.setScreen(XERPV01.inventoryScreenId);
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        this.myController=screenPage;
    }
}
