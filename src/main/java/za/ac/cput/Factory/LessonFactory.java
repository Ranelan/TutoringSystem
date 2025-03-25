//Author: Scelo Kevin Nyandeni 230189695

package za.ac.cput.Factory;
import za.ac.cput.Entity.Course;
import za.ac.cput.Entity.Lesson;
import za.ac.cput.Utility.Helper;

public class LessonFactory {
    public static Lesson createLesson(int lessonId, Course course, String title, String description, String date, String startTime, String endTime ) {

        if(!Helper.isValid(lessonId)){
            return null;
        }
        if(course == null){
            return null;
        }
    if(Helper.isNullOrEmpty(title) || Helper.isNullOrEmpty(description)) {
       return null;
    }
    
    if(!Helper.isValidDate(date)){
        return null;
    }
    if(!Helper.isValidTime(startTime)){
        return null;

    }
   if(!Helper.isValidTime(endTime)){
        return null;
    }
    return new Lesson.LessonBuilder()
            .setLessonId(lessonId)
            .setCourse(course)
            .setTitle(title)
            .setDescription(description)
            .setDate(date)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .build();
}
