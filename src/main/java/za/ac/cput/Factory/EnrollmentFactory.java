/*
EnrollmentFactory.java
Author: Ranelani Engel (221813853)
Date: 23 March 2025
 */


package za.ac.cput.Factory;

import za.ac.cput.Entity.Course;
import za.ac.cput.Entity.Enrollment;
import za.ac.cput.Entity.Student;
import za.ac.cput.Utility.Helper;

public class EnrollmentFactory {

    public static Enrollment createEnrollment(int enrollmentId, Student student, Course course, String enrollmentDate, String grade) {

        if(!Helper.isValid(enrollmentId)
                || student == null
                || course == null
                || Helper.isValidDate(enrollmentDate) || Helper.isNullOrEmpty(enrollmentDate)
                || Helper.isNullOrEmpty(grade)) {
            return null;
        }


        return new Enrollment.EnrollmentBuilder()
                .setEnrollmentId(enrollmentId)
                .setStudent(student)
                .setCourse(course)
                .setEnrollmentDate(enrollmentDate)
                .setGrade(grade)
                .build();
    }
}
