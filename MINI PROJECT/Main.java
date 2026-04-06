import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LearningSystem system = new LearningSystem();
        Student student = new Student(1, "Mahesh");

        int choice;

        do {
            System.out.println("\n===== ONLINE LEARNING SYSTEM =====");
            System.out.println("1. View Courses");
            System.out.println("2. Enroll Course");
            System.out.println("3. My Courses");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    system.showCourses();
                    break;

                case 2:
                    system.showCourses();
                    System.out.print("Enter course ID: ");
                    int id = sc.nextInt();
                    Course c = system.getCourse(id);
                    if (c != null)
                        student.enrollCourse(c);
                    else
                        System.out.println("Invalid Course");
                    break;

                case 3:
                    student.viewCourses();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;
            }

        } while (choice != 4);
    }
}