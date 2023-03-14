/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author LENOVO
 */
public class Arcos {

   
    private int peso;
    private boolean direccion;
    private Nodos origen;
    private Nodos destino;

    public Arcos(int peso, boolean direccion, Nodos origen, Nodos destino) {
        this.peso = peso;
        this.direccion = direccion;
        this.origen = origen;
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isDireccion() {
        return direccion;
    }

    public void setDireccion(boolean direccion) {
        this.direccion = direccion;
    }

    public Nodos getOrigen() {
        return origen;
    }

    public void setOrigen(Nodos origen) {
        this.origen = origen;
    }

    public Nodos getDestino() {
        return destino;
    }

    public void setDestino(Nodos destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Arcos{" + "peso=" + peso + ", direccion=" + direccion + ", origen=" + origen.getCiudades() + ", destino=" + destino.getCiudades() + '}';
    }
    
    
    

    
    
}
