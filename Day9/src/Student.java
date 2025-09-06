import java.util.ArrayList;

public class Student {
    private final int id;
    private final String name;
    private ArrayList<Course> enrolledCourses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.enrolledCourses = new  ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public boolean checkDuplicateCourseEnrollment(Course course) {
        return enrolledCourses.contains(course);
    }

    public void enrollCourse(Course course) {
        if (!checkDuplicateCourseEnrollment(course)) {
            enrolledCourses.add(course);
        } else {
            System.out.println ("You have already enrolled this course");
        }
    }

    public void printStudentDetails() {
        System.out.println("Student ID : "+id);
        System.out.println("Student Name : "+name);
        System.out.println ("\nEnrolled Courses : ");
        for (Course course : enrolledCourses) {
            System.out.println ("Course id : "+course.getId());
            System.out.println ("Course name : "+course.getName());
        }
        System.out.println ("--------------------------");
    }
}
