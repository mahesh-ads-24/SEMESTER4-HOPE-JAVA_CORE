import java.util.*;

class LearningSystem {

    ArrayList<Course> courses = new ArrayList<>();

    LearningSystem() {
        courses.add(new Course(1, "Java Programming", "John"));
        courses.add(new Course(2, "Web Development", "David"));
        courses.add(new Course(3, "Python", "Smith"));
    }

    void showCourses() {
        System.out.println("\nAvailable Courses:");
        for (Course c : courses) {
            c.displayCourse();
        }
    }

    Course getCourse(int id) {
        for (Course c : courses) {
            if (c.courseId == id)
                return c;
        }
        return null;
    }
}