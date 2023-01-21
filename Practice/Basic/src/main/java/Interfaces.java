/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habibun
 */
public class Interfaces {
    public static void main(String[] args)
    {
        CarNew c = new CarNew();
        c.getColor();
        System.out.println(c.getFuel());
    }
    
}

interface VehicleNew {
    void getColor();
    int getFuel();
}


class CarNew implements VehicleNew {
    
    public void getColor()
    {
        System.out.println("red");
    }


    public int getFuel() {
        return 5;
    }
    
}
