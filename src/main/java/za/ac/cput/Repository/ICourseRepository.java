//Author Scelo Kevin Nyandeni 
//230189695

package za.ac.cput.Repository;

import za.ac.cput.Entity.Course;

import java.util.List;

public interface ICourseRepository extends IRepository<Course, String>{
  List<Course> getAll();
}
