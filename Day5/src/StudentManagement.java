import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentManagement {
    private ArrayList<Student> students;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAllStudents() {
        for (Student student : students) {
            student.printStudentDetails();
        }
    }

    public Student getTopper(int topIndex,int currentIndex) {

        if (currentIndex == students.size()) {
            return students.get(topIndex);
        }

        if (students.get(topIndex).getAverage() < students.get(currentIndex).getAverage()  ) {
            return getTopper(currentIndex, currentIndex + 1);
        }

        return getTopper(topIndex, currentIndex + 1);
    }

    public Student findStudentByName(String name,int index) {

        if (index < 0) {
            return null;
        }

        if (students.get(index).getName().equalsIgnoreCase(name)) {
            return students.get(index);
        }

        return findStudentByName(name, index - 1);
    }

    public int getSize() {
        return students.size();
    }
}
