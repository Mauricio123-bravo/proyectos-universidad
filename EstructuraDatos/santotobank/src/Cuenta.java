
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
public class Cuenta {
    
    private int numero;
    private Usuario tipo[];
    private String sucuenta[];
    
    
    public Cuenta()
    {
        this.numero=0;
        
        this.sucuenta= new String[2];
        for(int i = 0; i < sucuenta.length; i++)
        sucuenta[i] = new String();
        this.tipo = new Usuario[2];
        for(int i = 0; i < tipo.length; i++)
        tipo[i] = new Usuario();
    
    }

    public Usuario[] getTipo() {
        return tipo;
    }

    public void setTipo(Usuario[] tipo) {
        this.tipo = tipo;
    }

    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    

    
     public String[] getSucuenta() {
        return sucuenta;
    }

    public void setSucuenta(String[] sucuenta) {
        this.sucuenta = sucuenta;
    }
    
    
    
    public void datosCuenta()
    {
     
        
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i<tipo.length ; i++){
            System.out.println("Ingrese su nombre: " +i);
            tipo[i].setNombre(keyboard.next());
                
            System.out.println("Ingrese su apellido: "+i);
            tipo[i].setApellido(keyboard.next());
            
            System.out.println("cuantas cuentas posee: "+i);
            tipo[i].setNumcuentas(keyboard.nextInt());
            for(int j=0; i<tipo[i].getNumcuentas(); j++);
            if(tipo[i].getNumcuentas()>3)
            {
              System.out.println("No puede tener mas de 3 cuentas");
            }
            
            System.out.println("Ingrese su usuario: " +i);
            tipo[i].setNumerousu(keyboard.nextInt());
 
            
            
            
           
        }
    
        
        
      
    }
   
   public  void organizar ()
            
    {
        
      Scanner keyboard = new Scanner(System.in);
       for(int i=0;i<tipo.length-1;i++)
       { 
            
           
           
            System.out.println("Ingrese su nombre: " +i);
            tipo[i].setNombre(keyboard.next());
          
       }
         
          for(int i=0;i<tipo.length-1;i++)
       { 
          for(int j=i+1;j<tipo.length;j++)
          
            if(tipo[i].getNombre().compareTo(tipo[j].getNombre())>0)
            {
              Usuario aux=tipo[i];
              tipo[i]=tipo[j];
              tipo[j]=aux;
            }
          
       }
    
    
    }
   
   public void mostrar()
       {
          for(int i=0;i<tipo.length;i++)
              System.out.println(tipo[i].toString());
         
       }
   
}
