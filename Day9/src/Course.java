import java.util.ArrayList;

public class Course {
    private final int id;
    private final String name;
    private final int capacity;
    private ArrayList<Student> enrolledStudents;

    public Course(int id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void addStudent(Student student) {

        if (enrolledStudents.size() != capacity) {
            enrolledStudents.add(student);
        }
    }
    public void printCourseDetails() {
        System.out.println("Course ID : "+id);
        System.out.println("Course Name : "+name);
        System.out.println("Capacity : "+capacity);
        System.out.println("Enrollment count : "+enrolledStudents.size());
        System.out.println("\nEnrolled Students : ");
        for (Student student : enrolledStudents) {
            System.out.println ("Student ID : "+student.getId());
            System.out.println ("Student Name : "+student.getName());
        }
        System.out.println ("--------------------------");

    }

    public int getEnrolledStudentsSize() {
        return enrolledStudents.size();
    }
}

