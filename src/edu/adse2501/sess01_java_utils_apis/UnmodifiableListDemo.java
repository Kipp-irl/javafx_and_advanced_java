package edu.adse2501.sess01_java_utils_apis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Java program that demonstrates an unmodifiable implementation of the List
 * interface.
 *
 * @author Victor
 */
public class UnmodifiableListDemo {

    public static void main(String[] args) {
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Avocado");
        mutableList.add("Apple");
        mutableList.add("Durian");
        mutableList.add("Cherry");
        
        List<String> unmodifiableList = Collections.unmodifiableList(mutableList);
        
        System.out.println("The first fruit/element in the unmodifiable list is: " + unmodifiableList.get(0));
        
        try {
            unmodifiableList.add("Banana");
        } catch (UnsupportedOperationException uoe) {
            System.err.println("Modification attempt failed! This list is read-only.");
        }
    }
}