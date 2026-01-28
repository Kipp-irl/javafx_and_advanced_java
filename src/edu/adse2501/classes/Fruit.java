package edu.adse2501.classes;

import java.time.LocalDate;

/**
 * @author Victor
 */
public class Fruit extends Food {
    protected String taste;
    protected double weight;

    public Fruit(String taste, double weight, String name, LocalDate expirationDate) {
        super(name, expirationDate);
        this.taste = taste;
        this.weight = weight;
    }

    public String getTaste() { return taste; }
    public double getWeight() { return weight; }
    
    @Override
    public String toString() {
        // FIXED: Added an extra %s for super.toString()
        return String.format("""
                             %s
                             Fruit Details
                             ------------------------
                             Taste: %s
                             Weight in grams: %.2f
                             ------------------------
                             """, super.toString(), this.getTaste(), this.getWeight());
    }
}