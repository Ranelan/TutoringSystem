/*
StudentFactory.java
Author: Ranelani Engel (221813853)
Date: 23 March 2025
 */

package za.ac.cput.factory;

import za.ac.cput.entity.Student;

public class StudentFactory {
    public static Student createStudent(int studentId, String firstName, String lastName, String dateOfBirth, String contactNumber, String email) {

        if (studentId <= 0 ||
                firstName == null || firstName.isEmpty() ||
                lastName == null || lastName.isEmpty() ||
                dateOfBirth == null || dateOfBirth.isEmpty() ||
                contactNumber == null || contactNumber.isEmpty()
                || email == null || email.isEmpty()) {
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
