/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habibun
 */
public class GenericMethodDemo {
    public static <GM> void genericDisplay(GM element)
    {
        System.out.println(element.getClass().getName() + " = " + element);
    }
    
    public static void main(String[] args)
    {
        genericDisplay(2);
        genericDisplay("test");
        genericDisplay(2.4);
    }
}
