package edu.adse2501.sess08_design_patterns_and_other_features;

import java.util.concurrent.locks.StampedLock;

/**
 *
 * @author Victor
 */
public class StampedLockDemo {
    private double balance;
    private final StampedLock stampedLock = new StampedLock();

    public StampedLockDemo(double initialBalance) {
        this.balance = initialBalance;
    }


    public void withdraw(double amount) {
        long stamp = stampedLock.writeLock(); // Exclusive lock for modifying state
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn Kes.: " + amount);
            } else {
                System.out.println("Insufficient funds for withdrawal.");
            }
        } finally {
            stampedLock.unlockWrite(stamp);
        }
    }

    public void deposit(double amount) {
        long stamp = stampedLock.writeLock(); // Exclusive lock for modifying state
        try {
            balance += amount;
            System.out.println("Deposited Kes.: " + amount);
        } finally {
            stampedLock.unlockWrite(stamp);
        }
    }

    public double checkBalance() {
        long stamp = stampedLock.readLock(); // Pessimistic read lock
        try {
            System.out.println("Checking balance with standard read lock...");
            System.out.println("Available balance is Kes.: " + this.balance);
            return this.balance;
        } finally {
            stampedLock.unlockRead(stamp);
        }
    }

    // --- Transcribed from Image 1 ---

    public double checkBalanceOptimisticRead()
    {
        System.out.println("\nAbout to check the balance with optimistec read lock");
        long stamp = stampedLock.tryOptimisticRead(); // Attempt a non-blocking optimistic read
        System.out.println("Applied non-blocking optimistic read lock");
        double currentBalance = this.balance;

        // Validate if a write occured during the optimistic read
        if(!stampedLock.validate(stamp))
        {
            System.out.println("Stamp has changed. Applying full read lock");
            stamp = stampedLock.readLock(); // Fallback to read lock when optimistic read fails
            try
            {
                currentBalance = this.balance;
            }finally
            {
                stampedLock.unlockRead(stamp); // Release the read lock
                System.out.println("Unlock read lock");
            }
        }
        System.out.println("\nAvailable balance is Kes.: " + currentBalance);
        return currentBalance;
    }

    // --- Transcribed from Image 2 ---

    public static void main(String[] args)
    {
        // Initialise StampedLockDemo with an initial balance of 4000.00
        StampedLockDemo stampedLockDemo = new StampedLockDemo(4000.00);

        // Perform a series of transactions
        stampedLockDemo.withdraw(1000.0);               // Withdraw Kes. 1000.00
        stampedLockDemo.deposit(5000.0);                // Deposit Kes. 5000.00
        stampedLockDemo.checkBalance();                 // Check balance with read lock
        stampedLockDemo.checkBalanceOptimisticRead();   // Check balance with optimistic read lock
    }
}