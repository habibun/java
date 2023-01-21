/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habibun
 */
public class GenericClassDemo {
    public static void main(String[] args)
    {
        Generic<Integer> integerBox = new Generic<Integer>();
        Generic<String> stringBox = new Generic<String>();
        
        integerBox.set(3);
        stringBox.set("test");
        
        System.out.println(integerBox.get());
        System.out.println(stringBox.get());
    }
}


class Generic<G> {
    private G g;
    
    public void set(G g) 
    {
        this.g = g;
    }
    
    public G get()
    {
        return g;
    }
}