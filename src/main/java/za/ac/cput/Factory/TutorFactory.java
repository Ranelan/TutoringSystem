/*
 * TutorFactory.java
 * Author: Lebuhang Nyanyantsi (222184353)
 * Date: 24 March 2025
 */

package za.ac.cput.Factory;

import za.ac.cput.Entity.Tutor;
import za.ac.cput.Utility.Helper;

public class TutorFactory {
    public static Tutor createTutor(int tutorID, String firstName, String lastName,
                                    String qualification, String contactNumber, String email) {

        if (tutorID <= 0
                || Helper.isNullOrEmpty(firstName)
                || Helper.isNullOrEmpty(lastName)
                || Helper.isNullOrEmpty(qualification)
                || !Helper.isValidContactNumber(contactNumber)
                || !Helper.isValidEmail(email)) {
            return null;
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
