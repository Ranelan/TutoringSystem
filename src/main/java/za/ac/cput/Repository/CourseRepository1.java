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
        return List.of();
    }

    @Override
    public Course create(Course course) {
        return null;
    }

    @Override
    public Course read(String s) {
        return null;
    }

    @Override
    public Course update(Course course) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }
}


