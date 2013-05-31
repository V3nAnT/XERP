/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.entities.pojo.inventory;

/**
 *
 * @author V3nAnT
 */
public class ABC {

    String _cod_elem;//Código del elemento
    double _vu;//Valor Unitario
    double _d;//Demanda (unidades)
    double _um;//Uso monetario
    double _per_um;//Porcentaje de uso monetario
    double _per_ua;//Porcentaje de uso del artículo
    String _c;//Clase (A,B,C)

    public String getC() {
        return _c;
    }

    public void setC(String _c) {
        this._c = _c;
    }
    public static enum _clase {

        A, B, C
    };

    public String getCod_elem() {
        return _cod_elem;
    }

    public void setCod_elem(String _cod_elem) {
        this._cod_elem = _cod_elem;
    }

    public double getVu() {
        return _vu;
    }

    public void setVu(double _vu) {
        this._vu = _vu;
    }

    public double getD() {
        return _d;
    }

    public void setD(double _d) {
        this._d = _d;
    }

    public double getUm() {
        _um = getVu() * getD();
        return _um;
    }

    public void setUm(double _um) {
        this._um = _um;
    }

    public double getPer_um() {
        return _per_um;
    }

    public void setPer_um(double _per_um) {
        this._per_um = _per_um;
    }

    public double getPer_ua() {
        return _per_ua;
    }

    public void setPer_ua(double _per_ua) {
        this._per_ua = _per_ua;
    }

    public ABC() {
    }
}
