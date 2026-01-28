package edu.adse2501.sess02_generics;

import java.util.Scanner;

/**
 * Java program to demonstrate working with custom generic classes.
 *
 * * @author Victor
 */
public class GenericClassDemo {

    public static void main(String[] args) {
        GenericClass<String> genString = new GenericClass<>("Hello");
        GenericClass<Byte> genByte;
        GenericClass<Float> genFloat = new GenericClass<>(56.78f);
        GenericClass<SimpleCircle> genCircle;

        // Instantiate the genericByte and genericSimpleCircle objects
        genByte = new GenericClass<>((byte) 32);

        // Prompt the user for the radius of the circle
        System.out.println("Please enter the radius of the circle in cm. -> ");
        float rad = new Scanner(System.in).nextFloat();
        genCircle = new GenericClass<>(new SimpleCircle(rad));

        // Display the contents and types of the various generic objects
        System.out.println("genString's type is -> " + genString.showType()
                + " and its value is: " + genString.getVarT());

        System.out.println("genByte's type is -> " + genByte.showType()
                + " and its value is: " + genByte.getVarT());

        System.out.println("genFloat's type is -> " + genFloat.showType()
                + " and its value is: " + genFloat.getVarT());

        System.out.println("genCircle's type is -> " + genCircle.showType());
        System.out.println("1. Radius: " + genCircle.getVarT().getRadius() + " cm.");
        System.out.printf("2. Area: %.2f cm²\n", genCircle.getVarT().calcArea());
        System.out.printf("3. Circumference: %.2f cm\n", genCircle.getVarT().calcCircumeference());
    }
}
