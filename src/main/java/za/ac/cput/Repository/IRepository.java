/*
IRepository.java
Author: Ranelani Engel (221813853)
Date: 27 March 2025
*/

package za.ac.cput.Repository;

public interface IRepository <T, ID>{

    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}
