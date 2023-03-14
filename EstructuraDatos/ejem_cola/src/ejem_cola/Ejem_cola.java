/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_cola;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author LENOVO
 */
public class Ejem_cola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Queue<Clientes> fila = new LinkedList<Clientes>();
        
        Clientes c1 = new Clientes("mauricio","bravo",18);  
        fila.add(c1);
        Clientes c2 = new Clientes("pepito","peres",10);  
        fila.add(c2);
        Clientes c3 = new Clientes("fausto","asprilla",58);  
        fila.add(c3);
        Clientes c4 = new Clientes("armando ","casas",43);  
        fila.add(c4);
        Clientes c5 = new Clientes("jose","caseres",65);  
        fila.add(c5);
        Clientes c6 = new Clientes("james","milner",32);  
        fila.add(c6);
        Clientes c7 = new Clientes("laura","perez",14);  
        fila.add(c7);
        Clientes c8 = new Clientes("paula","becerra",22);  
        fila.add(c8);
        Clientes c9 = new Clientes("pepita","alegre",8);  
        fila.add(c9);
        Clientes c10 = new Clientes("tatiana","blanco",2);  
        fila.add(c10);
        
        System.out.println("el primer cliente es "+fila.peek().toString());
        System.out.println("el tamaño de la cola es "+fila.size());
        System.out.println("atender un cliente" +fila.poll().toString());
        System.out.println("el tamaño de la cola es "+fila.size());
        
        
        
    }
    
}
