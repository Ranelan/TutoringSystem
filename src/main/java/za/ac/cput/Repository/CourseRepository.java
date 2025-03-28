//Author Scelo Kevin Nyandeni
//230189695

package za.ac.cput.Repository;

import za.ac.cput.Entity.Course;
import java.util.LinkedList;
import java.util.List;

public class CourseRepository{
  private final List<Course> courseList = new LinkedList<>();

  public void save(Course course){
    courseList.add(course);
  }

  public Course getCourse(int id){
    for(Course course : courseList){
      if(course.getCourseId() == id){
         return course;
      }
    }
      return null;
  }
public void updateCourse(Course updatedCourse){
  for (int i = 0; i < courseList.size(); i++){
    if(courseList.get(i).getCourseId() == updatedCourse.getCourseId()){
      courseList.set(i, updatedCourse);
      return;
    }
  }
}
  public boolean deleteCourse(int id){
    return courseList.removeIf(course -> course.getCourseId() == id);
  }
  public List<Course> getAllCourses(){
    return LinkedList<>(courseList);
  }
  }
}
