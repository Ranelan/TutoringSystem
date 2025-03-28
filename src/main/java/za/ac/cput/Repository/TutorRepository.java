package za.ac.cput.Repository;

import za.ac.cput.Entity.Tutor;
import java.util.LinkedList;
import java.util.List;

public class TutorRepository implements ITutorRepository {

    private static TutorRepository tutorInstance = null;
    private final List<Tutor> tutorList;

    private TutorRepository() {
        tutorList = new LinkedList<>();
    }

    public static TutorRepository getTutorInstance() {
        if (tutorInstance == null) {
            tutorInstance = new TutorRepository();
        }
        return tutorInstance;
    }

    @Override
    public List<Tutor> getAll() {
        return new LinkedList<>(tutorList); // Return a copy to avoid external modification
    }

    @Override
    public Tutor create(Tutor tutor) {
        tutorList.add(tutor);
        return tutor;
    }

    @Override
    public Tutor read(Integer id) {
        for (Tutor tutor : tutorList) {
            if (Integer.valueOf(tutor.getTutorID()).equals(id)) { // Ensure proper comparison
                return tutor;
            }
        }
        return null; // Return null if tutor is not found
    }

    @Override
    public Tutor update(Tutor tutor) {
        for (int i = 0; i < tutorList.size(); i++) {
            if (Integer.valueOf(tutorList.get(i).getTutorID()).equals(tutor.getTutorID())) {
                tutorList.set(i, tutor);
                return tutor;
            }
        }
        return null; // Return null if tutor not found
    }

    @Override
    public boolean delete(Integer id) {
        return tutorList.removeIf(tutor -> Integer.valueOf(tutor.getTutorID()).equals(id));
    }
}