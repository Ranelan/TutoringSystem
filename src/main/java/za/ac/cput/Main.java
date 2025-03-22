package za.ac.cput;


import za.ac.cput.entity.Student;
import za.ac.cput.factory.StudentFactory;

public class Main {
    public static void main(String[] args) {
        Student student = StudentFactory.createStudent(221813853, "Ranelani", "Engel", "2000-05-10", "0712345678", "ranelani@email.com"); // Testing the Student Factory

        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Invalid student data.");
        }

       //waiting for the courseFactory to be complete to test the Enrollment Factory

    }
    }
