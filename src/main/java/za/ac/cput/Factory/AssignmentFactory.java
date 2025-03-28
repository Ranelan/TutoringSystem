/*
Assignment.java
AssignmentFactory.java
Author: Ntuli Simangaliso Mazweni (230070728)
Date: 20 March 2025
 */

package za.ac.cput.Factory;

import za.ac.cput.Entity.Assignment;
import za.ac.cput.Entity.Course;
import za.ac.cput.Utility.Helper;

import java.time.LocalDate;

public class AssignmentFactory {
    public static Assignment createAssignment(int assignmentId, String title, String description, String dueDate,int maxPoints, Course course){

        if (!Helper.isValid(assignmentId)){
            return null;
        }

        if (Helper.isNullOrEmpty(title) || Helper.isNullOrEmpty(description)){
            return null;
        }

        if (dueDate == null || !Helper.isValidDate(dueDate.toString())){
            return null;
        }

        if (!Helper.isValidMaxPoints(maxPoints)){
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

