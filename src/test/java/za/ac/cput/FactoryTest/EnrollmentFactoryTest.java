/*
EnrollmentFactoryTest.java
Author: Ranelani Engel (221813853)
Date: 28 March 2025
 */


package za.ac.cput.FactoryTest;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.Entity.Enrollment;
import za.ac.cput.Entity.Student;
import za.ac.cput.Entity.Course;
import za.ac.cput.Factory.EnrollmentFactory;


class EnrollmentFactoryTest {

    private Enrollment enrollment;
    private Enrollment enrollmentInvalidId;
    private Enrollment enrollmentInvalidStudent;
    private Enrollment enrollmentInvalidCourse;
    private Enrollment enrollmentInvalidDate;
    private Enrollment enrollmentInvalidGrade;

    private Student student;
    private Course course;

    @BeforeEach
    void setUp() {
        // Setting up valid student and course
        student = new Student.StudentBuilder()
                .setStudentId(221813853)
                .setFirstName("Engel")
                .setLastName("Ranelani")
                .setDateOfBirth("2000-05-12")
                .setContactNumber("0637298552")
                .setEmail("raneyclassic@gmail.com")
                .build();

        course = new Course.CourseBuilder()
                .setCourseId(101)
                .setCourseName("Mathematics")
                .setCourseDescription("Mathematics 101")
                .build();

        // Creating valid enrollment
        enrollment = EnrollmentFactory.createEnrollment(3004, student, course, "2025-05-12", "A");

        // Creating invalid enrollments
        enrollmentInvalidId = EnrollmentFactory.createEnrollment(0, student, course, "2025-03-23", "A");
        enrollmentInvalidStudent = EnrollmentFactory.createEnrollment(3004, null, course, "2025-03-23", "A");
        enrollmentInvalidCourse = EnrollmentFactory.createEnrollment(3004, student, null, "2025-03-23", "A");
        enrollmentInvalidDate = EnrollmentFactory.createEnrollment(3004, student, course, "2025-32-45", "A");
        enrollmentInvalidGrade = EnrollmentFactory.createEnrollment(3004, student, course, "2025-03-23", "");
    }

    @Test
    void testCreateValidEnrollment() {
        // Test for valid enrollment creation
        assertNotNull(enrollment);
        assertEquals(1001, enrollment.getEnrollmentId());
        assertEquals(student, enrollment.getStudent());
        assertEquals(course, enrollment.getCourse());
        assertEquals("2025-03-23", enrollment.getEnrollmentDate());
        assertEquals("A", enrollment.getGrade());
    }

    @Test
    void testCreateEnrollmentWithInvalidId() {
        // Test for invalid enrollmentId (0)
        assertNull(enrollmentInvalidId);
    }

    @Test
    void testCreateEnrollmentWithNullStudent() {
        // Test for invalid student (null)
        assertNull(enrollmentInvalidStudent);
    }

    @Test
    void testCreateEnrollmentWithNullCourse() {
        // Test for invalid course (null)
        assertNull(enrollmentInvalidCourse);
    }

    @Test
    void testCreateEnrollmentWithInvalidDate() {
        // Test for invalid enrollment date
        assertNull(enrollmentInvalidDate);
    }

    @Test
    void testCreateEnrollmentWithEmptyGrade() {
        // Test for invalid grade (empty string)
        assertNull(enrollmentInvalidGrade);
    }
}
