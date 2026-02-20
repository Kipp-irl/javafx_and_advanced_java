package edu.adse2501.sess06.db_intro;

import edu.adse2501.classes.Course;
import edu.adse2501.db_connection.SQLServerOpenConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

/**
 * Java program to display the various courses offered at EICN.
 *
 * @author a.nyanjui
 */
public class SQLServerCourses
{
    private static final String COURSE_QUERY = "Select * from Course";

    public static void main(String[] args)
    {
        List<Course> collegeCourses = new ArrayList<>();

        // Use a try with resources to connect to the SQL Server DB
        try(Connection conn = new SQLServerOpenConnection().createConnection();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(COURSE_QUERY))
        {
            int n = 0; // Integer used for display purposes
            while(rs.next())
            {
                // Add the courses from the Course table to the list of available courses
                collegeCourses.add(new Course(rs.getString(1), rs.getString(2),
                        rs.getFloat(3), rs.getInt(4)));

                // Display the details of the added course
                System.out.println("Displaying the details of course number " 
                        + (++n));
                System.out.println(collegeCourses.get(collegeCourses.size() - 1).toString());
            }
            
            System.out.println("\nNumber of courses found: " + n);
            for(Course c : collegeCourses) {
                System.out.println(c);
            }

        } catch (SQLException ex) {
            System.err.println("Error processing database query: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}