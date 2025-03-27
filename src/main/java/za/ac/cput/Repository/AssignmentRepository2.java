package za.ac.cput.Repository;

import za.ac.cput.Entity.Assignment;

import java.util.ArrayList;
import java.util.List;

public class AssignmentRepository2 implements IAssignmentRepository {

    private static IAssignmentRepository Assignmentinstance = null;
    private List<Assignment> assignmnentList;

    private AssignmentRepository2() {
        assignmnentList = new ArrayList<Assignment>();
    }

    public static IAssignmentRepository getAssignmentInstance() {
        if (Assignmentinstance == null) {
            Assignmentinstance = new AssignmentRepository2();
        }
        return Assignmentinstance;
    }

    @Override
    public List<Assignment> getAll() {
        return List.of();
    }

    @Override
    public Assignment create(Assignment assignment) {
        return null;
    }

    @Override
    public Assignment read(String s) {
        return null;
    }

    @Override
    public Assignment update(Assignment assignment) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }
}
