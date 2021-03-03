package ie.gmit.Student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {
    Student student;

    @BeforeEach
    public void Setup(){
        student = new Student("Sean","Test@gmail.com");
    }

    @DisplayName("Testing vaild name")
    @Test
    public void testStudentname(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Student("","Test@gmail.com"));
        assertEquals("Invalid Name",e.getMessage());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Student(null,"Test@gmail.com"));
        assertEquals("Invalid Name",e.getMessage());
    }

    @DisplayName("Adding two numbers")
    @Test
    public void testStudentemail(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Student("Sean",null));
        assertEquals("Invalid Email Address",e.getMessage());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Student("Sean",""));
        assertEquals("Invalid Email Address",e.getMessage());
    }

    @Test
    public void testNamecorrect(){
        assertEquals("Sean",student.getStudentName());
    }

    @DisplayName("Adding two numbers")
    @Test
    public void testEmailcorrect(){
        assertEquals("Test@gmail.com",student.getStudentEmail());
    }













}
