package za.ac.cput.Repository;

import za.ac.cput.Entity.Enrollment;

import java.util.List;

public class EnrollmentRepository2 implements IEnrollmentRepository {

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
