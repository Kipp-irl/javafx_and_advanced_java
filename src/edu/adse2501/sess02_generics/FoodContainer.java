package edu.adse2501.sess02_generics;

import edu.adse2501.classes.Food;

/**
 * A specialized container for Food items.
 * @author Victor
 * @param <T> the type of food item held by this container
 */
public class FoodContainer<T extends Food> extends Container<T> {
    
    public FoodContainer(T item){
        super(item);
    }
    
    public void displayExpirationDate(){
        // Use 'item' from Container class
        System.out.println("The expiration date of " + item.getName() + " is: " + item.getExpirationDate());
    }

    /**
     * Implementation for the missing method used in the Demo class.
     */
    public void displayItemInfo() {
        System.out.println("Food Item Info:");
        System.out.println("Name: " + item.getName());
        System.out.println("Expiration: " + item.getExpirationDate());
    }
}