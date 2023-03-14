/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Grafo {
  
    
    List<Nodo> nodos ;

    public Grafo(List<Nodo> nodos) {
        
        this.nodos = nodos;
    }
    
    public Grafo()
    {
    }

   

    public List<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(List<Nodo> nodos) {
        this.nodos = nodos;
    }

    @Override
    public String toString() {
        return "Grafo{" + "nodos=" + nodos + '}';
    }

   

  
    
   public void agregarNodo(Nodo n)
    {
     if(nodos == null)
     {
      nodos = new ArrayList<>();
     }
     
     nodos.add(n);
     
    }
  
    
}
