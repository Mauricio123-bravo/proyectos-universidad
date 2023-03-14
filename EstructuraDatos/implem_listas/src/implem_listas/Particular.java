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
public class Particular extends Vehiculo{
    
    private int numPuertas;
    private String color;
    private String tipoMotor;

    public Particular(int id, double valor, String tipoCombustible, int modelo, String estado,int numPuertas, String color, String tipoMotor) {
        super(id,valor,tipoCombustible,modelo,estado);
        this.numPuertas = 0;
        this.color = "";
        this.tipoMotor = "";
        
    }
    
    
    public Particular()
    {
    
    }

    @Override
    public String toString() {
        return "Particular{" + "numPuertas=" + numPuertas + ", color=" + color + ", tipoMotor=" + tipoMotor + ",  id=" + this.getId()+ ",  Estado=" +  this.getEstado()+ ",  Tipo de Combustible=" + this.getTipoCombustible()+ ",  Modelo=" +  this.getModelo()+  ",  Valor=" +  this.getValor()+'}';
    }

   

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    
    
    
    
    
}
