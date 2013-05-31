/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.entities.helpers.inventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xerp.layers.entities.pojo.inventory.ABC;
import xerp.layers.entities.helpers.util.SortList;

/**
 *
 * @author V3nAnT
 */
public class ABCHelper {

    ABC _abc;
    List<ABC> _listAbc;

    public ABCHelper(ABC abc) {
        this._abc = abc;
        _listAbc = new ArrayList<>();
    }

    //Retorna la lista ABC
    public List<ABC> GetListAbc() {
        SetListAbc();
        return _listAbc;
    }
    //Ordena artículos de manera ascendente

    public void SetOrdenAscendente() {
        double vu = 0, temp = 0;
        if (_listAbc != null) {
            SortList.Sort(_listAbc);
            for (int i = 0; i < _listAbc.size(); i++) {
                System.out.println("Lista: " + _listAbc.get(i).getUm());
            }
        }
    }

    //Retorna el total de uso monetario
    public double GetTotalUM() {
        double result = 0;
        if (_listAbc != null) {
            for (Iterator<ABC> it = _listAbc.iterator(); it.hasNext();) {
                ABC abc = it.next();
                result += abc.getUm();
            }
        }
        return result;
    }

    //Establece el porcentaje del uso monetario
    public void SetPerUM() {
        double totalUm = 0;
        double per_um = 0;
        totalUm = GetTotalUM();
        if (_listAbc != null) {
            for (int i = 0; i < _listAbc.size(); i++) {
                per_um = (_listAbc.get(i).getUm() / totalUm) * 100;
                _listAbc.get(i).setPer_um(per_um);
            }
        }
    }
    //Establece el porcentaje de uso del artículo

    public void SetPerUA() {
        double per_ua = 0;
        if (_listAbc != null) {
            for (int i = 0; i < _listAbc.size(); i++) {
                if (i == 0) {
                    per_ua = _listAbc.get(i).getPer_um();
                    _listAbc.get(i).setPer_ua(per_ua);
                } else {
                    per_ua = (_listAbc.get(i - 1).getUm() + _listAbc.get(i).getUm());
                    _listAbc.get(i).setPer_ua(per_ua);
                }
            }
        }
    }

    //Establece la clase (A,B,C) a la que pertenece el articulo
    public void SetClase() {
        double clase = 0;
        double n_productos = 0;
        n_productos = _listAbc.size();
        if (_listAbc != null) {
            for (int i = 0; i < _listAbc.size(); i++) {
                if (i == 0) {
                    clase = 1 / n_productos;
                    if (clase <= 0.20) {
                        _listAbc.get(i).setC(ABC._clase.A.toString());
                    } else if (clase >= 0.20 && clase <= 0.30) {
                        _listAbc.get(i).setC(ABC._clase.B.toString());
                    } else if (clase >= 0.30 && clase <= 1) {
                        _listAbc.get(i).setC(ABC._clase.C.toString());
                    }

                } else {
                    clase += 1 / n_productos;
                    if (clase <= 0.20) {
                        _listAbc.get(i).setC(ABC._clase.A.toString());
                    } else if (clase >= 0.20 && clase <= 0.30) {
                        _listAbc.get(i).setC(ABC._clase.B.toString());
                    } else if (clase >= 0.30 && clase <= 1) {
                        _listAbc.get(i).setC(ABC._clase.C.toString());
                    }
                }
            }
        }
    }

    //Establece todos los campos de la lista ABC
    public void SetListAbc() {
        SetOrdenAscendente();
        SetPerUM();
        SetPerUA();
        SetClase();
    }
}
