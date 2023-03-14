/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlinked;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Mainlinked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("toyota");
        cars.add("bmw");
        cars.add("mitsubichi");
        cars.add("volvo");
        
        System.out.println(cars);
        
        cars.addFirst("dahiatsu");
        cars.addLast("nissan");
        
        System.out.println(cars);
        System.out.println("primero " +cars.getFirst());
        System.out.println("ultimo " +cars.getLast());
        
        
        cars.removeFirst();
        cars.removeLast();
        
        System.out.println(cars);
        System.out.println("primero " +cars.getFirst());
        System.out.println("ultimo " +cars.getLast());
        
    }
    
}
