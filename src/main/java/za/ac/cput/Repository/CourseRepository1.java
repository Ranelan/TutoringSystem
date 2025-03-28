package za.ac.cput.Repository;


import za.ac.cput.Entity.Course;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CourseRepository1 implements ICourseRepository {

    private static CourseRepository1 courseInstance = null;
    private List<Course> courseList;

    private CourseRepository1() {
        courseList = new LinkedList<Course>();
    }
    public static CourseRepository1 getRepository() {
        if (courseInstance == null) {
            courseInstance = new CourseRepository1();
        }
        return courseInstance;
    }
    @Override
    public List<Course> getAll() {
        return courseList;
    }

    @Override
    public Course create(Course course) {
        courseList.add(course);
        return course;
    }

    @Override
    public Course read(Integer id) {
        for(Course course : courseList){
            if(course.getCourseId() == id){
                return course;
            }
        }
        return null;
    }

    @Override
    public Course update(Course course) {
        for (int i = 0; i < courseList.size(); i++){
            if(courseList.get(i).getCourseId() == course.getCourseId()){
                courseList.set(i, course);
                return course;
            }
        }
        return course;
    }

    @Override
    public boolean delete(Integer id) {

        return courseList.removeIf(course -> course.getCourseId() == id);
}
}


