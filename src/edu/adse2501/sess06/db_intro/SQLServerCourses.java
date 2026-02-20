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

        try(Connection conn = new SQLServerOpenConnection().createConnection();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(COURSE_QUERY))
        {
            int n = 0;
            while(rs.next()){
                collegeCourses.add(new Course(
                        rs.getString("CourseCode"),
                        rs.getString("CourseName"),
                        rs.getFloat("Fee"),
                        rs.getInt("Duration")
                ));
                n++;
            }
            System.out.println("Number of courses found: " + n);
            for(Course c : collegeCourses) {
                System.out.println(c);
            }

        } catch (SQLException ex) {
            System.err.println("Error processing database query: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}