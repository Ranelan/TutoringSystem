//Author: Scelo Kevin Nyandeni 230189695

package za.ac.cput.Factory;
import za.ac.cput.Entity.Course;
import za.ac.cput.Entity.Lesson;

public class LessonFactory {
    public static Lesson createLesson(int lessonId, Course course, String title, String description, String date, String startTime, String endTime ) {

        if(lessonId <= 0){
            return null;
        }
    if(title == null || title.isEmpty()){
       return null;
    }
    if(description == null || description.isEmpty()){
        return null;
    }
    if(date == null || date.isEmpty()){
        return null;
    }
    if(startTime == null || startTime.isEmpty()){
        return null;

    }
    if(endTime == null || endTime.isEmpty()){
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
