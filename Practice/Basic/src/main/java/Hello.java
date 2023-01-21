/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habibun
 */
public class Hello {
    public static void main(String[] args)
    {
        String name = "Jony";
        int x = 10;
        int y = 5, z = 10;
        char singleCharacter = 'S';
        boolean b = true;
        float de = 19.4f;
        String message = "Hello world";
        String messageLength = "Hello world";
        String firstName = "John";
        String lastName = "Doe";
        String text = "it's my name";
        String[] car = {"t", "b"};
//        System.out.println("Hello " + name + " " + z + " " + firstName.concat(lastName) + " " + car[0]);
//        MyNameWithParam("jony");
        
        int[] testArr = {4, 5, 6, 10};
        for(int i = 0; i < testArr.length; i++) {
            System.out.printf("The value of testArr[%d] is %d \n", i, testArr[i]);
        }
    }
    
    public static void myName()
    {
        System.out.println("My name is jony!");
    }
    
    public static void MyNameWithParam(String name)
    {
        System.out.println("My name is " + name);
    }
}
