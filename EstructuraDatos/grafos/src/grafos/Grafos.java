/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Grafos {
    
    List<Nodos> nodos ;

    public Grafos(List<Nodos> nodos) {
        
        this.nodos= new ArrayList<Nodos>();
    }
    public Grafos(){}

    public List<Nodos> getNodos() {
        return nodos;
    }
    

    public void setNodos(List<Nodos> nodos) {
        this.nodos = nodos;
    }

    @Override
    public String toString() {
        return "Grafos{" + "nodos=" + nodos + '}';
    }
    
   public void agregarNodo(Nodos n)
    {
     if(nodos == null)
     {
      nodos = new ArrayList<>();
     }
     
     nodos.add(n);
     
    }
  
 
   public String buscar()
     {
         Scanner keyboard = new Scanner(System.in);
         String palabra;
         System.out.println("ingrese el nombre de la ciudad");
         palabra = keyboard.next();
         
         for(Nodos llave:nodos)
         
         {
          if(llave.getCiudades().equals(palabra))
          {
              return "si se encontro el nodo con el nombre de la ciudad " +palabra;
          
          }
        
         }
         
         return "no se encontro el nodo con el nombre de la ciudad";
     
     }
   
   
   public void conexionNodos(String nombre1, String nombre2)
   {
    
       boolean existe= false;
       for(Nodos n:nodos)
       {
           if(n.getCiudades().equals(nombre1))
           {
            for(Arcos a: n.getArcos())
            {
                if(a.getDestino().equals(nombre2))
                {
                   existe = true;
                    System.out.println("Hay conexion directa entre "+nombre1+ "y "+nombre2);
                }
            }
           }
       
       }if(!existe)
           System.out.println("No Hay conexion directa entre nodos");
   
   }
   
   
   
}





  
    

