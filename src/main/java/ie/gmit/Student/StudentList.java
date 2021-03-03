package ie.gmit.Student;

import java.util.ArrayList;

public class StudentList {
    ArrayList<Student> studentList = new ArrayList<Student>();

    void addStudent(Student newStudent) {
        studentList.add(newStudent);
    }

    Student searchStudent(String studentName){

        for(Student student : studentList)
            if(studentName.equals(student.getStudentName())){
                return student;
        }

        return null;
    }
}
