package edu.adse2501.util;

/**
 * The {@code Spacer} class provides utility methods for console formatting.
 * * @author Victor
 */
public class Spacer {

    /**
     * Prints a horizontal line of 75 dashes followed by an empty line for visual separation.
     */
    public final static void separator() {
        // Prints a line of 75 dashes
        System.out.println("-".repeat(75));
        
        // Prints an empty line for spacing
        System.out.println();
    }
}