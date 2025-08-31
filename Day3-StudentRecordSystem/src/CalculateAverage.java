import java.util.ArrayList;

public class CalculateAverage {

    public static int getAverage(int index, int sum, Student student, int averageMarks) {

        if (index > student.getMarks().size() - 1) {
            return averageMarks;
        }

        sum += student.getMark(index);

        if (index == student.getMarks().size() - 1) {
            averageMarks = sum / student.getMarks().size();
        }

        return getAverage(index + 1, sum, student, averageMarks);

    }

}
