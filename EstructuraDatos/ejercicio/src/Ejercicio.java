
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LENOVO
 */
public class Ejercicio {

    private Panaderia panaderia;
    
    
    
    public static void main(String[] args) {
     
        Ejercicio inicio = new Ejercicio();
        inicio.panaderia = new Panaderia();
        inicio.panaderia.llenarPanaderia();
     
        
         Scanner keyboard = new Scanner(System.in);
         
         int cont=0;
         
         int opcion;
         int opcion1;
         boolean salir = true;
         boolean salir1 = true;
         while(salir1)
         {
          System.out.println("1. vender ");
          System.out.println("2. ver informacion de ventas");
          System.out.println("3.salir ");
          
             System.out.println("digite su opcion");
             opcion1 = keyboard.nextInt();
           
          switch(opcion1)
              
          
          {
              case 1:
                  while(salir)
             {
                 System.out.println("1. Primer tipo de pan ");
                 System.out.println("2. Segundo tipo de pan ");
                 System.out.println("3. Tercer tipo de pan");
                 System.out.println("4. Cuarto tipo de pan");
                 System.out.println("5. Quinto tipo de pan");
                 System.out.println("6. Sexto tipo de pan ");
                 System.out.println("7. Salir ");
                 
                 
                 System.out.println("Introduce tu opcion");
                 opcion = keyboard.nextInt();
                 
                 
                 int interno = 0;
                 switch(opcion)
                 {
                     case 1:
                         
                     System.out.println(" \ncantidad disponible " +inicio.panaderia.getPanesmostrados()[0].getNumeropan()+ "\nsu precio es " +inicio.panaderia.getPanesmostrados()[0].getPrecio()+ "\n su tipo es " +inicio.panaderia.getPanesmostrados()[0].getTipo());
                         System.out.println(" Cuantos panes desea llevar ");
                         int pan0 = keyboard.nextInt();
                         if(pan0>0 && pan0<inicio.panaderia.getPanesmostrados()[0].getNumeropan() )
                         { 
                             for(int b=0; b<pan0; b++){
                           inicio.panaderia.getVenta()[cont].getBolsapan()[interno].setTipo(inicio.panaderia.getPanesmostrados()[0].getTipo());
                           inicio.panaderia.getVenta()[cont].getBolsapan()[interno].setPrecio(inicio.panaderia.getPanesmostrados()[0].getPrecio());
                           
                           interno++;
                         }
                         
                         }
                      break;
                   
                     case 2:
                         System.out.println(" \ncantidad disponible " +inicio.panaderia.getPanesmostrados()[1].getNumeropan()+ "\nsu precio es " +inicio.panaderia.getPanesmostrados()[1].getPrecio()+ "\n su tipo es " +inicio.panaderia.getPanesmostrados()[1].getTipo());
                         System.out.println(" Cuantos panes desea llevar ");
                         int pan1 = keyboard.nextInt();
                         if(pan1>0 && pan1<inicio.panaderia.getPanesmostrados()[1].getNumeropan() )
                         { 
                             for(int b=0; b<pan1; b++){
                           inicio.panaderia.getVenta()[cont].getBolsapan()[interno].setTipo(inicio.panaderia.getPanesmostrados()[1].getTipo());
                           inicio.panaderia.getVenta()[cont].getBolsapan()[interno].setPrecio(inicio.panaderia.getPanesmostrados()[1].getPrecio());
                           interno++;
                         }
                         
                         }
                     
                     break;
                     
                     case 3:
                         System.out.println(" \ncantidad disponible " +inicio.panaderia.getPanesmostrados()[2].getNumeropan()+ "\nsu precio es " +inicio.panaderia.getPanesmostrados()[2].getPrecio()+ "\n su tipo es " +inicio.panaderia.getPanesmostrados()[2].getTipo());
                         System.out.println(" Cuantos panes desea llevar ");
                         int pan2 = keyboard.nextInt();
                         if(pan2>0 && pan2<inicio.panaderia.getPanesmostrados()[2].getNumeropan() )
                         { 
                             for(int b=0; b<pan2; b++){
                           inicio.panaderia.getVenta()[cont].getBolsapan()[interno].setTipo(inicio.panaderia.getPanesmostrados()[2].getTipo());
                           inicio.panaderia.getVenta()[cont].getBolsapan()[interno].setPrecio(inicio.panaderia.getPanesmostrados()[2].getPrecio());
                           interno++;
                         }
                         
                         }
                     
                     break;
                     
                     case 4:
                     System.out.println(" \ncantidad disponible " +inicio.panaderia.getPanesmostrados()[3].getNumeropan()+ "\nsu precio es " +inicio.panaderia.getPanesmostrados()[3].getPrecio()+ "\n su tipo es " +inicio.panaderia.getPanesmostrados()[3].getTipo());
                         System.out.println(" Cuantos panes desea llevar ");
                         int pan3 = keyboard.nextInt();
                         if(pan3>0 && pan3<inicio.panaderia.getPanesmostrados()[3].getNumeropan() )
                         { 
                             for(int b=0; b<pan3; b++){
                           inicio.panaderia.getVenta()[cont].getBolsapan()[interno].setTipo(inicio.panaderia.getPanesmostrados()[3].getTipo());
                           inicio.panaderia.getVenta()[cont].getBolsapan()[interno].setPrecio(inicio.panaderia.getPanesmostrados()[3].getPrecio());
                           interno++;
                         }
                         
                         }
                     break;
                     
                     case 5:
                         System.out.println(" \ncantidad disponible " +inicio.panaderia.getPanesmostrados()[4].getNumeropan()+ "\nsu precio es " +inicio.panaderia.getPanesmostrados()[4].getPrecio()+ "\n su tipo es " +inicio.panaderia.getPanesmostrados()[4].getTipo());
                         System.out.println(" Cuantos panes desea llevar ");
                         int pan4 = keyboard.nextInt();
                         if(pan4>0 && pan4<inicio.panaderia.getPanesmostrados()[4].getNumeropan() )
                         { 
                             for(int b=0; b<pan4; b++){
                           inicio.panaderia.getVenta()[cont].getBolsapan()[interno].setTipo(inicio.panaderia.getPanesmostrados()[4].getTipo());
                           inicio.panaderia.getVenta()[cont].getBolsapan()[interno].setPrecio(inicio.panaderia.getPanesmostrados()[4].getPrecio());
                           interno++;
                         }
                             System.out.println(inicio.panaderia.getVenta()[cont].getBolsapan()[interno-1].getPrecio());
                             System.out.println(interno);
                             System.out.println(cont);
                         }
                     
                     break;
                     
                     case 6:
                         
                         System.out.println(" \ncantidad disponible " +inicio.panaderia.getPanesmostrados()[5].getNumeropan()+ "\nsu precio es " +inicio.panaderia.getPanesmostrados()[5].getPrecio()+ "\n su tipo es " +inicio.panaderia.getPanesmostrados()[5].getTipo());
                         System.out.println(" Cuantos panes desea llevar ");
                         int pan5 = keyboard.nextInt();
                         if(pan5>0 && pan5<inicio.panaderia.getPanesmostrados()[5].getNumeropan() )
                         { 
                             for(int b=0; b<pan5; b++){
                           inicio.panaderia.getVenta()[cont].getBolsapan()[interno].setTipo(inicio.panaderia.getPanesmostrados()[5].getTipo());
                           inicio.panaderia.getVenta()[cont].getBolsapan()[interno].setPrecio(inicio.panaderia.getPanesmostrados()[5].getPrecio());
                           interno++;
                         }
                         
                         }

                     break;
                         
                     
                     case 7:                         
                     salir = false;
                     
                     double sum = 0;
                         System.out.println(inicio.panaderia.getVenta()[cont].getBolsapan().length);
                     for(int a =0; a<inicio.panaderia.getVenta()[cont].getBolsapan().length; a++)
                     {
                        sum = sum+inicio.panaderia.getVenta()[cont].getBolsapan()[a].getPrecio();
                        System.out.println("el toal de la venta fue " + sum);
                     }
                      
                     inicio.panaderia.getVenta()[cont].setTotal(sum);
                     
                     
                     
                     break;
                     
                     default:
                         System.out.println("el rango de opcione esta entre 1 y 7");
                     
                 
                 
                 
                 
                 
                 }
                 cont++;
                 System.out.println("El programa ha finalizado, gracias por usarlo");
                 
             
             }
                  break;

   
              case 2:
                  
                  
                  
                  
                  
                  break;
                  
              case 3:
                  salir1 = false;
                  break;
                  
          }
         
          
         }     
          
        
        
    }
    
    
}
