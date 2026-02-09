package edu.adse2501.sess03_files;

import java.io.Serializable;

/**
 *
 * @author Victor
 */
public class Car implements Serializable {
    
    // This ID is required for the class to be safely serialized
    public static final long serialVersionUID = 1L;
    
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // --- Getters and Setters ---

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    // --- toString Method (from screenshot) ---

    @Override
    public String toString() {
        return String.format("""
                
                Car Details
                _______________________________________
                Make :    %s
                Model:    %s
                Year :    %d
                """, this.getMake(), this.getModel(), this.getYear());
    }
}