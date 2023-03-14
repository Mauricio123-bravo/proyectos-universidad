/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_mayor;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Numero_mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        encontrarMayor();
        encontrarMenor();
        promedio();
        
        
    }
    
    
    public static void encontrarMayor()
    {
       int mayor=0;
        int tamV=0;
        int numeros[];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
         tamV= keyboard.nextInt();
         
         System.out.println("ingrese los numeros");
         numeros= new int[tamV];
         for(int b=0;b<tamV; b++)
         {
           numeros[b]= 0;
         }
         
         for(int b=0;b<tamV; b++)
         {
           numeros[b]= keyboard.nextInt();
           
         }
         
         for (int b=0;b<tamV; b++)
         {
             if(numeros[b]> mayor)
             {
              mayor=numeros[b];
             }
             
             
           
           
         }
         
         System.out.println("el numero mayor es " +mayor);
         
         
    
    }
    
    public static void encontrarMenor()
    {
       int mayor;
        int tamV=0;
        int numeros[];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
         tamV= keyboard.nextInt();
         
         System.out.println("ingrese los numeros");
         numeros= new int[tamV];
         for(int b=0;b<tamV; b++)
         {
           numeros[b]= 0;
         }
         
         for(int b=0;b<tamV; b++)
         {
           numeros[b]= keyboard.nextInt();
           
         }
         mayor=numeros[0];
         for (int b=0;b<tamV; b++)
         {
             if(numeros[b]<mayor)
             {
              mayor=numeros[b];
             }
             
             
           
           
         }
         
         System.out.println("el numero menor es " +mayor);
         
         
    
    }
    
    public static void promedio()
    {
    int promedio=0;
    int sum=0;
        int tamV=0;
        int numeros[];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
         tamV= keyboard.nextInt();
         
         System.out.println("ingrese los numeros");
         numeros= new int[tamV];
         for(int b=0;b<tamV; b++)
         {
           numeros[b]= 0;
         }
         
         for(int b=0;b<tamV; b++)
         {
           numeros[b]= keyboard.nextInt();
           
         }
         
         for (int b=0;b<tamV; b++)
         {
             
             sum=sum+numeros[b];
             
         }
         
         for (int b=0;b<tamV; b++)
         {
             
             promedio=sum/tamV;
             
         }
         
         System.out.println("el promedio es " +promedio);
         
    
    }
    
}
