/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Pan panes[];
        panes = new Pan[4];
         for (int i=0; i<=panes.length-1;i++)
         {
            panes[i] = new Pan();
         }
         Scanner sc = new Scanner(System.in);
         for (int i=0; i<=panes.length-1;i++)
        {
            System.out.println("Digite tipo, precio y numero de panes");
            panes[i] = new Pan(sc.next(), sc.nextInt(), sc.nextInt());
            panes[i].setTipo(sc.next());
            panes[i].setPrecio(sc.nextInt());
            panes[i].setNumeroPanes(sc.nextInt());
            
        }
    }
    
}
