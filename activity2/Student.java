public class Student{
    int studentId;
    String firstName;
    String middleName;
    String lastName;
    String gender;
    String email;
    static int totalStudent = 0;

    public Student(int studentId, String firstName, String middleName, String lastName, String gender, String email){
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;

        totalStudent++;
    }

    public void displayStudentInfo(){
        System.out.printf("""
                StudentId: %d
                First Name: %s
                Middle Name: %s
                Last Name: %s
                Gender: %s
                Email: %s\n
                """, studentId, firstName, middleName, lastName, gender, email);
    }

    public static int getTotalStudents(){
        return totalStudent;
    }
}
