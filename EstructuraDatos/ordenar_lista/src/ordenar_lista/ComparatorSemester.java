/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar_lista;

import java.util.Comparator;

/**
 *
 * @author LENOVO
 */
public class ComparatorSemester implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
         
        Estudiante a1 = (Estudiante) o1;
        return a1.getSemestre()-((Estudiante)o2).getSemestre();
    }
    
    

    
}
