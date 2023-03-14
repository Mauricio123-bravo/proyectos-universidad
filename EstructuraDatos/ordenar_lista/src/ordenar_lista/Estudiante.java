/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar_lista;

/**
 *
 * @author LENOVO
 */
public class Estudiante {

    
    
    
     private String nombre;
    private int edad;
    private int semestre;
    private double notas[]; 
    
    public Estudiante()
    {
      this.nombre = "";
      this.edad=0;
      this.semestre=0;
      this.notas = new double[5];
      for(int i=0; i<notas.length; i++)
      {
          notas[i]= 0;
      }
    }
    
    public Estudiante(String nombre, int edad, int semestre, double[] notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.semestre = semestre;
        this.notas = notas;
    }

   
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
   
    
    
    
    
   
}
