/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.bussineslogic.inventory;

import javax.swing.JOptionPane;
import xerp.layers.entities.helpers.inventory.EOQHelper;
import xerp.layers.entities.pojo.inventory.EOQ;

/**
 *
 * @author V3nAnT
 */
public class EOQBL {
    EOQHelper _helper;
    public EOQBL(EOQ eoq) {
        _helper = new EOQHelper(eoq);
    }
     //Retorna Q óptimo con respecto a costo de mantenimiento H
    public double GetQH() {
        double result = 0;
        try {
             result = _helper.GetQH();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ha ocurrido un error al calcular Q óptimo.", 1);
        }
        return result;
    }
    //Retorna Q óptimo con respecto a la tasa de mantenimiento y costo de producto

    public double GetQIC() {
        double result = 0;
        try {
             result = _helper.GetQIC();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Ha ocurrido un error al calcular Q óptimo.",1);
        }
        return result;
    }
    //Retorna el número esperado de órdenes

    public int GetNEO() {
        double result = 0;
       try {
             result = _helper.GetNEO();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Ha ocurrido un error al calcular Numero esperado de órdenes.",1);
        }
        return (int)result;
    }
    //Retorna el tiempo esperado por órdenes

    public double GetTEO() {
        double result = 0;
        try {
             result = _helper.GetTEO();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Ha ocurrido un error al calcular Tiempo esperado por órdenes.",1);
        }
        return result;
    }
    //Retorna el costo total anual

    public double GetTC() {
        double result = 0;
        try {
             result = _helper.GetTC();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Ha ocurrido un error al calcular Costo total anual.",1);
        }
        return result;
    }
    //Retorna la demanda por día

    public double GetDemandaDiaria() {
        double result = 0;
       try {
             result = _helper.GetDemandaDiaria();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Ha ocurrido un error al calcular Demanda diaria.",1);
        }
        return result;
    }
    //Retorna los puntos de reorden

    public double GetROP() {
        double result = 0;
       try {
             result = _helper.GetROP();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Ha ocurrido un error al calcular ROP.",1);
        }
        return result;
    }
}
