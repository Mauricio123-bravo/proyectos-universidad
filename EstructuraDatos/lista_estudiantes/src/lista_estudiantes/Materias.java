/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_estudiantes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Materias {
    
    
    
    private String nombre;
    
    List<Materias> subjects = new ArrayList<Materias>();
    
    public Materias() {
        this.nombre = "";
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    

    

    public void completeInfo() {
        System.out.println("ingrese la cantidad de materias");

        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        
        for(int i = 0; i < num; i++){
            System.out.println("digite el nombre de las materias");
            setNombre(keyboard.next());

            

            subjects.add(new Materias());
        }

        Collections.sort(subjects, new CompareMaterias());

        for(Materias sub : subjects)
        System.out.println(sub.toString());
    }

    
}
    

