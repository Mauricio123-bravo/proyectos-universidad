/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Ventas {
    
    private String dia;
    private double total;
    private Pan bolsapan[];
    private int sizemaxpan;
    
    
    public Ventas()
    { 
        this.dia = dia;
        this.total= 0;
        this.sizemaxpan = 100;
        this.bolsapan = new Pan[sizemaxpan];
        
        for(int b=0;b<sizemaxpan;b++)
        {
         bolsapan[b] = new Pan();
        }
    
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setBolsapan(Pan[] bolsapan) {
        this.bolsapan = bolsapan;
    }

    public void setSizemaxpan(int sizemaxpan) {
        this.sizemaxpan = sizemaxpan;
    }

    public String getDia() {
        return dia;
    }

    public double getTotal() {
        return total;
    }

    public Pan[] getBolsapan() {
        return bolsapan;
    }

    public int getSizemaxpan() {
        return sizemaxpan;
    }

    
    



}

