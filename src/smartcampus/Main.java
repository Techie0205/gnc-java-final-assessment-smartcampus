package smartcampus;

import smartcampus.models.*;
import smartcampus.services.*;
import smartcampus.exceptions.InvalidDataException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService ss = new StudentService();
        CourseService cs = new CourseService();
        EnrollmentService es = new EnrollmentService();

        while (true) {

            System.out.println("\n===== SMART CAMPUS =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student");
            System.out.println("4. View Students");
            System.out.println("5. View Enrollments");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Name: ");
                        String name = sc.nextLine();

                        System.out.print("Email: ");
                        String email = sc.nextLine();

                        ss.addStudent(id, name, email);
                        break;

                    case 2:
                        System.out.print("Course ID: ");
                        int cid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Course Name: ");
                        String cname = sc.nextLine();

                        System.out.print("Fee: ");
                        double fee = sc.nextDouble();

                        cs.addCourse(cid, cname, fee);
                        break;

                    case 3:
                        System.out.print("Student ID: ");
                        int sid = sc.nextInt();

                        System.out.print("Course ID: ");
                        int crid = sc.nextInt();

                        Student s = ss.findStudent(sid);
                        Course c = cs.findCourse(crid);

                        if (s != null && c != null) {
                            es.enrollAsync(s, c);
                        } else {
                            System.out.println("Invalid Student or Course ID");
                        }
                        break;

                    case 4:
                        for (Student st : ss.getStudents()) {
                            System.out.println(st);
                        }
                        break;

                    case 5:
                        es.viewEnrollments();
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (InvalidDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}