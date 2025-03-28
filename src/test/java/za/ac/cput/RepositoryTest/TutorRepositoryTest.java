/*
TutorRepositoryTest.java
Author: Lebuhang Nyanyantsi (222184353)
Date: 28 March 2025
*/

package za.ac.cput.RepositoryTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Tutor;
import za.ac.cput.Repository.TutorRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TutorRepositoryTest {

    private TutorRepository repository;
    private Tutor tutor1;
    private Tutor tutor2;

    @BeforeEach
    void setUp() {
        repository = TutorRepository.getTutorInstance();

        // Initialize test tutors using the Builder pattern
        tutor1 = new Tutor.Builder()
                .setTutorID(1001)
                .setFirstName("Thapelo")
                .setLastName("Nzide")
                .setQualification("PhD in Computer Science")
                .setContactNumber("0632392362")
                .setEmail("thapelo.nzide@cput.ac.za")
                .build();

        tutor2 = new Tutor.Builder()
                .setTutorID(1002)
                .setFirstName("Lebohang")
                .setLastName("Mokoena")
                .setQualification("MSc in Information Technology")
                .setContactNumber("0812233445")
                .setEmail("lebo.mokoena@cput.ac.za")
                .build();

        // Add tutors to repository
        repository.create(tutor1);
        repository.create(tutor2);
    }

    @Test
    void testCreate() {
        Tutor newTutor = new Tutor.Builder()
                .setTutorID(1003)
                .setFirstName("John")
                .setLastName("Doe")
                .setQualification("BSc in Software Engineering")
                .setContactNumber("0729988776")
                .setEmail("john.doe@cput.ac.za")
                .build();

        Tutor createdTutor = repository.create(newTutor);
        assertNotNull(createdTutor, "Tutor creation failed");
        assertEquals(1003, createdTutor.getTutorID(), "Tutor ID mismatch");
    }

    @Test
    void testRead() {
        Tutor foundTutor = repository.read(1001);
        assertNotNull(foundTutor, "Tutor not found");
        assertEquals("Thapelo", foundTutor.getFirstName(), "First name mismatch");
        assertEquals("thapelo.nzide@cput.ac.za", foundTutor.getEmail(), "Email mismatch");
    }

    @Test
    void testUpdate() {
        Tutor updatedTutor = new Tutor.Builder()
                .setTutorID(1001)
                .setFirstName("Thapelo Junior")
                .setLastName("Nzide")
                .setQualification("PhD in Computer Science")
                .setContactNumber("0632392362")
                .setEmail("thapelo.junior@cput.ac.za")
                .build();

        Tutor result = repository.update(updatedTutor);
        assertNotNull(result, "Update failed");
        assertEquals("Thapelo Junior", result.getFirstName(), "First name not updated");
        assertEquals("thapelo.junior@cput.ac.za", result.getEmail(), "Email not updated");
    }

    @Test
    void testDelete() {
        boolean isDeleted = repository.delete(1002);
        assertTrue(isDeleted, "Delete operation failed");
        assertNull(repository.read(1002), "Tutor should be deleted");
    }

    @Test
    void testGetAll() {
        List<Tutor> tutorList = repository.getAll();
        System.out.println("Tutors in repository: " + tutorList.size());
        for (Tutor tutor : tutorList) {
            System.out.println(tutor.getTutorID() + " - " + tutor.getFirstName());
        }
        assertEquals(2, tutorList.size(), "Incorrect number of tutors");
    }
}
