package edu.adse2501.sess02_generics;

import edu.adse2501.classes.Fruit;
import java.time.LocalDate;

/**
 *
 * @author Victor
 */
public class GenericClassInheritanceDemo {
    public static void main(String[] args){
        Fruit orange = new Fruit("Sweet", 150.0, "Orange", LocalDate.now().plusDays(7));
        
        FoodContainer<Fruit> orangeContainer = new FoodContainer<>(orange);
        
        orangeContainer.displayItemInfo();
        orangeContainer.displayExpirationDate();
    }
}
