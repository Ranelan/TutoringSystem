package za.ac.cput.Repository;

import za.ac.cput.Entity.Tutor;

import java.util.List;

public interface ITutorRepository extends IRepository {
    List<Tutor> getAll();

}
