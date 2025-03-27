package za.ac.cput.Repository;

import za.ac.cput.Entity.Student;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository {
    private final List<Student> studentList = new LinkedList<>();

    // Save a new student
    public void save(Student student) {
        studentList.add(student);
    }

    // Retrieve a student by studentId
    public Student getStudent(int id) {
        for (Student student : studentList) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null; // Return null if student not found
    }

    // Update an existing student
    public void updateStudent(Student updatedStudent) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == updatedStudent.getStudentId()) {
                studentList.set(i, updatedStudent);
                return;
            }
        }
    }

    // Delete a student by studentId
    public boolean deleteStudent(int id) {
        return studentList.removeIf(student -> student.getStudentId() == id);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return new LinkedList<>(studentList);
    }
}
