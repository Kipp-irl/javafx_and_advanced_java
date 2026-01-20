package edu.adse2501.classes;

import java.time.LocalDate;

/**
 * The abstract class {@code Person} represents a person with common attributes
 * or properties such as names, birthdate, gender(binary) and nationality.
 *
 * * @author Victor
 */
public abstract class Person {

    protected String names;
    protected String nationality;
    protected LocalDate birthDate;
    protected char gender;

    // --- Getters ---
    /**
     * Gets the full names of this person.
     *
     * @return the names
     */
    public String getNames() {
        return names;
    }

    /**
     * Gets the nationality of this person.
     *
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Gets the date of birth for this person.
     *
     * @return the birthDate
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Gets the gender character of this person.
     *
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    // --- Setters ---
    /**
     * Sets the full names of this person.
     *
     * @param names the names to set
     */
    public void setNames(String names) {
        this.names = names;
    }

    /**
     * Sets the nationality of this person.
     *
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Sets the date of birth for this person.
     *
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Sets the gender character of this person.
     *
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * Returns the role of the person (e.g. "Student", "Employee", "Customer").
     *
     * @return the role of the person as a String.
     */
    public abstract String getPersonRole();

    @Override
    public String toString() {
        return String.format("""
                             Role: %s
                             Name(s): %s
                             Birth Date: %s
                             Gender: %s
                             Nationality: %s""",
                getPersonRole(),
                getNames(),
                getBirthDate(),
                getGender() == 'm' || getGender() == 'M' ? "Male" : "Female",
                getNationality()
        );
    }
}
