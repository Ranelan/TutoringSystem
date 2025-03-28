package za.ac.cput.Repository;

import za.ac.cput.Entity.Enrollment;

import java.util.LinkedList;
import java.util.List;

public class EnrollmentRepository {
    private final List<Enrollment> enrollments = new LinkedList<>();

    public void save(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    // Read - Get an enrollment by their id
    public Enrollment getEnrollment(int id) {
        if (id >= 0 && id < enrollments.size()) {
            return enrollments.get(id);
        }
        return null;
    }

    // Update - Update an enrollment by id
    public boolean updateEnrollment(int id, Enrollment updatedEnrollment) {
        for (int i = 0; i < enrollments.size(); i++) {
            if (enrollments.get(i).getEnrollmentId() == id) {
                enrollments.set(i, updatedEnrollment);
                return true; // Successfully updated
            }
        }
        return false;
    }

    // Delete - Remove an enrollment by ID
    public boolean deleteEnrollment(int id) {
        return enrollments.removeIf(enrollment -> enrollment.getEnrollmentId() == id);
    }


}
