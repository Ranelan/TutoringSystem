/*
EnrollmentRepository2.java
Author: Ntuli Simangaliso Mazweni (230070728)
Date: 28 March 2025
 */

package za.ac.cput.Repository;

import za.ac.cput.Entity.Enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentRepository implements IEnrollmentRepository {

    //Static instance for the singleton pattern
    private static EnrollmentRepository enrollmentInstance;

    //List to store Enrollment objects
    private List<Enrollment> enrollments;

    public EnrollmentRepository() {
        enrollments = new ArrayList<Enrollment>();
    }

    public static EnrollmentRepository getInstance() {
        if (enrollmentInstance == null) {
            enrollmentInstance = new EnrollmentRepository();
        }
        return enrollmentInstance;
    }

    @Override
    public Enrollment create(Enrollment enrollment) {
        boolean validate = enrollments.add(enrollment);
        if (validate) {
            return enrollment;
        }
        return null;
    }

    @Override
    public Enrollment read(Integer enrollmentId) {
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getEnrollmentId() == enrollmentId) {
                return enrollment;
            }
        }
        return null;
    }


    @Override
    public Enrollment update(Enrollment enrollment) {
        for (int i = 0; i < enrollments.size(); i++) {
            if (enrollments.get(i).getEnrollmentId() == enrollment.getEnrollmentId()) {
                enrollments.set(i, enrollment);
                return enrollment;
            }
        }
        return null;
    }

    @Override
    public boolean delete(Integer enrollmentId) {
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getEnrollmentId() == enrollmentId) {
                return enrollments.remove(enrollment);
            }
        }
        return false;
    }

    @Override
    public List<Enrollment> getAll() {
        return new ArrayList<Enrollment>(enrollments);
    }
}
