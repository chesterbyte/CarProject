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
public class Car {
    
    private String make;
    
    public Car(){
        System.out.println("---Start constructing (Car)---");
    }
    
    public void setMake(String make){
        this.make = make;
    }
    
    protected String getMake(){
        return this.make;
    }
}
