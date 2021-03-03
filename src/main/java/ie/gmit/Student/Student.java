package ie.gmit.Student;

public class Student {


    String firstName;
    String lastName;
    String studentName;
    String studentEmail;

    public Student(String studentName, String studentEmail){
        setStudentName(studentName);
        setStudentEmail(studentEmail);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {

        if(studentName != null && !studentName.equals("")){
            this.studentName = studentName;
        }else{
            throw new IllegalArgumentException("Invalid Name");
        }
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        if(studentEmail != null && !studentEmail.equals("")){
            this.studentEmail = studentEmail;
        }else{
            throw new IllegalArgumentException("Invalid Email Address");
        }
    }

}
