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
public class Arco {
    private int peso;
    private boolean direccion;
    private Nodo origen;
    private Nodo destino;

    public Arco(int peso, boolean direccion, Nodo origen, Nodo destino) {
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

    public Nodo getOrigen() {
        return origen;
    }

    public void setOrigen(Nodo origen) {
        this.origen = origen;
    }

    public Nodo getDestino() {
        return destino;
    }

    public void setDestino(Nodo destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Arco{" + "peso=" + peso + ", direccion=" + direccion + ", origen=" + origen.getCiu()+ ", destino=" + destino.getCiu() + '}';
    }
    
    
    
}
