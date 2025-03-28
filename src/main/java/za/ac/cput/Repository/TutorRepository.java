package za.ac.cput.Repository;

import za.ac.cput.Entity.Student;
import za.ac.cput.Entity.Tutor;
import java.util.LinkedList;
import java.util.List;

public class TutorRepository {

    private final List<Tutor> tutorList = new LinkedList<>();

    public void save(Tutor tutor){
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

    public void updateTutor(Tutor updatedTutor) {
        for (int i = 0; i < tutorList.size(); i++) {
            if (tutorList.get(i).getTutorID() == updatedTutor.getTutorID()) {
                tutorList.set(i, updatedTutor);
                return;
            }
        }
    }


    public boolean deleteTutor(int id) {
        return tutorList.removeIf(tutor -> tutor.getTutorID() == id);
    }

    // Get all Tutors
    public List<Tutor> getAllTutors() {
        return new LinkedList<>(tutorList);
    }


}