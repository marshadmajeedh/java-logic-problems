import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1,"Marshad");
        Student student2 = new Student(2,"Julia");
        Student student3 = new Student(3,"Lucas");

        student1.addSubjectAndMark("Islam",90);
        student1.addSubjectAndMark("Maths",90);
        student1.addSubjectAndMark("Java",85);

        student2.addSubjectAndMark("Physics",86);
        student2.addSubjectAndMark("Maths",90);
        student2.addSubjectAndMark("Java",80);

        student3.addSubjectAndMark("Physics",70);
        student3.addSubjectAndMark("Maths",60);
        student3.addSubjectAndMark("Java",40);

        StudentManagement sm =  new StudentManagement();
        sm.addStudent(student1);
        sm.addStudent(student2);
        sm.addStudent(student3);

        sm.printAllStudents();

        System.out.println ("Find student by their name : ");
        Student find = sm.findStudentByName("Marshad", sm.getSize()-1);
        find.printStudentDetails();

        Student topStudent = sm.getTopper(0,0);
        System.out.println ("Find top student by their average : ");
        topStudent.printStudentDetails();



    }
}
