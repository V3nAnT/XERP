/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.bussineslogic.inventory;

import javax.swing.JOptionPane;
import xerp.layers.entities.helpers.inventory.ProbabilisticoHelper;
import xerp.layers.entities.pojo.inventory.Probabilistico;

/**
 *
 * @author V3nAnT
 */
public class ProbabilisticoBL {

    ProbabilisticoHelper _helper;

    public ProbabilisticoBL(Probabilistico p) {
        _helper = new ProbabilisticoHelper(p);
    }
    //Retorna el número de desviaciones estándar Z

    public double GetZ(double x) {
        double result = 0;
        try {
            result = _helper.GetZ(x);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ha ocurrido un error al calcular el n° de desviaciones estandar.", 1);
        }
        return result;
    }
    //Retorna el ROP (Punto de reorden)

    public double GetROP() {
        double result = 0;
        try {
            result = _helper.GetROP();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ha ocurrido un error al calcular ROP.", 1);
        }
        return result;
    }
    //Retorna el costo anual por faltantes

    public double GetCAF() {
        double result = 0;
        try {
            result = _helper.GetCAF();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ha ocurrido un error al calcular costo anual por faltantes.", 1);
        }
        return result;
    }
    //Retorna el costo anual de mantener

    public double GetCAM() {
        double result = 0;
        try {
            result = _helper.GetCAM();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ha ocurrido un error al calcular costo anual de mantener.", 1);
        }
        return result;
    }
    //Retorna el costo total

    public double GetCT() {
        double result = 0;
        try {
            result = _helper.GetCT();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ha ocurrido un error al calcular costo total.", 1);
        }
        return result;
    }
}
