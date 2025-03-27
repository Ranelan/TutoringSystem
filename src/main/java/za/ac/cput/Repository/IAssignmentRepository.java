package za.ac.cput.Repository;

import za.ac.cput.Entity.Assignment;

import java.util.List;

public interface IAssignmentRepository extends IRepository<Assignment, String>{
    List<Assignment> getAll();
}
