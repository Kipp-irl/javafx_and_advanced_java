package edu.adse2501.sess02_generics;

/**
 * Generic base class {@code Container} that can hold items of different types.
 *
 * @param <T> the type of item/contents held by this class.
 * @author Victor
 */
public class Container<T> {

    /**
     * The stored item of generic type {@code T}
     */
    protected T item;

    /**
     * Parameterized constructor to initialize the container with an item.
     * @param varT the item to store
     */
    public Container(T varT) {
        this.item = varT;
    }

    /**
     * Returns the stored item.
     * @return the item
     */
    public T getVarT() { 
        return item;
    }

    /**
     * Displays the content of the container to the console.
     */
    public void display() {
        System.out.println("The container holds: " + item.toString());
    }
}