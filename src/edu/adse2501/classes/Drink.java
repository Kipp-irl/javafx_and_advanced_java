package edu.adse2501.classes;

/**
 * Represents a drink item with a name and its volume in litres.
 * * @author Victor
 */
public class Drink {
    /** The name of the drink. */
    protected String name;
    
    /** The volume of the drink in litres. */
    protected double volume;

    /**
     * Default constructor initializing name to an empty string and volume to 0.0.
     */
    public Drink(){
        this.name = "";
        this.volume = 0.0;
    }
    
    /**
     * Constructs a new Drink with the specified name and volume.
     * * @param name the name of the drink
     * @param volume the volume of the drink in litres
     */
    public Drink(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    /**
     * Gets the name of the drink.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the drink.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the volume of the drink.
     * @return the volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the drink.
     * @param volume the volume to set
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Returns a formatted string containing the drink details.
     * The volume is formatted to two decimal places.
     * * @return a formatted string of drink details
     */
    @Override
    public String toString() {
        return String.format("""
                             Drink Details
                             ------------------------
                             Name: %s
                             Volume in Litres: %.2f
                             ------------------------
                             """, this.getName(), this.getVolume());
    }
}