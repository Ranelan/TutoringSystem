package za.ac.cput.Repository;

import za.ac.cput.Entity.Enrollment;

import java.util.List;

public interface IEnrollmentRepository extends IRepository<Enrollment, String>{
    List<Enrollment> getAll();

}
