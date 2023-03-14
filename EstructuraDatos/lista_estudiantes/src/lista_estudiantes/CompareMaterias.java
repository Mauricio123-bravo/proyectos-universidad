/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_estudiantes;
import java.util.Comparator;
/**
 *
 * @author LENOVO
 */


public class CompareMaterias implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Materias a1 = (Materias) o1;
        return a1.getNombre().compareTo(((Materias)o2).getNombre());
    }

    
}
