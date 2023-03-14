


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Producto {

  

   
    
    
    private String nombre;
    private String tipo;
    private List<String> componentes;

    

    public Producto(String nombre, String tipo, List<String> componentes) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.componentes = componentes;
    }
    
    public Producto()
    {
     componentes = new ArrayList<>();
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<String> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<String> componentes) {
        this.componentes = componentes;
    }
    
      @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", tipo=" + tipo + ", componentes=" + componentes + '}';
    }

}
