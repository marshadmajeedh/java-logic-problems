import java.util.ArrayList;

public class Student {

    private final int id;
    private final String name;
    private final ArrayList<String>subjects;
    private final ArrayList<Integer>marks;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.subjects = new ArrayList<>();
        this.marks = new ArrayList<>();
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }
    public void addMark(int mark) {
        marks.add(mark);
    }

    public void addSubjectAndMark(String subject, int mark) {
        addSubject(subject);
        addMark(mark);
    }

    public int calculateAverage(int index,int average) {

        if (index == marks.size()) {
            return average / marks.size();
        }

        average += marks.get(index);

        return calculateAverage(index+1, average);

    }

    public String getName() {
        return name;
    }

    public int getAverage() {
        return calculateAverage(0, 0);
    }

    public void printMarksAndSubject() {

        for (int i = 0; i < subjects.size(); i++) {
            System.out.println("subject : " + subjects.get(i)+", mark : "+marks.get(i));
        }
        System.out.println("average " + calculateAverage(0, 0));
        System.out.println();
    }

    public void printStudentDetails() {
        System.out.println ("Student ID: " + id);
        System.out.println ("Student Name: " + name);
        System.out.println ("Student academic details : ");
        printMarksAndSubject();
    }
}
