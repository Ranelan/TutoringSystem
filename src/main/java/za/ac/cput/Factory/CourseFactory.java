//Author: Scelo Kevin Nyandeni 230189695

package za.ac.cput.Factory;

import za.ac.cput.Entity.Course;
import za.ac.cput.Entity.Tutor;
import za.ac.cput.Utility.Helper;

public class CourseFactory {
    public static Course createCourse(int courseId, String courseName, String courseDescription, Tutor tutor) {

        if (!Helper.isValid(courseId){
            return null;
        }
        if(Helper.isNullOrEmpty(courseName) || Helper.isNullOrEmpty(courseDescription)) {
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
