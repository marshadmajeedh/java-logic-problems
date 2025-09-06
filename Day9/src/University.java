import java.util.ArrayList;

public class University {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public University() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void enrollStudentInCourse(int studentID,int courseID) {

        boolean isCourseAvailable = false;
        int index = 0;

        for (Course course : courses) {
            if (course.getId() == courseID) {
                isCourseAvailable = true;
                index = courses.indexOf(course);
                break;
            }
        }

        for (Student student : students) {
            if (student.getId() == studentID && isCourseAvailable) {
                student.enrollCourse(courses.get(index));
                courses.get(index).addStudent(student);
            }
        }

    }

    public Course findCourseWithMaxEnrollment(int index,int topIndex) {

        if (index == courses.size()) {
            return null;
        }

        if (index == courses.size()-1) {
            return courses.get(topIndex);
        }

        if (courses.get(index).getEnrolledStudentsSize() > courses.get(topIndex).getEnrolledStudentsSize()) {
            return findCourseWithMaxEnrollment(index + 1, index);
        }

        return findCourseWithMaxEnrollment(index + 1, topIndex);
    }

    public void universityDetails() {

        System.out.println("\n===|Student details|===");
        studentDetails(0);

        System.out.println("\n===|Course details|===");
        courseDetails(0);
    }

    public void studentDetails(int index) {
        if (index == students.size()) {
            System.out.println("\n======================");
            return;
        }
        System.out.println("\nStudent "+(index + 1)+" details : ");
        students.get(index).printStudentDetails();

        studentDetails(index + 1);
    }

    public void courseDetails(int index) {
        if (index == courses.size()) {
            System.out.println("\n======================");
            return;
        }

        System.out.println("\nCourse "+(index + 1)+" details : ");
        courses.get(index).printCourseDetails();

        courseDetails(index + 1);
    }
}
