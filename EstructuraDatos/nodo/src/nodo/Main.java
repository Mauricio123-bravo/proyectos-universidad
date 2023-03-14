/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;

import org.w3c.dom.Attr;
import org.w3c.dom.Node;

/**
 *
 * @author LENOVO
 */
public class Main {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Nodo no = new Nodo();
        Nodo n1 = no.agregarhijo(7);
        Nodo n2= no.agregarhijo(3);
        Nodo n3 = n1.agregarhijo(15);
        Nodo n4 = n1.agregarhijo(5);
        Nodo n5 = n2.agregarhijo(12);
        Nodo n6 = n2.agregarhijo(5);
        
        posorden(no);
      
    }
    
    public static void posorden(Nodo n)
    {
      if(n==null)
          return;
      
        posorden(n.getHijo1());
        posorden(n.getHijo2());
        
        System.out.println("Nodo value -->" + n.toString());
    }

   
    
   
    
}
