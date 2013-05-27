/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.entities.pojo.inventory;

/**
 *
 * @author V3nAnT
 */
public class DescuentoCantidad {

    double _cp;//Costo de preparacion
    double _cm;//Costo de mantener
    double _cpr;//Costo del producto 
    double Q = 0;//Numero óptimo de unidades por orden
    double D = 0;//Demanda anual
    double S = 0;//Costo de Pedir
    double H = 0;//Costo de mantenimiento
    double i = 0;//Tasa de mantenimiento
    double C = 0;//Costo del producto

    public DescuentoCantidad() {
    }

    public double getCp() {
        return _cp;
    }

    public void setCp(double _cp) {
        this._cp = _cp;
    }

    public double getCm() {
        return _cm;
    }

    public void setCm(double _cm) {
        this._cm = _cm;
    }

    public double getCpr() {
        return _cpr;
    }

    public void setCpr(double _cpr) {
        this._cpr = _cpr;
    }

    public double getQ() {
        return Q;
    }

    public void setQ(double Q) {
        this.Q = Q;
    }

    public double getD() {
        return D;
    }

    public void setD(double D) {
        this.D = D;
    }

    public double getS() {
        return S;
    }

    public void setS(double S) {
        this.S = S;
    }

    public double getH() {
        return H;
    }

    public void setH(double H) {
        this.H = H;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }
}
