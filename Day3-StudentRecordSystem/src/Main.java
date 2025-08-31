import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> student1_Marks = new ArrayList<>();
        ArrayList<Integer> student2_Marks = new ArrayList<>();
        ArrayList<Integer> student3_Marks = new ArrayList<>();

        student1_Marks.add(20);
        student1_Marks.add(30);
        student1_Marks.add(40);

        student2_Marks.add(70);
        student2_Marks.add(80);
        student2_Marks.add(90);

        student3_Marks.add(10);
        student3_Marks.add(60);
        student3_Marks.add(90);


        Student student1 = new Student(1,"Marshad",student1_Marks);
        Student student2 = new Student(2,"Ahamed",student2_Marks);
        Student student3 = new Student(3,"Fatima",student3_Marks);

        int avgMarksOfStudent1 = CalculateAverage.getAverage(0,0,student1,0);
        int avgMarksOfStudent2 = CalculateAverage.getAverage(0,0,student2,0);
        int avgMarksOfStudent3 = CalculateAverage.getAverage(0,0,student3,0);

        student1.setAverageMarks(avgMarksOfStudent1);
        student2.setAverageMarks(avgMarksOfStudent2);
        student3.setAverageMarks(avgMarksOfStudent3);

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student : students) {
            student.printStudentDetails();
        }

        System.out.println ("Top student is : ");
        System.out.println ("------------------");
        Student topStudent = FindTheTopper.getStudent(students,0,0);
        topStudent.printStudentDetails();
    }
}
