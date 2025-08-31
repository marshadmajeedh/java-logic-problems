import java.util.ArrayList;

public class FindTheTopper {

    public static Student getStudent(ArrayList<Student> students, int currentStudentIndex, int topStudentIndex) {

        if (currentStudentIndex == students.size()) {
            return students.get(topStudentIndex);
        }

        int maximumAverageMark = students.get(topStudentIndex).getAverageMarks();

        if (maximumAverageMark < students.get(currentStudentIndex).getAverageMarks()) {

            return getStudent(students, currentStudentIndex + 1, currentStudentIndex);

        }

        return getStudent(students, currentStudentIndex + 1, topStudentIndex);
    }
}
