package edu.adse2501.sess02_generics;

/**
 * Represents a basic circle with calculations for area and circumference.
 * * @author Victor
 */
public class SimpleCircle {
    /** * The radius of the circle.
     */
    protected double radius;

    /**
     * Constructs a new SimpleCircle with a specified radius.
     * * @param radius the radius of the circle
     */
    public SimpleCircle(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the radius of the circle.
     * * @return the current radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets a new radius for the circle.
     * * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Calculates the area of the circle using the formula $\pi r^2$.
     * * @return the calculated area as a double
     */
    public double calcArea(){
        return (double)(Math.PI * Math.pow(this.radius, 2));
    }
    
    /**
     * Calculates the circumference of the circle using the formula $2\pi r$.
     * * @return the calculated circumference as a double
     */
    public double calcCircumeference(){
        return (double)(Math.PI * (this.radius * 2));
    }
    
    /**
     * Returns a string representation of the circle's attributes.
     * * @return a string containing the radius value
     */
    @Override
    public String toString(){
        return "SimpleCircle{" + "radius =" + this.radius + "}";
    }
}