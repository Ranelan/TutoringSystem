package za.ac.cput.Repository;

import za.ac.cput.Entity.Student;

import java.util.List;

public interface IStudentRepository extends IRepository<Student, String>{ //Deals with abstraction
    List<Student> getAll();
}
