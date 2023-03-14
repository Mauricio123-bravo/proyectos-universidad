    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Nodos {
    
    private  String ciudades ;
    
    List<Arcos> arcos ;

    public Nodos(String ciudades) {
        this.ciudades = ciudades;
        this.arcos = new ArrayList<Arcos>();
    }

    public String getCiudades() {
        return ciudades;
    }

    public void setNumeros(String ciudades) {
        this.ciudades = ciudades;
    }

    public List<Arcos> getArcos() {
        return arcos;
    }

    public void setArcos(List<Arcos> arcos) {
        this.arcos = arcos;
    }

    @Override
    public String toString() {
        return "Nodos{" + "numeros=" + ciudades + ", arcos=" + arcos + '}';
    }
    
     public void añadirArco(Arcos ar)
    {
     if(arcos == null)
     {
      arcos = new ArrayList<>();
     }
     
     arcos.add(ar);
     
    }
     
     
    
    
}
