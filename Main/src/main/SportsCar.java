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
public class SportsCar extends Car {
    
    public SportsCar(){
        super();
        System.out.println("---Start constructing (SportsCar)---");
    }
    
    public String beep(){
        return "Beep! I am a " + getMake();
    }
}
