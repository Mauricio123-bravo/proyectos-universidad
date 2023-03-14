/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar_lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ordenar_lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        System.out.println("Cuantos estudiantes desea ingresar");
        
        Scanner keyboard = new Scanner (System.in);
        int numEst = keyboard.nextInt();
        
        for(int i=0; i<numEst; i++)
        {
          System.out.println("Digite el nombre del Estudiante : " +i+1);
          String nombre = keyboard.next();
          
          System.out.println("Digite la edad del Estudiante : " +i+1);
          int edad = keyboard.nextInt();
          
          System.out.println("Digite el semestre del Estudiante : " +i+1);
          int semestre = keyboard.nextInt();
          
          System.out.println("Digite las 5 notas del Estudiante : " +i+1);
          double nt[] = new double[5];
          for(int j=0; j<5; j++)
          
          nt[j]= keyboard.nextDouble();
          
          estudiantes.add(new Estudiante(nombre,edad,semestre,nt));
          
        }
        
        
         Collections.sort(estudiantes, new ComparatorSemester());
         Collections.sort(estudiantes, new ComparatorNombre());
         
         
         
         for(Estudiante es: estudiantes)
         {
             System.out.println(es.toString());
         }
    }
    
    
    
}
