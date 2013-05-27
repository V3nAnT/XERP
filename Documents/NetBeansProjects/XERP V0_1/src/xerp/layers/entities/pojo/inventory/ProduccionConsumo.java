/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.entities.pojo.inventory;

/**
 *
 * @author V3nAnT
 */
public class ProduccionConsumo {

    double _CAMI;//Costo Anual de Mantener Inventario
    double _NPI;//Nivel Promedio de Inventario
    double _CMUA;//Costo de Mantener por Unidad por Año
    double _NIP;//Nivel de Inventario Promedio
    double _NIM;//Nivel de Inventario Máximo
    double _pt;//Total Producido
    double _dt;//Total Usado
    double D = 0;//Demanda anual
    double S = 0;//Costo de Pedir
    double H = 0;//Costo de mantenimiento
    double P = 0;//Tasa de Produccion por dia
    double _d = 0;//Consumo en dias (demanda diaria)

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

    public double getP() {
        return P;
    }

    public void setP(double P) {
        this.P = P;
    }

    public double getDConsumo() {
        return _d;
    }

    public void setDConsumo(double _d) {
        this._d = _d;
    }

    public ProduccionConsumo() {
    }

    public double getCAMI() {
        return _CAMI;
    }

    public void setCAMI(double _CAMI) {
        this._CAMI = _CAMI;
    }

    public double getNPI() {
        return _NPI;
    }

    public void setNPI(double _NPI) {
        this._NPI = _NPI;
    }

    public double getCMUA() {
        return _CMUA;
    }

    public void setCMUA(double _CMUA) {
        this._CMUA = _CMUA;
    }

    public double getNIP() {
        return _NIP;
    }

    public void setNIP(double _NIP) {
        this._NIP = _NIP;
    }

    public double getNIM() {
        return _NIM;
    }

    public void setNIM(double _NIM) {
        this._NIM = _NIM;
    }

    public double getPt() {
        return _pt;
    }

    public void setPt(double _pt) {
        this._pt = _pt;
    }

    public double getDt() {
        return _dt;
    }

    public void setDt(double _dt) {
        this._dt = _dt;
    }
}
