package za.ac.cput.Repository;

import za.ac.cput.Entity.Tutor;

import java.util.LinkedList;
import java.util.List;

public class TutorRepository1 implements ITutorRepository{

    private static TutorRepository tutorInstance = null;
    private List<Tutor> tutorList;

    private TutorRepository1(){
        tutorList = new LinkedList<Tutor>();
    }

    public static TutorRepository getTutorInstance() {
        if (tutorInstance == null){
            tutorInstance = new TutorRepository();
        }
        return tutorInstance;
    }


    @Override
    public List<Tutor> getAll() {

        return List.of();
    }

    @Override
    public Tutor create(Tutor tutor) {

        return null;
    }

    @Override
    public Tutor read(String s) {

        return null;
    }

    @Override
    public Tutor update(Tutor tutor) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }
}
