/*
Enrollment.java
Author: Ranelani Engel (221813853)
Author : Scelo Kevin Nyandeni (230189695)
Date: 20 March 2025
 */


package za.ac.cput.entity;
import za.ac.cput.Tutor;

public class Course {
    private int courseId;
    private String courseName;
    private String courseDescription;
    private Tutor tutor;

    public Course() {

    }

    private Course(Builder builder) {
        this.courseId = builder.courseId;
        this.courseName = builder.courseName;
        this.courseDescription = builder.courseDescription;
        this.tutor = builder.tutor;

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

    public static class Builder {
        private int courseId;
        private String courseName;
        private String courseDescription;
        private Tutor tutor;

        public Builder setCourseId(int courseId) {
            this.courseId = courseId;
            return this;
        }

        public Builder setCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public Builder setCourseDescription(String courseDescription) {
            this.courseDescription = courseDescription;
            return this;
        }

        public Builder setTutor(Tutor tutor) {
            this.tutor = tutor;
            return this;
        }
        public Course build(){
            return new Course(this);

        }
    }

}
