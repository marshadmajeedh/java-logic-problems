import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Integer>marks;
    private int averageMarks;

    public Student(int id, String name, ArrayList<Integer> marks) {
        this.id = id;
        this.name = name;
        this.marks = new ArrayList<>(marks);
        setAverageMarks(averageMarks);
    }

    public int getAverageMarks() {
        return averageMarks;
    }
    public void setAverageMarks(int averageMarks) {
        this.averageMarks = averageMarks;
    }
    public void addMark(int mark) {
        marks.add(mark);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMark(int index) {
        return marks.get(index);
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void printMarks() {
        for (Integer mark : marks) {
            System.out.println(mark);
        }
    }
    public void printStudentDetails() {

        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " );
        printMarks();
        System.out.println("AverageMarks: " + averageMarks);
        System.out.println();
    }
}
