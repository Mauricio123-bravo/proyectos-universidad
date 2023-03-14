/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implem_listas;

import java.util.Comparator;

/**
 *
 * @author LENOVO
 */
public class ComparatorModelo implements Comparator{
    
    @Override
    public int compare(Object o1, Object o2) {
         
        Vehiculo a1 = (Vehiculo) o1;
        return a1.getModelo()-((Vehiculo)o2).getModelo();
    }
    
}
