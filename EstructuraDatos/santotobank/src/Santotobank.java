
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
public class Santotobank {

    private Cuenta cuenta;
    private Usuario usuario;
    
    public static void main(String[] args) {
        
       Santotobank objeto = new Santotobank();
       Santotobank objeto1 = new Santotobank();
        objeto.cuenta = new Cuenta();
        objeto.menu();
        objeto1.usuario = new Usuario();
        
    }
    
    public void menu()
    {
        
        Santotobank objeto = new Santotobank();
        objeto.cuenta = new Cuenta();
        
        
        
       Scanner keyboard = new Scanner(System.in);
       boolean salir = true;
             while(salir)
             {
                 System.out.println("1. Ingresar usuarios y sus datos");
                 System.out.println("2. Tipo de cuenta con mayor saldo");
                 System.out.println("3. Usuario con menor saldo en cuenta ahorros");
                 System.out.println("4. usuarios organizados de acuerdo a su nombre");
                 System.out.println("5. Salir");
                 
                 System.out.println("Introduce tu opcion");
                 int opcion = keyboard.nextInt();
                 
                 switch(opcion)
                 {
                     case 1:
                        objeto.cuenta.datosCuenta();
                                 
    
                      break;
                   
                      case 2:
                         
                          
                  
                      break;
                     
                     case 3:        
                         objeto.usuario.menorAhorros();
                     
                     break;
                     
                     case 4:
                       objeto.cuenta.organizar();
                       objeto.cuenta.mostrar();
                      
                      break;
                      
                     case 5:
                         salir=false;
                         
                         break;
                     
                     default:
                         System.out.println("el rango de opcione esta entre 1 y 5");
                     
                     
                 }
             }
    
    
    }

}
