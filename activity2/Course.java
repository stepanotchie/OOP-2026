public class Course {
    String courseCode;
    String courseTitle;
    Student[] enrolledStudents;
    int enrollmentCount = 0;
    static String schoolName = "My University";

    public Course(String courseCode, String courseTitle){
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.enrolledStudents = new Student[50];
    }

    public void enrollStudent(Student student){
        this.enrolledStudents[enrollmentCount] = student;
        this.enrollmentCount++;
    }

    public void displayCourseInfo(){
        System.out.println("School Name: " + schoolName);
        System.out.println("Course Code: " + this.courseCode);
        System.out.println("Course Title: " + this.courseTitle);

        for (int i = 0; i < this.enrollmentCount; i++) {
            System.out.println("- [" + this.enrolledStudents[i].studentId + "] " + this.enrolledStudents[i].firstName + " " + this.enrolledStudents[i].lastName);
            
        }
    }
    
    public static String getSchoolName(){
        return schoolName;
    }
}
