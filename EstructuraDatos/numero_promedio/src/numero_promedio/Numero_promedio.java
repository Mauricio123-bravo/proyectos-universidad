/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_promedio;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Numero_promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                int tamV=0;
                int numero[];
        
		Scanner keyboard = new Scanner(System.in);
                System.out.println("ingrese el tamaño del vector");
                
                tamV = keyboard.nextInt();
                
                numero=  new int [tamV];
                
                 
                System.out.println("ingrese los numeros");
                  for(int i=0; i<numero.length;i++)
                      numero[i]=keyboard.nextInt();
                
                
		int suma = 0;
		for (int a = 0; a < numero.length; a++) {
			suma = suma + numero[a];
		}
		
		int promedio = suma / numero.length;
		System.out.println("Suma es igual a: " +suma+ " Promedio es igual a : "+promedio);
	}
}
    
    

