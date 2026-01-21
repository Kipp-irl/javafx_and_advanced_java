package edu.adse2501.sess01_java_util_apis;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Java program to demonstrate the HashSet class and some of its methods.
 * * @author Victor
 */
public class HashSetDemo {

    public static void main(String[] args) {
        // Initialize the set for design students
        Set<String> designClass = new HashSet<>();

        // Adding design students
        designClass.add("James");
        designClass.add("Kennedy");
        designClass.add("Richard");
        designClass.add("Michael");
        designClass.add("Adam");
        designClass.add("Ayub");
        designClass.add("Osman");
        designClass.add("Erick");
        designClass.add("George");
        designClass.add("Ema");
        designClass.add("Salim");
        designClass.add("Nadia");
        designClass.add("Rachael");
        designClass.add("Roocy");
        designClass.add("Abigail");

        // Create a string array of art students
        String[] artStudents = {
            "Roocy", "Julius", "Paul", "Amanda", "Kamau", "Leviathan", "Sean",
            "Erick", "Joe", "Alejandro"
        };

        // Create a set from the art class string array
        Set<String> artClass = new HashSet<>(Arrays.asList(artStudents));

        // Create a set of all students in the campus
        Set<String> allCampusStudents = new HashSet<>(designClass);
        // Add the students from the art class as well
        allCampusStudents.addAll(artClass);

        // Display calls
        displayDesignStudents(designClass);
        displayArtStudents(artClass);
        displayAllStudents(allCampusStudents);
    }

    /**
     * Display the design class details using a for ... each loop : NB Works
     * in java 7 & prior and current versions.
     */
    private static void displayDesignStudents(Set designClass) {
        System.out.printf("""
                          
                          The design class has %d students and their names are:
                          
                          """, designClass.size());

        for (Object obj : designClass) {
            System.out.println(obj);
        }
    }

    /**
     * Display the details of the art students using functional programming
     * NB: works in Java 8 and later versions
     */
    private static void displayArtStudents(Set artClass) {
        System.out.printf("""
                          
                          The art class has %d students and their names are:
                          
                          """, artClass.size());

        artClass.forEach((artStudent) -> {
            System.out.println(artStudent);
        });
    }

    /**
     * TODO: Assignment -> Write the 'displayAllStudents(allCampusStudents);'
     * that accepts a set of all student names in the campus and displays them
     * using an iterator.
     */
    private static void displayAllStudents(Set allCampusStudents) {
        System.out.printf("""
                          
                          The total campus has %d unique students and their names are:
                          
                          """, allCampusStudents.size());

        // Implementing the assignment using an Iterator
        Iterator iterator = allCampusStudents.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}