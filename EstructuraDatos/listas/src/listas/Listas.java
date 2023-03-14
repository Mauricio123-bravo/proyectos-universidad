/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       List<Double> edades = new ArrayList<Double>();
       
       edades.add(10.21);
       edades.add(90.1);
       edades.add(19.9);
       edades.add(33.33);
       
       
        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digita las siguientes 5 edades");
        for(int i=0; i<5; i++)
            edades.add(keyboard.nextDouble());
        
        System.out.println("tamaño lista " +edades.size());
        
        
        System.out.println("Digita las siguientes 5 edades");
        int pos =11;
        for(int i=0; i<5; i++)
            
        {
            edades.add(pos,keyboard.nextDouble());
            pos++;
        
        }
            
        
        System.out.println("tamaño lista " +edades.size());
        
        for(Double edad:edades)
        {
            System.out.println("Edad " +edad);
        }
        
        System.out.println("que edad desea cambiar");

        int i=0;
        for(Double edad:edades)
        {
            System.out.println("Edad " +i+ ": " +edad);
            i++;
        }        
        
        int posc = keyboard.nextInt();
        
        System.out.println("digita la nueva edad");
        edades.set(posc, keyboard.nextDouble());
    }
    
}
