/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habibun
 */
public class AbstractClasses {
    public static void main(String[] args)
    {
        N n = new N();
        System.out.println(n.getFuel());
        n.run();
    }
}


abstract class V {
    int fuel;
    int getFuel()
    {
        return this.fuel;
    }
    
    abstract void run();
}


class N extends V {
    void run()
    {
        System.out.println("sdf");
    }
}