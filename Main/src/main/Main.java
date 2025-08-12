/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SportsCar car1 = new SportsCar();
        car1.setMake("Mercedes-Benz");
        System.out.println(car1.beep());
        
        SportsCar car2 = new SportsCar();
        car2.setMake("Audi");
        System.out.println(car2.beep());
        
    }
    
}
