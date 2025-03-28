/*
TutorRepository
Author: Lebuhang Nyanyantsi (222184353)
Date: 28 March 2025
*/
package za.ac.cput.Repository;

import za.ac.cput.Entity.Tutor;
import java.util.LinkedList;
import java.util.List;

public class TutorRepository1 implements ITutorRepository {

    private static TutorRepository1 tutorInstance = null;
    private final List<Tutor> tutorList;

    private TutorRepository1() {
        tutorList = new LinkedList<>();
    }

    public static TutorRepository1 getTutorInstance() {
        if (tutorInstance == null) {
            tutorInstance = new TutorRepository1();
        }
        return tutorInstance;
    }


    @Override
    public List<Tutor> getAll()  { // Retrieves all tutor records.
        return new LinkedList<>(tutorList); // Return a copy to avoid external modification
    }

    @Override
    public Tutor create(Tutor tutor) {
        tutorList.add(tutor);
        return tutor;    }

    @Override
    public Tutor read(Integer id) {  //Reads and retrieves a tutor by their tutor ID.
            for (Tutor tutor : tutorList) {
                if (tutor.getTutorID() == id) {
                    return tutor;
                }
            }
            return null; // Return null if the tutor is not found
        }

    @Override
    public Tutor update(Tutor tutor) { //Updates an existing tutor's details.
        for (int i = 0; i < tutorList.size(); i++) {
            if (tutorList.get(i).getTutorID() == tutor.getTutorID() ){
                tutorList.set(i, tutor);
                return tutor;
            }
        }
        return null; // Return null if tutor not found
    }

    @Override
    public boolean delete(Integer id) { //Deletes a tutor record by tutor ID.
        return tutorList.removeIf(tutor -> tutor.getTutorID() == id);
    }

}

