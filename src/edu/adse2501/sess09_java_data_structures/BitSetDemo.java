package edu.adse2501.sess09_java_data_structures;

import java.util.BitSet;

/**
 * This program demonstrates the usage of the BitSet class in Java.
 * BitSet is a class that implements a vector of bits that grows as needed.
 *
 * Methods demonstrated include:
 * - set: To set the bit at the specified index to true.
 * - and: To perform a logical AND operation with another BitSet.
 * - or: To perform a logical OR operation with another BitSet.
 * - xor: To perform a logical XOR operation with another BitSet.
 *
 * @author Victor
 */
public class BitSetDemo 
{
    /**
     * main method demonstrates basic operations with the java.util.BitSet class.
     * * @param args String array of command line arguments.
     */
    public static void main(String[] args)
    {
        // Create two BitSet instances
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // Set some bits to true
        for(int i = 0; i < 16; i++) 
        {
            if((i % 2) == 0) bits1.set(i);
            if((i % 5) != 0) bits2.set(i);
        }

        // Display the initial BitSets
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);

        // Perform AND operation
        System.out.println("\nbits2 AND bits1: ");
        bits2.and(bits1);
        System.out.println(bits2);

        // Perform OR operation
        System.out.println("\nbits2 OR bits1: ");
        bits2.or(bits1);
        System.out.println(bits2);

        // Perform XOR operation
        System.out.println("\nbits2 XOR bits1: ");
        bits2.xor(bits1);
        System.out.println(bits2);
    }
}