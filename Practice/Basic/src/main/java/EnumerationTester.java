/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habibun
 */
import java.util.Vector;
import java.util.Enumeration;
public class EnumerationTester {
    public static void main(String args[])
    { 
        Enumeration days;
        Vector dayNames = new Vector();
        
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        
        days = dayNames.elements();
        
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}