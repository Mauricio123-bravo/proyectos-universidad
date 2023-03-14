/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santotobank1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Cuenta {
    
    private int numCuenta;
    private int clave;
    private double saldo = 100;
    private double saldototal;

    public Cuenta(int numCuenta, int clave ) {
        this.numCuenta = numCuenta;
        this.clave = clave;
    }
    
    
    
    public Cuenta()
    {
    
    }

    public double getSaldototal() {
        return saldototal;
    }

    public void setSaldototal(double saldototal) {
        this.saldototal = saldototal;
    }

   
    
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numCuenta=" + numCuenta + ", clave=" + clave + ", saldo=" + saldo + '}';
    }
    
    
    public void saldo()
    {
      Scanner keyboard= new Scanner(System.in);
       System.out.println("su saldo es de: "+getSaldo()+ "esto el banco se lo obsequio como bienvenida");
                              System.out.println("cuanto dinero desea ingresar a su cuenta: ");
                              double s = keyboard.nextDouble();
                              double sto= s+getSaldo();
                              setSaldototal(sto);
                              System.out.println("su saldo actual es de: "+sto);
                              
                              
    
    }
    
    public void retira()
    { 
        Scanner keyboard= new Scanner(System.in);
        System.out.println("conciendo que su saldo actual es: "+getSaldototal()+ "cuanto dinero desea retirar");
        double r = keyboard.nextDouble();
        double retirar = getSaldototal()-r;
        
        setSaldototal(retirar);
        System.out.println("su saldo actual es "+retirar);
        
    
    }
    
}



    


