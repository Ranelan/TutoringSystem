/*
IEnrollmentRepository.java
Author: Ntuli Simangaliso Mazweni (230070728)
Date: 28 March 2025
 */

package za.ac.cput.Repository;

import za.ac.cput.Entity.Enrollment;

import java.util.List;

public interface IEnrollmentRepository extends IRepository<Enrollment, String>{
    List<Enrollment> getAll();

}
