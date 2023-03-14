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
public class Ruta{
   private String origen;
   private String destino;
   private int timeporuta;
   private String horario;
   private int milla;
   private String estado;

    public Ruta(String origen, String destino, int timeporuta, String horario, int milla, String estado) {
        this.origen = origen;
        this.destino = destino;
        this.timeporuta = timeporuta;
        this.horario = horario;
        this.milla = milla;
        this.estado = estado;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTimeporuta() {
        return timeporuta;
    }

    public void setTimeporuta(int timeporuta) {
        this.timeporuta = timeporuta;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getMilla() {
        return milla;
    }

    public void setMilla(int milla) {
        this.milla = milla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ciudades{" + "origen=" + origen + ", destino=" + destino + ", timeporuta=" + timeporuta + ", horario=" + horario + ", milla=" + milla + ", estado=" + estado + '}';
    }
   
  
    
}
