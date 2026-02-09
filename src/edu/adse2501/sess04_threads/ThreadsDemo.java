package edu.adse2501.sess04_threads;

/**
 * Java program to demonstrate creating threads for a class that implements the
 * java.lang.Runnable interface and one that extends the java.lang.Thread class.
 *
 * @author Victor
 */
public class ThreadsDemo {

    public static void main(String[] args) {
        // Demonstrate thread execution by creating and starting multiple threads
        // We loop from 1 to 4 to create 4 pairs of threads (8 threads total)
        for (int n = 1; n < 5; n++) {
            // Create a Thread using the Runnable interface implementation
            Thread t = new Thread(new ImplementRunnable(n));
            
            // Create a Thread using the Thread class extension
            ExtendThread thread = new ExtendThread(n);
            
            // Start both threads
            t.start();
            thread.start();
        }
    }
}