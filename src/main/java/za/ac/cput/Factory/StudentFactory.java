/*
StudentFactory.java
Author: Ranelani Engel (221813853)
Date: 23 March 2025
 */

package za.ac.cput.Factory;

import za.ac.cput.Entity.Student;
import za.ac.cput.Utility.Helper;

public class StudentFactory {
    public static Student createStudent(int studentId, String firstName, String lastName, String dateOfBirth, String contactNumber, String email) {

        if (!Helper.isValid(studentId)
                || Helper.isNullOrEmpty(firstName)
                || Helper.isNullOrEmpty(lastName)
                || !Helper.isValidDate(dateOfBirth)  // Negate condition
                || !Helper.isValidContactNumber(contactNumber)  // Negate condition
                || !Helper.isValidEmail(email)) {  // Negate condition
            return null;
        }

        return new Student.StudentBuilder()
                .setStudentId(studentId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setDateOfBirth(dateOfBirth)
                .setContactNumber(contactNumber)
                .setEmail(email)
                .build();

    }
}
