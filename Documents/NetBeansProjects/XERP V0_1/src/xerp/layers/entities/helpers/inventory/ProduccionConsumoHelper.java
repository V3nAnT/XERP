/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.entities.helpers.inventory;

import xerp.layers.entities.pojo.inventory.ProduccionConsumo;

/**
 *
 * @author V3nAnT
 */
public class ProduccionConsumoHelper {

    ProduccionConsumo _pc;

    public ProduccionConsumoHelper(ProduccionConsumo pc) {
        this._pc = pc;
    }

    //Retorna el costo anual de mantener inventario
    public double GetCAMI() {
        double result = 0;
        result = _pc.getNIP() * _pc.getCMUA();
        return result;
    }

    //Retorna el nivel de inventario máximo
    public double GetNIM() {
        double result = 0;
        result = _pc.getPt() - _pc.getDt();
        return result;
    }

    //Retorna el nivel de inventario promedio
    public double GetNIP() {
        double result = 0;
        result = _pc.getNIM() / 2;
        return result;
    }

    //Retorna la cantidad óptima
    public double GetQ() {
        double result = 0;
        if (_pc.getH() != 0 && (_pc.getP() - _pc.getDConsumo()) != 0 && (_pc.getP() - _pc.getDConsumo()) != 0) {
            result = Math.sqrt(((2 * _pc.getD() * _pc.getS()) / _pc.getH()) * (_pc.getP() / (_pc.getP() - _pc.getDConsumo())));
        }
        return result;
    }
}
