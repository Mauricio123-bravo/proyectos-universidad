/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Pan {
    
    private String tipo;
    private int precio;
    private int numeropan;

   
    
    public Pan()
    {
        this.tipo = "";
        this.precio= 0;
        this.numeropan=0;
    
    }

    public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
     public int getNumeropan() {
        return numeropan;
    }

    public void setNumeropan(int numeropan) {
        this.numeropan = numeropan;
    }
    
}
