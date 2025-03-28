/*
TutorFactoryTest.java
Author: Lebuhang Nyanyantsi
Date: 28 March 2025
*/

package za.ac.cput.FactoryTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.Entity.Tutor;
import za.ac.cput.Factory.TutorFactory;

class TutorFactoryTest {

    @Test
    void testCreateTutor_ValidInputs() {
        // Given valid inputs
        int tutorID = 1001;
        String firstName = "Thapelo";
        String lastName = "Nzide";
        String qualification = "PhD in Computer Science";
        String contactNumber = "0632392362";
        String email = "Thapelo.nzide@cput.ac.za";

        Tutor tutor = TutorFactory.createTutor(tutorID, firstName, lastName, qualification, contactNumber, email);

        System.out.println("Created Tutor: " + tutor);

        assertNotNull(tutor);
        assertEquals(tutorID, tutor.getTutorID());
        assertEquals(firstName, tutor.getFirstName());
        assertEquals(lastName, tutor.getLastName());
        assertEquals(qualification, tutor.getQualification());
        assertEquals(contactNumber, tutor.getContactNumber());
        assertEquals(email, tutor.getEmail());
    }

    @Test
    void testCreateTutor_InvalidTutorId() {
        // Given invalid tutor ID (negative number)
        int tutorID = -1;
        String firstName = "Thapelo";
        String lastName = "Nzide";
        String qualification = "PhD in Computer Science";
        String contactNumber = "0632392362";
        String email = "Thapelo.nzide@cput.ac.za";

        Tutor tutor = TutorFactory.createTutor(tutorID, firstName, lastName, qualification, contactNumber, email);

        assertNull(tutor);
    }

    @Test
    void testCreateTutor_EmptyFirstName() {
        // Given an empty first name
        int tutorID = 1001;
        String firstName = "";
        String lastName = "Nzide";
        String qualification = "PhD in Computer Science";
        String contactNumber = "0632392362";
        String email = "Thapelo.nzide@cput.ac.za";

        Tutor tutor = TutorFactory.createTutor(tutorID, firstName, lastName, qualification, contactNumber, email);

        assertNull(tutor);
    }

    @Test
    void testCreateTutor_EmptyLastName() {
        // Given an empty last name
        int tutorID = 1001;
        String firstName = "Thapelo";
        String lastName = "";
        String qualification = "PhD in Computer Science";
        String contactNumber = "0632392362";
        String email = "Thapelo.nzide@cput.ac.za";

        Tutor tutor = TutorFactory.createTutor(tutorID, firstName, lastName, qualification, contactNumber, email);

        assertNull(tutor);
    }

    @Test
    void testCreateTutor_EmptyQualification() {
        // Given an empty qualification
        int tutorID = 1001;
        String firstName = "Thapelo";
        String lastName = "Nzide";
        String qualification = "";
        String contactNumber = "0632392362";
        String email = "Thapelo.nzide@cput.ac.za";

        Tutor tutor = TutorFactory.createTutor(tutorID, firstName, lastName, qualification, contactNumber, email);

        assertNull(tutor);
    }

    @Test
    void testCreateTutor_InvalidContactNumber() {
        // Given an invalid contact number (less than required digits)
        int tutorID = 1001;
        String firstName = "Thapelo";
        String lastName = "Nzide";
        String qualification = "PhD in Computer Science";
        String contactNumber = "123"; // Invalid contact number
        String email = "Thapelo.nzide@cput.ac.za";

        Tutor tutor = TutorFactory.createTutor(tutorID, firstName, lastName, qualification, contactNumber, email);

        assertNull(tutor);
    }

    @Test
    void testCreateTutor_InvalidEmail() {
        // Given an invalid email format (missing '@')
        int tutorID = 1001;
        String firstName = "Thapelo";
        String lastName = "Nzide";
        String qualification = "PhD in Computer Science";
        String contactNumber = "0632392362";
        String email = "Thapelo.nzide.cput.ac.za"; // Missing '@'

        Tutor tutor = TutorFactory.createTutor(tutorID, firstName, lastName, qualification, contactNumber, email);

        assertNull(tutor);
    }

    @Test
    void testCreateTutor_AllEmptyFields() {
        // Given all empty fields
        int tutorID = 0;
        String firstName = "";
        String lastName = "";
        String qualification = "";
        String contactNumber = "";
        String email = "";

        Tutor tutor = TutorFactory.createTutor(tutorID, firstName, lastName, qualification, contactNumber, email);

        assertNull(tutor);
    }
}
