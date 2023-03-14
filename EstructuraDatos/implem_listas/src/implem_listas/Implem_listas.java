/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implem_listas;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Implem_listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Compraventa com = new Compraventa();
        
        
        
        Scanner keyboard = new Scanner(System.in);
        int opcion;
            boolean salir = true;
             while(salir)
             {
                 System.out.println("1. Registrar Vehiculo");
                 System.out.println("2. Vender Vehiculo");
                 System.out.println("3. Mostrar Vehiculos");
                 System.out.println("4. Mostrar Vehiculos Particulares");
                 System.out.println("5. Mostrar Vehiculos Publicos");
                 System.out.println("6. Buscar Vehiculos tipo precio");
                 System.out.println("7. Buscar Vehiculos tipo modelo");
                 System.out.println("8. Vehiculos ordenados tipo modelo");
                 System.out.println("9. Vehiculos ordenados tipo pecio");
                 System.out.println("10. Salir");
                 
                 
                 System.out.println("Introduce tu opcion");
                 opcion = keyboard.nextInt();
                 
                 switch(opcion)
                 {
                     case 1:
                         com.registrarVehiculo();
                         
                     
                      break;
                   
                     case 2:
                         
                         com.vender();
       
                     break;
                     
                     case 3: 
                         
                         com.mostrarVehiculos();
                     break;
                     
                     case 4:
                         
                         com.mostrarVehiculosParticulares();
                     
                     break;
                     
                     case 5:
                         com.mostrarVehiculosPublicos();
                     
                     break;
                     
                     case 6:
                         com.buscarVehiculoPrecio();
                     
                     break;
                     
                     
                     case 7:
                     com.buscarVehiculoModelo();
                     break;
                     
                     case 8:
                         
                         com.ordenarModelo();
                     
                     break;
                     
                     case 9:
                     com.ordenarValor();
                     break;
                     
                     case 10:                         
                     salir = false;
                     break;
                     
                     default:
                         System.out.println("el rango de opcione esta entre 1 y 10");
                     
                 
                 
                 
                 
                 
                 }
             
             }
               System.out.println("El programa ha finalizado, gracias por usarlo");
          
         }
         
       }
           
    
        

    

