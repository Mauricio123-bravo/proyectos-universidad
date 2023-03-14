/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implem_listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Compraventa {

    
    
   private List<Particular> carrosParticularDisponibles ;
   private List<Publico> carrosPublicosDisponibles ;
   private  List<Vehiculo> carrosVendidos;
    
   
   public Compraventa() {
        this.carrosParticularDisponibles = new ArrayList<Particular>();
        this.carrosPublicosDisponibles = new ArrayList<Publico>();
        this.carrosVendidos = new ArrayList<Vehiculo>();
        
    }

    public List<Particular> getCarrosParticularDisponibles() {
        return carrosParticularDisponibles;
    }

    public void setCarrosParticularDisponibles(List<Particular> carrosParticularDisponibles) {
        this.carrosParticularDisponibles = carrosParticularDisponibles;
    }

    public List<Publico> getCarrosPublicorDisponibles() {
        return carrosPublicosDisponibles;
    }

    public void setCarrosPublicorDisponibles(List<Publico> carrosPublicorDisponibles) {
        this.carrosPublicosDisponibles = carrosPublicorDisponibles;
    }

    public List<Vehiculo> getCarrosVendidos() {
        return carrosVendidos;
    }

    public void setCarrosVendidos(List<Vehiculo> carrosVendidos) {
        this.carrosVendidos = carrosVendidos;
    }
   
   
    public void registrarVehiculo()
    {
      Particular par = new Particular();
      Publico pub = new Publico();
      
      
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("por favor ingrese si su vehiculo es particular  o publico");
      String part = keyboard.next();
      
      if(part.equals("particular"))
      {
          System.out.println("por favor ingrese los siguientes datos");
          System.out.println("color");
          par.setColor(keyboard.next());
          System.out.println("Estado");
          par.setEstado(keyboard.next());
          System.out.println("id");
          par.setId(keyboard.nextInt());
          System.out.println("Modelo");
          par.setModelo(keyboard.nextInt());
          System.out.println("numero de puertas");
          par.setNumPuertas(keyboard.nextInt());
          System.out.println("tipo de combustible");
          par.setTipoCombustible(keyboard.next());
          System.out.println("motor");
          par.setTipoMotor(keyboard.next());
          
          carrosParticularDisponibles.add(par);
          
          
       
      }else 
        
          {
              System.out.println("por favor ingrese los siguientes datos");
          System.out.println("capacidad");
              pub.setCapacidad(keyboard.nextInt());
              System.out.println("¿es verdad que su vehiculo tiene cupo? ");
          pub.setCupo(keyboard.nextBoolean());
          System.out.println("Estado");
          pub.setEstado(keyboard.next());
          System.out.println("tipo");
          pub.setTipo(keyboard.next());
          System.out.println("id");
          pub.setId(keyboard.nextInt());
          System.out.println("tipo de combustible");
          pub.setTipoCombustible(keyboard.next());
          System.out.println("valor");
          pub.setValor(keyboard.nextInt());
          
          carrosPublicosDisponibles.add(pub);
          
         }
        
     
    }
    
    public void vender()
    {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Buen dia, nosotros manejamos vehiculos de tipo  particualar y publico , ¿ cual desea comprar? ");
      String ver= keyboard.next();
      
      if(ver.equals("particular"))
      {
       for(int i=0; i<carrosParticularDisponibles.size(); i++)
            System.out.println(carrosParticularDisponibles.get(i).toString());
       
        System.out.println("ingrese el id del carro que quiere comprar");
        
        int m = keyboard.nextInt();
        
        for(int i=0; i<carrosParticularDisponibles.size(); i++)
        {
          if(carrosPublicosDisponibles.get(i).getId()==m)
          {
           m=i;
           break;
          }
        }
        carrosVendidos.add(carrosPublicosDisponibles.get(m));
        carrosPublicosDisponibles.remove(m);
       
      }else
      {
       for(int i=0; i<carrosPublicosDisponibles.size(); i++)
            System.out.println(carrosPublicosDisponibles.get(i).toString());
       
        System.out.println("ingrese el id del carro que quiere comprar");
        
        int p = keyboard.nextInt();
        for(int i=0; i<carrosPublicosDisponibles.size(); i++)
        {
          if(carrosPublicosDisponibles.get(i).getId()==p)
          {
           p=i;
           break;
          }
        }
        carrosVendidos.add(carrosPublicosDisponibles.get(p));
        carrosPublicosDisponibles.remove(p);
      }
    
  
        
        
                
       }
    
    public void mostrarVehiculos()
    {
        System.out.println("Los carros que tenemos en el momento son los siguientes");
        for(int i=0; i<carrosParticularDisponibles.size(); i++)
            System.out.println(carrosParticularDisponibles.get(i).toString());
        
         for(int i=0; i<carrosPublicosDisponibles.size(); i++)
            System.out.println(carrosPublicosDisponibles.get(i).toString());
        
    }
    
    public void mostrarVehiculosParticulares()
    {
    System.out.println("Los carros particulares que tenemos en el momento son los siguientes");
        for(int i=0; i<carrosParticularDisponibles.size(); i++)
            System.out.println(carrosParticularDisponibles.get(i).toString());
    }
    
    public void mostrarVehiculosPublicos()
    {
    System.out.println("Los carros publicos que tenemos en el momento son los siguientes");
        for(int i=0; i<carrosPublicosDisponibles.size(); i++)
            System.out.println(carrosPublicosDisponibles.get(i).toString());
    }
    
    
    public void buscarVehiculoPrecio()
    {
     
        Scanner keyboard = new Scanner(System.in);
      System.out.println("Buen dia, para buscar el vehiculo de acuerdo el precio, por favor digite si el vehiculo es particular o publico ");
      String ver= keyboard.next();
      
      if(ver.equals("particular"))
      {
       
        System.out.println("ingrese el precio del carro que quiere buscar");
        
        int m = keyboard.nextInt();
        
        for(int i=0; i<carrosParticularDisponibles.size(); i++)
        {
          if(carrosPublicosDisponibles.get(i).getValor()==m)
          {
           m=i;
           break;
          }
        }
        
       
      }else
      {
       
       
        System.out.println("ingrese el id del carro que quiere comprar");
        
        int p = keyboard.nextInt();
        for(int i=0; i<carrosPublicosDisponibles.size(); i++)
        {
          if(carrosPublicosDisponibles.get(i).getValor()==p)
          {
           p=i;
           break;
          }
        }
        
      }
      
      
      
    }
    
    
     public void buscarVehiculoModelo()
    {
     
        Scanner keyboard = new Scanner(System.in);
      System.out.println("Buen dia, para buscar el vehiculo de acuerdo el Modelo, por favor digite si el vehiculo es particular o publico ");
      String ver= keyboard.next();
      
      if(ver.equals("particular"))
      {
       
        System.out.println("ingrese el modelo del carro que quiere buscar");
        
        int m = keyboard.nextInt();
        
        for(int i=0; i<carrosParticularDisponibles.size(); i++)
        {
          if(carrosPublicosDisponibles.get(i).getModelo()==m)
          {
           m=i;
           break;
          }
        }
        
       
      }else
      {
       
       
        System.out.println("ingrese el modelo del carro que quiere comprar");
        
        int p = keyboard.nextInt();
        for(int i=0; i<carrosPublicosDisponibles.size(); i++)
        {
          if(carrosPublicosDisponibles.get(i).getModelo()==p)
          {
           p=i;
           break;
          }
        }
        
      }
      
   
    }
     
     public void ordenarModelo()
     {
     Collections.sort(carrosParticularDisponibles, new ComparatorModelo());
     Collections.sort(carrosPublicosDisponibles, new ComparatorModelo());
         
     Scanner keyboard = new Scanner(System.in);
         System.out.println("Buen dia, para ordenar el vehiculo de acuerdo el Modelo, por favor digite si el vehiculo es particular o publico ");
      String ver= keyboard.next();
      
      if(ver.equals("particular"))
      {
         
         for(Particular es: carrosParticularDisponibles )
         {
             System.out.println(es.toString());
         }
     
       }else
      {
       for(Publico n: carrosPublicosDisponibles )
         {
             System.out.println(n.toString());
         }

     }

      
  }

public void ordenarValor()
     {
     Collections.sort(carrosParticularDisponibles, new ComparatorPrecio());
     Collections.sort(carrosPublicosDisponibles, new ComparatorPrecio());
         
     Scanner keyboard = new Scanner(System.in);
         System.out.println("Buen dia, para ordenar el vehiculo de acuerdo el precio, por favor digite si el vehiculo es particular o publico ");
      String ver= keyboard.next();
      
      if(ver.equals("particular"))
      {
         
         for(Particular es: carrosParticularDisponibles )
         {
             System.out.println(es.toString());
         }
     
       }else
      {
       for(Publico n: carrosPublicosDisponibles )
         {
             System.out.println(n.toString());
         }

     }


   }

}
