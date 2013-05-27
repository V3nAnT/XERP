/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.entities.helpers.inventory;

import xerp.layers.entities.pojo.inventory.Probabilistico;
import org.jquantlib.math.distributions.NormalDistribution;

/**
 *
 * @author V3nAnT
 */
public class ProbabilisticoHelper {

    Probabilistico _p;
    NormalDistribution _nd;

    public ProbabilisticoHelper(Probabilistico p) {
        this._p = p;
        _nd = new NormalDistribution(p.getAvg(), p.getSigma());
    }
    //Retorna el número de desviaciones estándar Z

    public double GetZ(double x) {
        double result = 0;
        result = _nd.op(x);
        return result;
    }
    //Retorna el ROP (Punto de reorden)

    public double GetROP() {
        double result = 0;
        result = (_p.getDd() * _p.getL()) + _p.getSs();
        return result;
    }
    //Retorna el costo anual por faltantes

    public double GetCAF() {
        double result = 0;
        result = (_p.getSuf() * _p.getPnd() * _p.getCfu() * _p.getNoa());
        _p.setCaxf(result);
        return result;
    }
    //Retorna el costo anual de mantener

    public double GetCAM() {
        double result = 0;
        result = _p.getCmu() * _p.getUarop();
        return result;
    }
    //Retorna el costo total

    public double GetCT() {
        double result = 0;
        result = _p.getCaxf() + _p.getCma();
        return result;
    }
}
