/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_estudiantes;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Asignatura {
    private String nombreAsignatura;
    private Estudiante listaEstudiante[];
    private String nota;
    
    public Asignatura() {
        this.nombreAsignatura = "";
        this.listaEstudiante = new Estudiante[5];
        
        for(int i = 0; i < listaEstudiante.length; i++)
        listaEstudiante[i] = new Estudiante();
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public Estudiante[] getListEstudiante() {
        return listaEstudiante;
    }

    public void setListEstudiante(Estudiante[] listEstudiante) {
        this.listaEstudiante = listEstudiante;
    }

    public void estudiantes() {
        Scanner sc = new Scanner(System.in);
        double suma = 0; 
        int elem = 7;
        double prom = 0;

        for(int i = 0; i<listaEstudiante.length ; i++){
            System.out.println("Ingrese su nombre: " +i);
            listaEstudiante[i].setNombre(sc.next());
                
            System.out.println("Ingrese su apellido: "+i);
            listaEstudiante[i].setApellido(sc.next());

            for(int a = 0; a <listaEstudiante[i].getNota().length; a++){
                System.out.println("Ingrese la nota " + a+1);
                listaEstudiante[i].getNota()[a] = sc.nextDouble();
            }
        }

        for(int i = 0; i < listaEstudiante[i].getNota().length; i++){
            for(int b = 0; b < listaEstudiante[i].getNota()[b]; b++)
            suma = suma + listaEstudiante[i].getNota()[b];
            prom = suma/elem;
        }
        
        for(int i = 0; i<listaEstudiante.length; i++)
        System.out.println("el promedio de el estudiante "+ listaEstudiante[i].getNombre()+listaEstudiante[i].getApellido()+" es: "+prom);
    }
    
    public void mayor()
    {
        for(int a=0; a<listaEstudiante.length; a++)
        {
          
            listaEstudiante[a].notaMayor();
        
        }
    
    }
    
    public void menor()
    
    {
    
         for(int a=0; a<listaEstudiante.length; a++)
        {
          
            listaEstudiante[a].notaMenor();
        
        }
    }
    
    public void calcularMayor()
    {
         double mayor = 0;
    for(int a=0; a<listaEstudiante.length; a++)
        {
          
           if(listaEstudiante[a].getNotaMayor()>mayor)
           {
              mayor= listaEstudiante[a].getNotaMayor();
           }
        
        }
    
        System.out.println("la nota mayor es " + mayor);
    }
    
    public void calcularMenor()
    {
         double menor ;
         menor=listaEstudiante[0].getNotaMenor();
         
    for(int a=0; a<listaEstudiante.length; a++)
        {
          
           if(listaEstudiante[a].getNotaMenor()<menor)
           {
              menor= listaEstudiante[a].getNotaMenor();
           }
        
        }
    
        System.out.println("la nota mayor es " + menor);
    }
    
    
    public  void burbuja ()
            
    {
      
       for(int i=0;i<listaEstudiante.length-1;i++)
       {
          for(int j=i+1;j<listaEstudiante.length;j++)
          
            if(listaEstudiante[i].getApellido().compareTo(listaEstudiante[j].getApellido())>0)
            {
              Estudiante aux=listaEstudiante[i];
              listaEstudiante[i]=listaEstudiante[j];
              listaEstudiante[j]=aux;
            }
          
       }
       
    }
    
    public  void  seleccion() {
          int i, j,pos;
          Estudiante tmp;
          
          for (i = 0; i < listaEstudiante.length - 1; i++) {      // tomamos como menor el primero
                Estudiante menor = listaEstudiante[i];                       // de los elementos que quedan por ordenar                    
                
                pos = i;                            // y guardamos su posición
                for (j = i + 1; j < listaEstudiante.length; j++){ // buscamos en el resto
                      if (listaEstudiante[j].getApellido().compareTo(menor.getApellido())>0) {           // del array algún elemento
                          menor = listaEstudiante[j];             // menor que el actual
                          pos = j;
                      }
                }
                if (pos != i){                      // si hay alguno menor se intercambia                         
                    tmp = listaEstudiante[i];
                    listaEstudiante[i] = listaEstudiante[pos];
                    listaEstudiante[pos]= tmp;
                }
          }
          
        
    }
    
    public void mostrar()
       {
          for(int i=0;i<listaEstudiante.length;i++)
              System.out.println(listaEstudiante[i].toString());
         
       }
}

    

