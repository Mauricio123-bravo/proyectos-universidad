/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santotobank01;

/**
 *
 * @author LENOVO
 */
public class Cuenta {
    
    private int numCuenta;
    private int clave;
    private double saldo = 1000;
    
    public Cuenta(int numCuenta, int clave) {
        this.numCuenta = numCuenta;
        this.clave = clave;
      
    }
    
    public Cuenta()
    {
    
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
    
    
    
}



    

