/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_pila;

/**
 *
 * @author LENOVO
 */
public class Ficha {

   
    
    private int numero;
    private String color;
    
    
    public Ficha()
    {
    
    }

    public Ficha(int numero, String color) {
        this.numero = numero;
        this.color = color;
    }
    
     
    
    @Override
    public String toString() {
        return "Ficha{" + "numero=" + numero + ", color=" + color + '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
