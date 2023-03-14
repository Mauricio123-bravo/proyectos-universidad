/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizar_vectores;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Organizar_vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int tamV=0;
        int numeros[];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        tamV= keyboard.nextInt();
        
        numeros= new int[tamV];
        
        System.out.println("ingrese los numeros");
        
        for(int i=0; i<numeros.length;i++)
            numeros[i]=keyboard.nextInt();
         
         
         numeros=burbuja(numeros);
         mostrar(numeros);
         numeros=seleccion(numeros);
         numeros=quicksort(numeros, tamV, tamV);
         
          
          
       }
    
    
    public static int[] burbuja (int V[])
            
    {
      
       for(int i=0;i<V.length-1;i++)
       {
          for(int j=i+1;j<V.length;j++)
          
            if(V[i]>V[j])
            {
              int aux=V[i];
              V[i]=V[j];
              V[j]=aux;
            }
          
       }
       return V;
    }
       
       public static void mostrar(int vt[])
       {
          for(int i=0;i<vt.length;i++)
              System.out.println(vt[i]);
         
       }
        
    public static int[] seleccion(int A[]) {
          int i, j, menor, pos, tmp;
          for (i = 0; i < A.length - 1; i++) {      // tomamos como menor el primero
                menor = A[i];                       // de los elementos que quedan por ordenar                    
                pos = i;                            // y guardamos su posición
                for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                      if (A[j] < menor) {           // del array algún elemento
                          menor = A[j];             // menor que el actual
                          pos = j;
                      }
                }
                if (pos != i){                      // si hay alguno menor se intercambia                         
                    tmp = A[i];
                    A[i] = A[pos];
                    A[pos] = tmp;
                }
          }
        return A;
    }
    
  public static int[] quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; // tomamos primer elemento como pivote
  int i=izq;         // i realiza la búsqueda de izquierda a derecha
  int j=der;         // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i < j){                          // mientras no se crucen las búsquedas                                   
     while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
     while(A[j] > pivote) j--;           // busca elemento menor que pivote
     if (i < j) {                        // si no se han cruzado                      
         aux= A[i];                      // los intercambia
         A[i]=A[j];
         A[j]=aux;
     }
   }
   
   A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
   A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1)
      quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
   if(j+1 < der)
      quicksort(A,j+1,der);          // ordenamos subarray derecho
   
   return A;
}
    
    
    
}

    

