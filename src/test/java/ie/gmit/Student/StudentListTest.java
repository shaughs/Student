package ie.gmit.Student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StudentListTest {

    StudentList studentList = new StudentList();
    Student newStudent1, newStudent2, newStudent3, newStudent4;

    @BeforeEach
    public void Setup(){
        newStudent1 = new Student("John", "Test@hotmail.com");
        newStudent2 = new Student("Mary", "Test@gmail.com");
        newStudent3 = new Student("Sean", "Test@outlook.com");
        newStudent4 = new Student("Paddy", "Test1234@hotmail.com");

        studentList.addStudent(newStudent1);
        studentList.addStudent(newStudent2);
        studentList.addStudent(newStudent3);
        studentList.addStudent(newStudent4);
    }

    @DisplayName("Testing Student List True")
    @Test
    public void testStudentNameTrue(){
        assertEquals(newStudent1, studentList.searchStudent(newStudent1.getStudentName()));
        assertEquals(newStudent2, studentList.searchStudent(newStudent2.getStudentName()));
        assertEquals(newStudent3, studentList.searchStudent(newStudent3.getStudentName()));
        assertEquals(newStudent4, studentList.searchStudent(newStudent4.getStudentName()));
    }

    @DisplayName("Testing Student List False")
    @Test
    public void testStudentNameFalse(){
        assertNull(studentList.searchStudent("Sgfdsgean"));
        assertNull(studentList.searchStudent("gfdsg"));
        assertNull(studentList.searchStudent("gfds"));
        assertNull(studentList.searchStudent("gfdsfgd"));
    }





























}
