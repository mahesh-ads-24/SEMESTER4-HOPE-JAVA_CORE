class Course {
    int courseId;
    String courseName;
    String instructor;

    Course(int courseId, String courseName, String instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    void displayCourse() {
        System.out.println(courseId + " - " + courseName + " (" + instructor + ")");
    }
}