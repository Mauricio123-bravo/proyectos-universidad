
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


public class Usuario {

 
    
  
    
    private int numerousu;
    private String nombre;
    private String apellido;
    private int numcuentas;
    private Cuenta cuentas[];
    private double saldo;
    private double saldoMenor;
    
    

    public Usuario()
   {
     this.apellido="";
     this.saldo=0;
     this.saldoMenor=0;
     this.nombre="";
     this.numerousu=0;
     this.numcuentas= 0;
     this.cuentas=new Cuenta [3];
     for(int i = 0; i < cuentas.length; i++);
     
     
     
   
   }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }
    
    
    public int getNumerousu() {
        return numerousu;
    }

    public void setNumerousu(int numerousu) {
        this.numerousu = numerousu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public int getNumcuentas() {
        return numcuentas;
    }

    public void setNumcuentas(int numcuentas) {
        this.numcuentas = numcuentas;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
   
    
        
        
   
    

    
    public void menorAhorros()
        {
          String ahorros="Ahorros";
          
          Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i<cuentas.length ; i++){
            System.out.println("Ingrese el saldo de la cuenta: " +i);
            saldo=keyboard.nextDouble();
          for(int a = 0; a <cuentas[i].getSucuenta().length; a++){
                System.out.println("Ingrese si tiene cuenta Corriente o de Ahorros" + a);
                cuentas[i].getSucuenta()[a] = keyboard.next();
            }
          if(cuentas[i].getSucuenta().equals(ahorros))
          {
             double menor;
        
        
            menor=saldo;
         
         for (int b=0;b<saldo; b++)
         {
             if(saldo<menor)
             {
              menor=saldo;
             }
             
             
         }
         
         System.out.println("el saldo menor es " +menor);
         saldoMenor=menor;
          }
        }
    

    }

}