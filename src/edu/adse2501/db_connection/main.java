package edu.adse2501.db_connection;

import java.sql.Connection;

/**
 * This class is the entry point to test your database connection.
 */
public class main {
    
    public static void main(String[] args) {
        // 1. Create an instance of your connection helper class
        SQLServerOpenConnection dbHelper = new SQLServerOpenConnection();
        
        // 2. Call the method to open the connection
        System.out.println("Attempting to connect to database...");
        Connection conn = dbHelper.createConnection();
        
        // 3. Check if it worked
        if (conn != null) {
            System.out.println("------------------------------------------");
            System.out.println("SUCCESS! Connected to Victor_ADSE2501_CollegeDB");
            System.out.println("------------------------------------------");
            
            // 4. Close the connection when done
            SQLServerOpenConnection.closeConnection(conn);
        } else {
            System.out.println("------------------------------------------");
            System.out.println("FAILURE: Could not connect.");
            System.out.println("------------------------------------------");
        }
    }
}