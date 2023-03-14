/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class InicioInfoSteam {
    
    private Infosteam1 info;
    
    public InicioInfoSteam()
    {
      this.info = new Infosteam1();
    
    }

    public void setInfo(Infosteam1 info) {
        this.info = info;
    }

    public Infosteam1 getInfo() {
        return info;
    }
    
 
    public static void main(String[] args) {
        
        
        InicioInfoSteam start = new InicioInfoSteam();
        start.info.menu();
    }
}
