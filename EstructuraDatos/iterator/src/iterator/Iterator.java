/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author LENOVO
 */
public class Iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Vector vector = new Vector(5);
    	
    	//Creación del iterador
    	VectorIterator iterador = vector.iterador();
    	
    	//Recorrido con el iterador
    	while (iterador.hasNext())
            System.out.println(iterador.next());   
    }
    
}
