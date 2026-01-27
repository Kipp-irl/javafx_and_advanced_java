package edu.adse2501.classes;

import java.time.LocalDate;

/**
 *
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

    /**
     * @return the taste
     */
    public String getTaste() {
        return taste;
    }

    /**
     * @param taste the taste to set
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return String.format("""
                             Fruit Details
                             ------------------------
                             Taste: %s
                             Weight in grams: %.2f
                             ------------------------
                             """,super.toString(), this.getTaste(), this.getWeight());
    }
}
