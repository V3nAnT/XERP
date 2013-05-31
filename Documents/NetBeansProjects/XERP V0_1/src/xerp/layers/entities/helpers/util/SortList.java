/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xerp.layers.entities.helpers.util;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import xerp.layers.entities.pojo.inventory.ABC;

/**
 *
 * @author V3nAnT
 */
public class SortList {

    public static void Sort(List list) {
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
//                Class clase = o1.getClass();
//                String getter = "get" + Character.toUpperCase(property.charAt(0)) + property.substring(1);
                try {
//                    Method getProperty = clase.getMethod(getter);
//                    Object property1 = getProperty.invoke(o1);
//                    Object property2 = getProperty.invoke(o2);
                    ABC e1 = (ABC) o1;
                    ABC e2 = (ABC) o2;
                    double codigo1 = e1.getUm();
                    double codigo2 = e2.getUm();

                    if (codigo1 > codigo2) {
                        return 1;
                    } else if (codigo1 < codigo2) {
                        return -1;
                    } else {
                        return 0;
                    }
//                    if (property1 instanceof Comparable && property2 instanceof Comparable) {
//                        Comparable prop1 = (Comparable) property1;
//                        Comparable prop2 = (Comparable) property2;
//                        return prop1.compareTo(prop2);
//                    } else {
//                        if (property1.equals(property2)) {
//                            return 0;
//                        } else {
//                            return 1;
//                        }
//                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });
    }
}
