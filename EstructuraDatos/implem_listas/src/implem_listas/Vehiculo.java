/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implem_listas;

/**
 *
 * @author LENOVO
 */
public class Vehiculo {

    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", valor=" + valor + ", tipoCombustible=" + tipoCombustible + ", modelo=" + modelo + ", estado=" + estado + '}';
    }
    
    private int id;
    private double valor;
    private String tipoCombustible;
    private int modelo;
    private String estado;

    public Vehiculo(int id, double valor, String tipoCombustible, int modelo, String estado) {
        this.id = 0;
        this.valor = 0;
        this.tipoCombustible = "";
        this.modelo = 0;
        this.estado = "";
    }
    
    public Vehiculo()
    {
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
