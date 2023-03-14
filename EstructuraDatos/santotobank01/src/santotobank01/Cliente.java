/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santotobank01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


/**
 *
 * @author LENOVO
 */
public class Cliente{
    
    private String name;
    private List<Cuenta> cu;
    private Queue<Integer> fila;

    public Cliente(String name, List<Cuenta> cu, Queue<Integer> fila) {
        this.name = name;
        this.cu = new LinkedList<Cuenta>();
        this.fila = new LinkedList<Integer>();
    }
    
    public Cliente()
    {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cuenta> getCu() {
        return cu;
    }

    public void setCu(List<Cuenta> cu) {
        this.cu = cu;
    }

    public Queue<Integer> getFila() {
        return fila;
    }

    public void setFila(Queue<Integer> fila) {
        this.fila = fila;
    }

    @Override
    public String toString() {
        return "Cliente{" + "name=" + name + ", cu=" + cu + ", fila=" + fila + '}';
    }
    
    


    
   
    

    public void nuevaCuenta() {
        int id;
        
        int pass;
        int ncuenta;
        Scanner keyboard = new Scanner(System.in);
       

        System.out.println("¿Cuantas cuentas quiere crear?");
        ncuenta = keyboard.nextInt();
        for (int i = 0; i < ncuenta; i++) {
            System.out.println("Numero de cuenta: ");
            id = keyboard.nextInt();
           
            
           
            System.out.println("Clave, por favor evite inciar con el cero: ");
            pass = keyboard.nextInt();
            
            cu.add(new Cuenta(id, pass));

            
        }
    }
    
    public void nuevaPass()
    {
        Cuenta c1 = new Cuenta();
         Scanner keyboard= new Scanner(System.in);
        System.out.println("ingrese la nueva contraseña, por favor evite inciar con el cero");
        int npass = keyboard.nextInt();
        c1.setClave(npass);
        
      
    }

    
}

    
