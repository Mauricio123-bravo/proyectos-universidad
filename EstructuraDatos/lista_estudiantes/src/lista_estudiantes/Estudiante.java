/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_estudiantes;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */


public class Estudiante {
    private String nombre;
    private String apellido;
    private double nota[];
    private double notaMayor;
    private double notaMenor;
   
    public Estudiante() {
       this.nombre = "";
       this.apellido = "";
       this.nota = new double[7];

       for(int i = 0; i < nota.length; i++);

    }

    public double getNotaMayor() {
        return notaMayor;
    }

    public double getNotaMenor() {
        return notaMenor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    
    
    public void notaMayor()
    
    {
        
         double mayor=0;
        
        
         
         
         for (int b=0;b<nota.length; b++)
         {
             if(nota[b]> mayor)
             {
              mayor=nota[b];
             }
             
             
         }
         
         System.out.println("el numero mayor es " +mayor);
         notaMayor=mayor;
         
    }
    
    public void notaMenor()
    
    {
        
         double menor;
        
        
         menor=nota[0];
         
         for (int b=0;b<nota.length; b++)
         {
             if(nota[b]<menor)
             {
              menor=nota[b];
             }
             
             
         }
         
         System.out.println("el numero menor es " +menor);
         notaMenor=menor;
         
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", nota=" + nota + ", notaMayor=" + notaMayor + ", notaMenor=" + notaMenor + '}';
    }
  
    
    
    
    
}

    

