package za.ac.cput.Repository;

import za.ac.cput.Entity.Assignment;

import java.util.ArrayList;
import java.util.List;

public class AssignmentRepository {
    private final List<Assignment> assignmentList = new ArrayList<>();

    public void save(Assignment assignment) {
        assignmentList.add(assignment);
    }

    public Assignment getAssignment(int id) {
            return assignmentList.get(id);
    }

    public void updateAssignment(Assignment assignment) {
        for (int i = 0; i < assignmentList.size(); i++) {
            if (assignmentList.get(i).getAssignmentId() == assignment.getAssignmentId()) {
                assignmentList.set(i, assignment);
                return;
            }
        }
    }

    public boolean deleteAssignment(int id) {
        for (Assignment assignment : assignmentList) {
            if (assignment.getAssignmentId() == id) {
                assignmentList.remove(assignment);
                return true;
            }
        }
        return false;
    }
}
