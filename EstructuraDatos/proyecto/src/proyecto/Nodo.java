/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Nodo {
    
    private Ciudad ciu;
    private List<Arco> arc;

    public Nodo(Ciudad ciu) {
        this.ciu = ciu;
        this.arc = new ArrayList<Arco>();
    }

    public Ciudad getCiu() {
        return ciu;
    }

    public void setCiu(Ciudad ciu) {
        this.ciu = ciu;
    }

    public List<Arco> getArc() {
        return arc;
    }

    public void setArc(List<Arco> arc) {
        this.arc = arc;
    }

    @Override
    public String toString() {
        return "Nodo{" + "ciuad=" + ciu.getNombre() + ", arco=" + arc + '}';
    }
    
    
    
  

    
     public void añadirArco(Arco a)
    {
     if(a == null)
     {
      arc = new ArrayList<>();
     }
     
     arc.add(a);
     
    }
     
    
}
