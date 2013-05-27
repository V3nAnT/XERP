/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.entities.helpers.inventory;

import xerp.layers.entities.pojo.inventory.DescuentoCantidad;

/**
 *
 * @author V3nAnT
 */
public class DescuentoCantidadHelper {

    DescuentoCantidad _dc;

    public DescuentoCantidadHelper(DescuentoCantidad dc) {
        this._dc = dc;
    }

    //Retorna el Costo Total 
    public double GetCT() {
        double result = 0;
        result = _dc.getCp() + _dc.getCm() + _dc.getCpr();
        return result;
    }

    //Retorna Q óptimo
    public double GetQ() {
        double result = 0;
        if (_dc.getI() != 0 && _dc.getC() != 0) {
            result = Math.sqrt((2 * _dc.getD() * _dc.getS()) / (_dc.getI() * _dc.getC()));
        }
        _dc.setQ(result);
        return result;
    }

    //Retorna el costo total extendido
    public double GetCTExt() {
        double result = 0;
        result = (_dc.getD() * _dc.getC()) + ((_dc.getQ() * _dc.getH()) / 2) + ((_dc.getD() * _dc.getS()) / _dc.getQ());
        return result;
    }
}
