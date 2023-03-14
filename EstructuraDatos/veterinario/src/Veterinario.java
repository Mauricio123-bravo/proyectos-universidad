
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
public class Veterinario {

   
    private Animales datos[];
    private int triage;
     public Veterinario()
     {
        this.triage=0; 
        this.datos = new Animales[10];
        for(int i = 0; i < datos.length; i++)
        datos[i] = new Animales();
     }
     
     
     public void dato()
     
    {
        Scanner keyboard = new Scanner(System.in);
         for(int i = 0; i<datos.length ; i++){
            System.out.println("Ingrese el nombre de su mascota: " +i);
            datos[i].setNombre(keyboard.next());
            
            System.out.println("Ingrese el id de su mascota : " +i);
            datos[i].setId(keyboard.nextInt());
            
            System.out.println("Ingrese la enfermedad de su mascota : " +i);
            datos[i].setEnfermedad(keyboard.next());
            
            System.out.println("Ingrese el tipo de animal: "+i);
            datos[i].setTipo(keyboard.next());
            
            
                System.out.println("Ingrese el nivel de urgencia de su mascota" );
                   triage = keyboard.nextInt();
            
                
            

           
            }
        }
     
     
     public  void organizarTriage ()
            
    {
      
       for(int i=0;i<datos.length-1;i++)
       {
          for(int j=i+1;j<datos.length;j++)
          
            if(triage<triage)
            {
                Animales aux=datos[i];
                datos[i]=datos[j];
                datos[j]=aux;
            }
            
          
       }
       
        
     }
     
    public void buscarAnimal()
    {
     Scanner k = new Scanner(System.in);
     String nom= k.next();
     int j = 0;
     for(int i=0; i<datos.length; i++)
     {
        
      if(datos[i].getNombre().equals(datos[j].getNombre()))
      {
          nom = datos[i].getNombre();
      }
      break;
      
     }
        System.out.println(nom);
    } 
     
        
    
    }
     
     
    
     
    
    
    
    

