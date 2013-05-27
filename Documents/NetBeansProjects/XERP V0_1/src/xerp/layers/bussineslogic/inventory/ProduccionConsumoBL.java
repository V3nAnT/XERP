/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.bussineslogic.inventory;

import javax.swing.JOptionPane;
import xerp.layers.entities.helpers.inventory.ProduccionConsumoHelper;
import xerp.layers.entities.pojo.inventory.ProduccionConsumo;

/**
 *
 * @author V3nAnT
 */
public class ProduccionConsumoBL {

    ProduccionConsumoHelper _helper;

    public ProduccionConsumoBL(ProduccionConsumo pc) {
        _helper = new ProduccionConsumoHelper(pc);
    }
    //Retorna el costo anual de mantener inventario

    public double GetCAMI() {
        double result = 0;
        try {
            result = _helper.GetCAMI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ha ocurrido un error al calcular costo anual de mantener inventario.", 1);
        }
        return result;
    }

    //Retorna el nivel de inventario máximo
    public double GetNIM() {
        double result = 0;
        try {
            result = _helper.GetNIM();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ha ocurrido un error al calcular nivel de inventario máximo.", 1);
        }
        return result;
    }

    //Retorna el nivel de inventario promedio
    public double GetNIP() {
        double result = 0;
        try {
            result = _helper.GetNIP();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ha ocurrido un error al calcular nivel de inventario promedio.", 1);
        }
        return result;
    }

    //Retorna la cantidad óptima
    public double GetQ() {
        double result = 0;
        try {
            result = _helper.GetQ();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ha ocurrido un error al calcular Q óptima.", 1);
        }
        return result;
    }
}
