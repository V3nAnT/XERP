/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.bussineslogic.inventory;

import javax.swing.JOptionPane;
import xerp.layers.entities.helpers.inventory.DescuentoCantidadHelper;
import xerp.layers.entities.pojo.inventory.DescuentoCantidad;

/**
 *
 * @author V3nAnT
 */
public class DescuentoCantidadBL {

    DescuentoCantidadHelper _helper;

    public DescuentoCantidadBL(DescuentoCantidad dc) {
        _helper = new DescuentoCantidadHelper(dc);
    }
    //Retorna el Costo Total 

    public double GetCT() {
        double result = 0;
        try {
            result = _helper.GetCT();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ha ocurrido un error al calcular costo total.", 1);
        }
        return result;
    }

    //Retorna Q óptimo
    public double GetQ() {
        double result = 0;
        try {
            result = _helper.GetQ();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ha ocurrido un error al calcular Q óptimo.", 1);
        }
        return result;
    }

    //Retorna el costo total extendido
    public double GetCTExt() {
        double result = 0;
        try {
            result = _helper.GetCTExt();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ha ocurrido un error al calcular costo total.", 1);
        }
        return result;
    }
}
