/*
AssignmentFactoryTest.java
Author: Simangaliso Mazweni Ntuli(230070728)
Date: 28-03-2025
*/

package za.ac.cput.FactoryTest;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Assignment;
import za.ac.cput.Entity.Course;
import za.ac.cput.Factory.AssignmentFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AssignmentFactoryTest {

    @Test
    public void testCreateAssignment() {
        Course course = new Course.CourseBuilder()
                .setCourseId(10)
                .setCourseName("Diploma in ICT")
                .setCourseDescription("This course aims to create software developers")
                .build();

        Assignment assignment = AssignmentFactory.createAssignment(
                356,
                "ADP3 Enterprise Project",
                "Articulate your domain problem as a UML class diagram.",
                "2025-03-28",
                100,
                course
        );


        assertNotNull(assignment);
        assertEquals(356, assignment.getAssignmentId());
        assertEquals("ADP3 Enterprise Project", assignment.getTitle());
        assertEquals("Articulate your domain problem as a UML class diagram.", assignment.getDescription());
        assertEquals("2025-03-28", assignment.getDueDate());
        assertEquals(100, assignment.getMaxPoints());
        assertEquals(course, assignment.getCourse());
    }
        @Test
        void testAssignmentID(){
            Course course = new Course.CourseBuilder()
                    .setCourseId(10)
                    .setCourseName("Diploma in ICT")
                    .build();
            Assignment assignment = AssignmentFactory.createAssignment(
                    -1, "ADP3 Enterprise Project",
                    "Articulate your domain problem as a UML class diagram.",
                    "2025-03-28",
                    100,
                    course);
            assertNotNull(assignment, "Return a null assignment for invalid assignment ID");
        }

        @Test
        void testAssignmentTitle(){
            Course course = new Course.CourseBuilder()
                    .setCourseId(10)
                    .setCourseName("Diploma in ICT")
                    .build();
            Assignment assignment = AssignmentFactory.createAssignment(
                    356,
                    "",
                    "Articulate your domain problem as a UML class diagram.",
                    "2025-03-28",
                    100,
                    course
            );
            assertNotNull(assignment, "Return a null assignment for invalid assignment title");
        }

        @Test
        void testAssignmentDescription(){
            Course course = new Course.CourseBuilder()
                    .setCourseId(10)
                    .setCourseName("Diploma in ICT")
                    .build();
            Assignment assignment = AssignmentFactory.createAssignment(
                    356,
                    "ADP3 Enterprise Project",
                    "",
                    "2025-03-28",
                    100,
                    course
            );
            assertNotNull(assignment, "Return a null assignment for invalid assignment description");
        }

        @Test
        void testAssignmentDueDate(){
            Course course = new Course.CourseBuilder()
                    .setCourseId(10)
                    .setCourseName("Diploma in ICT")
                    .build();
            Assignment assignment = AssignmentFactory.createAssignment(
                    356,
                    "ADP3 Enterprise Project",
                    "Articulate your domain problem as a UML class diagram.",
                    "",
                    100,
                    course
            );
            assertNotNull(assignment, "Return a null assignment for invalid assignment due date");
        }

        @Test
        void testAssignmentMaxPoints(){
            Course course = new Course.CourseBuilder()
                    .setCourseId(10)
                    .setCourseName("Diploma in ICT")
                    .build();
            Assignment assignment = AssignmentFactory.createAssignment(
                    356,
                    "ADP3 Enterprise Project",
                    "Articulate your domain problem as a UML class diagram.",
                    "2025-03-28",
                    -1,
                    course
            );
            assertNotNull(assignment, "Return a null assignment for invalid assignment max points");
        }

        @Test
        void testAssignmentCourse(){
            Assignment assignment = AssignmentFactory.createAssignment(
                    356,
                    "ADP3 Enterprise Project",
                    "Articulate your domain problem as a UML class diagram.",
                    "2025-03-28",
                    100,
                    null
            );
            assertNotNull(assignment, "Return a null assignment for invalid assignment course");
        }

    }

