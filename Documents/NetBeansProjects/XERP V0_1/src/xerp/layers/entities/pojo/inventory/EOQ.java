/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.entities.pojo.inventory;

/**
 *
 * @author V3nAnT
 */
public class EOQ {

    double Q = 0;//Numero óptimo de unidades por orden
    double D = 0;//Demanda anual
    double S = 0;//Costo de Pedir
    double H = 0;//Costo de mantenimiento
    double i = 0;//Tasa de mantenimiento
    double c = 0;//Costo del producto
    int N = 0;//N° esperado de órdenes
    double T = 0;//Tiempo esperado de órdenes
    int n_dias = 0;//Número de días trabajados por año
    double tc = 0;//Costo total anual
    double rop = 0;//Puntos de reorden
    double _d = 0;//Demanda diaria
    double L = 0;//Período

    public EOQ() {
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
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public double getT() {
        return T;
    }

    public void setT(double T) {
        this.T = T;
    }

    public int getN_dias() {
        return n_dias;
    }

    public void setN_dias(int n_dias) {
        this.n_dias = n_dias;
    }

    public double getTc() {
        return tc;
    }

    public void setTc(double tc) {
        this.tc = tc;
    }

    public double getRop() {
        return rop;
    }

    public void setRop(double rop) {
        this.rop = rop;
    }

    public double getDD() {
        return _d;
    }

    public void setDD(double _d) {
        this._d = _d;
    }

    public double getL() {
        return L;
    }

    public void setL(double L) {
        this.L = L;
    }
}
