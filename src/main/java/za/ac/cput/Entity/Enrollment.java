/*
Enrollment.java
Author: Ranelani Engel (221813853)
Date: 19 March 2025
*/

package za.ac.cput.Entity;

public class Enrollment {
    private int enrollmentId;
    private Student student;
    private Course course;
    private String enrollmentDate;
    private String grade;

    private Enrollment(EnrollmentBuilder builder) {
        this.enrollmentId = builder.enrollmentId;
        this.student = builder.student;
        this.course = builder.course;
        this.enrollmentDate = builder.enrollmentDate;
        this.grade = builder.grade;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollmentId=" + enrollmentId +
                ", student=" + student +
                ", course=" + course +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public static class EnrollmentBuilder {
        private int enrollmentId;
        private Student student;
        private Course course;
        private String enrollmentDate;
        private String grade;

        public EnrollmentBuilder setEnrollmentId(int enrollmentId) {
            this.enrollmentId = enrollmentId;
            return this;
        }

        public EnrollmentBuilder setStudent(Student student) {
            this.student = student;
            return this;
        }

        public EnrollmentBuilder setCourse(Course course) {
            this.course = course;
            return this;
        }

        public EnrollmentBuilder setEnrollmentDate(String enrollmentDate) {
            this.enrollmentDate = enrollmentDate;
            return this;
        }

        public EnrollmentBuilder setGrade(String grade) {
            this.grade = grade;
            return this;
        }

        public Enrollment build() {
            return new Enrollment(this);
        }
    }
}
