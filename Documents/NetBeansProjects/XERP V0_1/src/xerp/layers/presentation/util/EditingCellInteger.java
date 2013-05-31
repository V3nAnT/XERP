/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.presentation.util;

import java.util.Map;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.TableCell;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author joram
 */
public class EditingCellInteger extends TableCell<Map,Integer> {

    private TextField textField;
    public EditingCellInteger() {
    
    }
     @Override
        public void startEdit() {
            if (!isEmpty()) {
                super.startEdit();
                createTextField();
                setText(null);
                setGraphic(textField);
                textField.selectAll();
            }
        }
 
        @Override
        public void cancelEdit() {
            super.cancelEdit();
 
            setText(""+getItem());
            setGraphic(null);
        }
 
        @Override
        public void updateItem(Integer item, boolean empty) {
            super.updateItem(item, empty);
 
            if (empty) {
                setText(null);
                setGraphic(null);
            } else {
                if (isEditing()) {
                    if (textField != null) {
                        textField.setText(getString());
                    }
                    setText(null);
                    setGraphic(textField);
                } else {
                    setText(getString());
                    setGraphic(null);
                }
            }
        }
 
        private void createTextField() {
            textField = new TextField(getString());
            textField.setMinWidth(this.getWidth() - this.getGraphicTextGap()* 2);
            textField.setEffect(new DropShadow());
            textField.setOnKeyPressed(new EventHandler<KeyEvent>() {
              
                @Override
                public void handle(KeyEvent t) {
                    
                   if(t.getCode()==KeyCode.ENTER)
                   {
                       try {
                          commitEdit(Integer.parseInt(textField.getText()));  
                       } catch (Exception e) {
                       
                   commitEdit(0);
                       }
                   }
                }
            });
            textField.focusedProperty().addListener(new ChangeListener<Boolean>(){
                  

                @Override
                public void changed(ObservableValue<? extends Boolean> ov, Boolean t, Boolean t1) {
                  
                        if (!t1) {
                            try {
                          commitEdit(Integer.parseInt(textField.getText()));  
                       } catch (Exception e) {
                       
                   commitEdit(0);
                       }
                        }
                
                }
            });
        }
 
        private String getString() {
            return getItem() == null ? "" : getItem().toString();
        }
    
}
