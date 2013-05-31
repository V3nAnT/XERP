/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.presentation.modules.fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import xerp.layers.presentation.main.fx.ControlledScreen;
import xerp.layers.presentation.main.fx.ScreensController;
import xerp.layers.presentation.main.fx.XERPV01;

/**
 * FXML Controller class
 *
 * @author V3nAnT
 */
public class InventoryController implements Initializable, ControlledScreen{

    /**
     * Initializes the controller class.
     */
    ScreensController myController;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }
    
     @FXML
    private void goMain(ActionEvent event){
       myController.setScreen(XERPV01.mainScreenId);
    }

    @FXML
    private void openMrp(ActionEvent event) {
        myController.setScreen(XERPV01.mrpScreenId);
    }

    @FXML
    private void chBxHEOQChecked(ActionEvent event) {
       
    }

}
