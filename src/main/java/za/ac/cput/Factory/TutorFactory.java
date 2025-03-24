package za.ac.cput.Factory;

import za.ac.cput.Entity.Tutor;

public class TutorFactory {

    public static Tutor createTutor(int tutorID, String firstName, String lastName,
                                    String qualification, String contactNumber, String email) {
        if (firstName == null || firstName.isEmpty() ||
                lastName == null || lastName.isEmpty() ||
                qualification == null || qualification.isEmpty() ||
                email == null || email.isEmpty()) {
            throw new IllegalArgumentException("All fields are required.");
        }

        return new Tutor.Builder()
                .setTutorID(tutorID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setQualification(qualification)
                .setContactNumber(contactNumber)
                .setEmail(email)
                .build();
    }
}