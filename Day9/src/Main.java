public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1,"Marshad");
        Student student2 = new Student(2,"Jack");
        Student student3 = new Student(3,"James");

        Course course1 = new Course(101,"SE",100);
        Course course2 = new Course(102,"HR",50);
        Course course3 = new Course(103,"Programming",150);

        University uni = new  University();
        uni.addCourse(course1);
        uni.addCourse(course2);
        uni.addCourse(course3);

        uni.addStudent(student1);
        uni.addStudent(student2);
        uni.addStudent(student3);

        uni.enrollStudentInCourse(1,101);
        uni.enrollStudentInCourse(2,102);
        uni.enrollStudentInCourse(3,103);

        Course maximumEnrolledStudentCourse = uni.findCourseWithMaxEnrollment(0,1);

        System.out.println("Course has the maximum amount of enrollment: ");
        maximumEnrolledStudentCourse.printCourseDetails();

        uni.universityDetails();
    }
}
