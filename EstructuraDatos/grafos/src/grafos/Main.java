/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Nodos n1 = new Nodos("bogota");
        Nodos n2 = new Nodos("duitama");
        Nodos n3 = new Nodos("bucaramanga");
        Nodos n4 = new Nodos("barranquilla");
        
        
        n1.añadirArco(new Arcos(67,true,n1,n3));
        n1.añadirArco(new Arcos(222,true,new Nodos("bogota"),new Nodos("barranquilla")));
        
        
        n2.añadirArco(new Arcos(55,true,new Nodos("duitama"),new Nodos("bogota")));
        
        n3.añadirArco(new Arcos(300,true,new Nodos("bucaramanga"),new Nodos("medellin")));
         n3.añadirArco(new Arcos(210,true,new Nodos("bucaramanga"),new Nodos("duitama")));
         
         
          n4.añadirArco(new Arcos(400,true,new Nodos("barranquilla"),new Nodos("duitama")));
        
        
          
         Grafos g = new Grafos();
         g.agregarNodo(n1);
         g.agregarNodo(n2);
         g.agregarNodo(n3);
         g.agregarNodo(n4);
         
         System.out.println(g);
         
         
          
        
        
        
    }
    
}
