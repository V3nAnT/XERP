/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.presentation.modules.fx;

import xerp.layers.presentation.util.EditingCellstring;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.ScaleTransition;
import javafx.animation.ScaleTransitionBuilder;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.MapValueFactory;
import javafx.util.Callback;
import javafx.util.Duration;
/**
 * FXML Controller class
 *
 * @author V3nAnT
 */
public class EjemTablaController implements Initializable {
    @FXML
    private TableColumn colString;
    @FXML
    private TableColumn colInteger;
    @FXML
    private TableColumn colDouble;
    @FXML
    private TableView tblMain;
    @FXML
    private Button btnBoton;
    
    ObservableList<Map> datos= FXCollections.observableArrayList();

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Callback<TableColumn<Map,String>,TableCell<Map,String>> cellFactoryString=new Callback<TableColumn<Map, String>, TableCell<Map, String>>() {

            @Override
            public TableCell<Map, String> call(TableColumn<Map, String> p) {
               return new EditingCellstring();
            }
        };
        colString.setCellFactory(cellFactoryString);
        colString.setCellValueFactory(new MapValueFactory(colString.getText()));
        colString.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Map,String>>() {

            @Override
            public void handle(TableColumn.CellEditEvent<Map, String> t) {
               t.getRowValue().put(t.getTableColumn().getText(), t.getNewValue());
            }
        });
        tblMain.setItems(datos);
        //colString.getCellData(indice);
    }    

    @FXML
    private void addRows(ActionEvent event) {
        //Obtenempos <tipo columna,valor columna>
//        Map<String,Object> algo = new HashMap<>();
//        algo.put(colString.getText(), " Un texto");
//        datos.add(algo);
        
        ScaleTransition st = ScaleTransitionBuilder.create()
                .node(tblMain)
                .fromX(1)
                .fromY(1).toX(0.2).toY(0.3).
                duration(Duration.millis(800))
                .interpolator(Interpolator.LINEAR)
                .cycleCount(Timeline.INDEFINITE).autoReverse(true).build();
        st.play();
    }
}
