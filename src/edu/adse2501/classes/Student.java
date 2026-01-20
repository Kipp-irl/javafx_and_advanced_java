package edu.adse2501.classes;

import java.time.LocalDate;

/**
 * The {@code Student} class represents a student with a registration number and course.
 * It extends the {@link Person} class.
 * * @author Victor
 */
public class Student extends Person {
    protected String regNo;
    protected String course;

    /**
     * Constructs a new Student and initializes all inherited and local fields.
     * Match signature from Navigator: (regNo, course, names, nationality, birthDate, gender).
     * * @param regNo the student registration number
     * @param course the enrolled course
     * @param names the names of the student
     * @param nationality the nationality
     * @param birthDate the date of birth
     * @param gender the gender character
     */
    public Student(String regNo, String course, String names, String nationality, LocalDate birthDate, char gender) {
        // Assigning protected fields directly as Person has no parameterized constructor
        this.regNo = regNo;
        this.course = course;
        this.names = names;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    // --- Getters ---

    /**
     * Gets the registration number of the student.
     * @return the regNo
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * Gets the academic course of the student.
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    // --- Setters ---

    /**
     * Sets the registration number for the student.
     * @param regNo the regNo to set
     */
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    /**
     * Sets the academic course for the student.
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * Returns the specific role of this person as a Student.
     * @return the string "Student"
     */
    @Override
    public String getPersonRole() {
        return "Student";
    }

    /**
     * Returns a formatted String representation of the student's details.
     * Uses Java Text Blocks and invokes the parent toString.
     * * @return the student's details.
     */
    @Override
    public String toString() {
        return String.format("""
                             %s
                             Registration No: %s
                             Course: %s
                             """,
                super.toString(),
                getRegNo(),
                getCourse()
        );
    }
}