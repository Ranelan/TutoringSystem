/*
Student.java
Author: Ranelani Engel (221813853)
Date: 19 March 2025
 */


package za.ac.cput.Entity;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String contactNumber;
    private String email;

    private Student(StudentBuilder studentBuilder) {
        this.studentId = studentBuilder.studentId;
        this.firstName = studentBuilder.firstName;
        this.lastName = studentBuilder.lastName;
        this.dateOfBirth = studentBuilder.dateOfBirth;
        this.contactNumber = studentBuilder.contactNumber;
        this.email = studentBuilder.email;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class StudentBuilder {
        private int studentId;
        private String firstName;
        private String lastName;
        private String dateOfBirth;
        private String contactNumber;
        private String email;

        public StudentBuilder setStudentId(int studentId) {
            this.studentId = studentId;
            return this;
        }

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public StudentBuilder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Student build() {
            return new Student(this);
        }
    }

}
