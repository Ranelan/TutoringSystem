//Scelo Kevin Nyandeni
//230189695

package za.ac.cput.FactoryTest;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Course;
import za.ac.cput.Entity.Tutor;
import za.ac.cput.Factory.CourseFactory;
import za.ac.cput.Utility.Helper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CourseFactoryTest {

    @Test
    public void testCreateCourse() {
        Tutor tutor = new Tutor.TutorBuilder()
                .setTutorId(11)
                .setTutorName("Scelo Kevin")
                .setTutorEmail("scelo@example.com")
                .build();

      Course course = CourseFactory.createCourse(
                10,
                "Data Analytics",
                "Analysic trends and patterns to create visual representation of data",
                tutor
        );

       
        assertNotNull(course);
        assertEquals(10, course.getCourseId());
        assertEquals("Data Analytics", course.getCourseName());
        assertEquals("Analysic trends and patterns to create visual representation of data", course.getCourseDescription());
        assertEquals(tutor, course.getTutor());
    }

   @Test
    void testInvalidCourseId() {
        Tutor tutor = new Tutor.TutorBuilder()
                .setTutorId(11)
                .setTutorName("Scelo Kevin")
                .setTutorEmail("scelo@example.com")
                .build();

        Course course = CourseFactory.createCourse(
                -1,
                "Data Analytics",
                "Analysing trends and patterns to create visual representation of data",
                tutor
        );

        assertNull(course, "Return null for invalid course ID");
    }

   @Test
    void testInvalidCourseName() {
        Tutor tutor = new Tutor.TutorBuilder()
                .setTutorId(11)
                .setTutorName("Scelo Kevin")
                .setTutorEmail("scelo@example.com")
                .build();

        Course course = CourseFactory.createCourse(
                10,
                "",
                "Analysing trends and patterns to create visual representation of data",
                tutor
        );

        assertNull(course, "Return null for invalid course name");
    }
  
   @Test
    void testInvalidCourseDescription() {
        Tutor tutor = new Tutor.TutorBuilder()
                .setTutorId(11)
                .setTutorName("Scelo Kevin")
                .setTutorEmail("scelo@example.com")
                .build();

        Course course = CourseFactory.createCourse(
                10,
                "Data Analytics",
                "",
                tutor
        );

        assertNull(course, "Return null for invalid course description");
    }
    @Test
    void testCourseNameAndDescriptionEmpty() {
     Tutor tutor = new Tutor.TutorBuilder()
        .setTutorId(11)
        .setTutorName("Scelo Kevin")
        .setTutorEmail("scelo@example.com")
        .build();

        assertNull(course, "Course should be null for empty course name and description");
    }
    
   @Test
    void testNullTutor() {
        Course course = CourseFactory.createCourse(
                11,
                "Data Analytics",
                "Analysing trends and patterns to create visual representation of data",
                null
        );

        assertNull(course, "Return null for null tutor");
    }
}
