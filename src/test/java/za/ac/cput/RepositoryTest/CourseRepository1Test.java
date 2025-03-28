// Scelo Kevin Nyandeni
// 230189695

package za.ac.cput.RepositoryTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Course;
import za.ac.cput.Entity.Tutor;
import za.ac.cput.Repository.CourseRepository1;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CourseRepository1Test {

    private CourseRepository1 repository;
    private Course course;

    @BeforeEach
    void setUp() {
        repository = CourseRepository1.getRepository();
        repository.getAll().clear();

        Tutor tutor = new Tutor.TutorBuilder()
                .setTutorId(11)
                .setTutorName("Scelo Kevin")
                .setTutorEmail("scelo@example.com")
                .build();

        course = new Course.CourseBuilder()
                .setCourseId(10)
                .setCourseName("Data Analytics")
                .setCourseDescription("Analyzing trends and patterns to create visualization of data")
                .setTutor(tutor)
                .build();
    }

    @Test
    void testCourseCreate() {
        Course savedCourse = repository.create(course);
        assertNotNull(savedCourse);
        assertEquals(course, savedCourse);
    }

    @Test
    void testCourseRead() {
        repository.create(course);
        Course readCourse = repository.read(10);
        assertNotNull(readCourse);
        assertEquals(course, readCourse);
    }

    @Test
    void testCourseUpdate() {
        repository.create(course);

        Course updatedCourse = new Course.CourseBuilder()
                .setCourseId(10)
                .setCourseName("Data Analytics")
                .setCourseDescription("Analyzing trends and patterns to create visualization of data")
                .setTutor(course.getTutor())
                .build();

        Course savedCourse = repository.update(updatedCourse);
        assertNotNull(savedCourse);
        assertEquals("Analyzing trends and patterns to create visualization of data", savedCourse.getCourseName());
    }

    @Test
    void testCourseDelete() {
        repository.create(course);
        boolean deleted = repository.delete(10);
        assertTrue(deleted);
        assertNull(repository.read(10));
    }

    @Test
    void testCourseFindAll() {
        repository.create(course);
        List<Course> courseList = repository.getAll();
        assertEquals(1, courseList.size());
    }
}
