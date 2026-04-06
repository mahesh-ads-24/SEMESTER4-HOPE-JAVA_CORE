import java.util.ArrayList;

class Student {
    int studentId;
    String name;

    ArrayList<Course> enrolledCourses = new ArrayList<>();

    Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    void enrollCourse(Course course) {
        enrolledCourses.add(course);
        System.out.println("Enrolled in " + course.courseName);
    }

    void viewCourses() {
        System.out.println("\nEnrolled Courses:");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.courseName);
        }
    }
}