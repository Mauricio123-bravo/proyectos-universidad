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
public class Ciudad {
    
    private String nombre;
private String país;
private String altura;
private String clima;

    public Ciudad(String nombre, String país, String altura, String clima) {
        this.nombre = nombre;
        this.país = país;
        this.altura = altura;
        this.clima = clima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", pa\u00eds=" + país + ", altura=" + altura + ", clima=" + clima + '}';
    }


    
    
    
}
