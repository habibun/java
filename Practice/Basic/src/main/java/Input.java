/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habibun
 */
import java.util.Scanner;

public class Input {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter your roll no: ");
        int rollNo = sc.nextInt();
        
        System.out.println("Enter your name : ");
        String name = sc.next();
        
        System.out.println("Enter your fee : ");
        float fee = sc.nextFloat();
        
        System.out.println("Roll No: " +rollNo + " name : " + name + " fee : " +fee);
    }
}
