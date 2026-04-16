package smartcampus.services;

import smartcampus.models.Student;
import smartcampus.models.Course;

import java.util.*;

public class EnrollmentService {

    private HashMap<Student, List<Course>> map = new HashMap<>();

    public void enrollAsync(Student student, Course course) {

        Thread t = new Thread(() -> {
            try {
                System.out.println("⏳ Processing enrollment for " + student.getName());

                Thread.sleep(2000); // simulate delay

                map.putIfAbsent(student, new ArrayList<>());
                map.get(student).add(course);

                System.out.println("✔ Enrolled: " + student.getName()
                        + " -> " + course.getCourseName());

            } catch (InterruptedException e) {
                System.out.println("Error in thread");
            }
        });

        t.start();
    }

    public void viewEnrollments() {

        if (map.isEmpty()) {
            System.out.println("No enrollments yet.");
            return;
        }

        for (Student s : map.keySet()) {
            System.out.println("\nStudent: " + s.getName());

            for (Course c : map.get(s)) {
                System.out.println("   → " + c.getCourseName());
            }
        }
    }
}