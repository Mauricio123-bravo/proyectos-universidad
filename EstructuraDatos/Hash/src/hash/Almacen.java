/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Almacen {
    
    HashMap<Integer,Producto> al;
    

    public Almacen() {
        
        al = new HashMap<Integer,Producto>();
    }

    public HashMap<Integer,Producto> getAl() {
        return al;
    }

    public void setAl(HashMap<Integer,Producto> al) {
        this.al = al;
    }

    @Override
    public String toString() {
        return "Almacen{" + "al=" + al + '}';
    }
    
     public void llenarAlmacen()
    {
        List<String>lista = new ArrayList<String>();
        
        lista.add("sony");
        lista.add("100 gramos");
        al.put(21, new Producto("PSP", "consola" , lista));
        
        lista = new ArrayList<String>();
        
        lista.add("golty");
        lista.add("1 kg");
        al.put(202, new Producto("balon", "deporte" , lista));
        
        lista = new ArrayList<String>();
        
        lista.add("kalley");
        lista.add("1k kg");
        al.put(22, new Producto("estufa", "electrodomentico" , lista));
        
        lista = new ArrayList<String>();
        
        lista.add("gw");
        lista.add("7 kg");
        al.put(52, new Producto("cicla", "medio  de transporte" , lista));
        
        
        for(Integer j: al.keySet())
        {
            System.out.println(" = " +al.get(j));
        }
        
       Iterator it = al.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry<Integer, Integer> entry = (Map.Entry)it.next();
	        System.out.println(entry.getKey() + " = " + entry.getValue()); 
	    }

        
        
        
    }
     
     
     
     public String buscar()
     {
         Scanner keyboard = new Scanner(System.in);
         int codigo;
         System.out.println("ingrese la clave del producto que desea buscar");
         codigo = keyboard.nextInt();
         
         for(int llave:al.keySet())
         
         {
          if(llave == codigo)
              return al.get(llave).toString();
         }
     
         return"";
     }

     
     public String buscar1(int codigo)
     {
         if(al.containsKey(codigo))
         {
          return al.get(codigo).toString();
         }
         
         else
         {
             System.out.println("no hay ningun producto con ese codigo");
         }
         
         return "";
     }
     
     public void llenarporteclado()
     {
         
         List<String>lista = new ArrayList<String>();
         String inicio = "si";
         
         Scanner keyboard = new  Scanner(System.in);
         System.out.println("Digite el nombre del producto : " );
          String nombre = keyboard.next();
          
          System.out.println("Digite el tipo del producto : " );
          String tipo = keyboard.next();
          
          System.out.println("Digite la clave del producto, por favor no use el 0 al inicio : " );
          int clave = keyboard.nextInt();
          
         
         
         while(inicio.equals("si"))
         {
             
             
             System.out.println("que caracteristicas desea agregar: ");
             String crc1 = keyboard.next();
             
             System.out.println("digite  " +crc1+ ": ");
             String crc11 = keyboard.next();
             
             lista.add(crc1+": " +crc11);
             
             System.out.println("si desea ingresar otra caracteristicas del producto, digite si : " );
             inicio = keyboard.next();
             
         }
        
        
             
           al.put(clave, new Producto(nombre,tipo,lista));
           Iterator it = al.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry<Integer, Integer> entry = (Map.Entry)it.next();
	        System.out.println(entry.getKey() + " = " + entry.getValue()); 
	    }
           
         
     
     }

    
}
