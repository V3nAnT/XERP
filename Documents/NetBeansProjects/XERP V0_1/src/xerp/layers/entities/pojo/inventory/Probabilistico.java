/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.entities.pojo.inventory;

/**
 *
 * @author V3nAnT
 */
public class Probabilistico {

    double _dd; //Demanda por día
    double _l;//Período
    double _ss;//Inventario de Seguridad (Security Stock)
    double _suf;//Suma de unidades faltantes para cada nivel de demanda
    double _pnd;//Probabilidad del nivel de demanda
    double _cfu;//Costo de faltantes por unidad
    double _noa;//Número de órdenes por año
    double _cmu;//Costo de mantener una unidad
    double _uarop;//Unidades agregadas al ROP
    double _caxf;//Costo anual por faltantes
    double _cma;//Costo de mantener adicional
    double _dete;//Demanda esperada durante el tiempo de entrega
    double _Z;//Número de desviaciones estándar
    double _sigma;//Desviación estándar de la demanda
    double _avg;//Media (average)

    public double getAvg() {
        return _avg;
    }

    public void setAvg(double _avg) {
        this._avg = _avg;
    }

    public Probabilistico() {
    }

    public double getDd() {
        return _dd;
    }

    public void setDd(double _dd) {
        this._dd = _dd;
    }

    public double getL() {
        return _l;
    }

    public void setL(double _l) {
        this._l = _l;
    }

    public double getSs() {
        return _ss;
    }

    public void setSs(double _ss) {
        this._ss = _ss;
    }

    public double getSuf() {
        return _suf;
    }

    public void setSuf(double _suf) {
        this._suf = _suf;
    }

    public double getPnd() {
        return _pnd;
    }

    public void setPnd(double _pnd) {
        this._pnd = _pnd;
    }

    public double getCfu() {
        return _cfu;
    }

    public void setCfu(double _cfu) {
        this._cfu = _cfu;
    }

    public double getNoa() {
        return _noa;
    }

    public void setNoa(double _noa) {
        this._noa = _noa;
    }

    public double getCmu() {
        return _cmu;
    }

    public void setCmu(double _cmu) {
        this._cmu = _cmu;
    }

    public double getUarop() {
        return _uarop;
    }

    public void setUarop(double _uarop) {
        this._uarop = _uarop;
    }

    public double getCaxf() {
        return _caxf;
    }

    public void setCaxf(double _caxf) {
        this._caxf = _caxf;
    }

    public double getCma() {
        return _cma;
    }

    public void setCma(double _cma) {
        this._cma = _cma;
    }

    public double getDete() {
        return _dete;
    }

    public void setDete(double _dete) {
        this._dete = _dete;
    }

    public double getZ() {
        return _Z;
    }

    public void setZ(double _Z) {
        this._Z = _Z;
    }

    public double getSigma() {
        return _sigma;
    }

    public void setSigma(double _sigma) {
        this._sigma = _sigma;
    }
}
