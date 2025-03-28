package za.ac.cput.Repository;

import za.ac.cput.Entity.Tutor;
import java.util.LinkedList;
import java.util.List;

public class TutorRepository2 {
    private final List<Tutor> tutorList = new LinkedList<>();

    public void save(Tutor tutor) {
        tutorList.add(tutor);
    }

    public Tutor getTutor(int id) {
        for (Tutor tutor : tutorList) {
            if (tutor.getTutorID() == id) {
                return tutor;
            }
        }
        return null;
    }

    public void updateTutor(Tutor tutor) {
        for (int i = 0; i < tutorList.size(); i++) {
            if (tutorList.get(i).getTutorID() == tutor.getTutorID()) {
                tutorList.set(i, tutor);
                return;
            }
        }
    }

    public boolean deleteTutor(int id) {
        for (Tutor tutor : tutorList) {
            if (tutor.getTutorID() == id) {
                tutorList.remove(tutor);
                return true;
            }
        }
        return false;
    }
}