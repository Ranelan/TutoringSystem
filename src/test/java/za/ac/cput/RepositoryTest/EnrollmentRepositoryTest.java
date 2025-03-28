/*
EnrollmentRepositoryTest.java
Author: Simangaliso Mazweni Ntuli(230070728)
Date: 28-03-2025
*/

package za.ac.cput.RepositoryTest;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Course;
import za.ac.cput.Entity.Enrollment;
import za.ac.cput.Entity.Student;
import za.ac.cput.Repository.EnrollmentRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EnrollmentRepositoryTest {

    EnrollmentRepository repository;
    Enrollment enrollment;

    @Test
    public void test() {
        repository = EnrollmentRepository.getInstance();
        repository.getAll().clear();

        Student student = new Student.StudentBuilder()
                .setStudentId(2)
                .setFirstName("Alexander")
                .setLastName("Bastoni")
                .setDateOfBirth("1997-12-30")
                .setContactNumber("0610504961")
                .setEmail("252256450@mycput.ac.za")
                .build();

        Course course = new Course.CourseBuilder()
                .setCourseId(10)
                .setCourseName("Diploma in ICT")
                .build();

        enrollment = new Enrollment.EnrollmentBuilder()
                .setEnrollmentId(1)
                .setStudent(student)
                .setCourse(course)
                .setEnrollmentDate("2025-01-28")
                .setGrade("First Year")
                .build();
    }
    @Test
    void testEnrollmentCreate(){
        Enrollment save = repository.create(enrollment);
        assertNotNull(save);
        assertEquals(enrollment, save);
    }

    @Test
    void testEnrollmentRead(){
        repository.create(enrollment);
        Enrollment read = repository.read(1);
        assertNotNull(read);
        assertEquals(enrollment, read);
    }

    @Test
    void testEnrollmentUpdate(){
        repository.create(enrollment);
        Enrollment update = new Enrollment.EnrollmentBuilder()
                .setEnrollmentId(1)
                .setStudent(enrollment.getStudent())
                .setCourse(enrollment.getCourse())
                .setEnrollmentDate("2025-02-05")
                .build();

        Enrollment save = repository.update(update);
        assertNotNull(save);
        assertEquals("2025-02-05", save.getEnrollmentDate());
    }

    @Test
    void testEnrollmentDelete(){
        repository.create(enrollment);
        boolean deleted = repository.delete(1);
        assertTrue(deleted);
        assertNull(repository.read(1));
    }

    @Test
    void testEnrollmentFindAll(){
        repository.create(enrollment);
        List<Enrollment> enrollmentList = repository.getAll();
        assertEquals(1, enrollmentList.size());
    }
}
