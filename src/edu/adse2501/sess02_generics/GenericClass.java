package edu.adse2501.sess02_generics;

/**
 * A generic class that stores and manages the value of type {@code T} 
 *
 * @param <T> the type value held by this class
 * @author Victor
 */
public class GenericClass<T> {
    
    /**
     * The stored value of generic type {@code T}
     */
    private T varT;

    /**
     * Default constructor.
     */
    public GenericClass() {
    }

    /**
     * Parameterized constructor to initialize the stored value.
     * @param varT the initial value to stored
     */
    public GenericClass(T varT) {
        this.varT = varT;
    }

    /**
     * Returns the stored value.
     * @return the VarT
     */
    public T getVarT() {
        return varT;
    }

    /**
     * Set the value to be stored.
     * @param varT
     */
    public void setVarT(T varT) {
        this.varT = varT;
    }
}