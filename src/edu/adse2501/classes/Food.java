package edu.adse2501.classes;

import java.time.LocalDate;

/**
 * Represents a food item with a name and an expiration date.
 * * @author Victor
 */
public class Food {
    /** The name of the food item. */
    protected String name;
    
    /** The date when the food item expires. */
    protected LocalDate expirationDate;

    /**
     * Constructs a new Food item with the specified name and expiration date.
     * * @param name the name of the food
     * @param expirationDate the expiration date of the food
     */
    public Food(String name, LocalDate expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
    }

    /**
     * Gets the name of the food item.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the food item.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the expiration date of the food item.
     * @return the expirationDate
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the expiration date of the food item.
     * @param expirationDate the expirationDate to set
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    /**
     * Returns a formatted string containing the food details.
     * Uses a text block for clean console output.
     * @return a formatted string of food details
     */
    @Override
    public String toString() {
        return String.format("""
                             Food Details
                             ------------------------
                             Name: %s
                             Expiration Date: %s
                             ------------------------
                             """, this.getName(), this.getExpirationDate());
    }
}