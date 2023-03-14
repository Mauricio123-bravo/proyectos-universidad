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
public class Lista_estudiantes {

    /**
     * @param args the command line arguments
     */
     
    private Asignatura asignatura;
    
    public static void main(String[] args) {
        
        
        Lista_estudiantes objeto = new Lista_estudiantes();
        objeto.asignatura = new Asignatura();
        objeto.menu();
        objeto.asignatura.estudiantes();
        objeto.asignatura.mayor();
        objeto.asignatura.menor();
        objeto.asignatura.calcularMayor();
        objeto.asignatura.calcularMenor();
        
    }
    
    public  void menu()
    {
        
        
       Scanner keyboard = new Scanner(System.in);
       boolean salir = true;
             while(salir)
             {
                 System.out.println("1. Burbuja");
                 System.out.println("2. seleccion");
                 System.out.println("3. Salir");
                 
                 System.out.println("Introduce tu opcion");
                 int opcion = keyboard.nextInt();
                 
                 switch(opcion)
                 {
                     case 1:
                         asignatura.burbuja();
                         asignatura.mostrar();
                                 
    
                      break;
                   
                      case 2:
                         asignatura.seleccion();
                         asignatura.mostrar();
                  
                      break;
                     
                     case 3:                         
                     salir = false;
                     break;
                     
                     default:
                         System.out.println("el rango de opcione esta entre 1 y 3");
                     
                     
                 }
             }
    
    }
    
}


     
    
