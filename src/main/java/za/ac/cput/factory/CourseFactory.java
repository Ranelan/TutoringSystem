//Author: Scelo Kevin Nyandeni 230189695

package za.ac.cput.factory;

import za.ac.cput.entity.Course;
import za.ac.cput.entity.Tutor;

public class CourseFactory {
    public static Course createCourse(int courseId, String courseName, String courseDescription, Tutor tutor) {

        if (courseId <= 0){
            return null;
        }
        if(courseName == null || courseName.isEmpty()) {
            return null;
        }
        if (courseDescription == null || courseDescription.isEmpty()) {
            return null;
        }
        if (tutor == null){
            return null;
        }

        return new Course.CourseBuilder()
                .setCourseId(courseId)
                .setCourseName(courseName)
                .setCourseDescription(courseDescription)
                .setTutor(tutor)
                .build();

    }
}
