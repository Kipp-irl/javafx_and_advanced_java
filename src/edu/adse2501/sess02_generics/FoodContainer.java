package edu.adse2501.sess02_generics;

import edu.adse2501.classes.Food;

/**
 *
 * @author Victor
 * @param <T>
 */
public class FoodContainer<T extends Food> extends Container<T> {
    
    public  FoodContainer(T item){
        super(item);
    }
    
    public void displayExpirationDate(){
        System.out.println("Expiration date of " + item.getName() + item.getExpirationDate());
    }
    
}
