/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_pila;

import java.util.Stack;

/**
 *
 * @author LENOVO
 */
public class Ejem_pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
   Stack<Ficha> pila = new Stack<Ficha>();
   
   Ficha f1 = new Ficha(2,"rojo");
   pila.push(f1);
   Ficha f2 = new Ficha(22,"verde");
   pila.push(f2);
   Ficha f3 = new Ficha(4,"morado");
   pila.push(f3);
   Ficha f4 = new Ficha(5,"rosa");
   pila.push(f4);
   Ficha f5 = new Ficha(12,"naranja");
   pila.push(f5);
   Ficha f6 = new Ficha(7,"marron");
   pila.push(f6);
   Ficha f7 = new Ficha(9,"negro");
   pila.push(f7);
   Ficha f8 = new Ficha(16,"azul");
   pila.push(f8);
   Ficha f9 = new Ficha(1,"blanco");
   pila.push(f9);
   Ficha f10 = new Ficha(14,"gris");
   pila.push(f10);
  
   
   
   System.out.println("el tamaño de la pila es " +pila.size());
   pila.pop();
  System.out.println("el tamaño de la pila es " +pila.size());
   
   
   
    
    
        
    }
    
}
