/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;

import org.w3c.dom.Node;

/**
 *
 * @author LENOVO
 */
public class Nodo {

   
    
    private int numero;
    private Nodo hijo1;
     private Nodo hijo2;

    public Nodo(int numero) {
        this.numero = numero;
        this.hijo1=null;
        this.hijo2=null;
        
       
    }
    public Nodo()
    {
    
    }

    public Nodo getHijo1() {
        return hijo1;
    }

    public void setHijo1(Nodo hijo1) {
        this.hijo1 = hijo1;
    }

    public Nodo getHijo2() {
        return hijo2;
    }

    public void setHijo2(Nodo hijo2) {
        this.hijo2 = hijo2;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

     @Override
    public String toString() {
        return "Nodo{" + "numero=" + numero + ", hijo1=" + hijo1 + ", hijo2=" + hijo2 + '}';
    }
    
    
    public Nodo agregarhijo(int numeroh)
    {
     
        if(hijo1==null)
        {
            hijo1 = new Nodo(numeroh);
            return hijo1;
        }else if(hijo2==null)
         {
             hijo2 = new Nodo(numeroh);
              return hijo2;
         }else
        {
            return null;
        }
    
    }
     
     
    
}
