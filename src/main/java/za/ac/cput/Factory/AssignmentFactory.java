/*
Assignment.java
AssignmentFactory.java
Author: Ntuli Simangaliso Mazweni (230070728)
Date: 20 March 2025
 */

package za.ac.cput.Factory;

import za.ac.cput.Entity.Assignment;
import za.ac.cput.Entity.Course;

import java.time.LocalDate;

public class AssignmentFactory {
    public static Assignment createAssignment(int assignmentId, String title, String description, LocalDate dueDate,int maxPoints, Course course){
        if (assignmentId <= 0){
            return null;
        }

        if (title.isEmpty() || title == null){
            return null;
        }

        if (description.isEmpty() || description == null){
            return null;
        }

        if (dueDate == null){
            return null;
        }

        if (maxPoints <= 0){
            return null;
        }

        if (course == null){
            return null;
        }

        return new Assignment.AssignmentBuilder()
                .setAssignmentId(assignmentId)
                .setTitle(title)
                .setDescription(description)
                .setDueDate(dueDate)
                .setMaxPoints(maxPoints)
                .setCourse(course)
                .build();
    }
}

