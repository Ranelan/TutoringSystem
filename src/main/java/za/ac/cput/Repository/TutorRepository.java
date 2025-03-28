package za.ac.cput.Repository;

import za.ac.cput.Entity.Tutor;
import java.util.LinkedList;
import java.util.List;

public class TutorRepository implements ITutorRepository {

    private static ITutorRepository repositoryTutor = null;
    private List<Tutor> tutorList;
    private TutorRepository(){
        tutorList = new LinkedList<Tutor>();
    }

    public static ITutorRepository getRepository(){
        if(repositoryTutor==null){
            repositoryTutor = new TutorRepository();
        }
        return repositoryTutor;
    }


    @Override
    public List<Tutor> getAll() {
        return List.of();
    }

    @Override
    public Object create(Object o) {
        return null;
    }

    @Override
    public Object read(Object o) {
        return null;
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }
}