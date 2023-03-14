  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Juego {

    
     private String nombre;
     private  int precio;
    private String desarrollador;
    private int fechaLanzamiento;
     
     
    public Juego()
    {
       this.nombre="";
       this.precio=0;
       this.desarrollador="";
       this.fechaLanzamiento=0;
    
    }
    
    
     public Juego(String nombre, int precio, String desarrollador, int fechaLanzamiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.desarrollador = desarrollador;
        this.fechaLanzamiento = fechaLanzamiento;
    }
   
    
    public String getNombre() {
        return nombre;
    }

    public  int  getPrecio() {
        return precio;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    
    
    
     
}
