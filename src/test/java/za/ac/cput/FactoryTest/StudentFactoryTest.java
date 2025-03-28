/*
StudentFactoryTest.java
Author: Ranelani Engel (221813853)
Date: 28 March 2025
 */


package za.ac.cput.FactoryTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.Entity.Student;
import za.ac.cput.Factory.StudentFactory;


    class StudentFactoryTest {

        @Test
        void testCreateStudent_ValidInputs() {
            // Given valid inputs
            int studentId = 221813853;
            String firstName = "Engel";
            String lastName = "Ranelani";
            String dateOfBirth = "2000-05-12";
            String contactNumber = "0637298552";
            String email = "raneyclassic@gmail.com";

            Student student = StudentFactory.createStudent(studentId, firstName, lastName, dateOfBirth, contactNumber, email); // creating a student

            System.out.println("Created Student: " + student);

            assertNotNull(student); // student should not be null and should have the correct attributes
            assertEquals(studentId, student.getStudentId());
            assertEquals(firstName, student.getFirstName());
            assertEquals(lastName, student.getLastName());
            assertEquals(dateOfBirth, student.getDateOfBirth());
            assertEquals(contactNumber, student.getContactNumber());
            assertEquals(email, student.getEmail());
        }

        @Test
        void testCreateStudent_InvalidStudentId() {
            int studentId = 0;  // Invalid student ID
            String firstName = "Engel";
            String lastName = "Ranelani";
            String dateOfBirth = "2000-05-12";
            String contactNumber = "0637298552";
            String email = "raneyclassic@gmail.com";

            // When creating a student
            Student student = StudentFactory.createStudent(studentId, firstName, lastName, dateOfBirth, contactNumber, email);

            // Then the student should be null
            assertNull(student);
        }

        @Test
        void testCreateStudent_InvalidFirstName() {

            int studentId = 221813853;
            String firstName = "";// empty firstName (invalid input)
            String lastName = "Ranelani";
            String dateOfBirth = "2000-05-12";
            String contactNumber = "0637298552";
            String email = "raneyclassic@gmail.com";

            // When creating a student
            Student student = StudentFactory.createStudent(studentId, firstName, lastName, dateOfBirth, contactNumber, email);

            // Then the student should be null
            assertNull(student);
        }

        @Test
        void testCreateStudent_InvalidDateOfBirth() {
            // Given an invalid dateOfBirth (invalid format)
            int studentId = 221813853;
            String firstName = "Engel";
            String lastName = "Ranelani";
            String dateOfBirth = "01-01-2000";  // Invalid format
            String contactNumber = "0637298552";
            String email = "raneyclassic@gmail.com";

            //creating a student
            Student student = StudentFactory.createStudent(studentId, firstName, lastName, dateOfBirth, contactNumber, email);

            // Then the student should be null
            assertNull(student);
        }

        @Test
        void testCreateStudent_InvalidEmail() {
            // Given an invalid email (missing '@')
            int studentId = 221813853;
            String firstName = "Engel";
            String lastName = "Ranelani";
            String dateOfBirth = "2000-05-12";
            String contactNumber = "0637298552";
            String email = "john.doeexample.com";  // Invalid email

            // creating a student
            Student student = StudentFactory.createStudent(studentId, firstName, lastName, dateOfBirth, contactNumber, email);

            // Then the student should be null
            assertNull(student);
        }

        @Test
        void testCreateStudent_EmptyFields() {
            // Given empty inputs
            int studentId = 0;
            String firstName = "";
            String lastName = "";
            String dateOfBirth = "";
            String contactNumber = "";
            String email = "";

            // When creating a student
            Student student = StudentFactory.createStudent(studentId, firstName, lastName, dateOfBirth, contactNumber, email);

            // Then the student should be null
            assertNull(student);
        }

    }


