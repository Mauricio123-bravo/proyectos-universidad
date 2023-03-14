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
public class Publico extends Vehiculo{
    
    private int capacidad;
    private String tipo;
    private boolean cupo;

    public Publico(int id, double valor, String tipoCombustible, int modelo, String estado,int capacidad, String tipo, boolean cupo) {
        super(id,valor,tipoCombustible,modelo,estado);
        this.capacidad = 0;
        this.tipo = "";
        this.cupo = true;
    }
    
    public Publico()
    {
    
    }

    @Override
    public String toString() {
        return "Publico{" + "capacidad=" + capacidad + ", tipo=" + tipo + ", cupo=" + cupo + ",  id=" + this.getId()+ ",  Estado=" +  this.getEstado()+ ",  Tipo de Combustible=" + this.getTipoCombustible()+ ",  Modelo=" +  this.getModelo()+  ",  Valor=" +  this.getValor()+'}';
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isCupo() {
        return cupo;
    }

    public void setCupo(boolean cupo) {
        this.cupo = cupo;
    }
    
    
    
    
}
