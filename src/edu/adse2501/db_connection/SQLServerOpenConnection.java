package edu.adse2501.db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class SQLServerOpenConnection {
    //Class constants that will be used to connect to the database
    public static final String DBURL = "jdbc:sqlserver://DESKTOP-8A0NOO4\\SQLEXPRESS;databaseName=Victor_ADSE2501_CollegeDB;encrypt=true;trustServerCertificate=true";
    
    private static final String USERNAME = "Java_Sem2";
    private static final String PASSWORD = "Jav@_S3m2!";
    private static final Logger LOGGER = Logger.getLogger(SQLServerOpenConnection.class.getName());

    public Connection createConnection()
    {
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
        }
        catch (SQLException sqle)
        {
            System.err.println("Sorry the connection to the database failed.\n"
                    + "Please verify that the connection parameters are correct"
                    + " and that the server is running and try again!");
        }
        return conn;
    }

    public static void closeConnection(Connection conn)
    {
        if(conn != null)
        {
            try
            {
                conn.close();
                LOGGER.info("Database connection closed successfully");
            }
            catch (SQLException sqle)
            {
                LOGGER.log(Level.SEVERE, "Failed to close database connection.", 
                        sqle.getLocalizedMessage());
            }
        }
    }
}