/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Panaderia {
    
    private Ventas venta[];
    private Pan panesmostrados[];

    
    
    public Panaderia()
    {
       this.venta= new Ventas[20];
       for(int a=0;a<venta.length;a++)
       {
           venta[a]= new Ventas();
       }
       
       this.panesmostrados = new Pan [6];
       for(int a=0;a<panesmostrados.length;a++)
       {
           panesmostrados[a]= new Pan();
       }
    }

    public void setVenta(Ventas[] venta) {
        this.venta = venta;
    }

    public Ventas[] getVenta() {
        return venta;
    }
    
    public void setPanesmostrados(Pan[] panesmostrados) {
        this.panesmostrados = panesmostrados;
    }

    public Pan[] getPanesmostrados() {
        return panesmostrados;
    }

    
    
    public void llenarPanaderia()
    {
      
        panesmostrados[0].setNumeropan(100);
        panesmostrados[0].setPrecio(500);
        panesmostrados[0].setTipo("hojaldrado");
        
        panesmostrados[1].setNumeropan(75);
        panesmostrados[1].setPrecio(300);
        panesmostrados[1].setTipo("blandito");
        
        panesmostrados[2].setNumeropan(200);
        panesmostrados[2].setPrecio(400);
        panesmostrados[2].setTipo("mogolla");
        
        panesmostrados[3].setNumeropan(50);
        panesmostrados[3].setPrecio(700);
        panesmostrados[3].setTipo("roscon");
        
        panesmostrados[4].setNumeropan(250);
        panesmostrados[4].setPrecio(1000);
        panesmostrados[4].setTipo("pan nuevo");
        
        
        panesmostrados[5].setNumeropan(20);
        panesmostrados[5].setPrecio(100);
        panesmostrados[5].setTipo("pan viejo");
        
    
    }
    
}
