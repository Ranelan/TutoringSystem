package za.ac.cput.Repository;

import za.ac.cput.Entity.Assignment;
import za.ac.cput.Entity.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository1 implements IStudentRepository{

    private static StudentRepository studentInstance = null;
    private List<Student> studentList;

    private StudentRepository1() {
        studentList = new LinkedList<Student>();
    }

    public static StudentRepository getRepository() {
        if (studentInstance == null) {
            studentInstance = new StudentRepository();
        }
        return studentInstance;
    }


    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public Student read(String s) {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public List<Student> getAll() {
        return List.of();
    }
}
