/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.presentation.main;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author V3nAnT
 */
public class XERPV01 extends Application {
    
    public static String mainScreenId = "main";
    public static String mainScreen = "MainWindow.fxml";
    public static String inventoryScreenId = "inventory";
    public static String inventoryScreen = "/xerp/layers/presentation/modules/Inventory.fxml";
    
    
    @Override
    public void start(Stage primaryStage) {
        
        ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(XERPV01.mainScreenId, XERPV01.mainScreen);
        mainContainer.loadScreen(XERPV01.inventoryScreenId, XERPV01.inventoryScreen);
        
        mainContainer.setScreen(XERPV01.mainScreenId);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
