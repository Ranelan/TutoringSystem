/*
Enrollment.java
Author: Ranelani Engel (221813853)
Author : Scelo Kevin Nyandeni (230189695)
Date: 20 March 2025
 */


package za.ac.cput.entity;


public class Course {
    private int courseId;
    private String courseName;
    private String courseDescription;
    private Tutor tutor;

    public Course() {

    }

    private Course(CourseBuilder courseBuilder) {
        this.courseId = courseBuilder.courseId;
        this.courseName = courseBuilder.courseName;
        this.courseDescription = courseBuilder.courseDescription;
        this.tutor = courseBuilder.tutor;

    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", tutor=" + tutor +
                '}';
    }

    public static class CourseBuilder {
        private int courseId;
        private String courseName;
        private String courseDescription;
        private Tutor tutor;

        public CourseBuilder setCourseId(int courseId) {
            this.courseId = courseId;
            return this;
        }

        public CourseBuilder setCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder setCourseDescription(String courseDescription) {
            this.courseDescription = courseDescription;
            return this;
        }

        public CourseBuilder setTutor(Tutor tutor) {
            this.tutor = tutor;
            return this;
        }
        public Course build(){
            return new Course(this);

        }
    }

}
