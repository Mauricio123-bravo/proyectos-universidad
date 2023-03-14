/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Usuario {

   
    private String usuario;
    private String pass;

   
    
    public Usuario()
    {
       this.usuario="";
       this.pass="";
              
    
    }
    
     public Usuario(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }
     
     public String getUsuario() {
        return usuario;
    }

    public String getPass() {
        return pass;
    }
    
     public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
     
}

