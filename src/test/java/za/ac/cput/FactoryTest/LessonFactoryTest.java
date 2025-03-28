// Scelo Kevin Nyandeni
// 230189695

package za.ac.cput.FactoryTest;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Course;
import za.ac.cput.Entity.Lesson;
import za.ac.cput.Factory.LessonFactory;
import za.ac.cput.Entity.Tutor;

import static org.junit.jupiter.api.Assertions.*;

public class LessonFactoryTest {

    @Test
    public void testCreateLesson() {
        Tutor tutor = new Tutor.TutorBuilder()
                .setTutorId(11)
                .setTutorName("Scelo Kevin")
                .setTutorEmail("scelo@example.com")
                .build();

        Course course = new Course.CourseBuilder()
                .setCourseId(10)
                .setCourseName("Data Analytics")
                .setCourseDescription("Analyzing trends and patterns to create a visual representation of data")
                .setTutor(tutor)
                .build();

        Lesson lesson = LessonFactory.createLesson(
                201,
                course,
                "Introduction to Data Analytics",
                "Overview of data analytics principles",
                "2025-04-01",
                "10:00",
                "12:00"
        );

        assertNotNull(lesson);
        assertEquals(201, lesson.getLessonId());
        assertEquals(course, lesson.getCourse());
        assertEquals("Introduction to Data Analytics", lesson.getTitle());
        assertEquals("Overview of data analytics principles", lesson.getDescription());
        assertEquals("2025-04-01", lesson.getDate());
        assertEquals("10:00", lesson.getStartTime());
        assertEquals("12:00", lesson.getEndTime());
    }

    @Test
    void testInvalidLessonId() {
        Course course = new Course.CourseBuilder()
                .setCourseId(10)
                .setCourseName("Data Analytics")
                .setCourseDescription("Analyzing trends and patterns to create a visual representation of data")
                .setTutor(new Tutor.TutorBuilder()
                        .setTutorId(11)
                        .setTutorName("Scelo Kevin")
                        .setTutorEmail("scelo@example.com")
                        .build())
                .build();

        Lesson lesson = LessonFactory.createLesson(
                -1,
                course,
                "Introduction to Data Analytics",
                "Overview of data analytics principles",
                "2025-04-01",
                "10:00",
                "12:00"
        );

        assertNull(lesson, "Return null for invalid lesson ID");
    }

    @Test
    void testNullCourse() {
        Lesson lesson = LessonFactory.createLesson(
                201,
                null,
                "Introduction to Data Analytics",
                "Overview of data analytics principles",
                "2025-04-01",
                "10:00",
                "12:00"
        );

        assertNull(lesson, "Return null for null course");
    }

    @Test
    void testEmptyTitle() {
        Course course = new Course.CourseBuilder()
                .setCourseId(10)
                .setCourseName("Data Analytics")
                .setCourseDescription("Analyzing trends and patterns to create a visual representation of data")
                .setTutor(new Tutor.TutorBuilder()
                        .setTutorId(11)
                        .setTutorName("Scelo Kevin")
                        .setTutorEmail("scelo@example.com")
                        .build())
                .build();

        Lesson lesson = LessonFactory.createLesson(
                201,
                course,
                "",
                "Overview of data analytics principles",
                "2025-04-01",
                "10:00",
                "12:00"
        );

        assertNull(lesson, "Return null for empty title");
    }

    @Test
    void testInvalidDate() {
        Course course = new Course.CourseBuilder()
                .setCourseId(10)
                .setCourseName("Data Analytics")
                .setCourseDescription("Analyzing trends and patterns to create a visual representation of data")
                .setTutor(new Tutor.TutorBuilder()
                        .setTutorId(11)
                        .setTutorName("Scelo Kevin")
                        .setTutorEmail("scelo@example.com")
                        .build())
                .build();

        Lesson lesson = LessonFactory.createLesson(
                201,
                course,
                "Introduction to Data Analytics",
                "Overview of data analytics principles",
                "invalid-date",
                "10:00",
                "12:00"
        );

        assertNull(lesson, "Return null for invalid date format");
    }

    @Test
    void testInvalidStartTime() {
        Course course = new Course.CourseBuilder()
                .setCourseId(10)
                .setCourseName("Data Analytics")
                .setCourseDescription("Analyzing trends and patterns to create a visual representation of data")
                .setTutor(new Tutor.TutorBuilder()
                        .setTutorId(11)
                        .setTutorName("Scelo Kevin")
                        .setTutorEmail("scelo@example.com")
                        .build())
                .build();

        Lesson lesson = LessonFactory.createLesson(
                201,
                course,
                "Introduction to Data Analytics",
                "Overview of data analytics principles",
                "2025-04-01",
                "invalid-time",
                "12:00"
        );

        assertNull(lesson, "Return null for invalid start time format");
    }

    @Test
    void testInvalidEndTime() {
        Course course = new Course.CourseBuilder()
                .setCourseId(10)
                .setCourseName("Data Analytics")
                .setCourseDescription("Analyzing trends and patterns to create a visual representation of data")
                .setTutor(new Tutor.TutorBuilder()
                        .setTutorId(11)
                        .setTutorName("Scelo Kevin")
                        .setTutorEmail("scelo@example.com")
                        .build())
                .build();

        Lesson lesson = LessonFactory.createLesson(
                201,
                course,
                "Introduction to Data Analytics",
                "Overview of data analytics principles",
                "2025-04-01",
                "10:00",
                "invalid-time"
        );

        assertNull(lesson, "Return null for invalid end time format");
    }
}
