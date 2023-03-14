
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Aerolinea {
    
    private List<Trabajador> tra ;
    private List<Cliente> cli;
    private List<Ticket> ti;
    private HashMap<Integer,Ruta> rut;
    private Grafo grr;
    private int numrut;
    

   
        
  

    public Aerolinea(List<Trabajador> tra, List<Cliente> cli, List<Ticket> ti, HashMap<Integer, Ruta> rut, Grafo grr, int numrut) {
        this.tra = new ArrayList<Trabajador>();
        this.cli = new ArrayList<Cliente>();
        this.ti = new ArrayList<Ticket>();
        this.rut = new HashMap<Integer,Ruta>();
        this.grr = new Grafo();
        this.numrut = numrut;
        
    }
    
      public Aerolinea()
    
    {
          this.tra = new ArrayList<Trabajador>();
        this.cli = new ArrayList<Cliente>();
        this.ti = new ArrayList<Ticket>();
        this.rut = new HashMap<Integer,Ruta>();
        this.grr = new Grafo();
        this.numrut=0;
    
    }

    public List<Trabajador> getTra() {
        return tra;
    }

    public void setTra(List<Trabajador> tra) {
        this.tra = tra;
    }

    public List<Cliente> getCli() {
        return cli;
    }

    public void setCli(List<Cliente> cli) {
        this.cli = cli;
    }

    public List<Ticket> getTi() {
        return ti;
    }

    public void setTi(List<Ticket> ti) {
        this.ti = ti;
    }

    public HashMap<Integer, Ruta> getRut() {
        return rut;
    }

    public void setRut(HashMap<Integer, Ruta> rut) {
        this.rut = rut;
    }

    public Grafo getGrr() {
        return grr;
    }

    public void setGrr(Grafo grr) {
        this.grr = grr;
    }

    public int getNumrut() {
        return numrut;
    }

    public void setNumrut(int numrut) {
        this.numrut = numrut;
    }

    @Override
    public String toString() {
        return "Aerolinea{" + "tra=" + tra + ", cli=" + cli + ", ti=" + ti + ", rut=" + rut + ", grr=" + grr + ", numrut=" + numrut + '}';
    }

   

   
    
    

    
    
    
    public void infoTrabajador()
    {
        
        Scanner keyboard = new  Scanner(System.in);
        Trabajador t = new Trabajador();
        System.out.println("ingrese su nombre por favor");
        t.setNombre(keyboard.next());
        tra.add(t);
       System.out.println("ingrese su apellido por favor");
        t.setApellido(keyboard.next());
        tra.add(t);
        System.out.println("ingrese su id por favor");
        t.setId(keyboard.nextInt());
        tra.add(t);
        
        
    }
    
    public void infoCliente()
    {
        
        Scanner keyboard = new  Scanner(System.in);
        Cliente cl = new Cliente();
        System.out.println("ingrese su nombre por favor");
        cl.setNombre(keyboard.next());
        cli.add(cl);
       System.out.println("ingrese su apellido por favor");
        cl.setApellido(keyboard.next());
        cli.add(cl);
        System.out.println("ingrese su id por favor");
        cl.setId(keyboard.nextInt());
        cli.add(cl);
       
        
        
    }
    
    public void registrarCiudades()
    { 
        
        Nodo n1 = new Nodo(new Ciudad("bogota","colombia","2640 m","15 °C" ));
        Nodo n2 = new Nodo(new Ciudad("madrid","españa","820 m","11 °C" ));
        Nodo n3 = new Nodo(new Ciudad("lima","peru","2.87 m ","19 °C" ));
        Nodo n4 = new Nodo(new Ciudad("paris","francia","35 m","8 °C" ));
      
        
        n1.añadirArco(new Arco(8007, true, n1, n3));
        n2.añadirArco(new Arco(1276, true, n2, n4));
        n3.añadirArco(new Arco(9503, true, n3, n2));
        n4.añadirArco(new Arco(8617, true, n4, n1));
        
           
        
        grr.agregarNodo(n1);
        grr.agregarNodo(n2);
        grr.agregarNodo(n3);
        grr.agregarNodo(n4);
        
        
        System.out.println(grr);
        
        
    
    }
    
    public void guardarRutas()
    {
        
      
        for(Nodo n: grr.getNodos())
       {
           
            for(Arco a: n.getArc())
            {
                
                System.out.println("guardar ruta de: "+n.getCiu()+ "a" +a.getDestino().getCiu());
                rut.put(numrut, new Ruta(a.getOrigen().getCiu().getNombre(),a.getDestino().getCiu().getNombre(),a.getPeso()/2,"nocturno",a.getPeso(),"En transito"));
                recursiva(n.getCiu().getNombre(),a.getDestino());
             
             
            }
          
       }
        
       
           
       }
    
    
    public void recursiva(String origen, Nodo n)
    {
       if(n.getArc() != null)
       {
          for(Arco a: n.getArc())
          {
              if(!origen.equals(a.getDestino().getCiu().getNombre()))
              {
                 System.out.println("guardar ruta de: "+origen+ "a" +a.getDestino().getCiu());
              rut.put(numrut, new Ruta(a.getOrigen().getCiu().getNombre(),a.getDestino().getCiu().getNombre(),a.getPeso()/2,"nocturno",a.getPeso(),"En transito"));
              recursiva(origen, a.getDestino());
              
              }
             
              
          }
       
       }
    
    }
    
    public void mostrarRuta()
    {
        for(Integer i: rut.keySet())
        {
          Iterator it = rut.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry<Integer, Ruta> entry = (Map.Entry)it.next();
	        System.out.println(entry.getKey() + " = " + entry.getValue()); 
	    }
        }
    
    }
    
    
    
    
    
    public void crearTicket()
    
    {
       Ticket tc = new Ticket();
       Scanner keyboard = new  Scanner(System.in);
        
        System.out.println("Nombre de la aerolinea");
        tc.getNombreempresa();
        
        
        System.out.println("ingrese su nombre completo por favor");
        tc.setNombrecom(keyboard.nextLine());
        
        
         System.out.println("ingrese la fecha del dia cuando compro el tickete");
        tc.setFecha(keyboard.nextLine());
        
        
        System.out.println("ingrese la cantidad de asientos que quiere comprar ");
        tc.setCantdasiento(keyboard.nextInt());
        ti.add(tc);
        
        
        System.out.println(ti);
        
       
        
    
    }
    
}
