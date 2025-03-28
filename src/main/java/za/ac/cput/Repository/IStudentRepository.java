package za.ac.cput.Repository;

import za.ac.cput.Entity.Student;

import java.util.List;

public interface IStudentRepository extends IRepository<Student, Integer>{ //Deals with abstraction
    List<Student> getAll();
}
