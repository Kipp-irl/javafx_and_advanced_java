package edu.adse2501.sess02_generics;

import edu.adse2501.classes.Drink;

/**
 * A specialized container that only holds objects of type {@code Drink} or its subclasses.
 * This is an example of a Bounded Type Parameter.
 * @param <T> a type that extends the Drink class
 * @author Victor
 */
public class DrinkContainer<T extends Drink> extends Container<T> {
    
    /**
     * Constructs a DrinkContainer with a specific drink item.
     * @param drinkItem the drink to store
     */
    public DrinkContainer(T drinkItem){
        super(drinkItem);    }
    
    /**
     * Displays the volume and name of the stored drink.
     * Uses varT inherited from the Container class.
     */
    public void displayVolume(){
        System.out.println(item.getName() + " comes in a volume of " + item.getVolume() + " litres.");
    }
}