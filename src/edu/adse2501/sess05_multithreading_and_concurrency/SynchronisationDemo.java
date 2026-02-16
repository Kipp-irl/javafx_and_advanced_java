package edu.adse2501.sess05_multithreading_and_concurrency;

class Counter {
    private int count = 0;
    
    // FIXED: Changed 'private' to 'public'. 
    // If it is private, the threads in the main method cannot call it!
    public synchronized void increment() {
        count++; 
    }
    
    public int getCount() {
        return count;
    }
}

/**
 * @author Victor
 */
public class SynchronisationDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        
        // We use an array of size 1 to hold the local count so it can be 'final' 
        // effectively but still mutable inside the lambda.
        // FIXED: Java array syntax uses curly braces {}, not brackets []
        final int[] thread1Count = {0};
        final int[] thread2Count = {0};
        
        // --- Create Thread 1 ---
        // FIXED: Added proper Thread syntax using a Lambda expression () -> {}
        Thread t1 = new Thread(() -> {
            for(int n = 0; n < 1000; n++) {
                counter.increment();
                thread1Count[0]++; // Increment local tracker
            }
            System.out.println("Thread 1 finished. Local count: " + thread1Count[0]);
        });

        // --- Create Thread 2 ---
        // We add a second thread to demonstrate that they don't overwrite each other
        Thread t2 = new Thread(() -> {
            for(int n = 0; n < 1000; n++) {
                counter.increment();
                thread2Count[0]++; // Increment local tracker
            }
            System.out.println("Thread 2 finished. Local count: " + thread2Count[0]);
        });
        
        // Start the threads
        t1.start();
        t2.start();
        
        // FIXED: Added .join()
        // We must wait for the threads to finish before printing the total.
        // Without this, the system might print the total before the threads are done!
        t1.join();
        t2.join();
        
        System.out.println("--------------------------------------------------");
        System.out.println("Final Shared Count Value: " + counter.getCount());
        System.out.println("--------------------------------------------------");
    }
}