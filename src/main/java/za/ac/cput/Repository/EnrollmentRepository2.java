/*
EnrollmentRepository2.java
Author: Ntuli Simangaliso Mazweni (230070728)
Date: 28 March 2025
 */

package za.ac.cput.Repository;

import za.ac.cput.Entity.Enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentRepository2 implements IEnrollmentRepository {

    //Static instance for the singleton pattern
    private static EnrollmentRepository enrollmentInstance;

    //List to store Enrollment objects
    private List<Enrollment> enrollments;

    public EnrollmentRepository2() {
        enrollments = new ArrayList<Enrollment>();
    }

    public static EnrollmentRepository getInstance() {
        if (enrollmentInstance == null) {
            enrollmentInstance = new EnrollmentRepository();
        }
        return enrollmentInstance;
    }

    @Override
    public List<Enrollment> getAll() {
        return List.of();
    }

    @Override
    public Enrollment create(Enrollment enrollment) {
        return null;
    }

    @Override
    public Enrollment read(String s) {
        return null;
    }

    @Override
    public Enrollment update(Enrollment enrollment) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }
}
