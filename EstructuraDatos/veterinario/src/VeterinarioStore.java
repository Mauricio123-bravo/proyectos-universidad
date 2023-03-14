/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LENOVO
 */
public class VeterinarioStore {

    private Veterinario vete;
    
    public static void main(String[] args) {
        
        VeterinarioStore miobjeto = new VeterinarioStore();
        
        miobjeto.vete = new Veterinario();
        miobjeto.vete.buscarAnimal();
        miobjeto.vete.dato();
        miobjeto.vete.organizarTriage();
        
    }
    
}
