/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;



/**
 *
 * @author LENOVO
 */
public class Ticket {
    
   private String nombrecom; 
   private String nombreempresa="Aerolínea Saint Tomas ";
   private String fecha;
    private int cantdasiento;
   
   
   
   public Ticket()
   {
   
   }

    public Ticket(String nombrecom, String fecha, int cantdasiento) {
        this.nombrecom = nombrecom;
        this.fecha = fecha;
       
        this.cantdasiento = cantdasiento;
    }

    public String getNombrecom() {
        return nombrecom;
    }

    public void setNombrecom(String nombrecom) {
        this.nombrecom = nombrecom;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   
    public int getCantdasiento() {
        return cantdasiento;
    }

    public void setCantdasiento(int cantdasiento) {
        this.cantdasiento = cantdasiento;
    }

    @Override
    public String toString() {
        return "Ticket{" + "nombrecom=" + nombrecom + ", nombreempresa=" + nombreempresa + ", fecha=" + fecha + ", cantdasiento=" + cantdasiento + '}';
    }

   
    
   
   
   
   
   
   
    
}
