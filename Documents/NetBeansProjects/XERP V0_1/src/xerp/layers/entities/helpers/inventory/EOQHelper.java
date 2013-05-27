/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.entities.helpers.inventory;

import xerp.layers.entities.pojo.inventory.EOQ;

/**
 *
 * @author V3nAnT
 */
public class EOQHelper {

    EOQ _eoq;

    public EOQHelper(EOQ eoq) {
        this._eoq = eoq;
    }

    //Retorna Q óptimo con respecto a costo de mantenimiento H
    public double GetQH() {
        double result = 0;
        if(_eoq.getH() !=0)
        result = Math.sqrt((2 * _eoq.getD() * _eoq.getS()) / _eoq.getH());
        _eoq.setQ(result);
        return result;
    }
    //Retorna Q óptimo con respecto a la tasa de mantenimiento y costo de producto

    public double GetQIC() {
        double result = 0;
        if(_eoq.getI() !=0 && _eoq.getC() !=0)
        result = Math.sqrt((2 * _eoq.getD() * _eoq.getS()) / (_eoq.getI() * _eoq.getC()));
        _eoq.setQ(result);
        return result;
    }
    //Retorna el número esperado de órdenes

    public int GetNEO() {
        double result = 0;
        if(_eoq.getQ()!=0)
        result = _eoq.getD() / _eoq.getQ();
        _eoq.setN((int) result);
        return _eoq.getN();
    }
    //Retorna el tiempo esperado por órdenes

    public double GetTEO() {
        double result = 0;
        if(_eoq.getN()!=0)
        result = _eoq.getN_dias() / _eoq.getN();
        _eoq.setT(result);
        return result;
    }
    //Retorna el costo total anual

    public double GetTC() {
        double result = 0;
        if(_eoq.getQ()!=0)
        result = ((_eoq.getD() / _eoq.getQ()) * _eoq.getS()) + ((_eoq.getQ() / 2) * _eoq.getH());
        _eoq.setTc(result);
        return result;
    }
    //Retorna la demanda por día

    public double GetDemandaDiaria() {
        double result = 0;
        if(_eoq.getN_dias()!=0)
        result = _eoq.getD() / _eoq.getN_dias();
        _eoq.setDD(result);
        return result;
    }
    //Retorna los puntos de reorden

    public double GetROP() {
        double result = 0;
        result = _eoq.getDD() * _eoq.getL();
        return result;
    }
}