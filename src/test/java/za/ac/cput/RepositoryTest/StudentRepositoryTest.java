/*
StudenRepositoryTest.java
Author: Ranelani Engel (221813853)
Date: 28 March 2025
 */


package za.ac.cput.RepositoryTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Student;
import za.ac.cput.Repository.StudentRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryTest {

    private StudentRepository repository;
    private Student student1;
    private Student student2;

    @BeforeEach
    void setUp() {
        repository = (StudentRepository) StudentRepository.getInstance();

        repository.clear();


        student1 = new Student.StudentBuilder()
                .setStudentId(221813853)
                .setFirstName("Engel")
                .setLastName("Ranelani")
                .setDateOfBirth("2001-05-12")
                .setContactNumber("0637298552")
                .setEmail("raneyclassic@gmail.com")
                .build();

        student2 = new Student.StudentBuilder()
                .setStudentId(221826796)
                .setFirstName("Jane")
                .setLastName("Ntuli")
                .setDateOfBirth("2002-08-21")
                .setContactNumber("0716362203")
                .setEmail("janeNtuli@gmail.com")
                .build();

        // Add students before running tests
        repository.create(student1);
        repository.create(student2);
    }

    @Test
    void testCreate() {
        Student newStudent = new Student.StudentBuilder()
                .setStudentId(25573839)
                .setFirstName("Lebuhang")
                .setLastName("Nyanyantsi")
                .setDateOfBirth("2000-12-10")
                .setContactNumber("0654321897")
                .setEmail("lebza@gami.com")
                .build();

        Student createdStudent = repository.create(newStudent);
        assertNotNull(createdStudent);
        assertEquals(25573839, createdStudent.getStudentId());
    }

    @Test
    void testRead() {
        Student foundStudent = repository.read(221813853);
        assertNotNull(foundStudent);
        assertEquals("Engel", foundStudent.getFirstName());
    }

    @Test
    void testUpdate() {
        Student updatedStudent = new Student.StudentBuilder()
                .setStudentId(221813853)
                .setFirstName("Raney")
                .setLastName("Ranelani")
                .setDateOfBirth("2001-05-12")
                .setContactNumber("0637298552")
                .setEmail("raneyclassic@gmail.com")
                .build();

        Student result = repository.update(updatedStudent);
        assertNotNull(result);
        assertEquals("Raney", result.getFirstName());
        assertEquals("raneyclassic@gmail.com", result.getEmail());
    }

    @Test
    void testDelete() {
        boolean isDeleted = repository.delete(221826796);
        assertTrue(isDeleted);
        assertNull(repository.read(221826796)); // Ensure the student is deleted
    }

    @Test
    void testGetAll() {
        List<Student> studentList = repository.getAll();
        System.out.println("Students in repository: " + studentList.size());
        for (Student student : studentList) {
            System.out.println(student.getStudentId() + " - " + student.getFirstName());
        }
        assertEquals(2, studentList.size());
    }

}
