/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santotobank1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Santotobank1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Cliente cl1 = new Cliente();
       
        Cuenta cue = new Cuenta();
        cl1.nuevaCuenta();
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Buen dia, bienvenido");
        
        
         int opcion;
            boolean salir = true;
             while(salir)
             {
                 System.out.println("1. Ver saldo");
                 System.out.println("2. Cambiar clave");
                 System.out.println("3. Retirar");
                 System.out.println("4. Salir");
                 
                 
                 
                 System.out.println("Introduce tu opcion");
                 opcion = keyboard.nextInt();
                 
                 switch(opcion)
                 {
                     case 1:
                        cue.saldo();
                        
                     
                      break;
                   
                     case 2:
                         
                         cl1.nuevaPass();
       
                     break;
                     
                     case 3: 
                         
                         cue.retira();
                         
                         
                         
                         
                     break;
                     
                     case 4:
                         
                         salir = false;
                     break;
                         
                         
                     
                     
                     
                     
                     default:
                         System.out.println("el rango de opcione esta entre 1 y 4");
                     
                 
                 
                 
                 
                 
                 }
             
             }
               System.out.println("El programa ha finalizado, gracias por usarlo");
          
         }
        
       
        
        
        
    
    }
    


    
    

