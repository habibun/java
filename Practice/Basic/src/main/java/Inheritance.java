/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habibun
 */



public class Inheritance {
    public static void main(String[] args)
    {
        Car c = new Car();
        System.out.println(c.brand);
        c.honk();
    }
}

class Vehicle{
    String brand = "Ford";
    
    public void honk()
    {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    
    String brand = "Mustang";
}