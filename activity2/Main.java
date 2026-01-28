public class Main {
    public static void main(String[] args) {
        Student.getTotalStudents();

        Student student1 = new Student(2510576, "Stephanie", "Dalisay", "de Leon", "Female",
                "stephaniemhay.deleon@lorma.edu");
        Student student2 = new Student(2511028, "Geoff", "Patanao", "Cariño", "Male", "geoffbenedict.cariño@lorma.edu");
        Student student3 = new Student(2511044, "Zedrick", "Miano", "Ganaden", "Male", "zedrick.ganaden@lorma.edu");

        Student.getTotalStudents();
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        Course.getSchoolName();

        Course course1 = new Course("SNCO2-404", "Compro 2");
        
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);

        course1.displayCourseInfo();
    }
}
