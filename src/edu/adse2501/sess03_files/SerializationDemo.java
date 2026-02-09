package edu.adse2501.sess03_files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Java program to demonstrate serialization and deserialisation.
 * @author Victor
 */
public class SerializationDemo {

    public static void serialiseCar(Car car, String fileName) {
        
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(fileName))) {
            
            oos.writeObject(car);
            System.out.println("Successfully serialised " + car);
            
        } catch (IOException ioe) {
            System.err.println("Serialisation failed due to:\n" 
                    + ioe.getLocalizedMessage());
        }
    }

    public static Car deserialiseCar(String fileName) {
        
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(fileName))) {
            
            return (Car) ois.readObject();
            
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialisation failed due to:\n" 
                    + e.getLocalizedMessage());
            return null;
        }
    }
    
    public static void main(String[] args) {
        
        String filePath = "src/edu/adse2501/files/carData.ser";
        Car myCar = new Car("Mercedes", "S580", 2025);

        System.out.println("--- Starting Serialisation ---");
        serialiseCar(myCar, filePath);

        System.out.println("\n--- Starting Deserialisation ---");
        Car loadedCar = deserialiseCar(filePath);

        if (loadedCar != null) {
            System.out.println("Read from file: " + loadedCar.toString());
        }
    }
}