package edu.adse2501.sess02_generics;

import edu.adse2501.classes.Drink;

/**
 * Specialized container for drinks.
 * @author Victor
 */
public class DrinkContainer<T extends Drink> extends Container<T> {
    
    public DrinkContainer(T drinkItem){
        super(drinkItem);
    }
    
    public void displayVolume(){
        System.out.println(item.getName() + " comes in a volume of " + item.getVolume() + " litres.");
    }
}