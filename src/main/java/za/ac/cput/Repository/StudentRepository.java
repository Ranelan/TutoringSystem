package za.ac.cput.Repository;

import za.ac.cput.Entity.Student;

import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements IStudentRepository{

   private static IStudentRepository repository = null;
   private List<Student> studentList;

   private StudentRepository(){
       studentList = new LinkedList<Student>();
   }

   public static IStudentRepository getInstance(){
       if(repository == null){
           repository = new StudentRepository();
       }
       return repository;
   }

    @Override
    public Student create(Student student) { //Create a new student
        studentList.add(student);
        return student;
    }


    @Override
    public Student read(Integer id) {  //Reads and retrieves a student by their student ID.
        for (Student student : studentList) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null; // Return null if the student is not found
    }


    @Override
    public Student update(Student student) { //Updates an existing student's details.
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == student.getStudentId()) {
                studentList.set(i, student);
                return student;
            }
        }
        return null; // Return null if student not found
    }


    @Override
    public boolean delete(Integer id) { //Deletes a student record by student ID.
        return studentList.removeIf(student -> student.getStudentId() == id);
    }


    @Override
    public List<Student> getAll() { // Retrieves all student records.
        return new LinkedList<>(studentList); // Return a copy to avoid external modification
    }
}