package edu.adse2501.sess02_generics;

/**
 * A generic class that stores and manages the value of type {@code T} 
 *
 * @param <T> the type value held by this class
 * @author Victor
 */
public class GenericClass<T> {
    
    private T varT;

    public GenericClass(T varT) {
        this.varT = varT;
    }

    public T getVarT() {
        return varT;
    }

    public void setVarT(T varT) {
        this.varT = varT;
    }

    /**
     * Returns the name of the class of the object stored in varT.
     *
     */
    public String showType() {
        return varT.getClass().getName();
    }
}