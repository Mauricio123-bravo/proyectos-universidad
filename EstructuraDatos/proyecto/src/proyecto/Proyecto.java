/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aerolinea ae = new Aerolinea();
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Buen dia, bienvenido");
        
        
         int opcion;
            boolean salir = true;
             while(salir)
             {
                 System.out.println("1. Trabajador ");
                 System.out.println("2. Cliente");
                 System.out.println("3. Salir");
                 
                 
                 
                 
                 System.out.println("Introduce tu opcion, dependiendo el tipo de usuario que es: ");
                 opcion = keyboard.nextInt();
                 
                 switch(opcion)
                 {
                     case 1:
                       
                        ae.infoTrabajador();
                       
                        ae.registrarCiudades();
                        ae.guardarRutas();
                        ae.mostrarRuta();
                     
                      break;
                   
                     case 2:
                         
                         ae.infoCliente();
                         ae.crearTicket();
                       
       
                     break;
                     
                     
                     
                     case 3:
                         
                         salir = false;
                     break;
                         
                         
                     
                     
                     
                     
                     default:
                         System.out.println("el rango de opcione esta entre 1 y 3");
                     
                 
                 
                 
                 
                 
                 }
             
             }
               System.out.println("El programa ha finalizado, gracias por usarlo");
          
         }
        
       
        
        
       
    }
    

