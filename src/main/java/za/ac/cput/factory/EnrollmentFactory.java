/*
EnrollmentFactory.java
Author: Ranelani Engel (221813853)
Date: 23 March 2025
 */


package za.ac.cput.factory;

import za.ac.cput.entity.Course;
import za.ac.cput.entity.Enrollment;
import za.ac.cput.entity.Student;

public class EnrollmentFactory {

    public static Enrollment createEnrollment(int enrollmentId, Student student, Course course, String enrollmentDate, String grade) {

        if(enrollmentId <= 0
                || student == null
                || course == null
                || enrollmentDate == null || enrollmentDate.isEmpty()
                || grade == null || grade.isEmpty()) {
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
