package edu.adse2501.sess09_java_data_structures;

import java.util.Enumeration;
import java.util.Vector;

/**
 * This program demonstrates the usage of the Enumeration interface in Java.
 * Enumeration is a legacy interface used to iterate over collections like Vector
 * and Hashtable.
 *
 * Methods demonstrated include:
 * - hasMoreElements: To check if the enumeration contains more elements.
 * - nextElement: To retrieve the next element in the enumeration.
 *
 * @author Victor
 */
public class EnumerationDemo 
{
    /**
     * main method demonstrates basic operations with java.util.Enumeration.
     * * @param args String array of command line arguments.
     */
    public static void main(String[] args)
    {
        // Create a Vector instance to store String values
        Vector<String> days = new Vector<>();

        // Adding elements to the Vector
        System.out.println("Adding elements to the Vector: ");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");

        // Display the entire Vector
        System.out.println("Initial Vector elements: " + days);

        // Get the Enumeration from the Vector
        Enumeration<String> daysEnum = days.elements();

        // Iterating over the elements using Enumeration
        System.out.println("\nIterating over elements using Enumeration:");
        while(daysEnum.hasMoreElements())
        {
            String day = daysEnum.nextElement();
            System.out.println("Day:  " + day);
        }
    }
}