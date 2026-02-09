package edu.adse2501.sess04_threads;

import java.security.SecureRandom;

/**
 * Demonstrate creating a new thread(s) by implementing the
 * java.lang.Runnable interface and overriding its run() method.
 * @author Victor
 */
public class ImplementRunnable implements Runnable {

    /**
     * SecureRandom instance to generate random sleep duration for each thread.
     */
    private static final SecureRandom SLEEP_TIME_GENERATOR = new SecureRandom();
    private final int sleepDuration;
    private final String threadName;

    public ImplementRunnable(int threadNum) {
        this.threadName = "Thread-" + threadNum;
        // Generate a random sleep duration up to 1500 milliseconds
        this.sleepDuration = SLEEP_TIME_GENERATOR.nextInt(1500);
    }

    @Override
    public void run() {
        try {
            // Loop from 5 to 10 as shown in the screenshot
            for (int n = 5; n < 10; n++) {
                
                System.out.println("Output from " + threadName);
                System.out.println("Current value of n is: " + n);

                // Put the thread to sleep for a random duration
                Thread.sleep(sleepDuration);
                
                System.out.println(threadName + " has slept for " 
                        + sleepDuration + " milliseconds.");
            }
        } catch (InterruptedException ie) {
            // Print error message when the thread is interrupted
            System.err.println("Thread " + threadName + " interrupted.");
            ie.printStackTrace();
        }
    }
}