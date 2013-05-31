/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.bussineslogic.inventory;

import java.util.List;
import javax.swing.JOptionPane;
import xerp.layers.entities.helpers.inventory.ABCHelper;
import xerp.layers.entities.pojo.inventory.ABC;

/**
 *
 * @author V3nAnT
 */
public class ABCBL {

    ABCHelper _helper;

    public ABCBL(ABC abc) {
        _helper = new ABCHelper(abc);
    }
    //Retorna la lista ABC
    public List<ABC> GetListAbc() {
        List<ABC> result = null;
        try {
            result = _helper.GetListAbc();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ha ocurrido un error al obtener tabla ABC.", 1);
        }        
        return result;
    }
}
