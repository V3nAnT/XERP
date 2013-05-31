/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.presentation.main.fx;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    public static String mrpScreenId = "mrp";
    public static String mrpScreen = "/xerp/layers/presentation/modules/MRP.fxml";
    public static String tablaId = "tabla";
    public static String tabla = "/xerp/layers/presentation/modules/EjemTabla.fxml";
    
    
    @Override
    public void start(Stage primaryStage) {
        try {
            //        ScreensController mainContainer = new ScreensController();
            //        mainContainer.loadScreen(XERPV01.mainScreenId, XERPV01.mainScreen);
            //        mainContainer.loadScreen(XERPV01.inventoryScreenId, XERPV01.inventoryScreen);
            //        mainContainer.loadScreen(XERPV01.mrpScreenId, XERPV01.mrpScreen);
            //        mainContainer.loadScreen(XERPV01.tablaId, XERPV01.tabla);
            //        
            //        mainContainer.setScreen(XERPV01.mainScreenId);
            //        
            //        Group root = new Group();
            //        root.getChildren().addAll(mainContainer);
            //        Scene scene = new Scene(root);
            //        primaryStage.setScene(scene);
            //        primaryStage.show();
               Parent root = FXMLLoader.load(getClass().getResource("/xerp/layers/presentation/modules/EjemTabla.fxml"));
                    
                    Scene scene = new Scene(root);
                    
                    primaryStage.setScene(scene);
                    primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(XERPV01.class.getName()).log(Level.SEVERE, null, ex);
        }
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
